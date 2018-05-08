package com.school.oa.controller;


import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.school.oa.entity.User;
import com.school.oa.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController{

	@Resource
	private UserService userService;
	
	/**
	 * 判断用户登录
	 * @param user
	 * @return
	 */
	@RequestMapping("/showUser")
    public String showUser(User user){
		System.out.println(user);
		User obj = userService.getUser(user);
		if(obj!=null) {
			System.out.println("登录成功");
			return "redirect:list";
		}
		else {
			System.out.println("登录失败");
			return "redirect:error";
		}
	}
	
	/**
	 * 创建用户
	 */
	@RequestMapping(value="/create",method=RequestMethod.POST)
    public String createUser(User user){
		System.out.println(user);
		int result = userService.createUser(user);
		if(result!=0) {
			System.out.println("创建成功");
			return "redirect:list";
		}
		else {
			System.out.println("创建失败");
			return "redirect:error";
		}
	}
	
	/**
	 * 编辑用户
	 */
	@RequestMapping(value="/update",method=RequestMethod.POST)
    public String updateUser(User user){
		System.out.println(user);
		int result = userService.updateUser(user);
		if(result!=0) {
			System.out.println("创建成功");
			return "redirect:list";
		}
		else {
			System.out.println("创建失败");
			return "redirect:error";
		}
	}
	
	@RequestMapping(value="/delete",method=RequestMethod.GET)
    public String deleteUser(@RequestParam Integer userId){
		int result = userService.deleteUser(userId);
		if(result!=0) {
			System.out.println("删除成功");
			return "redirect:list";
		}
		else {
			System.out.println("删除失败");
			return "redirect:error";
		}
	}
	
	/**
	 * 用户列表
	 * @param model
	 * @return
	 */
	@RequestMapping("/list")
    @ResponseBody
    public ModelAndView userList(Model model){
		List<User> users = userService.getUsers();
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("users", users);
		modelAndView.setViewName("user_list");
//		model.addAttribute("users", users);
		return modelAndView;
	}
	
	/**
	 * 安卓
	 * 显示列表
	 * @param model
	 * @return
	 */
	@RequestMapping("/a/list")
    @ResponseBody
    public List<User> userListJson(Model model){
		List<User> users = userService.getUsers();
		
		return users;
	}
	
	/**
	 * 跳转登录页
	 * @return
	 */
	@RequestMapping("/login")  
    public String login(){
		return "login";
	}
	

	
	/**
	 * 跳转编辑页
	 * @return
	 */
	@RequestMapping(value = "/edit",method=RequestMethod.GET)  
    public ModelAndView edit(@RequestParam Integer userId){
		ModelAndView modelAndView = new ModelAndView();
		User user = userService.enterUserForm(userId);
		modelAndView.addObject("user", user);
		modelAndView.setViewName("user_edit");
		return modelAndView;
	}
	
	/**
	 * 跳转注册页
	 * @return
	 */
	@RequestMapping("/register")  
    public String register(){
		return "user_register";
	}
	
	/**
	 * 错误页面
	 * @return
	 */
	@RequestMapping("/error")  
    public String error(){
		return "error_oa";
	}
	
	
}
