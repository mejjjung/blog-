package com.project.controller;

import com.project.Service.UserService;
import com.project.ViewFrame.UserViewFrame;
import com.project.dto.UserDTO;

public class UserController {

	
	private UserService userService;
	UserViewFrame userViewFrame;

	
	public UserController() {
		userService = new UserService();
		UserDTO userdto = new UserDTO();
		//UserDTO dto = requestSingIn("jjungme","525");
		userViewFrame = new UserViewFrame();
		//userViewFrame.setlogindata(userdto) ;
		userViewFrame.setlogindata(userdto);
	}

	public UserDTO requestSingIn(String userId, String password) {
		UserDTO responseUserdto = userService.loginCheck(userId, password);
		return responseUserdto;

	}
	
	

}
