import { Routes } from '@angular/router';
import { Login } from './components/login/login';
import { FoodList } from './components/food-list/food-list';

export const routes: Routes = [  { path: '', component: Login },
  { path: 'foods', component: FoodList }];
