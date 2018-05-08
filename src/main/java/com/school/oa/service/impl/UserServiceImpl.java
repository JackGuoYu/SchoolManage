package com.school.oa.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.school.oa.dao.mapper.UserDao;
import com.school.oa.entity.User;
import com.school.oa.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService{
	
	@Resource
	private UserDao userDao;

	@Override
	public User getUser(User user) {
		User obj = userDao.getUser(user);
		return obj;
	}
	
	@Override
	public int createUser(User user) {
		int result = userDao.insert(user);
		return result;
	}

	@Override
	public int updateUser(User user) {
		int result = userDao.update(user);
		return result;
	}

	@Override
	public int deleteUser(Integer id) {
		int result = userDao.delete(id);
		return result;
	}

	@Override
	public User enterUserForm(Integer id) {
		User user = userDao.selectById(id);
		return user;
	}

	@Override
	public List<User> getUsers() {
		List<User> users = userDao.findAll();
		return users;
	}

}
