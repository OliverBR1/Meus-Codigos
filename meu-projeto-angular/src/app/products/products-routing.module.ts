import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ProductsFormComponent } from './products-form/products-form.component';
import { ProductsListComponent } from './products-list/products-list.component';

const routes: Routes = [
  {path: 'products-list', component : ProductsListComponent },
  {path: 'products-form', component: ProductsFormComponent},
  {path: 'products-form/:id', component: ProductsFormComponent}
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class ProductsRoutingModule { }
