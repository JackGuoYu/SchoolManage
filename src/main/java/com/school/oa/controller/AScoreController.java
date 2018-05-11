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
import com.school.oa.entity.Score;
import com.school.oa.service.ScoreService;

import net.sf.json.JSONObject;

@Controller
@RequestMapping("/scores")
public class AScoreController {
	@Resource
	private ScoreService scoreService;

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	@ResponseBody
	public FrontResponse addBooks(HttpServletRequest request, HttpServletResponse response,
			@RequestBody JSONObject jsonObj) {
		FrontResponse fr = new FrontResponse();
		Score score = (Score) JSONObject.toBean(jsonObj, Score.class);
		Timestamp current_time = new Timestamp(new Date().getTime());
		score.setSubject_id(1);
		score.setUser_id(1);
		score.setCreate_time(current_time);
		score.setUpdate_time(current_time);
		score.setIs_active("1");
		try {
			int result = scoreService.createScore(score);
			if (result != 0) {
				fr.setData(score);
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
		List<Score> scores;
		try {
			scores = scoreService.findAll();
			if (scores != null) {
				fr.setData(scores);
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
