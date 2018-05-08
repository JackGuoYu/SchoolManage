package com.school.oa.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.school.oa.entity.User;

@RestController
@EnableAutoConfiguration
@RequestMapping("/testboot")
public class TestBootController {
	
	@RequestMapping("getuser")
	public User getUser() {
	    User user = new User();
	    user.setUsername("小明");
	    return user;
	}
}
