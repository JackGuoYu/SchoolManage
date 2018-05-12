package com.school.oa.service;

import java.util.List;

import com.school.oa.entity.TimeTable;

public interface TimeTableService {
	
	List<TimeTable> findAll();
	
	TimeTable selectById(Integer id);
	
	int createTimeTable(TimeTable timeTable);
	
	int updateTimeTable(TimeTable timeTable);
	
	int deleteTimeTable(Integer id);
	
	TimeTable selectByPart(TimeTable timeTable);
	
	List<TimeTable> findByTimeTable(TimeTable timeTable);
}
