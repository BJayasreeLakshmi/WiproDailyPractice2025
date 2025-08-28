import { Component } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { IPayment } from '../../interfaces/ipayment';
import { Paymentservice } from '../../services/paymentservice';
import { CurrencyPipe } from '@angular/common';

@Component({
  selector: 'app-payment',
  imports: [CurrencyPipe],
  templateUrl: './payment.html',
  styleUrl: './payment.css'
})
export class Payment {


   totalPrice: any = '';
  orderId: any = '';

  constructor(
    private activatedRoute: ActivatedRoute,
    private paymentService: Paymentservice,
    private router: Router
  ) {}

  ngOnInit() {
    this.orderId = this.activatedRoute.snapshot.paramMap.get('orderId');
    let price = this.activatedRoute.snapshot.paramMap.get('totalPrice')?.toString();
    this.totalPrice = price;
  }

  async pay() {
    let payment: IPayment = {
      orderId: this.orderId ?? '',
      totalOrderPrice: Number(this.totalPrice) || 0,
      accountNumber: "123-45-678",
      cvv: 234,
      modeOfPayment: "card"
    };

    (await this.paymentService.save(payment))
      .subscribe((result: any) => {
        console.log(result);
        this.router.navigate(['paymentsub']);
      });
  }

}
