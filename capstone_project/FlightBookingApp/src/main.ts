import { bootstrapApplication } from '@angular/platform-browser';
import { appConfig } from './app/app.config';
import { App } from './app/app';
import { FlightSearch } from './app/components/flight-search/flight-search';
import { FlightResults } from './app/components/flight-results/flight-results';
import { Payment } from './app/components/payment/payment';

bootstrapApplication(App, appConfig)
  .catch((err) => console.error(err));
