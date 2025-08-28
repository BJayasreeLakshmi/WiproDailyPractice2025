import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { FormControl, FormGroup, ReactiveFormsModule, Validators } from '@angular/forms';
import { MatButtonModule } from '@angular/material/button';
import { MatNativeDateModule } from '@angular/material/core';
import { MatDatepickerModule } from '@angular/material/datepicker';
import { MatFormFieldModule } from '@angular/material/form-field';
import { MatInputModule } from '@angular/material/input';
import { MatSelectModule } from '@angular/material/select';

@Component({
  selector: 'app-ex5',
  imports: [ CommonModule,
    ReactiveFormsModule,
    MatFormFieldModule,
    MatInputModule,
    MatDatepickerModule,
    MatNativeDateModule,
    MatSelectModule,
    MatButtonModule],
  templateUrl: './ex5.html',
  styleUrl: './ex5.css'
})
export class Ex5 {

  regForm = new FormGroup({
    name: new FormControl('', Validators.required),
    email: new FormControl('', [Validators.required, Validators.email]),
    dob: new FormControl('', Validators.required),
    subject: new FormControl('', Validators.required)
  });

  subjects: string[] = ['Computer Science', 'Mathematics', 'Physics', 'Chemistry', 'Biology'];

  onSubmit() {
    if (this.regForm.valid) {
      console.log('Form Submitted', this.regForm.value);
    } else {
      console.log('Form Invalid');
    }
  }

}
