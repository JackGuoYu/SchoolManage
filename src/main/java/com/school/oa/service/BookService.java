package com.school.oa.service;

import java.util.List;

import com.school.oa.entity.Book;

public interface BookService {
	List<Book> findAll();
	
	Book selectById(Integer id);
	
	int createBook(Book book);
	
	int updateBook(Book book);
	
	int deleteBook(Integer id);
}
