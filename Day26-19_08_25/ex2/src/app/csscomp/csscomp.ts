import { NgClass } from '@angular/common';
import { Component } from '@angular/core';

@Component({
  selector: 'app-csscomp',
  imports: [NgClass],
  templateUrl: './csscomp.html',
  styleUrl: './csscomp.css'
})
export class Csscomp {

  flag1 = true;
  flag2 = false;
}
