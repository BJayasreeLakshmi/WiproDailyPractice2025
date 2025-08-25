import { Component } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Productservice } from '../productservice';

@Component({
  selector: 'app-productdelete',
  imports: [],
  templateUrl: './productdelete.html',
  styleUrl: './productdelete.css'
})
export class Productdelete {

  id: number | null = null;

  constructor(
    private activeRoute: ActivatedRoute,
    private productService: Productservice,
    private router: Router
  ) {}

  ngOnInit() {
    this.id = Number(this.activeRoute.snapshot.paramMap.get('id'));
    if (this.id) {
      this.productService.deleteProduct(this.id).subscribe({
        next: () => this.router.navigate(['/productlist']),
        error: (error) => console.error('Error deleting product:', error)
      });
    }
  }

}
