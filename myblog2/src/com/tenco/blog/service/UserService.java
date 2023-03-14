package com.tenco.blog.service;

import com.tenco.blog.dao.UserDao;
import com.tenco.blog.dto.UserDto;

public class UserService {

	private UserDao userDao;
	
	public UserService() {
		userDao = new UserDao();
	}
	
	public UserDto select(int userId) {
		return userDao.select(userId); 
	}
	
	
}
