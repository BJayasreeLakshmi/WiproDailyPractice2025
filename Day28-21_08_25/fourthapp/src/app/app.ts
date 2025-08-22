import { Component, signal } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { Vehiclecomp } from './vehiclecomp/vehiclecomp';

@Component({
  selector: 'app-root',
  imports: [RouterOutlet,Vehiclecomp],
  templateUrl: './app.html',
  styleUrl: './app.css'
})
export class App {
  protected  title = 'fourthapp';
}
