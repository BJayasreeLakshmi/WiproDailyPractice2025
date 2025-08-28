import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { User } from '../interfaces/user';
import { TokenData } from '../interfaces/tokendata';
import { BASE_URL } from '../../util/appconstant';

@Injectable({
  providedIn: 'root'
})
export class UserService {


constructor(private http: HttpClient) {}

  login(user: User): Observable<TokenData> {
    const url = `${BASE_URL}/user/login`;
    console.log("url - " + url);
    return this.http.post<TokenData>(url, user);
  }

  









  // private apiUrl = 'http://localhost:8080/user';

  // constructor(private http: HttpClient) {}

  // login(user: any): Observable<any> {
  //   return this.http.post(`${this.apiUrl}/login`, user);
  // }
  
}
