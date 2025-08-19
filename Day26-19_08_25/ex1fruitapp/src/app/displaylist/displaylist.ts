import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';

@Component({
   selector: 'app-displaylist',
  imports: [FormsModule],
  templateUrl: './displaylist.html',
  styleUrl: './displaylist.css'
})
export class Displaylist {

  
    fruits = [
    { name: 'Apple',       image: 'https://images.unsplash.com/photo-1567306226416-28f0efdc88ce' },
    { name: 'Banana',      image: 'https://images.unsplash.com/photo-1574226516831-e1dff420e47f' },
    { name: 'Orange',      image: 'https://images.unsplash.com/photo-1580910051073-3e86fa1527d0' },
    { name: 'Kiwi',        image: 'https://images.unsplash.com/photo-1497294815431-9365093b7331' },
    { name: 'Strawberry',  image: 'https://images.unsplash.com/photo-1567306226416-28f0efdc88ce' },
    { name: 'Cherry',      image: 'https://images.unsplash.com/photo-1567306226416-28f0efdc88ce' },
    { name: 'Pineapple',   image: 'https://images.unsplash.com/photo-1502741338009-cac2772e18bc' },
    { name: 'Grapes',      image: 'https://images.unsplash.com/photo-1506808547685-e2ba962dedf0' },
    { name: 'Blueberry',   image: 'https://images.unsplash.com/photo-1504198453319-5ce911bafcde' },
    { name: 'Watermelon',  image: 'https://images.unsplash.com/photo-1502741338009-cac2772e18bc' },
    { name: 'Mango',       image: 'https://images.unsplash.com/photo-1580910051073-3e86fa1527d0' },
    { name: 'Peach',       image: 'https://images.unsplash.com/photo-1497294815431-9365093b7331' },
    { name: 'Lime',        image: 'https://images.unsplash.com/photo-1506808547685-e2ba962dedf0' }
  ];
}
