package com.school.oa.dao.mapper;

import java.util.List;

import com.school.oa.entity.Score;

public interface ScoreDao {
	List<Score> findAll();
	
	Score selectById(Integer id);
	
	int insert(Score score);
	
	int update(Score score);
	
	int delete(Integer id);
}
