package com.app.action;

import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.ResultPath;
import org.springframework.beans.factory.annotation.Autowired;

import com.app.bo.Book;
import com.app.service.BookService;

@ResultPath("/pages/")
public class BookAction extends BaseAction {

	private Book book; 
	private List<Book> books;
	
	@Autowired
	private BookService bookservice ;
	
	
	@Action(value = "addBook" , results = { @Result(name="succes" ,location ="addBook.jsp" )})
	public String addBook(){
		bookservice.addBook(book);
		return SUCCESS ;
	}
	@Action(value = "getAllBooks" , results = { @Result(name="succes" ,location ="list.jsp" )})
	public String getAllBooks(){
		
		books = bookservice.gettAllBooks();
		return SUCCESS;
	}
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	public List<Book> getBooks() {
		return books;
	}
	public void setBooks(List<Book> books) {
		this.books = books;
	}
	public BookService getBookservice() {
		return bookservice;
	}
	public void setBookservice(BookService bookservice) {
		this.bookservice = bookservice;
	}
	
}
