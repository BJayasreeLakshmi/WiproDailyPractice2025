import { CommonModule } from '@angular/common';
import { Component, signal } from '@angular/core';
import { MatListModule } from '@angular/material/list';
import { RouterOutlet } from '@angular/router';

@Component({
  selector: 'app-root',
  imports: [MatListModule,CommonModule],
  templateUrl: './app.html',
  styleUrl: './app.css'
})
export class App {
  protected  title = 'EX-1 City list';
  cities: string[] = [
    'Bengalore',
    'Hyderabad',
    'Chennai',
    'Pune',
    'Delhi',
    'Pune',
    'Kolkata'
  ];
}
