package com.school.oa.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.school.oa.dao.mapper.SubjectDao;
import com.school.oa.entity.Subject;
import com.school.oa.service.SubjectService;

@Service("subjectService")
public class SubjectServiceImpl implements SubjectService{
	
	@Resource
	private SubjectDao subjectDao;
	
	@Override
	public int createSubject(Subject subject) {
		int result = subjectDao.insert(subject);
		return result;
	}

	@Override
	public int updateSubject(Subject subject) {
		int result = subjectDao.update(subject);
		return result;
	}

	@Override
	public int deleteSubject(Integer id) {
		int result = subjectDao.delete(id);
		return result;
	}

	@Override
	public Subject selectById(Integer id) {
		Subject subject = subjectDao.selectById(id);
		return subject;
	}

	@Override
	public List<Subject> findAll() {
		List<Subject> subjects = subjectDao.findAll();
		return subjects;
	}

}
