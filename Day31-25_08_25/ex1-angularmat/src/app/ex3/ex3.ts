import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { FormControl, ReactiveFormsModule } from '@angular/forms';

@Component({
  selector: 'app-ex3',
  imports: [ReactiveFormsModule, CommonModule],
  templateUrl: './ex3.html',
  styleUrl: './ex3.css'
})
export class Ex3 {

  fName = new FormControl('');
  reversedValue: string = '';

  constructor() {
    this.fName.valueChanges.subscribe((value) => {
      this.reversedValue = this.reverseString(value ?? '');
      console.log('value=' + value);
    });

  
    this.reversedValue = this.reverseString(this.fName.value ?? '');
  }

  private reverseString(str: string): string {
    return str.split('').reverse().join('');
  }

}
