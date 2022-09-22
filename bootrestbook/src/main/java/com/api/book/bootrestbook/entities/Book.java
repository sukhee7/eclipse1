package com.api.book.bootrestbook.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class Book {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int Bid;
	private String title;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JsonManagedReference
	private Author author;
	
	public Book() {
	}

	public Book(int bid, String title, Author author) {
		super();
		Bid = bid;
		this.title = title;
		this.author = author;
	}

	public int getBid() {
		return Bid;
	}

	public void setBid(int bid) {
		Bid = bid;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "Book [Bid=" + Bid + ", title=" + title + ", author=" + author + "]";
	}
	
	
}
