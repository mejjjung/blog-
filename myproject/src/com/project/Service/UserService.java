package com.project.Service;

import com.project.dao.UserDAO;
import com.project.dto.UserDTO;

public class UserService {

	private UserDAO userDAO;

	public UserService() {
		userDAO = new UserDAO();
	}

	public UserDTO loginCheck(String userId, String password) {
		boolean isValid = true;
		if (userId.equals("")) {
			isValid = false;
		} else if (password.equals("")) {
			isValid = false;
		}
		UserDTO userDTO = null;
		if (isValid) {
			userDTO = userDAO.loginCheck(userId, password);
		}
		return userDTO;
	}

}
