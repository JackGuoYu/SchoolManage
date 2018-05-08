package com.school.oa.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.school.oa.dao.mapper.TimeTableDao;
import com.school.oa.entity.TimeTable;
import com.school.oa.service.TimeTableService;

@Service("timeTableService")
public class TimeTableServiceImpl implements TimeTableService{
	
	@Resource
	private TimeTableDao timeTableDao;
	
	@Override
	public int createTimeTable(TimeTable TimeTable) {
		int result = timeTableDao.insert(TimeTable);
		return result;
	}

	@Override
	public int updateTimeTable(TimeTable TimeTable) {
		int result = timeTableDao.update(TimeTable);
		return result;
	}

	@Override
	public int deleteTimeTable(Integer id) {
		int result = timeTableDao.delete(id);
		return result;
	}

	@Override
	public TimeTable selectById(Integer id) {
		TimeTable timeTable = timeTableDao.selectById(id);
		return timeTable;
	}

	@Override
	public List<TimeTable> findAll() {
		List<TimeTable> timeTables = timeTableDao.findAll();
		return timeTables;
	}

}
