import { Component } from '@angular/core';

@Component({
  selector: 'app-loadcountry',
  imports: [],
  templateUrl: './loadcountry.html',
  styleUrl: './loadcountry.css'
})
export class Loadcountry {

  allCountries: string[] = ["India", "USA", "Canada", "Germany", "Japan"];
  countries: string[] = [];   

  loadCountries() {
    this.countries = this.allCountries;
  }

}
