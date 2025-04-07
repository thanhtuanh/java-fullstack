import { Component } from '@angular/core';
import { RouterModule, Router } from '@angular/router';
import { BookService, Book } from '../../services/book.service';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';


@Component({
  selector: 'app-book-create',
  standalone: true,
  imports: [CommonModule, FormsModule, RouterModule], // 🟢 RouterModule hinzufügen
  templateUrl: './book-create.component.html',
  styleUrls: ['./book-create.component.css']

})
export class BookCreateComponent {
  book: Book = {
    id: 0,
    title: '',
    author: '',
    isbn: '',
    description: '',
    publicationDate: '',
    price: 0,
    pages: 0,
    genre: '',
    inStock: true
  };

  constructor(private readonly bookService: BookService, private readonly router: Router) { }

  createBook(): void {
    this.bookService.createBook(this.book).subscribe(() => {
      this.router.navigate(['/books']);
    });
  }
}
