package com.school.oa.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.school.oa.dao.mapper.ScoreDao;
import com.school.oa.entity.Score;
import com.school.oa.service.ScoreService;

@Service("scoreService")
public class ScoreServiceImpl implements ScoreService{
	
	@Resource
	private ScoreDao scoreDao;
	
	@Override
	public int createScore(Score score) {
		int result = scoreDao.insert(score);
		return result;
	}

	@Override
	public int updateScore(Score score) {
		int result = scoreDao.update(score);
		return result;
	}

	@Override
	public int deleteScore(Integer id) {
		int result = scoreDao.delete(id);
		return result;
	}

	@Override
	public Score selectById(Integer id) {
		Score score = scoreDao.selectById(id);
		return score;
	}

	@Override
	public List<Score> findAll() {
		List<Score> scores = scoreDao.findAll();
		return scores;
	}

}
