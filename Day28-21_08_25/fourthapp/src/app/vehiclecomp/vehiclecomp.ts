import { CommonModule } from '@angular/common';
import { ChangeDetectorRef, Component } from '@angular/core';
import { Ivehicle } from '../ivehicle';
import { Vehicleservice } from '../vehicleservice';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-vehiclecomp',
  imports: [CommonModule,FormsModule],
  templateUrl: './vehiclecomp.html',
  styleUrl: './vehiclecomp.css'
})
export class Vehiclecomp {

  // vehicles: Ivehicle[] = [];

  // constructor(private vehicleService: Vehicleservice) {}

  // ngOnInit() {
  //   this.vehicleService.getVehicles().subscribe(
  //     (data: Ivehicle[]) => {
  //       this.vehicles = data;
  //       console.log('Vehicles fetched successfully:', this.vehicles);
  //     },
  //     (error) => {
  //       console.error('Error fetching vehicles:', error);
  //     }
  //   );
  // }
  vehicles: Ivehicle[] = [];

  vehicleEdit: Ivehicle = {
    id: 0,
    make: '',
    model: '',
    fuelType: '',
    price: 0
  };

  vehicleAdd: Ivehicle = {
    id: 0,
    make: '',
    model: '',
    fuelType: '',
    price: 0
  };

  constructor(private vehicleService: Vehicleservice, private cdr: ChangeDetectorRef) {}

  ngOnInit(): void {
    this.loadVehicles();
  }

  loadVehicles() {
    this.vehicleService.getVehicles().subscribe({
      next: (data) => {
        this.vehicles = data;
        this.cdr.detectChanges();
      },
      error: (err) => console.error('Error fetching vehicles:', err)
    });
  }

  edit(id:number) {
    this.vehicleService.getVehicleById(id).subscribe({
      next: (data) => {
        this.vehicleEdit = { ...data };
        this.cdr.detectChanges();
      },
      error: (err) => console.error('Error fetching vehicle:', err)
    });
  }

  update() {
    this.vehicleService.updateVehicle(this.vehicleEdit).subscribe({
      next: (updated) => {
        const index = this.vehicles.findIndex(v => v.id === updated.id);
        if (index !== -1) this.vehicles[index] = updated;
        this.vehicleEdit = { id: 0, make: '', model: '', fuelType: '', price: 0 };
        this.cdr.detectChanges();
        this.loadVehicles();
      },
      error: (err) => console.error('Error updating vehicle:', err)
    });
  }

  delete(id: number) {
    this.vehicleService.deleteVehicle(id).subscribe({
      next: () => {
        this.vehicles = this.vehicles.filter(v => v.id !== id);
        this.cdr.detectChanges();
      },
      error: (err) => console.error('Error deleting vehicle:', err)
    });
  }

  save() {
    this.vehicleService.addVehicle(this.vehicleAdd).subscribe({
      next: (newVehicle) => {
        this.vehicles.push(newVehicle);
        this.vehicleAdd = { id: 0, make: '', model: '', fuelType: '', price: 0 };
        this.cdr.detectChanges();
      },
      error: (err) => console.error('Error saving vehicle:', err)
    });
  }

}
