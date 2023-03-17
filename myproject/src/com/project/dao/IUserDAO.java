package com.project.dao;

import com.project.dto.UserDTO;

public interface IUserDAO {

	UserDTO loginCheck(String userId, String password);

}
