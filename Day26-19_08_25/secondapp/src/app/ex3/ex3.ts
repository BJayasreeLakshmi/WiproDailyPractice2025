import { NgClass } from '@angular/common';
import { Component } from '@angular/core';

@Component({
  selector: 'app-ex3',
  imports: [NgClass],
  templateUrl: './ex3.html',
  styleUrl: './ex3.css'
})
export class Ex3 {
 isRed = true;
  isBold = false;

  
  getNgClass() {
    return {
      redText: this.isRed,
      boldText: this.isBold
    };
  }

  
  
}
