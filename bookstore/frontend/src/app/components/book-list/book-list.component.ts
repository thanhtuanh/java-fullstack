import { Component, OnInit } from '@angular/core';
import { BookService } from '../../services/book.service';
import { Book } from '../../models/book.model';
import { RouterModule, Router } from '@angular/router';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { AuthService } from '../../services/auth.service';

@Component({
  selector: 'app-book-list',
  templateUrl: './book-list.component.html',
  styleUrls: ['./book-list.component.css'],
  standalone: true,
  imports: [CommonModule, RouterModule, FormsModule]
})
export class BookListComponent implements OnInit {
  books: Book[] = [];
  visibleBooks: Book[] = [];
  searchText: string = '';
  hasError: boolean = false;

  constructor(
    private readonly bookService: BookService,
    public authService: AuthService,
    private readonly router: Router
  ) { }

  ngOnInit(): void {
    if (!this.authService.isLoggedIn()) {
      this.router.navigate(['/login']);
      return;
    }

    this.bookService.getBooks().subscribe({
      next: (data) => {
        this.books = data;
        this.hasError = false;
        this.updateFilteredBooks();
      },
      error: (err) => {
        console.error('❌ Fehler beim Laden der Bücher:', err);
        this.hasError = true;
      }
    });
  }


  updateFilteredBooks(): void {
    const search = this.searchText.toLowerCase();
    this.visibleBooks = this.books.filter(book =>
      book.title.toLowerCase().includes(search) ||
      book.author.toLowerCase().includes(search) ||
      book.genre.toLowerCase().includes(search)
    );
  }

  deleteBook(id: number): void {
    if (!confirm('Buch wirklich löschen?')) return;

    this.bookService.deleteBook(id).subscribe({
      next: () => {
        this.books = this.books.filter(book => book.id !== id);
        this.updateFilteredBooks();
      },
      error: (err) => {
        console.error('❌ Fehler beim Löschen des Buches:', err);
      }
    });
  }
}
