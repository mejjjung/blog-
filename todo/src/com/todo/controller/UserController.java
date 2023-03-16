package com.todo.controller;

import com.todo.dto.UserDTO;
import com.todo.service.UserService;

public class UserController {

	private UserService service;
	
	public UserController() {
		service = new UserService();
	}
	
	public String insert(UserDTO user, String host) {
		String response = "외부에서는 정보저장이 불가능 합니다.";
		if(host.equals("localhost")) {
			response = service.insert(user);
		}
		return response;
	}
	
	public int delete(int userId, int id) {
		int responseRow = 
				service.delete(userId, id);
		return responseRow;
	}
	
	
	
}
