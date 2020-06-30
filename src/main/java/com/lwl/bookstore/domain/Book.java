package com.lwl.bookstore.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Book {

		private String id;
		private String isbn;
		private String title;
		private String author;
		private double price;
		public Book() {
		}
		public Book(String isbn, String title, String author, double price) {
			this.isbn = isbn;
			this.title = title;
			this.author = author;
			this.price = price;
		}
		
		
		
		
}
