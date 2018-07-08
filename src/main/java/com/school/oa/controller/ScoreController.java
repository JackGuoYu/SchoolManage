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

import com.school.oa.controller.websocket.handle.WebSocketServer;
import com.school.oa.entity.Score;
import com.school.oa.entity.Subject;
import com.school.oa.entity.User;
import com.school.oa.service.ScoreService;
import com.school.oa.service.SubjectService;

@Controller
public class ScoreController {
	
	@Resource
	private ScoreService scoreService;
	
	@Resource
	private SubjectService subjectService;
	
	/**
	 * 跳转到成绩列表
	 * @param map
	 * @return
	 */
	@RequestMapping("/content_score")
    public String content_score(Model model, HttpSession session){
		List<Score> scores = scoreService.findAll();
		model.addAttribute("scores",scores);
		User user = (User)session.getAttribute("user");
		if(user==null) {
			return "error_oa";
		}
		return "score/content_score";
	}
	
	/**
	 * 跳转到新增成绩页
	 * @param map
	 * @return
	 */
	@RequestMapping(value="/scoreadd", method=RequestMethod.GET)
    public String content_score_add(Model model){
		System.out.println("添加成绩");
		WebSocketServer.sendMessageToUsers("添加成绩11111");
		List<Subject> subjects = subjectService.findAll();
		model.addAttribute("subjects", subjects);
		return "/score/content_score_add";
	}
	
	/**
	 * 创建成绩
	 * @param Score
	 * @return
	 */
	@RequestMapping(value="/createScore",method=RequestMethod.POST)
    public String createScore(@ModelAttribute Score score, Model model){
		System.out.println(score);
		Timestamp current_time = new Timestamp(new Date().getTime());
		score.setSubject_id(1);
		score.setUser_id(1);
		score.setCreate_time(current_time);
		score.setUpdate_time(current_time);
		score.setIs_active("1");
		int result = scoreService.createScore(score);
		if(result!=0) {
			System.out.println("创建成功");
			List<Score> scores = scoreService.findAll();
			model.addAttribute("scores",scores);
			return "/score/content_score";
		}
		else {
			System.out.println("创建失败");
			return "error_oa";
		}
	}
	
	
	/**
	 * 更新成绩
	 * @param Score
	 * @return
	 */
	@RequestMapping(value="/updateScore",method=RequestMethod.POST)
    public String updateScore(@ModelAttribute Score score,Model model){
		System.out.println(score);
		Timestamp current_time = new Timestamp(new Date().getTime());
		score.setUpdate_time(current_time);
		score.setIs_active("1");
		int result = scoreService.updateScore(score);
		if(result!=0) {
			List<Score> scores = scoreService.findAll();
			model.addAttribute("scores",scores);
			return "/score/content_score";
		}
		else {
			System.out.println("创建失败");
			return "error_oa";
		}
	}
	
	/**
	 * 删除成绩
	 * @param map
	 * @return
	 */
	@RequestMapping(value="/scoreDelete", method=RequestMethod.GET)
    public String deleteScore(@RequestParam Integer scoreId,Model model){
		Score score = new Score();
		Timestamp current_time = new Timestamp(new Date().getTime());
		score.setUpdate_time(current_time);
		score.setIs_active("0");
		score.setId(scoreId);
		Integer result = scoreService.updateScore(score);
		if(result!=0) {
			List<Score> scores = scoreService.findAll();
			model.addAttribute("scores",scores);
			return "/score/content_score";
		}
		else {
			return "error_oa";
		}
		
	}


	/**
	 * 跳转到成绩编辑页面
	 * @param map
	 * @return
	 */
	@RequestMapping(value="/scoreedit", method=RequestMethod.GET)
    public String content_score_edit(@RequestParam Integer scoreId,Model model){
		Score score = scoreService.selectById(scoreId);
		List<Subject> subjects = subjectService.findAll();
		model.addAttribute("score",score);
		model.addAttribute("subjects", subjects);
		return "/score/content_score_edit";
	}
	
	
	
	
	
	
}
