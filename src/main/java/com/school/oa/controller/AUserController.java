package com.school.oa.controller;

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
import com.school.oa.entity.User;
import com.school.oa.service.UserService;

import net.sf.json.JSONObject;

@Controller
@RequestMapping("/auser")
public class AUserController {

	@Resource
	private UserService userService;
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	@ResponseBody
	public FrontResponse loginUser(HttpServletRequest request, HttpServletResponse response,
			@RequestBody JSONObject jsonObj) {
		FrontResponse fr = new FrontResponse();
		User user;
		try {
			user = (User)JSONObject.toBean(jsonObj,User.class);
			user = userService.getUser(user);
			if (user != null) {
				fr.setData(user);
				fr.setCode(FrontResponse.SUCCESS);
				fr.setMsg("执行成功");
			}
		} catch (Exception e) {
			fr.setCode(FrontResponse.FAILURE);
			fr.setMsg("执行失败");
			e.printStackTrace();
		}
		return fr;
	}
	
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	@ResponseBody
	public FrontResponse registerUser(HttpServletRequest request, HttpServletResponse response,
			@RequestBody JSONObject jsonObj) {
		FrontResponse fr = new FrontResponse();
		User user;
		try {
			user = (User)JSONObject.toBean(jsonObj,User.class);
			int result = userService.createUser(user);
			if (result != 0) {
				fr.setData(user);
				fr.setCode(FrontResponse.SUCCESS);
				fr.setMsg("执行成功");
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
	public FrontResponse registerUser(HttpServletRequest request, HttpServletResponse response) {
		FrontResponse fr = new FrontResponse();
		List<User> users;
		try {
			users = userService.getUsers();
			if (users != null) {
				fr.setData(users);
				fr.setCode(FrontResponse.SUCCESS);
				fr.setMsg("执行成功");
			}
		} catch (Exception e) {
			fr.setCode(FrontResponse.FAILURE);
			fr.setMsg("执行失败");
			e.printStackTrace();
		}
		return fr;
	}
	
}
