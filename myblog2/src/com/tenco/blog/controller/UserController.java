package com.tenco.blog.controller;

import com.tenco.blog.dto.UserDto;
import com.tenco.blog.service.UserService;

public class UserController {

	private UserService userService;
	
	public UserController() {
		userService = new UserService();
	}
	
	public UserDto select(int userId) {
		return userService.select(userId);
	}
	
}
