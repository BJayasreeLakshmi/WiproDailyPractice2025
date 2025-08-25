import { Component } from '@angular/core';
import { FoodService } from '../../services/food-service';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-food-list',
  imports: [CommonModule],
  templateUrl: './food-list.html',
  styleUrl: './food-list.css'
})
export class FoodList {

   foods: any[] = [];

  constructor(private foodService: FoodService) {}

  ngOnInit(): void {
    this.foodService.getFoods().subscribe((data: any) => {
      this.foods = data;
    });
  }

}
