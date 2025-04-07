import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

import { LoginComponent } from './components/login/login.component';
import { BookListComponent } from './components/book-list/book-list.component';
import { BookCreateComponent } from './components/book-create/book-create.component';
import { AuthGuard } from './guards/auth.guard';

const routes: Routes = [
  { path: '', redirectTo: 'books', pathMatch: 'full' },
  { path: 'login', component: LoginComponent },
  { path: 'books', component: BookListComponent, canActivate: [AuthGuard] },
  { path: 'books/create', component: BookCreateComponent, canActivate: [AuthGuard] },
  { path: '**', redirectTo: 'books' }
];

@NgModule({
  imports: [
    RouterModule.forRoot(routes, { useHash: false }) // ✅ Wichtig: HTML5-Modus aktiv
  ],
  exports: [RouterModule]
})
export class AppRoutingModule { }
