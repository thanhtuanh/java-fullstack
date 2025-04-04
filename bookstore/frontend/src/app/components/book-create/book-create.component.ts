import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { Router } from '@angular/router';
import { BookService } from '../../services/book.service';
import { Book } from '../../models/book.model';

@Component({
  selector: 'app-book-create',
  standalone: true,
  imports: [CommonModule, FormsModule],
  templateUrl: './book-create.component.html'
})
export class BookCreateComponent {
  book: Book = {
    id: 0,
    title: '',
    author: '',
    isbn: '',
    description: '',
    publication_date: '',
    price: 0,
    pages: 0,
    genre: '',
    in_stock: true
  };

  constructor(private readonly bookService: BookService, private readonly router: Router) {}

  createBook(): void {
    this.bookService.createBook(this.book).subscribe(() => {
      this.router.navigate(['/books']);
    });
  }
}
