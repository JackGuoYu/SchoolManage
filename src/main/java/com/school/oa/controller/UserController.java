package com.school.oa.controller;


import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.school.oa.entity.User;
import com.school.oa.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController{

	@Resource
	private UserService userService;
	
	@RequestMapping("/showUser")
    public String showUser(User user){
		System.out.println(user);
		User obj = userService.getUser(user);
		if(obj!=null) {
			System.out.println("登录成功");
			return "user/list";
		}
		else {
			System.out.println("登录失败");
			return "user/error";
		}
	}
	
	@RequestMapping("/list")
    @ResponseBody
    public String userList(Model model){
		List<User> users = userService.getUsers();
		model.addAttribute("users", users);
		return "user_list";
	}
	
	@RequestMapping("/login")  
    public String login(){
		return "login";
	}
	
	@RequestMapping("/error")  
    public String error(){
		return "error";
	}

	
}
