package com.lwl.bookstore.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lwl.bookstore.domain.Book;
import com.lwl.bookstore.service.BookService;

@RestController
@RequestMapping("/api/v1/book/")
public class BookController {
		@Autowired
		private BookService bookService;
		
		@PostMapping("addnewbook")
		public Book addBook(@RequestBody Book book) {
			return bookService.addBook(book);
		}
		@GetMapping("allbooks")
		public List<Book> getBooks(){
			return bookService.getBooks();
		}
}
