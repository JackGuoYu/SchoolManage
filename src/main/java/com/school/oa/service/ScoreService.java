package com.school.oa.service;

import java.util.List;

import com.school.oa.entity.Score;

public interface ScoreService {
	List<Score> findAll();
	
	Score selectById(Integer id);
	
	int createScore(Score score);
	
	int updateScore(Score score);
	
	int deleteScore(Integer id);
}
