import { Component } from '@angular/core';
import { UserService } from '../../services/user-service';
import { Router } from '@angular/router';
import { FormsModule } from '@angular/forms';
import { CommonModule } from '@angular/common';
import { User } from '../../interfaces/user';
import { TokenData } from '../../interfaces/tokendata';

@Component({
  selector: 'app-login',
  imports: [FormsModule,CommonModule],
  templateUrl: './login.html',
  styleUrl: './login.css'
})
export class Login {

user: User = {
    id: 0,
    name: '',
    email: '',
    passWord: ''
  };

  jwttoken: TokenData = {
    token: ''
  };

  error = '';

  constructor(private userService: UserService, private router: Router) {}

  login() {
    console.log(`email = ${this.user.email}`);
    console.log(`password = ${this.user.passWord}`);

    this.userService.login(this.user).subscribe({
      next: (data: TokenData) => {
        this.jwttoken = data;
        const tokenValue = this.jwttoken.token;
        localStorage.setItem('token', tokenValue);
        this.router.navigate(['/foods']);
      },
      error: () => {
        this.error = 'Invalid email or password';
      }
    });
  }

















  // -------------------------------------------------

  // email = '';
  // password = '';
  // error = '';

  // constructor(private userService: UserService, private router: Router) {}

  // login() {
  //   this.userService.login({ email: this.email, passWord: this.password })
  //     .subscribe({
  //       next: () => this.router.navigate(['/foods']),
  //       error: () => this.error = 'Invalid email or password'
  //     });
  // }

}
