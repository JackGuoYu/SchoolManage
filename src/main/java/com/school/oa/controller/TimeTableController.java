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

import com.school.oa.entity.College;
import com.school.oa.entity.OAClass;
import com.school.oa.entity.Subject;
import com.school.oa.entity.TimeTable;
import com.school.oa.entity.User;
import com.school.oa.service.CollegeService;
import com.school.oa.service.OAClassService;
import com.school.oa.service.SubjectService;
import com.school.oa.service.TimeTableService;

@Controller
public class TimeTableController {
	
	@Resource
	private TimeTableService timeTableService;
	
	@Resource
	private CollegeService collegeService;
	
	@Resource
	private OAClassService oAClassService;
	
	@Resource
	private SubjectService subjectService;
	
	/**
	 * 跳转到课表列表
	 * @param map
	 * @return
	 */
	@RequestMapping("/content_timetable")
    public String content_timetable(Model model, HttpSession session){
		List<TimeTable> timetables = timeTableService.findAll();
		model.addAttribute("timetables",timetables);
		User user = (User)session.getAttribute("user");
		if(user==null) {
			return "error_oa";
		}
		return "timetable/content_timetable";
	}
	
	/**
	 * 跳转到新增课表页
	 * @param map
	 * @return
	 */
	@RequestMapping(value="/timetableadd", method=RequestMethod.GET)
    public String content_timetable_add(Model model){
		List<College> colleges = collegeService.findAll();
		List<OAClass> oaclasses = oAClassService.findAll();
		List<Subject> subjects = subjectService.findAll();
		model.addAttribute("colleges", colleges);
		model.addAttribute("oaclasses", oaclasses);
		model.addAttribute("subjects", subjects);
		return "/timetable/content_timetable_add";
	}
	
	/**
	 * 创建课表
	 * @param timeTable
	 * @return
	 */
	@RequestMapping(value="/createTimeTable",method=RequestMethod.POST)
    public String createTimeTable(@ModelAttribute TimeTable timetable, Model model, HttpSession session){
		System.out.println(timetable);
		Timestamp current_time = new Timestamp(new Date().getTime());
		timetable.setCreate_time(current_time);
		timetable.setUpdate_time(current_time);
		timetable.setIs_active("1");
		TimeTable isExeist = timeTableService.selectByPart(timetable);
		int result = 0 ;
		if(isExeist!=null) {
			timetable.setId(isExeist.getId());
			result = timeTableService.updateTimeTable(timetable);
		}
		else {
			result = timeTableService.createTimeTable(timetable);
		}
		if(result!=0) {
			System.out.println("创建成功");
			List<TimeTable> timetables = timeTableService.findAll();
			model.addAttribute("timetables",timetables);
			return "/timetable/content_timetable";
		}
		else {
			System.out.println("创建失败");
			return "error_oa";
		}
	}
	
	
	/**
	 * 更新课表
	 * @param TimeTable
	 * @return
	 */
	@RequestMapping(value="/updateTimeTable",method=RequestMethod.POST)
    public String updateTimeTable(@ModelAttribute TimeTable timetable,Model model,HttpSession session){
		System.out.println(timetable);
		Timestamp current_time = new Timestamp(new Date().getTime());
		timetable.setUpdate_time(current_time);
		timetable.setIs_active("1");
	
		int result = timeTableService.updateTimeTable(timetable);
		if(result!=0) {
			List<TimeTable> timetables = timeTableService.findAll();
			model.addAttribute("timetables",timetables);
			return "/timetable/content_timetable";
		}
		else {
			System.out.println("创建失败");
			return "error_oa";
		}
	}
	
	/**
	 * 删除课表
	 * @param map
	 * @return
	 */
	@RequestMapping(value="/timetableDelete", method=RequestMethod.GET)
    public String deleteTimeTable(@RequestParam Integer timeTableId,Model model){
		TimeTable timeTable = new TimeTable();
		Timestamp current_time = new Timestamp(new Date().getTime());
		timeTable.setUpdate_time(current_time);
		timeTable.setIs_active("0");
		timeTable.setId(timeTableId);
		Integer result = timeTableService.updateTimeTable(timeTable);
		if(result!=0) {
			List<TimeTable> timetables = timeTableService.findAll();
			model.addAttribute("timetables",timetables);
			return "/timetable/content_timetable";
		}
		else {
			return "error_oa";
		}
		
	}


	/**
	 * 跳转到课表编辑页面
	 * @param map
	 * @return
	 */
	@RequestMapping(value="/timetableedit", method=RequestMethod.GET)
    public String content_timeTable_edit(@RequestParam Integer timeTableId,Model model){
		TimeTable timetable = timeTableService.selectById(timeTableId);
		model.addAttribute("timetable",timetable);
		List<College> colleges = collegeService.findAll();
		List<OAClass> oaclasses = oAClassService.findAll();
		List<Subject> subjects = subjectService.findAll();
		model.addAttribute("colleges", colleges);
		model.addAttribute("oaclasses", oaclasses);
		model.addAttribute("subjects", subjects);
		return "/timetable/content_timetable_edit";
	}
	
	
	
	
	
	
}
