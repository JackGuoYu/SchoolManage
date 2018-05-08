package com.school.oa.dao.mapper;

import java.util.List;

import com.school.oa.entity.Book;

public interface BookDao {
	List<Book> findAll();
	
	Book selectById(Integer id);
	
	int insert(Book book);
	
	int update(Book book);
	
	int delete(Integer id);
}
