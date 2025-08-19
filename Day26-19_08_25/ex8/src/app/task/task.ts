import { Component, EventEmitter, Output } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { ITask } from '../Itask';


@Component({
  selector: 'app-task',
  imports: [FormsModule],
  templateUrl: './task.html',
  styleUrl: './task.css'
})
export class Task {
 description: string = '';
  category: string = 'Work';

  @Output() addTask = new EventEmitter<ITask>();

  onAddTask() {
    if (!this.description) return;

    
    const newTask: ITask = {
      id: 0,
      description: this.description,
      category: this.category
    };

    this.addTask.emit(newTask);
    this.description = '';
  }
}
