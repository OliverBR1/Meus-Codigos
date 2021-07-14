import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { CategoriasService } from 'src/app/categorias/categorias.service';
import { ProdutoCategoriaService } from '../products-categories.service';

import { ProductsService} from '../products.service';

@Component({
  selector: 'app-products-form',
  templateUrl: './products-form.component.html',
  styleUrls: ['./products-form.component.css']
})
export class ProductsFormComponent implements OnInit {

  meuForm : FormGroup | any = null;
  categorias : any = null;

  constructor(
    private formBuilder : FormBuilder, 
    private productsService : ProductsService,
    private categoriasService : CategoriasService,
    private productsCategoriesService : ProdutoCategoriaService) { }

  ngOnInit(): void {
    this.createForm();
    this.getAllCategorias();
  }

  private getAllCategorias(){
    this.categoriasService.getAll()
      .subscribe(
        (data)=> {
          this.categorias = data;
        }
      );
  }

  private createForm(){
    this.meuForm = this.formBuilder.group(
      {
        name : [null, [Validators.required]],
        price : [null, [Validators.required]],
        status : [null, [Validators.required]],
        description : [null, [Validators.required]],
        image : [null, [Validators.required]],
        categories : [null, [Validators.required]],
      }
    );
  }

  public onSubmit(){

    this.productsService.save(this.meuForm.value)
      .subscribe(
        (response : any) => {
          console.log(response)
          let products_id = response.data.id;
          let categories_id = this.meuForm.get('categories').value;
          console.log (products_id, categories_id)

          this.productsCategoriesService.save(products_id, categories_id)
            .subscribe(
              () => {
                console.log ("Salvou produto-categoria com sucesso")
              }
            )
        }
      );
  }

}

