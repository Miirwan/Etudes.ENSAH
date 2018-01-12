package com.app.service;

import java.util.List;

import com.app.bo.Book;

public interface BookService {

	void addBook(Book b);
	List<Book> gettAllBooks() ;

}
