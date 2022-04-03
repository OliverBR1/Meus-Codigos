import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
import { CategoriasService } from '../categorias.service';

@Component({
  selector: 'app-categorias-form',
  templateUrl: './categorias-form.component.html',
  styleUrls: ['./categorias-form.component.css']
})
export class CategoriasFormComponent implements OnInit {

  meuForm : FormGroup | any = null;
  isEdicao : boolean = false;
  id : number = 0;

  constructor(
    private formBuilder : FormBuilder, 
    private categoriasService : CategoriasService,
    private router: Router,
    private activatedRoute : ActivatedRoute) { }

  ngOnInit(): void {
    // this.meuForm = new FormGroup (
    //   {
    //     nome : new FormControl ( null, [Validators.required] )
    //   }
    // );

    this.meuForm = this.formBuilder.group(
      {
        name : [ null, [Validators.required] ],
        description : [ null, [Validators.required] ],
        status : [ null, [Validators.required] ]
      }
    );
   
    this.activatedRoute.params
      .subscribe(
        (params : any) => { //pega todos os path params
          console.log(params)

          // é Edição
          if (params.id){
            this.isEdicao = true;
            this.id = params.id;
            this.categoriasService.getOne( this.id ).subscribe(
              (resp : any) => {
                console.log (resp)
                this.meuForm.patchValue( resp.data ) // esse data é as informações
              }
            );
          }
        }
      );

  }

  onSubmit(){
    console.log(this.meuForm)

    // Verificando se é edição
    if (this.isEdicao){
      this.categoriasService.update( this.id, this.meuForm.value ).
        subscribe(
          (data) => {
            this.router.navigate(['/categorias/categorias-list'])
          }
        )
    }
    else{

      this.categoriasService.save(this.meuForm.value)
      .subscribe(
        (data) => {
          console.log(data)
          this.meuForm.reset();
          this.router.navigate(['/categorias/categorias-list'])
        }
      );

    }


  }

}