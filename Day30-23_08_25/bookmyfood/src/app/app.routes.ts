import { Routes } from '@angular/router';
import { Login } from './components/login/login';
import { FoodList } from './components/food-list/food-list';
import { Ordercomp } from './components/ordercomp/ordercomp';


export const routes: Routes = [  { path: '', component: Login },
  { path: 'foods', component: FoodList },
  { path: '', redirectTo: '/foodlist', pathMatch: 'full' },
 { path: '**', redirectTo: '/foodlist' }];
