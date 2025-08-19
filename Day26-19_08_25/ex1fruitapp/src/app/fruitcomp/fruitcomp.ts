import { Component, EventEmitter, Input, Output } from '@angular/core';

interface IFruit {
  name: string;
  image: string;
  description: string;
}

@Component({
  selector: 'app-fruitcomp',
  standalone: true,
  templateUrl: './fruitcomp.html',
  styleUrls: ['./fruitcomp.css']
})
export class Fruitcomp {
  //Ex5
  // @Input() name!: string;
  // @Input() image!: string;
  // @Input() description!: string;

  //Ex6

   @Input() fruit!: IFruit;

   @Output() btnClick = new EventEmitter<string>();

  removeFruit() {
    this.btnClick.emit(this.fruit.name); 
  }
}
