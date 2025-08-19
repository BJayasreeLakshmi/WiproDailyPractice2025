import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Fruitcomp } from './fruitcomp';

describe('Fruitcomp', () => {
  let component: Fruitcomp;
  let fixture: ComponentFixture<Fruitcomp>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [Fruitcomp]
    })
    .compileComponents();

    fixture = TestBed.createComponent(Fruitcomp);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
