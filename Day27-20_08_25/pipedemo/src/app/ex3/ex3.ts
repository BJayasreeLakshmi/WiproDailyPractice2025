import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { CToFPipe } from '../c-to-f-pipe';

@Component({
  selector: 'app-ex3',
  imports: [FormsModule,CToFPipe],
  templateUrl: './ex3.html',
  styleUrl: './ex3.css'
})
export class Ex3 {

  celsius!: number;

}
