import { DatePipe } from '@angular/common';
import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-ex2',
  imports: [FormsModule,DatePipe],
  templateUrl: './ex2.html',
  styleUrl: './ex2.css'
})
export class Ex2 {
  selectedDate!: string;

}
