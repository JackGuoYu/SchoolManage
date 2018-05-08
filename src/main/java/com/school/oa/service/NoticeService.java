package com.school.oa.service;

import java.util.List;

import com.school.oa.entity.Notice;

public interface NoticeService {
	List<Notice> findAll();
	
	Notice selectById(Integer id);
	
	int createNotice(Notice Notice);
	
	int updateNotice(Notice Notice);
	
	int deleteNotice(Integer id);
}
