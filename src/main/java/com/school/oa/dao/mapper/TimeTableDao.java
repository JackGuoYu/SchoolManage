package com.school.oa.dao.mapper;

import java.util.List;

import com.school.oa.entity.TimeTable;

public interface TimeTableDao {
	List<TimeTable> findAll();
	
	TimeTable selectById(Integer id);
	
	int insert(TimeTable timeTable);
	
	int update(TimeTable timeTable);
	
	int delete(Integer id);
}
