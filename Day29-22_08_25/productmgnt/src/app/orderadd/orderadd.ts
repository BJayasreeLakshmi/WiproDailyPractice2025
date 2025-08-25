import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { HttpClientModule, HttpClient } from '@angular/common/http';
import { Product } from '../product'; 

@Component({
  selector: 'app-orderadd',
  standalone: true,
  imports: [CommonModule, FormsModule, HttpClientModule],
  templateUrl: './orderadd.html'
})
export class OrderAdd {
  products: Product[] = [];
  selectedProductId: number | null = null;
  qtyPurchased: number = 1;
  errorMessage: string = '';

  constructor(private http: HttpClient) {
    this.loadProducts();
  }

  loadProducts() {
    this.http.get<Product[]>('http://localhost:8080/products')
      .subscribe({
        next: (data) => this.products = data,
        error: () => this.errorMessage = 'Error loading products'
      });
  }

placeOrder() {
  if (this.selectedProductId === null) {
    this.errorMessage = 'Select a product';
    return;
  }

  const product = this.products.find(p => p.id === Number(this.selectedProductId));
  if (!product) {
    this.errorMessage = 'Invalid product';
    return;
  }

  if (this.qtyPurchased <= 0) {
    this.errorMessage = "Quantity must be greater than 0";
    return;
  }

  if (this.qtyPurchased > product.qty) {
    this.errorMessage = "Not enough stock available";
    return;
  }

  const order = {
  productId: product.id,
  qtyPurchased: this.qtyPurchased
};

  this.http.post('http://localhost:8080/orders', order)
    .subscribe({
      next: () => {
        this.errorMessage = '';
        alert('Order placed successfully');
        this.loadProducts(); 
      },
      error: () => this.errorMessage = 'Error placing order'
    });
}

}
