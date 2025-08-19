import { NgStyle } from '@angular/common';
import { Component } from '@angular/core';

@Component({
  selector: 'app-ex4',
  imports: [NgStyle],
  templateUrl: './ex4.html',
  styleUrl: './ex4.css'
})
export class Ex4 {
   color1 = 'green';
  fontSize1 = '22px';
  flag1 = false;

}
