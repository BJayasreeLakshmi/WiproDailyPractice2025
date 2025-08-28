import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { IPayment } from '../interfaces/ipayment';
import { Observable } from 'rxjs';
import { BASE_URL } from '../../util/appconstant';

@Injectable({
  providedIn: 'root'
})
export class Paymentservice {

  constructor(private http: HttpClient) {}

  save(payment: IPayment): Observable<IPayment> {
    const token = localStorage.getItem('token');
    const headers = new HttpHeaders()
      .set('Content-Type', 'application/json')
      .set('Authorization', `${token}`);

    const url = `${BASE_URL}/payment`;
    return this.http.post<IPayment>(url, payment, { headers });
  }
  
}
