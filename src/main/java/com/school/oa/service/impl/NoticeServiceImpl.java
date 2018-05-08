package com.school.oa.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.school.oa.dao.mapper.NoticeDao;
import com.school.oa.entity.Notice;
import com.school.oa.service.NoticeService;

@Service("noticeService")
public class NoticeServiceImpl implements NoticeService{
	
	@Resource
	private NoticeDao noticeDao;
	
	@Override
	public int createNotice(Notice notice) {
		int result = noticeDao.insert(notice);
		return result;
	}

	@Override
	public int updateNotice(Notice notice) {
		int result = noticeDao.update(notice);
		return result;
	}

	@Override
	public int deleteNotice(Integer id) {
		int result = noticeDao.delete(id);
		return result;
	}

	@Override
	public Notice selectById(Integer id) {
		Notice notice = noticeDao.selectById(id);
		return notice;
	}

	@Override
	public List<Notice> findAll() {
		List<Notice> notices = noticeDao.findAll();
		return notices;
	}

}
