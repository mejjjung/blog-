package com.todo.dao;

public interface IUserDAO {

	int insert(int userId, int id, String title, boolean completed);
	
	int delete(int Userid, int id);
	
	
}
