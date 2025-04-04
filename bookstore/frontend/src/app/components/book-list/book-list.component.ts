import { Component, OnInit } from '@angular/core';
import { BookService } from '../../services/book.service';
import { Book } from '../../models/book.model';
import { Router } from '@angular/router';
import { CommonModule } from '@angular/common';
import { RouterModule } from '@angular/router';

@Component({
  selector: 'app-book-list',
  standalone: true,
  imports: [CommonModule, RouterModule],
  templateUrl: './book-list.component.html'
})
export class BookListComponent implements OnInit {
  books: Book[] = [];
  isLoading = true;
  error: string | null = null;

  constructor(private readonly bookService: BookService, private readonly router: Router) {}

  ngOnInit(): void {
    this.loadBooks();
  }

  loadBooks(): void {
    this.bookService.getBooks().subscribe({
      next: data => {
        this.books = data;
        this.isLoading = false;
      },
      error: err => {
        this.error = 'Fehler beim Laden der Bücher';
        this.isLoading = false;
      }
    });
  }

  deleteBook(id: number): void {
    if (confirm('Möchtest du dieses Buch wirklich löschen?')) {
      this.bookService.deleteBook(id).subscribe(() => {
        this.loadBooks(); // nach dem Löschen neu laden
      });
    }
  }

  goToCreate(): void {
    this.router.navigate(['/books/create']);
  }
}
