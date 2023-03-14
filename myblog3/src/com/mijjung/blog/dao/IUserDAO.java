package com.mijjung.blog.dao;

import com.mijjung.blog.dto.UserDTO;

public interface IUserDAO {

	int saveUser(UserDTO user);
	
	UserDTO selectUserByUsernameAndPassword(String username, String password);
	
	
}
