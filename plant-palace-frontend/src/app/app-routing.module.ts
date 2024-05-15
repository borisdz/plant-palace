import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LoginComponent } from './authentication/components/login/login.component';
import { RegisterComponent } from './authentication/components/register/register.component';
import { HomeComponent } from './shop/components/home/home.component';
import { ProductListComponent } from './shop/components/product-list/product-list.component';
import { ShoppingCartComponent } from './shop/components/shopping-cart/shopping-cart.component';

const routes: Routes = [
  {
    path: 'home',
    component: HomeComponent
  },
  {
    path: 'login',
    component: LoginComponent
  },
  {
    path: 'register',
    component: RegisterComponent
  },
  {
    path: ':productsType/:categoryName',
    component: ProductListComponent
  },
  {
    path: 'shopping-cart',
    component: ShoppingCartComponent
  },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
