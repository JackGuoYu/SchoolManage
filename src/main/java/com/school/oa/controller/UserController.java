package com.school.oa.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.school.oa.entity.User;
import com.school.oa.service.UserService;

@Controller
public class UserController {
	
	@Resource
	private UserService userService;
	
	/**
	 * 跳转到登陆页
	 * @param map
	 * @return
	 */
	@RequestMapping("/login")
    public String login(ModelMap map){
		return "login";
	}
	
	/**
	 * 跳转到错误页面
	 * @param map
	 * @return
	 */
	@RequestMapping("/error_oa")
    public String error_oa(ModelMap map){
		return "error_oa";
	}
	

	
	@RequestMapping(value="/validate", method=RequestMethod.POST)
	public String validate(@ModelAttribute User user,Model model, HttpSession session) throws Exception{
		User obj = userService.getUser(user);
		if(obj!=null) {
			session.setAttribute("user", obj);
			System.out.println("登录成功");
			return "content";
		}
		else {
			System.out.println("登录失败");
			return "error_oa";
		}
	}
	
	/**
	 * 创建用户
	 * @param user
	 * @return
	 */
	@RequestMapping(value="/createUser",method=RequestMethod.POST)
    public String createUser(@ModelAttribute User user){
		System.out.println(user);
		int result = userService.createUser(user);
		if(result!=0) {
			System.out.println("创建成功");
			return "redirect:content";
		}
		else {
			System.out.println("创建失败");
			return "redirect:error_oa";
		}
	}
	
	
	/**
	 * 更新用户
	 * @param user
	 * @return
	 */
	@RequestMapping(value="/updateUser",method=RequestMethod.POST)
    public String updateUser(@ModelAttribute User user,Model model){
		System.out.println(user);
		int result = userService.updateUser(user);
		if(result!=0) {
			List<User> users = userService.getUsers();
			model.addAttribute("users",users);
			return "/user/content_user";
		}
		else {
			System.out.println("创建失败");
			return "error_oa";
		}
	}
	
	/**
	 * 删除用户
	 * @param map
	 * @return
	 */
	@RequestMapping(value="/userDelete", method=RequestMethod.GET)
    public String deleteUser(@RequestParam Integer userId,Model model){
		Integer result = userService.deleteUser(userId);
		if(result!=0) {
			List<User> users = userService.getUsers();
			model.addAttribute("users",users);
			return "/user/content_user";
		}
		else {
			return "error_oa";
		}
		
	}

	
	/**
	 * 跳转到用户列表（有页面布局的）
	 * @param map
	 * @return
	 */
	@RequestMapping("/content_user")
    public String content_user(Model model){
		List<User> users = userService.getUsers();
		model.addAttribute("users",users);
		return "user/content_user";
	}
	
	/**
	 * 跳转到用户编辑页面
	 * @param map
	 * @return
	 */
	@RequestMapping(value="/useredit", method=RequestMethod.GET)
    public String content_user_edit(@RequestParam Integer userId,Model model){
		User user = userService.enterUserForm(userId);
		model.addAttribute("user",user);
		return "/user/content_user_edit";
	}
	
	/**
	 * 跳转到注册页
	 * @param map
	 * @return
	 */
	@RequestMapping(value="/userRegister", method=RequestMethod.GET)
    public String userRegister(){
		return "useradd";
	}
	
	/**
	 * 跳转到首页
	 * @param map
	 * @return
	 */
	@RequestMapping("/content")
    public String content(ModelMap map){
		return "content";
	}
	
	
}
