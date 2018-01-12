package com.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.bo.Book;
import com.app.dao.BookDao;
import com.app.service.BookService;

@Service
@Transactional
public class BookServiceImpl implements BookService{

	
	@Autowired
	private BookDao bookdao ;
	
	public void addBook(Book b) {
		bookdao.create(b);
	}

	
	public List<Book> gettAllBooks() {
		return bookdao.getAll();
	}

}
