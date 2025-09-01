import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { CommonModule, DatePipe } from '@angular/common';

@Component({
  selector: 'app-ticket',
  imports: [CommonModule,DatePipe],
  templateUrl: './ticket.html',
  styleUrl: './ticket.css'
})
export class Ticket implements OnInit{

  booking: any;

  constructor(private router: Router) { }

ngOnInit(): void {
    const state = history.state;
    if (state && state.ticketData) {  
      this.booking = state.ticketData;
    } else {
      this.router.navigate(['/payment']);  
    }
}

  downloadTicket() {
    const ticketContent = document.getElementById('ticketCard')?.innerHTML;
    if (!ticketContent) return;

    const newWindow = window.open('', '', 'width=800,height=600');
    newWindow?.document.write(`<html><head><title>Flight Ticket</title></head><body>${ticketContent}</body></html>`);
    newWindow?.document.close();
    newWindow?.print();
  }
}


