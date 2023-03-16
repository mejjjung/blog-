package com.albums.controller;

import com.albums.dto.UserDTO;
import com.albums.service.UserService;

public class UserController {

	private UserService userService;
	
	public UserController() {
		userService = new UserService();
	}
	
	// 정보 저장 
	public String insert(UserDTO user, String host) {
		String response = "외부에서는 정보저장이 불가능 합니다.";
		if(host.equals("localhost")) {
			response = userService.signUp(user);
		}
		return response;
	}
	
	
	
	
}
