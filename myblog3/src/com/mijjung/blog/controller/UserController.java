package com.mijjung.blog.controller;

import com.mijjung.blog.dto.UserDTO;
import com.mijjung.blog.service.UserService;

public class UserController {

	private UserService userService;

	public UserController() {
		userService = new UserService();
	}

	// 회원가입 
	public String requestSignUp(UserDTO user, String host) {
		String response = "외부에서는 회원가입이 불가능 합니다.";
		if (host.equals("localhost")) {
			response = userService.signUp(user);
		}
		return response;

	}

	// 회원조회
	public UserDTO requestSingIn(String username, String password) {
		UserDTO responseUserDto = userService.checkUser(username, password);
		return responseUserDto;
	}

	
	
}
