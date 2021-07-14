import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { PokemonService } from '../pokemon.service';

@Component({
  selector: 'app-pokemon-list',
  templateUrl: './pokemon-list.component.html',
  styleUrls: ['./pokemon-list.component.css']
})
export class PokemonListComponent implements OnInit {
  // injeção de dependência
  pokemons : any = null;
  selecionadoPokemon: any = null;
  offset : number =0;
  limit : number = 10;


  constructor(private pokemonService : PokemonService, private ac:ActivatedRoute) { } //injetado o serviço

    //arrow functions => não precisa escrever function, somente para função sem nome
    // this é quando uma variavel foi declarada a uma classe
    // subscribe avisa que a resposta veio, e espera uma function

    ngOnInit(): void {

      this.ac.queryParams
      .subscribe( (params : any) => {
        console.log(params);
      }

      );

      this.pokemonService.getAll(this.offset, this.limit)
         .subscribe(  (x) => {
           this.pokemons = x;
           console.log(this.pokemons)
         } );
        }

        selecionarPokemon( url : string ){

          this.pokemonService.getOne(url)
          .subscribe(  (x) => {
            this.selecionadoPokemon = x;
            console.log(this.selecionadoPokemon)
          } );
      }

    proximaPagina(){

          this.offset += this.limit;

          this.pokemonService.getAll(this.offset, this.limit)
          .subscribe(
          (data : any) => {
                this.pokemons = data;
              } 
            );
        }

    paginaAnterior(){

          this.offset -= this.limit;

          this.pokemonService.getAll(this.offset, this.limit)
          .subscribe(
          (data : any) => {
                this.pokemons = data;
              } 
            );
        }
        
      }