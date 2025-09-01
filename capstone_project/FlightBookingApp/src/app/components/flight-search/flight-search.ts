import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { Router } from '@angular/router';
import { Icity } from '../../interfaces/icity';
import { HttpClient, HttpClientModule } from '@angular/common/http';

@Component({
  selector: 'app-flight-search',
  imports: [FormsModule,CommonModule,HttpClientModule],
  templateUrl: './flight-search.html',
  styleUrl: './flight-search.css'
})
export class FlightSearch {

   tripType = 'oneway';
  cities: Icity[] = [];

  selectedSource: Icity | null = null;
  selectedDestination: Icity | null = null;
  showSourceDropdown = false;
  showDestinationDropdown = false;

  departureDate = '';
  returnDate = '';
  errorMessage = '';
  minDate = new Date().toISOString().split('T')[0]; 

  constructor(private router: Router, private http: HttpClient) {}

  ngOnInit(): void {
    
    this.http.get<Icity[]>('http://localhost:8080/cities').subscribe({
      next: (data) => this.cities = data,
      error: (err) => console.error('Failed to load cities', err)
    });
  }

  selectSource(city: Icity) {
    if (this.selectedDestination && city.city === this.selectedDestination.city) {
      this.errorMessage = 'Source and destination cannot be the same.';
      return;
    }
    this.selectedSource = city;
    this.showSourceDropdown = false;
    this.errorMessage = '';
  }

  selectDestination(city: Icity) {
    if (this.selectedSource && city.city === this.selectedSource.city) {
      this.errorMessage = 'Source and destination cannot be the same.';
      return;
    }
    this.selectedDestination = city;
    this.showDestinationDropdown = false;
    this.errorMessage = '';
  }

  swapLocations() {
    if (!this.selectedSource || !this.selectedDestination) return;
    [this.selectedSource, this.selectedDestination] = [this.selectedDestination, this.selectedSource];
    this.errorMessage = '';
  }

  onSearch() {
    this.errorMessage = '';

    if (!this.selectedSource || !this.selectedDestination || !this.departureDate) {
      this.errorMessage = 'Please fill all required fields.';
      return;
    }

    const today = new Date(this.minDate);
    const depDate = new Date(this.departureDate);
    if (depDate < today) {
      this.errorMessage = 'Departure date cannot be before today.';
      return;
    }

    if (this.tripType === 'roundtrip') {
      if (!this.returnDate) {
        this.errorMessage = 'Please select return date for round trip.';
        return;
      }
      const retDate = new Date(this.returnDate);
      if (retDate < depDate) {
        this.errorMessage = 'Return date cannot be before departure date.';
        return;
      }
    }

    
    this.router.navigate(['/results'], {
      queryParams: {
        source: this.selectedSource.city,
        destination: this.selectedDestination.city,
        departureDate: this.departureDate,
        returnDate: this.returnDate || '',
        tripType: this.tripType
      }
    });
  }
}