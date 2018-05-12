package com.school.oa.dao.mapper;

import java.util.List;

import com.school.oa.entity.TimeTable;

public interface TimeTableDao {
	List<TimeTable> findAll();
	
	TimeTable selectById(Integer id);
	
	int insert(TimeTable timeTable);
	
	int update(TimeTable timeTable);
	
	int delete(Integer id);
	
	TimeTable selectByPart(TimeTable timeTable);  //根据节数，专业和学院找出对应可课程表记录
	
	//查询出一张完整的课程表 这里定义为每个学院下面的专业为一张课程表，
	//不精化到一个班级为一张课程表
	List<TimeTable> findByTimeTable(TimeTable timeTable); 
}
