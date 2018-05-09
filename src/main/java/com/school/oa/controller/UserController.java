package com.school.oa.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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
	
	/**
	 * 跳转到注册页
	 * @param map
	 * @return
	 */
	@RequestMapping("/useradd")
    public String useradd(ModelMap map){
		return "useradd";
	}
	
	@RequestMapping(value="/validate", method=RequestMethod.POST)
	public String validate(@ModelAttribute User user,Model model) throws Exception{
		User obj = userService.getUser(user);
		if(obj!=null) {
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
	@RequestMapping(value="/create",method=RequestMethod.POST)
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
	 * 跳转到用户列表
	 * @param map
	 * @return
	 */
	/*@RequestMapping("/userlist")
    public String userlist(Model model){
		List<User> users = userService.getUsers();
		model.addAttribute("users",users);
		return "userlist";
	}*/
	
	/**
	 * 跳转到用户列表（有页面布局的）
	 * @param map
	 * @return
	 */
	@RequestMapping("/content_user")
    public String content_user(Model model){
		List<User> users = userService.getUsers();
		model.addAttribute("users",users);
		return "content_user";
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
	
	@RequestMapping("/demo11")
    public String helloIndex(ModelMap map){
		return "index";
	}
	
	@RequestMapping("/demo")
    public String helloHtml(ModelMap map){
		return "changepwd";
	}
	
	@RequestMapping("/demo2")
    public String helloHtml2(ModelMap map){
		return "head2";
	}
	
	@RequestMapping("/demo3")
    public String helloHtml3(ModelMap map){
		return "left";
	}
	
	@RequestMapping("/demo4")
    public String helloHtml4(ModelMap map){
		return "main";
	}
	
	
	
	@RequestMapping("/demo6")
    public String helloHtml6(ModelMap map){
		return "p1";
	}
	
	@RequestMapping("/demo7")
    public String helloHtml7(ModelMap map){
		return "p2";
	}
	
	@RequestMapping("/demo8")
    public String helloHtml8(ModelMap map){
		return "p3";
	}
	
	@RequestMapping("/demo9")
    public String helloHtml9(ModelMap map){
		return "tab";
	}
	

	
	
	@RequestMapping("/userupdate")
    public String helloHtml12(ModelMap map){
		return "userupdate";
	}
}
