import { Component, OnInit } from '@angular/core';
import { ProductsService } from '../products.service';

@Component({
  selector: 'app-products-list',
  templateUrl: './products-list.component.html',
  styleUrls: ['./products-list.component.css']
})
export class ProductsListComponent implements OnInit {

  products : any = null;
  constructor(private productsService : ProductsService) { }

  ngOnInit(): void {
    this.getAll()  //sempre o segundo metodo a ser executado "ngOnInit"
  }

  getAll(){
    this.productsService.getAll()
      .subscribe(
        (data) => {
          this.products = data;
        }
      );
  }

  onDelete( id : number) {
    this.productsService.delete(id)
      .subscribe(
        () => {
          let index = this.products.data.findIndex( (x : any) => x.id == id );
          this.products.splice (index, 1);
        }
      );
  }

  getCategories( categorias: any ){

    let reponse :string = ``;
 
     if (categorias.length > 0){
 
       categorias.forEach( (el : any) => {
         reponse += `${el.name} ; `
       });
     }
     return reponse
 
   }

}

