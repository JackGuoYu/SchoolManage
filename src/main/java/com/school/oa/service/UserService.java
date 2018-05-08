package com.school.oa.service;

import java.util.List;

import com.school.oa.entity.User;

public interface UserService {
	User getUser(User user);
	
	int createUser(User user);
	
	int updateUser(User user);
	
	int deleteUser(Integer id);
	
	User enterUserForm(Integer id);
	
	List<User> getUsers();
}
