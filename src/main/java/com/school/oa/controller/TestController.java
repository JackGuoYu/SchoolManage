package com.school.oa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

	
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
