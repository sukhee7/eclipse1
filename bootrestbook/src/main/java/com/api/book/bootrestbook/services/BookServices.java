package com.api.book.bootrestbook.services;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.api.book.bootrestbook.dao.BookRepository;
import com.api.book.bootrestbook.entities.Book;

@Component
public class BookServices {
	
	@Autowired
	private BookRepository bookRepo;
	
	
	public BookServices() {
		// TODO Auto-generated constructor stub
	}
	
	

	public BookServices(BookRepository bookRepo) {
		super();
		this.bookRepo = bookRepo;
	}
	
	



	public BookRepository getBookRepo() {
		return bookRepo;
	}



	public void setBookRepo(BookRepository bookRepo) {
		this.bookRepo = bookRepo;
	}





//	static List<Book> list = new ArrayList<>();
	
//	static {
//		list.add(new Book(0, "Book1", "P1"));
//		list.add(new Book(1, "Book2", "P2"));
//		list.add(new Book(2, "Book3", "P3"));
//		list.add(new Book(3, "Book4", "P4"));
//		list.add(new Book(4, "Book5", "P5"));
//	}
	
	public List<Book> getAllBooks(){
		return this.bookRepo.findAll();
	}
	
	public Book getBookById(int id) {
		//Book book = null;
		//book = list.stream().filter(e -> e.getBid() == id).findFirst().get();
		return this.bookRepo.findById(id);
	}
	
	public Book setBook(Book b) {
		this.bookRepo.save(b);
		return b;
	}
	
	public Book deleteBook(int id) {
//		Book book = null;
//		book = list.stream().filter(e -> e.getBid() == id).findFirst().get();
//		list.remove(book);
		Book b = this.bookRepo.findById(id);
		this.bookRepo.deleteById(id);
		return b;
	}

	public void updateBook(Book book, int id) {
		//Book b = list.stream().filter(e -> e.getBid() == id).findFirst().get();
		//list.set(list.indexOf(b), book);
		
//		list.stream().map(b -> {
//			if(b.getBid() == id) {
//				b.setTitle(book.getTitle());
//				b.setAuthor(book.getAuthor());
//			}
//			return b;
//		});
		
		this.bookRepo.save(book);
		
	}

}
