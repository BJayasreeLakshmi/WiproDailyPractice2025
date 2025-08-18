import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Loadcountry } from './loadcountry';

describe('Loadcountry', () => {
  let component: Loadcountry;
  let fixture: ComponentFixture<Loadcountry>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [Loadcountry]
    })
    .compileComponents();

    fixture = TestBed.createComponent(Loadcountry);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
