import { Component, signal } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { FoodList } from './components/food-list/food-list';

@Component({
  selector: 'app-root',
  imports: [RouterOutlet],
  templateUrl: './app.html',
  styleUrl: './app.css'
})
export class App {
  protected title = 'bookmyfood';
}
