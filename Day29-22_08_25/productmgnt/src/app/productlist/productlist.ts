import { Component, OnInit } from '@angular/core';
import { Router, RouterLink } from '@angular/router';
import { Product } from '../product';
import { Productservice } from '../productservice';

@Component({
  selector: 'app-productlist',
  imports: [RouterLink],
  templateUrl: './productlist.html',
  styleUrl: './productlist.css'
})
export class Productlist implements OnInit{

  products: Product[] = [];

  constructor(private productService: Productservice, private router: Router) {}

  ngOnInit() {
    console.log("==> Productlist Component Initialized");
    this.productService.getProducts().subscribe(
      (data: Product[]) => {
        this.products = data;
        console.log('Products fetched successfully:', data);
      },
      (error) => {
        console.error('Error fetching products:', error);
      }
    );
  }

  addProduct() {
    this.router.navigate(['/productadd']);
  }
}
