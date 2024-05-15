import { Component, Input } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-product-list',
  templateUrl: './product-list.component.html',
  styleUrls: ['./product-list.component.scss']
})
export class ProductListComponent {
  type: string = '';
  category: string = '';

  constructor(private router: Router) {
    router.events.subscribe((val) => {
      this.type = this.router.url.split('/').at(1) ?? '';
      this.category = this.router.url.split('/').at(2) ?? '';
      this.fetchProducts();
    });
  }

  fetchProducts(){
    
  }
}
