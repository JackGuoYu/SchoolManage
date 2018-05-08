package com.school.oa.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.school.oa.dao.mapper.OAClassDao;
import com.school.oa.entity.OAClass;
import com.school.oa.service.OAClassService;

@Service("oAClassService")
public class OAClassServiceImpl implements OAClassService{
	
	@Resource
	private OAClassDao oAClassDao;
	
	@Override
	public int createOAClass(OAClass OAClass) {
		int result = oAClassDao.insert(OAClass);
		return result;
	}

	@Override
	public int updateOAClass(OAClass OAClass) {
		int result = oAClassDao.update(OAClass);
		return result;
	}

	@Override
	public int deleteOAClass(Integer id) {
		int result = oAClassDao.delete(id);
		return result;
	}

	@Override
	public OAClass selectById(Integer id) {
		OAClass OAClass = oAClassDao.selectById(id);
		return OAClass;
	}

	@Override
	public List<OAClass> findAll() {
		List<OAClass> OAClasss = oAClassDao.findAll();
		return OAClasss;
	}

}
