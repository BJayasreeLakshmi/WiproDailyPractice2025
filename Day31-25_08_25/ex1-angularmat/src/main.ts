import { bootstrapApplication } from '@angular/platform-browser';
import { appConfig } from './app/app.config';
import { App } from './app/app';
import { Ex2 } from './app/ex2/ex2';
import { Ex3 } from './app/ex3/ex3';
import { Ex4 } from './app/ex4/ex4';
import { Ex5 } from './app/ex5/ex5';

bootstrapApplication(Ex5, appConfig)
  .catch((err) => console.error(err));
