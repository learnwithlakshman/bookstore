package com.lwl.bookstore.service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.lwl.bookstore.domain.Book;
import com.lwl.bookstore.repo.BookRepo;

@Component
public class CleanDbService {

	@Autowired
	private BookRepo bookRepo;
	private static final Logger log = LoggerFactory.getLogger(CleanDbService.class);

	private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
	


	@Scheduled(fixedDelayString = "${schedule.db.time}")
	public void cleanDbData() {
		log.info("Database is going clean :{}",dateFormat.format(new Date()));
		bookRepo.deleteAll();
		
		Book book1 = new Book("1000001234","Learn Java in 30 Days","Pradeep",450);
		Book book2 = new Book("1000001235","Learn Python in 30 Days","Lakshman",350);
		Book book3 = new Book("1000001236","Learn MongoDB in 3 Days","Lakshman A",250);
		
		bookRepo.saveAll(Stream.of(book1,book2,book3).collect(Collectors.toList()));
		
	}
}
