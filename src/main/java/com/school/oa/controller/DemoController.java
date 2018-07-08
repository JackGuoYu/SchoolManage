package com.school.oa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.school.oa.service.impl.RedisServiceImpl;

@RestController
public class DemoController {
	
	@Autowired
	private RedisServiceImpl redisServiceImpl;
	
	@RequestMapping("/testhhh")
	public void demoTest() {
		redisServiceImpl.set("1","123234");
		System.out.println("已经设置了");
		System.out.println(redisServiceImpl.get("1"));
	}
	
}
