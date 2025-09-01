import { Routes } from '@angular/router';
import { FlightSearch } from './components/flight-search/flight-search';
import { FlightResults } from './components/flight-results/flight-results';
import { Booking } from './components/booking/booking';
import { Payment } from './components/payment/payment';
import { Ticket } from './components/ticket/ticket';

export const routes: Routes = [
     { path: '', component: FlightSearch },
  { path: 'results', component: FlightResults },
  { path: 'booking/:flightNumber', component: Booking },{ path: 'payment', component: Payment },
    { path: 'ticket', component: Ticket },                 // Ticket page
  { path: '**', redirectTo: '' } 
];
