package com.school.oa.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.school.oa.dao.mapper.BookDao;
import com.school.oa.entity.Book;
import com.school.oa.service.BookService;

@Service("bookService")
public class BookServiceImpl implements BookService{
	
	@Resource
	private BookDao bookDao;
	
	@Override
	public int createBook(Book book) {
		int result = bookDao.insert(book);
		return result;
	}

	@Override
	public int updateBook(Book book) {
		int result = bookDao.update(book);
		return result;
	}

	@Override
	public int deleteBook(Integer id) {
		int result = bookDao.delete(id);
		return result;
	}

	@Override
	public Book selectById(Integer id) {
		Book book = bookDao.selectById(id);
		return book;
	}

	@Override
	public List<Book> findAll() {
		List<Book> books = bookDao.findAll();
		return books;
	}

}
