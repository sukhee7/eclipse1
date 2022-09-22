package com.api.book.bootrestbook.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.book.bootrestbook.entities.Book;
import com.api.book.bootrestbook.services.BookServices;

@RestController
public class BookController {
	
	@Autowired
	private BookServices bookService;
	
	@GetMapping("/books")
	public List<Book> getBooks() {
		return this.bookService.getAllBooks();
	}
	
	@GetMapping("/books/{id}")
	public Book getBook(@PathVariable("id") int id) {
		return this.bookService.getBookById(id);
	}
	
	@PostMapping("/books")
	public Book setBook(@RequestBody Book book) {
		Book b = this.bookService.setBook(book);
		return b;
	}
	
	@DeleteMapping("/books/{id}")
	public Book deleteBook(@PathVariable("id") int id) {
		Book book = this.bookService.deleteBook(id);
		return book;
	}
	
	@PutMapping("/books/{id}")
	public void updateBook(@RequestBody Book book, @PathVariable("id") int id) {
		this.bookService.updateBook(book, id);
	}
	
	
}
