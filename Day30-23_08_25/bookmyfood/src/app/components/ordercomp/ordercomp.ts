import { Component } from '@angular/core';
import { Orderservice } from '../../services/orderservice';
import { Router } from '@angular/router';
import { Order } from '../../interfaces/order';
import { FormsModule } from '@angular/forms';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-ordercomp',
  imports: [FormsModule,CommonModule],
  templateUrl: './ordercomp.html',
  styleUrl: './ordercomp.css'
})
export class Ordercomp {
  order: Order = { foodId: 0, quantity: 1 };
  error = '';
  successMsg = '';

  constructor(private orderService: Orderservice, private router: Router) {}

  placeOrder() {
    this.error = '';
    this.successMsg = '';
    this.orderService.save(this.order).subscribe({
      next: () => {
        this.successMsg = 'Order placed successfully!';
      },
      error: (err: any) => {
        this.error = 'Failed to place order';
        console.error(err);
      }
    });
  }
}