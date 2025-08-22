import { CommonModule } from '@angular/common';
import { Component, signal } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { BrowserModule } from '@angular/platform-browser';
import { Ex1 } from './ex1/ex1';
import { RouterOutlet } from '@angular/router';


@Component({
  selector: 'app-root',
  
  imports: [BrowserModule,
    FormsModule,    
    CommonModule],
  templateUrl: './app.html',
  styleUrl: './app.css'
})
export class App {
  protected  title = 'pipedemo';
}
