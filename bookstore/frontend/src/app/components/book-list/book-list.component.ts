// ✅ book-list.component.ts

import { Component, OnInit } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { RouterModule, Router } from '@angular/router';
import { MatPaginatorModule } from '@angular/material/paginator';
import { BookService, Book } from '../../services/book.service';

@Component({
  selector: 'app-book-list',
  standalone: true,
  imports: [CommonModule, FormsModule, RouterModule, MatPaginatorModule],
  templateUrl: './book-list.component.html',
  styleUrls: ['./book-list.component.css']
})
export class BookListComponent implements OnInit {
  books: Book[] = [];
  filteredBooks: Book[] = [];
  isLoading = false;
  error: string | null = null;
  searchQuery = '';
  page = 0;

  constructor(
    private readonly bookService: BookService,
    private readonly router: Router
  ) { }

  ngOnInit(): void {
    this.loadBooks();
  }

  loadBooks(): void {
    this.isLoading = true;
    this.bookService.getBooks().subscribe({
      next: (data) => {
        this.books = data;
        this.filteredBooks = [...this.books];
        this.isLoading = false;
      },
      error: () => {
        this.error = 'Fehler beim Laden der Bücher.';
        this.isLoading = false;
      }
    });
  }

  filterBooks(): void {
    if (this.searchQuery) {
      const query = this.searchQuery.toLowerCase();
      this.filteredBooks = this.books.filter(book =>
        book.title.toLowerCase().includes(query) ||
        book.author.toLowerCase().includes(query) ||
        book.genre.toLowerCase().includes(query)
      );
    } else {
      this.filteredBooks = [...this.books];
    }
    this.page = 0;
  }

  onPageChange(event: any): void {
    this.page = event.pageIndex;
  }

  onEdit(book: Book): void {
    this.router.navigate(['/books', book.id, 'edit']);
  }

  onDelete(book: Book): void {
    const confirmed = confirm(`Soll das Buch "${book.title}" wirklich gelöscht werden?`);
    if (confirmed) {
      this.bookService.deleteBook(book.id).subscribe({
        next: () => {
          this.books = this.books.filter(b => b.id !== book.id);
          this.filterBooks();
        },
        error: () => {
          this.error = 'Löschen fehlgeschlagen.';
        }
      });
    }
  }
}
