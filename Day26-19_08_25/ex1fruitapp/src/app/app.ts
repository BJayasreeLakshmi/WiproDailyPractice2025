import { Component, signal } from '@angular/core';
import { Home } from './home/home';
import { Displaylist } from './displaylist/displaylist';
import { Fruitcomp } from './fruitcomp/fruitcomp';


@Component({
  selector: 'app-root',
  imports: [Home],
  templateUrl: './app.html',
  styleUrl: './app.css'
})
export class App {
  protected  title = 'ex1fruitapp';
}
