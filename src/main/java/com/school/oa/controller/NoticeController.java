package com.school.oa.controller;


import java.sql.Timestamp;
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

import com.school.oa.entity.Notice;
import com.school.oa.entity.User;
import com.school.oa.service.NoticeService;

@Controller
public class NoticeController {
	
	@Resource
	private NoticeService noticeService;
	
	
	/**
	 * 跳转到公告列表
	 * @param map
	 * @return
	 */
	@RequestMapping("/content_notice")
    public String content_notice(Model model,HttpSession session){
		List<Notice> notices = noticeService.findAll();
		model.addAttribute("notices",notices);
		User user = (User)session.getAttribute("user");
		if(user==null) {
			return "error_oa";
		}
		return "notice/content_notice";
	}
	
	/**
	 * 跳转到新增公告页
	 * @param map
	 * @return
	 */
	@RequestMapping(value="/noticeadd", method=RequestMethod.GET)
    public String content_notice_add(Model model){
		return "/notice/content_notice_add";
	}
	
	/**
	 * 创建公告
	 * @param notice
	 * @return
	 */
	@RequestMapping(value="/createNotice",method=RequestMethod.POST)
    public String createNotice(@ModelAttribute Notice notice, Model model, HttpSession session){
		System.out.println(notice);
		Timestamp current_time = new Timestamp(new Date().getTime());
		User user = (User) session.getAttribute("user");
		notice.setCreate_time(current_time);
		notice.setUpdate_time(current_time);
		notice.setIs_active("1");
		if(user==null) {
			return "error_oa";
		}
		else {
			notice.setUser_id(user.getId());
			notice.setUser_name(user.getUsername());
		}
		int result = noticeService.createNotice(notice);
		if(result!=0) {
			System.out.println("创建成功");
			List<Notice> notices = noticeService.findAll();
			model.addAttribute("notices",notices);
			return "/notice/content_notice";
		}
		else {
			System.out.println("创建失败");
			return "error_oa";
		}
	}
	
	
	/**
	 * 更新公告
	 * @param notice
	 * @return
	 */
	@RequestMapping(value="/updateNotice",method=RequestMethod.POST)
    public String updateNotice(@ModelAttribute Notice notice,Model model,HttpSession session){
		System.out.println(notice);
		Timestamp current_time = new Timestamp(new Date().getTime());
		notice.setUpdate_time(current_time);
		notice.setIs_active("1");
		User user = (User)session.getAttribute("user");
		if(user==null) {
			return "error_oa";
		}
		else {
			notice.setUser_id(user.getId());
			notice.setUser_name(user.getUsername());
		}
		
		int result = noticeService.updateNotice(notice);
		if(result!=0) {
			List<Notice> notices = noticeService.findAll();
			model.addAttribute("notices",notices);
			return "/notice/content_notice";
		}
		else {
			System.out.println("创建失败");
			return "error_oa";
		}
	}
	
	/**
	 * 删除公告
	 * @param map
	 * @return
	 */
	@RequestMapping(value="/noticeDelete", method=RequestMethod.GET)
    public String deleteNotice(@RequestParam Integer noticeId,Model model){
		Notice notice = new Notice();
		Timestamp current_time = new Timestamp(new Date().getTime());
		notice.setUpdate_time(current_time);
		notice.setIs_active("0");
		notice.setId(noticeId);
		Integer result = noticeService.updateNotice(notice);
		if(result!=0) {
			List<Notice> notices = noticeService.findAll();
			model.addAttribute("notices",notices);
			return "/notice/content_notice";
		}
		else {
			return "error_oa";
		}
		
	}


	/**
	 * 跳转到公告编辑页面
	 * @param map
	 * @return
	 */
	@RequestMapping(value="/noticeedit", method=RequestMethod.GET)
    public String content_notice_edit(@RequestParam Integer noticeId,Model model){
		Notice notice = noticeService.selectById(noticeId);
		model.addAttribute("notice",notice);
		return "/notice/content_notice_edit";
	}
	
	
	
	
	
	
}
