import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { Productservice } from '../productservice';
import { Router } from '@angular/router';

@Component({
  selector: 'app-productadd',
  imports: [FormsModule],
  templateUrl: './productadd.html',
  styleUrl: './productadd.css'
})
export class Productadd {

  constructor(private productService: Productservice, private router: Router) {}

  productName: string = '';
  productCategory: string = '';
  productPrice: number | null = null;
  productQty: number  = 0;

  submit() {
    if (!this.productName || !this.productCategory || this.productPrice === null) {
      alert('Please fill all fields');
      return;
    }

    this.productService.addProduct({
      name: this.productName,
      category: this.productCategory,
      price: this.productPrice,
      qty:this.productQty
    }).subscribe({
      next: () => this.router.navigate(['/productlist']),
      error: (error) => console.error('Error adding product:', error)
    });
  }
}
