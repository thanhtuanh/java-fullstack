import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { BookService } from '../../services/book.service';
import { Book } from '../../models/book.model';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-book-edit',
  standalone: true,
  imports: [CommonModule, FormsModule],
  templateUrl: './book-edit.component.html'
})
export class BookEditComponent implements OnInit {
  book!: Book;
  id!: number;

  constructor(
    private readonly route: ActivatedRoute,
    private readonly bookService: BookService,
    private readonly router: Router
  ) {}

  ngOnInit(): void {
    this.id = Number(this.route.snapshot.paramMap.get('id'));
    this.bookService.getBook(this.id).subscribe(data => {
      this.book = data;
    });
  }

  updateBook(): void {
    this.bookService.updateBook(this.id, this.book).subscribe(() => {
      this.router.navigate(['/books']);
    });
  }
}
