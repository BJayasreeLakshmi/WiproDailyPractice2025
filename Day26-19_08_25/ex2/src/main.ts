import { bootstrapApplication } from '@angular/platform-browser';
import { appConfig } from './app/app.config';
import { App } from './app/app';
import { Csscomp } from './app/csscomp/csscomp';

bootstrapApplication(Csscomp, appConfig)
  .catch((err) => console.error(err));
