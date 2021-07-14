import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { PrimeiroComponent } from './primeiro/primeiro.component';
import { PokemonGuardService } from './shared/services/pokemon-guard.service';


const routes: Routes = [
  { path:'primeiro', component: PrimeiroComponent },
  { path: 'pokemons', loadChildren: () => import('./pokemons/pokemons.module').then(m => m.PokemonsModule)  , canActivate : [] },
  { path: 'auth', loadChildren: () => import('./auth/auth.module').then(m => m.AuthModule) },
  { path: 'categorias', loadChildren: () => import('./categorias/categorias.module').then(m => m.CategoriasModule)  },
  { path: 'crud', loadChildren: () => import('./crud/crud.module').then(m => m.CrudModule)  },
  { path: 'formularios', loadChildren: () => import('./formularios/formularios.module').then(m => m.FormulariosModule)  },
  { path: 'usuarios', loadChildren: () => import('./usuarios/usuarios.module').then(m => m.UsuariosModule)  },
  { path: 'products', loadChildren: () => import('./products/products.module').then(m => m.ProductsModule)  }
  
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
