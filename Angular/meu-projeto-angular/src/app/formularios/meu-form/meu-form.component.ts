import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { CepService } from '../cep.service';

@Component({
  selector: 'app-meu-form',
  templateUrl: './meu-form.component.html',
  styleUrls: ['./meu-form.component.css']
})
export class MeuFormComponent implements OnInit {

  meuForm : FormGroup | any = null;

  constructor(private cepService: CepService) { } // injetar o serviço

  ngOnInit(): void {
   
    this.meuForm = new FormGroup(
    {
      
      email : new FormControl (null, [Validators.required, Validators.email, Validators.minLength(3)] ), // null ali em parênteses seria o primeiro valor
      password : new FormControl (null, [Validators.required] ),
      cep : new FormControl (null, [Validators.required]),
      logradouro : new FormControl (null, [Validators.required]),
      bairro : new FormControl (null, [Validators.required]),   // os mesmos nomes na api "bairro", para pegar os dados do bairro
      localidade : new FormControl (null, [Validators.required]),
      uf : new FormControl (null, [Validators.required])
      }
    );

    console.log(this.meuForm)
    
  }

  onBuscarCep(){

    if ( this.meuForm.controls.cep.value.length == 8 && this.isSomenteNumero(this.meuForm.controls.cep.value) ){

      this.cepService.getCep( this.meuForm.controls.cep.value )
      .subscribe(
        (data : any) => {
          console.log(data);
          this.meuForm.patchValue(
            data
          );
          // this.meuForm.patchValue(
          //   {
          //     logradouro : data.logradouro,
          //     cidade : data.localidade
          //   }
          // );
        },
        (error:any) => {
          console.log(error)
          alert("Erro ao consultar a API viacep")
        },
        () => {
          console.log("Sempre entra aqui .....");  // seria um try catch finally, ele entra nesse console dando erro ou nao
        }
      );
    }

  }
  isSomenteNumero(value:any){
    return ((value != null) &&
           (value !== '') &&
           !isNaN(Number(value.toString())));
  }

}