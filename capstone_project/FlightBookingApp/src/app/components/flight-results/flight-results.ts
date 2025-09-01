import { Component, OnInit } from '@angular/core';
import { Iflight } from '../../interfaces/iflight';
import { FormsModule } from '@angular/forms';
import { CommonModule } from '@angular/common';
import { ActivatedRoute, Router } from '@angular/router';
import { HttpClient, HttpClientModule } from '@angular/common/http';
import { FlightService } from '../../services/flight-service';

@Component({
  selector: 'app-flight-results',
  imports: [FormsModule,CommonModule,HttpClientModule],
  templateUrl: './flight-results.html',
  styleUrl: './flight-results.css'
})
export class FlightResults implements OnInit{
flights: Iflight[] = [];
  searchText: string = '';
  selectedClass: string = '';

  
  source: string = '';
  destination: string = '';
  departureDate: string = '';

  constructor(private http: HttpClient, private route: ActivatedRoute,private router: Router) {}

  ngOnInit(): void {
    
    this.route.queryParams.subscribe(params => {
      this.source = params['source'] || '';
      this.destination = params['destination'] || '';
      this.departureDate = params['departureDate'] || '';
      this.loadFlights();
    });
  }

  loadFlights() {
    
    const body = {
      source: this.source,
      destination: this.destination,
      departureDate: this.departureDate
    };

    this.http.post<Iflight[]>('http://localhost:8080/bookings/search-flights', body)
      .subscribe((data) => this.flights = data);
  }

  calculateDuration(start: string, end: string): string {
    const startDate = new Date(`2023-01-01T${start}`);
    const endDate = new Date(`2023-01-01T${end}`);
    let diff = (endDate.getTime() - startDate.getTime()) / (1000 * 60); 
    if (diff < 0) diff += 24 * 60; 
    const hours = Math.floor(diff / 60);
    const minutes = diff % 60;
    return `${hours}h ${minutes}m`;
  }

  matchesSearch(flight: Iflight): boolean {
    return !this.searchText ||
      flight.airline.toLowerCase().includes(this.searchText.toLowerCase()) ||
      flight.flightNumber.toLowerCase().includes(this.searchText.toLowerCase());
  }

  matchesClass(flight: Iflight): boolean {
    return !this.selectedClass || flight.travelClass === this.selectedClass;
  }
  
  bookFlight(flight: Iflight) {
  
   console.log('Navigating to booking for flightNumber:', flight.flightNumber);
  this.router.navigate(['/booking', flight.flightNumber]);
}
}
