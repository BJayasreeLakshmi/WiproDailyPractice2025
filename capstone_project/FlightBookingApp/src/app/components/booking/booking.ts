import { Component } from '@angular/core';
import { Iflight } from '../../interfaces/iflight';
import { ActivatedRoute, Router } from '@angular/router';
import { HttpClient, HttpClientModule } from '@angular/common/http';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { ChangeDetectorRef } from '@angular/core';
@Component({
  selector: 'app-booking',
  imports: [CommonModule,FormsModule,HttpClientModule],
  templateUrl: './booking.html',
  styleUrls: ['./booking.css']
})
export class Booking {
  flight?: Iflight;
  terminal: string = 'Terminal T4';
  baggageCabin: string = '7 Kgs / Adult';
  baggageCheckin: string = '15 Kgs / Adult';

  constructor(private route: ActivatedRoute, private http: HttpClient, private router: Router,private cdr: ChangeDetectorRef) {}

  ngOnInit(): void {
    const flightNumber = this.route.snapshot.paramMap.get('flightNumber');
    console.log('Navigating to booking for flightNumber:', flightNumber);

    if (flightNumber) {
      this.http.get<Iflight>(`http://localhost:8080/bookings/flight/${flightNumber}`)
        .subscribe({
          next: data => {
            console.log('Flight received:', data);
            this.flight = data;
            this.cdr.detectChanges();
          },
          error: err => console.error('Flight not found', err)
        });
    }
  }


  proceedToPay() {
    this.router.navigate(['/payment'], { state: { flight: this.flight } });
  }

  getFormattedDate(travelDate: string, timeStr: string): string {
  if (!travelDate || !timeStr) return '';

  const [year, month, day] = travelDate.split('-').map(Number);
  const [hours, minutes, seconds] = timeStr.split(':').map(Number);

  const date = new Date(year, month - 1, day, hours, minutes, seconds || 0);

  return date.toLocaleDateString('en-US', {
    weekday: 'long',
    month: 'short',
    day: 'numeric'
  });
}

}

