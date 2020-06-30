package com.lwl.bookstore.repo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.lwl.bookstore.domain.Book;

public interface BookRepo extends MongoRepository<Book, String> {

	List<Book> findByTitleLikeOrAuthorLike(String str);

}
