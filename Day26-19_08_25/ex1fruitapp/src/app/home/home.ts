import { Component } from '@angular/core';
import { NgFor } from '@angular/common';
import { Fruitcomp,} from '../fruitcomp/fruitcomp';



@Component({
  selector: 'app-home',
  standalone: true,
  imports: [NgFor, Fruitcomp],
  templateUrl: './home.html',
  styleUrls: ['./home.css']  
})
export class Home {
   fruits = [
    { name: 'Apple', image: 'https://images.unsplash.com/photo-1567306226416-28f0efdc88ce', description: 'A sweet red fruit.' },
    { name: 'Banana', image: 'https://images.unsplash.com/photo-1574226516831-e1dff420e47f', description: 'A long yellow fruit.' },
    { name: 'Orange', image: 'https://images.unsplash.com/photo-1580910051073-3e86fa1527d0', description: 'Rich in Vitamin C.' },
    { name: 'Kiwi', image: 'https://images.unsplash.com/photo-1497294815431-9365093b7331', description: 'A tangy tropical fruit.' },
    { name: 'Strawberry', image: 'https://images.unsplash.com/photo-1567306226416-28f0efdc88ce', description: 'A juicy red berry.' },
    { name: 'Cherry', image: 'https://images.unsplash.com/photo-1567306226416-28f0efdc88ce', description: 'Small and sweet fruit.' },
    { name: 'Pineapple', image: 'https://images.unsplash.com/photo-1502741338009-cac2772e18bc', description: 'Tropical spiky fruit.' },
    { name: 'Grapes', image: 'https://images.unsplash.com/photo-1506808547685-e2ba962dedf0', description: 'Small and juicy clusters.' },
    { name: 'Blueberry', image: 'https://images.unsplash.com/photo-1504198453319-5ce911bafcde', description: 'Tiny blue fruit.' },
    { name: 'Watermelon', image: 'https://images.unsplash.com/photo-1502741338009-cac2772e18bc', description: 'Large and refreshing.' },
    { name: 'Mango', image: 'https://images.unsplash.com/photo-1580910051073-3e86fa1527d0', description: 'The king of fruits.' },
    { name: 'Peach', image: 'https://images.unsplash.com/photo-1497294815431-9365093b7331', description: 'Soft and sweet fruit.' },
    { name: 'Lime', image: 'https://images.unsplash.com/photo-1506808547685-e2ba962dedf0', description: 'Green and sour citrus.' }
  ];
   remove(fruitName: string) {
    console.log("Remove button clicked - " + fruitName);
    this.fruits = this.fruits.filter(fruit => fruit.name !== fruitName);
  }
}
