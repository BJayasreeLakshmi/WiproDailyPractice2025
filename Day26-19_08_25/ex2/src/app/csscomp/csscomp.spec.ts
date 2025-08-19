import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Csscomp } from './csscomp';

describe('Csscomp', () => {
  let component: Csscomp;
  let fixture: ComponentFixture<Csscomp>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [Csscomp]
    })
    .compileComponents();

    fixture = TestBed.createComponent(Csscomp);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
