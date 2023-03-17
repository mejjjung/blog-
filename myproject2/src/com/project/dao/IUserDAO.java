package com.project.dao;

import java.util.ArrayList;

import com.project.dto.UserDTO;

public interface IUserDAO {

	ArrayList<UserDTO> select();

}
