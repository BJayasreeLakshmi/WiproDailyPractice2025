import { bootstrapApplication } from '@angular/platform-browser';
import { appConfig } from './app/app.config';
import { App } from './app/app';
import { Ex3 } from './app/ex3/ex3';
import { Ex4 } from './app/ex4/ex4';

bootstrapApplication(Ex4, appConfig)
  .catch((err) => console.error(err));
