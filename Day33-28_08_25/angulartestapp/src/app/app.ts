import { Component, signal } from '@angular/core';
import { RouterOutlet } from '@angular/router';

@Component({
  selector: 'app-root',
  imports: [RouterOutlet],
  templateUrl: './app.html',
  styleUrl: './app.css'
})
export class App {
   title = 'palindrome-app';

  
  isPalindrome(str: string): boolean {
    if (!str) return false;
    const palin = str.toLowerCase();
    return palin === palin.split('').reverse().join('');
  }
}
