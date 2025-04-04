import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { BookService } from '../../services/book.service';
import { Book } from '../../models/book.model';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-book-detail',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './book-detail.component.html'
})
export class BookDetailComponent implements OnInit {
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

  goToEdit(): void {
    this.router.navigate(['/books', this.id, 'edit']);
  }
}
