package com.api.book.bootrestbook.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.api.book.bootrestbook.entities.Book;

public interface BookRepository extends CrudRepository<Book, Integer>{
	public List<Book> findAll();
	public Book findById(int id);
}
