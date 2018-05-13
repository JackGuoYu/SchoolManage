package com.school.oa.controller;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.school.oa.controller.util.FrontResponse;
import com.school.oa.entity.Book;
import com.school.oa.service.BookService;

import net.sf.json.JSONObject;

@Controller
@RequestMapping("/books")
public class ABooksController {
	
	
	@Resource
	private BookService bookService;

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	@ResponseBody
	public FrontResponse addBooks(HttpServletRequest request, HttpServletResponse response,
			@RequestBody JSONObject jsonObj) {
		FrontResponse fr = new FrontResponse();
		Book book = (Book) JSONObject.toBean(jsonObj, Book.class);
		Timestamp current_time = new Timestamp(new Date().getTime());
		book.setCreate_time(current_time);
		book.setUpdate_time(current_time);
		book.setBorrow_time(current_time);
		book.setGive_time(current_time);
		book.setIs_active("1");
		book.setState("1");
		try {
			int result = bookService.createBook(book);
			if (result != 0) {
				fr.setData(book);
				fr.setCode(FrontResponse.SUCCESS);
				fr.setMsg("执行成功");
			} else {
				fr.setCode(FrontResponse.FAILURE);
				fr.setMsg("执行失败");
			}
		} catch (Exception e) {
			fr.setCode(FrontResponse.FAILURE);
			fr.setMsg("执行失败");
			e.printStackTrace();
		}
		return fr;
	}

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	@ResponseBody
	public FrontResponse getScoresList(HttpServletRequest request, HttpServletResponse response) {
		FrontResponse fr = new FrontResponse();
		List<Book> books;
		try {
			books = bookService.findAll();
			if (books != null) {
				fr.setData(books);
				fr.setCode(FrontResponse.SUCCESS);
				fr.setMsg("执行成功");
			} else {
				fr.setCode(FrontResponse.FAILURE);
				fr.setMsg("执行失败");
			}
		} catch (Exception e) {
			fr.setCode(FrontResponse.FAILURE);
			fr.setMsg("执行失败");
			e.printStackTrace();
		}
		return fr;
	}

}
