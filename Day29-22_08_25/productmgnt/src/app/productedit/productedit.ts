import { Component, OnInit } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { Product } from '../product';
import { ActivatedRoute, Router } from '@angular/router';
import { Productservice } from '../productservice';

@Component({
  selector: 'app-productedit',
  imports: [FormsModule],
  templateUrl: './productedit.html',
  styleUrl: './productedit.css'
})
export class Productedit implements OnInit {

  id: number | null = null;
  product: Product = {
    name: '',
    category: '',
    price: 0,
    qty:0
  };

  constructor(
    private activatedRoute: ActivatedRoute,
    private productService: Productservice,
    private router: Router
  ) {}

  ngOnInit() {
    console.log("==> Productedit Component Initialized");
    this.id = Number(this.activatedRoute.snapshot.paramMap.get('id'));

    if (this.id) {
      this.productService.findProduct(this.id).subscribe(product => {
        console.log('Fetched product:', product);
        this.product = product;
      });
    }
  }
  save() {
    this.productService.saveProduct(this.product).subscribe({
      next: (updatedProduct) => {
        console.log('Product saved successfully:', updatedProduct);
        this.router.navigate(['/productlist']);
      },
      error: (error) => {
        console.error('Error saving product:', error);
      }
    });
  }

}
