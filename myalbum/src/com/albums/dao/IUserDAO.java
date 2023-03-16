package com.albums.dao;

import com.albums.dto.UserDTO;

public interface IUserDAO {

	int insert(UserDTO userDTO);

	int insert(int userId, int id, String title);

}
