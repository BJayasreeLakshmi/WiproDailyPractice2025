export interface Order {
  id?:number;
  orderId?: string;
  userId?: number;   
  foodId: number;
  quantity: number;
  totalOrderPrice?: number;
  orderStatus?: number;
}
