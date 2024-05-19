import { Component, Inject, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { ProfileService } from '../../services/profile.service';

@Component({
  selector: 'app-profile',
  templateUrl: './profile.component.html',
  styleUrls: ['./profile.component.scss']
})
export class ProfileComponent implements OnInit {
  public formGroup: FormGroup = this.formBuilder.group({});

  constructor(
    @Inject(FormBuilder) private readonly formBuilder: FormBuilder,) {}  // No need for @Inject here

  ngOnInit(): void {
    this.formGroup = this.formBuilder.group({
      name: ['', Validators.required],
      surname: ['', Validators.required],
      password: ['', [Validators.required, Validators.minLength(6)]],
      confirmPassword: ['', [Validators.required, Validators.minLength(6)]],
      email: ['', [Validators.required, Validators.email]],
      address: ['', Validators.required],
      zipcode: [0, [Validators.required, Validators.pattern('^[0-9]{5}$')]],
      telephone: [0, [Validators.required, Validators.pattern('^[0-9]{10}$')]],
      info: ['', Validators.required],
      city: ['', Validators.required]
    });
  }

  submit(): void {
    if (this.formGroup.valid) {
      // Handle form submission
      console.log('Form Submitted', this.formGroup.value);
    }
  }
}
