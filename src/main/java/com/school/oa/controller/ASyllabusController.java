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
import com.school.oa.entity.TimeTable;
import com.school.oa.service.TimeTableService;

import net.sf.json.JSONObject;

@Controller
@RequestMapping("/syllabus")
public class ASyllabusController {
	
	
	
	
	@Resource
	private TimeTableService tableService;

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	@ResponseBody
	public FrontResponse addBooks(HttpServletRequest request, HttpServletResponse response,
			@RequestBody JSONObject jsonObj) {
		FrontResponse fr = new FrontResponse();
		TimeTable timeTable = (TimeTable) JSONObject.toBean(jsonObj, TimeTable.class);
		Timestamp current_time = new Timestamp(new Date().getTime());
		timeTable.setCreate_time(current_time);
		timeTable.setUpdate_time(current_time);
		timeTable.setCollege_id(1);
		timeTable.setClass_id(1);
		timeTable.setIs_active("1");
		timeTable.setMon(1);
		timeTable.setTues(1);
		timeTable.setWed(1);
		timeTable.setThurs(1);
		timeTable.setFir(1);
		timeTable.setSat(1);
		timeTable.setSun(1);
		try {
			int result = tableService.createTimeTable(timeTable);
			if (result != 0) {
				fr.setData(timeTable);
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
		List<TimeTable> timeTables;
		try {
			timeTables = tableService.findAll();
			if (timeTables != null) {
				fr.setData(timeTables);
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
