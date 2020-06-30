package com.lwl.bookstore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lwl.bookstore.domain.Book;
import com.lwl.bookstore.repo.BookRepo;

@Service
public class BookServiceImpl implements BookService {
	@Autowired
	private BookRepo bookRepo;

	@Override
	public Book addBook(Book book) {
		return bookRepo.save(book);
	}

	@Override
	public List<Book> getBooks() {
		return bookRepo.findAll();
	}

	@Override
	public Book getById(String id) {
		return bookRepo.findById(id).orElse(null);
	}

	@Override
	public List<Book> search(String str) {
		return bookRepo.findByTitleLikeOrAuthorLike(str);
	}

	@Override
	public Book updateBook(Book book) {
		return bookRepo.save(book);
	}

	@Override
	public boolean deleteBook(String id) {
		if(bookRepo.findById(id).isPresent()) {
			bookRepo.deleteById(id);
			return true;
		}
		return false;
	}

}
