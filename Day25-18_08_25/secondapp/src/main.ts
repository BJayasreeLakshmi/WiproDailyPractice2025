import { bootstrapApplication } from '@angular/platform-browser';
import { appConfig } from './app/app.config';
import { App } from './app/app';
import { Listcomp } from './app/listcomp/listcomp';
import { Condicomp } from './app/condicomp/condicomp';
import { Loadcountry } from './app/loadcountry/loadcountry';
import { Ex13 } from './app/ex13/ex13';
import { Ex14 } from './app/ex14/ex14';
import { Ex15booklist } from './app/ex15booklist/ex15booklist';

bootstrapApplication(Ex15booklist, appConfig)
  .catch((err) => console.error(err));
