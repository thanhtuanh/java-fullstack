import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { BookService, Book } from '../../services/book.service';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { RouterModule } from '@angular/router';

@Component({
  selector: 'app-book-edit',
  standalone: true,
  imports: [CommonModule, FormsModule, RouterModule],
  templateUrl: './book-edit.component.html',
  styleUrls: ['./book-edit.component.css']
})
export class BookEditComponent implements OnInit {
  book!: Book;
  error: string | null = null;

  constructor(
    private readonly route: ActivatedRoute,
    private readonly bookService: BookService,
    private readonly router: Router
  ) { }

  ngOnInit(): void {
    const id = Number(this.route.snapshot.paramMap.get('id'));
    if (isNaN(id)) {
      this.error = 'Ungültige Buch-ID.';
      return;
    }

    this.bookService.getBook(id).subscribe({
      next: (data) => {
        this.book = data;
      },
      error: () => {
        this.error = 'Fehler beim Laden des Buchs.';
      }
    });
  }

  updateBook(): void {
    if (!this.book?.id) return;

    this.bookService.updateBook(this.book.id, this.book).subscribe({
      next: () => {
        this.router.navigate(['/books']);
      },
      error: () => {
        this.error = 'Fehler beim Aktualisieren des Buchs.';
      }
    });
  }
}
