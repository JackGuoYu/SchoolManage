package com.school.oa.controller;


import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.school.oa.entity.Book;
import com.school.oa.entity.User;
import com.school.oa.service.BookService;
import com.school.oa.service.UserService;

@Controller
public class BookController {
	
	@Resource
	private BookService bookService;
	
	@Resource
	private UserService userService;
	
	
	/**
	 * 跳转到图书列表
	 * @param map
	 * @return
	 */
	@RequestMapping("/content_book")
    public String content_book(Model model,HttpSession session){
		List<Book> books = bookService.findAll();
		model.addAttribute("books",books);
		User user = (User)session.getAttribute("user");
		if(user==null) {
			return "error_oa";
		}
		return "book/content_book";
	}
	
	/**
	 * 跳转到新增图书页
	 * @param map
	 * @return
	 */
	@RequestMapping(value="/bookadd", method=RequestMethod.GET)
    public String content_book_add(Model model){
		List<User> users = userService.getUsers();
		model.addAttribute("users",users);
		return "/book/content_book_add";
	}
	

	/**
	 * 创建图书
	 * @param book
	 * @return
	 */
	@RequestMapping(value="/createBook",method=RequestMethod.POST)
    public String createBook(@ModelAttribute Book book, Model model, HttpSession session){
		System.out.println(book);
		Timestamp current_time = new Timestamp(new Date().getTime());
		User user = (User) session.getAttribute("user");
		Date date = new Date();
		SimpleDateFormat format = new SimpleDateFormat("yyMMddHHmmss");
		book.setBorrow_num(0);
		book.setBook_code("TS"+format.format(date));
		book.setCreate_time(current_time);
		book.setUpdate_time(current_time);
		book.setIs_active("1");
		if(user==null) {
			return "error_oa";
		}
		int result = bookService.createBook(book);
		if(result!=0) {
			System.out.println("创建成功");
			List<Book> books = bookService.findAll();
			model.addAttribute("books",books);
			return "/book/content_book";
		}
		else {
			System.out.println("创建失败");
			return "error_oa";
		}
	}
	
	
	/**
	 * 更新图书
	 * @param book
	 * @return
	 */
	@RequestMapping(value="/updateBook",method=RequestMethod.POST)
    public String updateBook(@ModelAttribute Book book,Model model,HttpSession session){
		System.out.println(book);
		book.setBorrow_num(book.getBorrow_num()+1);
		Timestamp current_time = new Timestamp(new Date().getTime());
		book.setUpdate_time(current_time);
		book.setIs_active("1");
	
		User user = (User)session.getAttribute("user");
		if(user==null) {
			return "error_oa";
		}
		int result = bookService.updateBook(book);
		if(result!=0) {
			List<Book> books = bookService.findAll();
			model.addAttribute("books",books);
			return "/book/content_book";
		}
		else {
			System.out.println("创建失败");
			return "error_oa";
		}
	}
	
	/**
	 * 删除图书
	 * @param map
	 * @return
	 */
	@RequestMapping(value="/bookDelete", method=RequestMethod.GET)
    public String deleteBook(@RequestParam Integer bookId,Model model){
		Book book = new Book();
		Timestamp current_time = new Timestamp(new Date().getTime());
		book.setUpdate_time(current_time);
		book.setIs_active("0");
		book.setId(bookId);
		Integer result = bookService.updateBook(book);
		if(result!=0) {
			List<Book> books = bookService.findAll();
			model.addAttribute("books",books);
			return "/book/content_book";
		}
		else {
			return "error_oa";
		}
		
	}


	/**
	 * 跳转到图书编辑页面
	 * @param map
	 * @return
	 */
	@RequestMapping(value="/bookedit", method=RequestMethod.GET)
    public String content_book_edit(@RequestParam Integer bookId,Model model){
		Book book = bookService.selectById(bookId);
		List<User> users = userService.getUsers();
		model.addAttribute("book",book);
		model.addAttribute("users",users);
		return "/book/content_book_edit";
	}
	
	
	
	
	
	
}
