import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-ex14',
  imports: [FormsModule],
  templateUrl: './ex14.html',
  styleUrl: './ex14.css'
})
export class Ex14 {

  names: string[] = ["Jayanta", "Jayaram", "Jayasree", "Sneha", "Amit", "Ravi"];
  searchText: string = "";

  get searchStr(){
    const txt = this.searchText.toLowerCase();
    return this.names.filter(n => n.toLowerCase().startsWith(txt));
  }

}
