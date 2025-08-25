import { Routes } from '@angular/router';
import { Productadd } from './productadd/productadd';
import { Productdelete } from './productdelete/productdelete';
import { Productedit } from './productedit/productedit';
import { Productlist } from './productlist/productlist';
import { OrderAdd } from './orderadd/orderadd';
import { Orderhistory } from './orderhistory/orderhistory';

export const routes: Routes = [
    { path: '', redirectTo: '/productlist', pathMatch: 'full' },
  { path: 'productlist', component: Productlist },
  { path: 'productadd', component: Productadd },
  { path: 'productedit/:id', component: Productedit },
  { path: 'productdelete/:id', component: Productdelete },
  { path: 'orderadd', component: OrderAdd },
  { path: 'orderhistory', component: Orderhistory }
];
