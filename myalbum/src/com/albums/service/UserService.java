package com.albums.service;

import com.albums.dao.UserDAO;
import com.albums.dto.UserDTO;

public class UserService {

	private UserDAO userDAO;
	
	public UserService() {
		userDAO = new UserDAO();
	}
	
	public String signUp(UserDTO user) {
		String msg = "";
		
		if(user.getUserId() == 0) {
			msg="유저 아이디를 입력하세요";
			System.out.println(msg);
		} else {
			int resultRow = userDAO.insert(user);
			return resultRow + "";
		}
		return msg;
	}	
	
	
	
	
	
}
