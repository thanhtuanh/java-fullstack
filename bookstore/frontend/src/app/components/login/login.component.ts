import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-login',
  standalone: true,
  imports: [CommonModule, FormsModule],
  templateUrl: './login.component.html'
})
export class LoginComponent {
  username = '';
  password = '';
  error = '';

  constructor(private router: Router) {}

  login(): void {
    if (this.username === 'admin' && this.password === 'admin') {
      localStorage.setItem('auth', 'true');
      this.router.navigate(['/books']);
    } else {
      this.error = 'Falscher Benutzername oder Passwort';
    }
  }
}
