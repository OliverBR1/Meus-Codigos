import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { environment } from 'src/environments/environment';
import { HeaderService } from '../shared/services/header.service';

@Injectable({
  providedIn: 'root'
})
export class ProductsService {
  

  url = `${environment.API}/products`;

  constructor(private http : HttpClient, private headerservice : HeaderService) { }

  getAll(){
    return this.http.get(this.url);
  } 

  
  getOne( id : number ){
    return this.http.get(`${this.url}/${id}`);  }

  save(products : any){

    return this.http.post(this.url, products, this.headerservice.getHeader() );
  }

  delete ( id : number ){

    return this.http.delete(`${this.url}/${id}`, this.headerservice.getHeader() );
  }

  update(id : number, products: any){
    return this.http.patch(`${this.url}/${id}`, products, this.headerservice.getHeader() );
  }

}
