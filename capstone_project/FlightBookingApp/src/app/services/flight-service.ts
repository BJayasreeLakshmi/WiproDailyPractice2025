import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Iflight } from '../interfaces/iflight';
import { BehaviorSubject, Observable, tap } from 'rxjs';
import { FlightSearchRequest } from '../interfaces/flight-search-request';

@Injectable({
  providedIn: 'root'
})
export class FlightService {
   private flightsSubject = new BehaviorSubject<Iflight[] | null>(null);
  flights$ = this.flightsSubject.asObservable();

  private baseUrl = 'http://localhost:8082/bookings';

  constructor(private http: HttpClient) {}

  // POST search request, backend returns Flight[]
  searchFlights(req: FlightSearchRequest): Observable<Iflight[]> {
    return this.http.post<Iflight[]>(`${this.baseUrl}/search-flights`, req)
      .pipe(
        tap(flights => this.flightsSubject.next(flights))
      );
  }

  // update or clear flights if needed
  setFlights(flights: Iflight[] | null) {
    this.flightsSubject.next(flights);
  }
}
