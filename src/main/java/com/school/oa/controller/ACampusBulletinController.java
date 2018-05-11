package com.school.oa.controller;

import java.sql.Timestamp;
import java.util.Date;
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
import com.school.oa.entity.Notice;
import com.school.oa.service.NoticeService;

import net.sf.json.JSONObject;

@Controller
@RequestMapping("/campusBulletion")
public class ACampusBulletinController {
	
	
	@Resource
	private NoticeService noticeService;

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	@ResponseBody
	public FrontResponse addBooks(HttpServletRequest request, HttpServletResponse response,
			@RequestBody JSONObject jsonObj) {
		FrontResponse fr = new FrontResponse();
		Notice notice = (Notice) JSONObject.toBean(jsonObj, Notice.class);
		Timestamp current_time = new Timestamp(new Date().getTime());
		notice.setCreate_time(current_time);
		notice.setUpdate_time(current_time);
		notice.setUser_id(1);
		notice.setIs_active("1");
		try {
			int result = noticeService.createNotice(notice);
			if (result != 0) {
				fr.setData(notice);
				fr.setCode(FrontResponse.SUCCESS);
				fr.setMsg("执行成功");
			} else {
				fr.setCode(FrontResponse.FAILURE);
				fr.setMsg("执行失败");
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
	public FrontResponse getScoresList(HttpServletRequest request, HttpServletResponse response) {
		FrontResponse fr = new FrontResponse();
		List<Notice> notices;
		try {
			notices = noticeService.findAll();
			if (notices != null) {
				fr.setData(notices);
				fr.setCode(FrontResponse.SUCCESS);
				fr.setMsg("执行成功");
			} else {
				fr.setCode(FrontResponse.FAILURE);
				fr.setMsg("执行失败");
			}
		} catch (Exception e) {
			fr.setCode(FrontResponse.FAILURE);
			fr.setMsg("执行失败");
			e.printStackTrace();
		}
		return fr;
	}


}
