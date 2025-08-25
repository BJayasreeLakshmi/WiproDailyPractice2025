import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Orderadd } from './orderadd';

describe('Orderadd', () => {
  let component: Orderadd;
  let fixture: ComponentFixture<Orderadd>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [Orderadd]
    })
    .compileComponents();

    fixture = TestBed.createComponent(Orderadd);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
