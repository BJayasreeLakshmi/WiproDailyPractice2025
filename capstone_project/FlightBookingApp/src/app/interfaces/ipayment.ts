export interface IPayment {
  bookingId?: string;
  cardNumber: string;
  flightNumber: string;
  cardHolderName: string;
  expiryMonth: string;
  expiryYear: string;
  cvv: string;
  amount: number;
  status?: string;
  paymentMethod: string;
}
