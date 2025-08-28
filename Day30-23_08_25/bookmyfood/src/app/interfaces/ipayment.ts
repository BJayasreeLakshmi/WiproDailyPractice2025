export interface IPayment {
  orderId: string | null;
  totalOrderPrice: number | string;
  accountNumber: string;
  cvv: number;
  modeOfPayment: string;
}

