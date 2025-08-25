import { Component, OnInit } from '@angular/core';
import { Order } from '../order';
import { Orderservice } from '../orderservice';

@Component({
  selector: 'app-orderhistory',
  imports: [],
  templateUrl: './orderhistory.html',
  styleUrl: './orderhistory.css'
})
export class Orderhistory implements OnInit{

orders: Order[] = [];

  constructor(private orderService: Orderservice) {}

  ngOnInit(): void {
    this.orderService.getOrders().subscribe({
      next: (data) => this.orders = data,
      error: (err) => console.error('Error fetching orders:', err)
    });
  }

}
