package com.app.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.app.bo.Book;
import com.app.dao.BookDao;
import com.genericdao.impl.HibernateSpringGenericDaoImpl;

@Repository
public class BookDaoImpl extends HibernateSpringGenericDaoImpl<Book, Long> implements BookDao{

	public BookDaoImpl() {
		super(Book.class);
	}

	@Override //TODO liste book by title
	public List<Book> getBookByTitle(String pTitle) {
		return null;
	}

	

}
