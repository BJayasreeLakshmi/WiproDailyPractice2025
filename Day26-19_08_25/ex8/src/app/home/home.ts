import { Component } from '@angular/core';
import { ITask } from '../Itask'; 
import { Task } from '../task/task';
import { Tasklist } from '../tasklist/tasklist';

@Component({
  selector: 'app-home',
  standalone: true, 
  imports: [Task,Tasklist],
  templateUrl: './home.html',
  styleUrl: './home.css'
})
export class Home {
tasks: ITask[] = [];
  nextId: number = 1;

  addTask(task: { description: string; category: string }) {
    this.tasks.push({ id: this.nextId++, description: task.description, category: task.category });
  }

  removeTask(id: number) {
    this.tasks = this.tasks.filter(t => t.id !== id);
  }
}
