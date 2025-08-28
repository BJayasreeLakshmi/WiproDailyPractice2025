import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Food } from '../interfaces/food';
import { BASE_URL } from '../../util/appconstant';

@Injectable({
  providedIn: 'root'
})
export class FoodService {



constructor(private http: HttpClient) {}

  getAllFoods(): Observable<Food[]> {
    let token = localStorage.getItem("token");
    // console.log("jwt token="+token)
    let header: HttpHeaders = new HttpHeaders();
    const headers = new HttpHeaders()
      .set('Content-Type', 'application/json')
      .set('Authorization', `${token}`);
    let url: string = BASE_URL + "/food";
    return this.http.get<Food[]>(url, { headers });
  }









  // private apiUrl = 'http://localhost:8080/food';

  // constructor(private http: HttpClient) {}

  // getFoods(): Observable<any> {
  //   return this.http.get(this.apiUrl);
  // }
  
}
