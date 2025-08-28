import { ChangeDetectorRef, Component } from '@angular/core';
import { FoodService } from '../../services/food-service';
import { CommonModule } from '@angular/common';
import { Food } from '../../interfaces/food';
import { Router } from '@angular/router';
import { Orderservice } from '../../services/orderservice';
import { Order } from '../../interfaces/order';
import { FormsModule } from '@angular/forms';


@Component({
  selector: 'app-food-list',
  imports: [CommonModule,FormsModule],
  templateUrl: './food-list.html',
  styleUrl: './food-list.css'
})
export class FoodList {

  foodList: Food[] = [];
  quantity: number = 1;
  foodMap: Map<number, number> = new Map();

  constructor(
    private foodService: FoodService,
    private cdr: ChangeDetectorRef,
    private router: Router,
    private orderService: Orderservice
  ) {}

  ngOnInit() {
    let tokendata: any = localStorage.getItem("token");
    // Uncomment below to enforce login redirect if no token
    // if(tokendata == null) {
    //   this.router.navigate(["/login"]);
    // }
    this.foodService.getAllFoods().subscribe((data) => {
      this.foodList = data;
      this.foodList.map((f) => {
        this.foodMap.set(f.id!, 0);
        console.log(this.foodMap.get(f.id!));
      });
      console.log(this.foodList);
      this.cdr.markForCheck();
    });
  }

  async save(foodId: number) {
    let orderData: Order = {
      foodId: foodId,
      quantity: this.quantity
    };
    let order: Order = {
      foodId: 0,
      quantity: 0
    };
    (await this.orderService.save(orderData)).subscribe((result: Order) => {
      order = result;
      console.log("result=" + result.id);
      this.router.navigate(['/payment/' + result.id + "/" + result.totalOrderPrice])
    });
  }

  changeQuantity(foodId: number) {
    console.log("foodId=" + foodId + "-" + this.quantity);
    this.foodMap.set(foodId, this.quantity);
    console.log("after quantity=" + this.foodMap.get(foodId));
  }
  trackByFoodId(index: number, food: Food): number {
    return food.id!;
  }


}


// --------------------------
//before order----
// foods: Food[] = [];

//   constructor(
//     private foodService: FoodService,
//     private cdr: ChangeDetectorRef,
//     private router: Router
//   ) {}

  

//   ngOnInit(): void {
//     const token = localStorage.getItem('token');
//     if (!token) {
//       this.router.navigate(['/login']);
//       return;
//     }

//     this.foodService.getFoods().subscribe({
//       next: (data: Food[]) => {
//         this.foods = data;
//         this.cdr.markForCheck();
//       },
//       error: (err) => {
//         console.error('Error fetching foods:', err);
//       }
//     });
//   }
























// // -------------------------------------------------------
//   //  foods: any[] = [];

//   // constructor(private foodService: FoodService) {}

//   // ngOnInit(): void {
//   //   this.foodService.getFoods().subscribe((data: any) => {
//   //     this.foods = data;
//   //   });
//   // }
  

// }
