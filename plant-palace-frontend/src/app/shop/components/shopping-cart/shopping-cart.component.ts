import { Component } from '@angular/core';
import { ICartProduct } from '../../models/cart-product';

@Component({
  selector: 'app-shopping-cart',
  templateUrl: './shopping-cart.component.html',
  styleUrls: ['./shopping-cart.component.scss']
})
export class ShoppingCartComponent {
  title: string = 'Shopping Cart';
  empptyShoppingCartMessage: string = 'Your shopping cart is empty. Browse products and add them to your cart.'

  products: ICartProduct[] = [{
    id: 0,
    name: 'Item',
    description: '',
    itemPrice: 5,
    selectedQuantity: 5,
    imageUrl: ''
  }];
}
