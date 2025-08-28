import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Order } from '../interfaces/order';
import { Observable } from 'rxjs';
import { BASE_URL } from '../../util/appconstant';
import { Router } from '@angular/router';

@Injectable({
  providedIn: 'root'
})
export class Orderservice {

  constructor(private http: HttpClient) {}

  save(order: Order): Observable<Order> {
    let token = localStorage.getItem("token");
    const headers = new HttpHeaders()
      .set('Content-Type', 'application/json')
      .set('Authorization', `${token}`);
    let url: string = BASE_URL + "/order";
    return this.http.post<Order>(url, order, { headers });
  }
}


















  // constructor(private http: HttpClient) {}

  // async save(order: Order): Promise<Observable<Order>> {
  //   console.log("--save--")
  //   let token = localStorage.getItem("token");
  //   // console.log("jwt token="+token)
  //   let header: HttpHeaders = new HttpHeaders();
  //   const headers = new HttpHeaders()
  //     .set('Content-Type', 'application/json')
  //     .set('Authorization', `${token}`);
  //   let url: string = BASE_URL + "/order";
  //   return await this.http.post<Order>(url, order, { headers });
  // }

  
  

