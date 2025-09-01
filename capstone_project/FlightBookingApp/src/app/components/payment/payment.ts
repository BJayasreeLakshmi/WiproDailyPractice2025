import { CommonModule } from '@angular/common';
import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, FormsModule, ReactiveFormsModule, Validators } from '@angular/forms';
import { IPayment } from '../../interfaces/ipayment';
import { HttpClient, HttpClientModule } from '@angular/common/http';
import { Router } from '@angular/router';

@Component({
  selector: 'app-payment',
  imports: [FormsModule,CommonModule,ReactiveFormsModule,HttpClientModule],
  templateUrl: './payment.html',
  styleUrl: './payment.css'
})
export class Payment implements OnInit {
paymentMethods = [
    { name: 'Saved Cards', clickable: false },
    { name: 'UPI', clickable: false },
    { name: 'Credit Card', clickable: true },
    { name: 'Debit Card', clickable: true },
    { name: 'Net Banking', clickable: false },
    { name: 'DebitCard + ATM PIN/OTP', clickable: false },
    { name: 'Wallets + Cash Cards', clickable: false },
    { name: 'Bharat QR', clickable: false },
    { name: 'PayLater by ICICI Bank', clickable: false }
  ];

  selectedMethod = 'Credit Card';
  cardForm!: FormGroup;
  months = Array.from({ length: 12 }, (_, i) => ('0' + (i + 1)).slice(-2));
  years = Array.from({ length: 16 }, (_, i) => new Date().getFullYear() + i);

  flight: any;
  amount: number = 0;

  constructor(private fb: FormBuilder, private http: HttpClient,private router: Router ) { }

  ngOnInit(): void {
    
    this.flight = history.state.flight;
    if (this.flight) {
      this.amount = this.flight.price || 100;
    }

    this.initForm();
  }

  selectMethod(methodName: string) {
    if (this.paymentMethods.find(m => m.name === methodName)?.clickable) {
      this.selectedMethod = methodName;
      this.initForm();
    }
  }

  initForm() {
    if (this.selectedMethod === 'Credit Card' || this.selectedMethod === 'Debit Card') {
      this.cardForm = this.fb.group({
        cardNumber: ['', [Validators.required, Validators.pattern(/^\d{16}$/)]],
        cardHolderName: ['', [Validators.required, Validators.pattern(/^[a-zA-Z ]+$/)]],
        expiryMonth: ['', Validators.required],
        expiryYear: ['', Validators.required],
        cvv: ['', [Validators.required, Validators.pattern(/^\d{3}$/)]],
        saveInfo: [false]
      });
    } else {
      this.cardForm = this.fb.group({});
    }
  }

  onPay() {
  if (this.cardForm.valid) {
    const paymentRequest: IPayment = {
      bookingId: '',
      flightNumber: this.flight.flightNumber,
      paymentMethod: this.selectedMethod,
      cardNumber: this.cardForm.value.cardNumber,
      cardHolderName: this.cardForm.value.cardHolderName,
      expiryMonth: this.cardForm.value.expiryMonth,
      expiryYear: this.cardForm.value.expiryYear,
      cvv: this.cardForm.value.cvv,
      amount: this.amount,
      status: 'initiated'
    };

    const url = 'http://localhost:8080/bookings/initiate-payment';

    this.http.post(url, paymentRequest).subscribe({
      next: (res: any) => {
        console.log('Booking MS Response:', res);
        alert(`Payment initiated! Booking ID: ${res.bookingId}`);
        
       
        const interval = setInterval(() => {
          this.http.get(`http://localhost:8080/bookings/${res.bookingId}`)
            .subscribe((booking: any) => {
              if (booking.status !== 'initiated') {
                clearInterval(interval);
                 const ticketData = this.mapToTicket(
                  booking,                    
                  this.flight,                
                  this.amount,                
                  this.cardForm?.value.cardHolderName 
                  );

this.router.navigate(['/ticket'], {
  state: { ticketData }
});
                alert(`Final Payment Status: ${booking.status}`);
              }
            });
        }, 2000);
      },
      error: (err) => {
        console.error('Payment Error:', err);
        alert('Payment failed! Check console.');
      }
    });
  } else {
    this.cardForm.markAllAsTouched();
  }
}


mapToTicket(bookingResponse: any, flightData: any, amount: number, cardHolderName?: string) {
  return {
    bookingId: bookingResponse.bookingId,
    passengerName: bookingResponse.passengerName || 'N/A',
    flightNumber: flightData.flightNumber,
    imageUrl: flightData.imageUrl || '', 
    airline: flightData.airline || '',
    source: flightData.source,
    destination: flightData.destination,
    endTime: flightData.endTime,
    startTime: flightData.startTime || '',
    sourceAirport: flightData.sourceAirport || '',
    destinationAirport: flightData.destinationAirport || '',
    travelDate: flightData.travelDate || new Date(),
    tripType: 'One Way',               
    duration: flightData.duration || '', 
    seatNumber: '11',
    meal: bookingResponse.meal || 'YES',
    eticketNumber:'A189',
    amount: amount,
    savings: bookingResponse.savings || 0,
    cardHolderName: cardHolderName || '',   
    status: bookingResponse.status || 'initiated'
  };
}

}

