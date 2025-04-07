import { Component } from '@angular/core';

@Component({
  selector: 'app-welcome',
  standalone: true,
  template: `
    <div style="text-align: center; margin-top: 50px;">
      <h1>📚 Willkommen zu Thanh Bookstore!</h1>
      <p><a routerLink="/login">Zum Login</a></p>
    </div>
  `,
  styles: []
})
export class WelcomeComponent {}
