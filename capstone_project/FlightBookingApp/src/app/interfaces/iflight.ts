export interface Iflight {
  flightNumber: string;
  airline: string;
  imageUrl?: string;
  source: string;
  destination: string;
  sourceAirport?: string;
  destinationAirport?: string;
  departureTime: string;
  arrivalTime?: string;
  duration?: string;
  price: number;
  travelClass?: string;
  stops?: number;
  startTime: string;  
  endTime: string;    
 travelDate: string; 
}
