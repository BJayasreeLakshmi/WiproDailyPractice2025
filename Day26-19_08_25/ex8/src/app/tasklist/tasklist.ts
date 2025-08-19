import { Component, EventEmitter, Input, Output } from '@angular/core';
import { ITask } from '../Itask'; 
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-tasklist',
  imports: [CommonModule],
  templateUrl: './tasklist.html',
  styleUrl: './tasklist.css'
})
export class Tasklist {
 @Input() tasks: ITask[] = [];
  @Output() removeTask = new EventEmitter<number>();

  onDelete(id: number) {
    this.removeTask.emit(id);
  }
}
