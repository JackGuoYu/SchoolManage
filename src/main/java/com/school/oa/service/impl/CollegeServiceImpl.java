package com.school.oa.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.school.oa.dao.mapper.CollegeDao;
import com.school.oa.entity.College;
import com.school.oa.service.CollegeService;

@Service("collegeService")
public class CollegeServiceImpl implements CollegeService{
	
	@Resource
	private CollegeDao collegeDao;
	
	@Override
	public int createCollege(College college) {
		int result = collegeDao.insert(college);
		return result;
	}

	@Override
	public int updateCollege(College college) {
		int result = collegeDao.update(college);
		return result;
	}

	@Override
	public int deleteCollege(Integer id) {
		int result = collegeDao.delete(id);
		return result;
	}

	@Override
	public College selectById(Integer id) {
		College college = collegeDao.selectById(id);
		return college;
	}

	@Override
	public List<College> findAll() {
		List<College> colleges = collegeDao.findAll();
		return colleges;
	}

}
