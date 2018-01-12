package com.app.dao;

import java.util.List;

import com.app.bo.Book;
import com.genericdao.api.GenericDao;

public interface BookDao extends GenericDao<Book, Long>{

	public List<Book> getBookByTitle(String pTitle);
}
