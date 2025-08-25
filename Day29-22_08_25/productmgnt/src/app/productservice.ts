import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Product } from './product';

@Injectable({
  providedIn: 'root'
})
export class Productservice {
   private url: string = "http://localhost:8080/products";

  constructor(private http: HttpClient) { }

  
  getProducts(): Observable<Product[]> {
    return this.http.get<Product[]>(this.url);
  }

  
  addProduct(product: Product): Observable<Product> {
    return this.http.post<Product>(this.url, product);
  }
    
  deleteProduct(id: number): Observable<void> {
    let endpoint = `${this.url}/${id}`;
    return this.http.delete<void>(endpoint);
  }

  
  findProduct(id: number): Observable<Product> {
    let endpoint = `${this.url}/${id}`;
    return this.http.get<Product>(endpoint);
  }
  
  saveProduct(product: Product): Observable<Product> {
    let endpoint = `${this.url}/${product.id}`;
    return this.http.put<Product>(endpoint, product);
  }
  updateProduct(product: Product): Observable<Product> {
  return this.http.put<Product>(`${this.url}/${product.id}`, product);
}

}
