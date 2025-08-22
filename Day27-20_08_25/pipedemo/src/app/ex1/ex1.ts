import { UpperCasePipe } from '@angular/common';
import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-ex1',
  imports: [UpperCasePipe,FormsModule],
  templateUrl: './ex1.html',
  styleUrl: './ex1.css'
})
export class Ex1 {
  inputText: string = '';

}
