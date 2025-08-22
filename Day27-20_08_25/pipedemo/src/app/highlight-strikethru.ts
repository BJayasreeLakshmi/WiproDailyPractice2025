import { Directive, ElementRef } from '@angular/core';

@Directive({
  selector: '[appHighlightStrikethru]',
  standalone: true
})
export class HighlightStrikethruDirective {
  constructor(private el: ElementRef) {
    this.el.nativeElement.style.color = 'yellow';
    this.el.nativeElement.style.textDecoration = 'line-through';
  }
}
