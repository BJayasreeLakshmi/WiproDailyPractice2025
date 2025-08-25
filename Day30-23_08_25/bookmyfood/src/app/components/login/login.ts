import { Component } from '@angular/core';
import { UserService } from '../../services/user-service';
import { Router } from '@angular/router';
import { FormsModule } from '@angular/forms';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-login',
  imports: [FormsModule,CommonModule],
  templateUrl: './login.html',
  styleUrl: './login.css'
})
export class Login {

  email = '';
  password = '';
  error = '';

  constructor(private userService: UserService, private router: Router) {}

  login() {
    this.userService.login({ email: this.email, passWord: this.password })
      .subscribe({
        next: () => this.router.navigate(['/foods']),
        error: () => this.error = 'Invalid email or password'
      });
  }

}
