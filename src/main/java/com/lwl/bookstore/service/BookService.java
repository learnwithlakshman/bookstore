package com.lwl.bookstore.service;

import java.util.List;

import com.lwl.bookstore.domain.Book;

public interface BookService {

		public Book addBook(Book book);
		public List<Book> getBooks();
		public Book getById(String id);
		public List<Book> search(String str);
		public Book updateBook(Book book);
		public boolean deleteBook(String id);
		
		
}
