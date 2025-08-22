import { bootstrapApplication } from '@angular/platform-browser';
import { appConfig } from './app/app.config';
import { App } from './app/app';
import { Ex1 } from './app/ex1/ex1';
import { Ex2 } from './app/ex2/ex2';
import { Ex3 } from './app/ex3/ex3';
import { Ex4 } from './app/ex4/ex4';


bootstrapApplication(Ex4, appConfig)
  .catch((err) => console.error(err));
