package com.todo.service;


import com.todo.dao.UserDAO;
import com.todo.dto.UserDTO;

public class UserService {

	private UserDAO userDAO;
	private UserDTO userDTO;
	public UserService() {
		userDAO = new UserDAO();
	}
	
	// 저장
	public String insert(UserDTO user) {
		String msg = "";
		
		if(user.getUserId() == 0) {
			msg = "아이디를 입력하세요";
			System.out.println(msg);
		} else {
			int resultRow = userDAO.insert(userDTO.getUserId(), userDTO.getId(), userDTO.getTitle(),userDTO.isCompleted());
			return resultRow+"";
		}
		return msg;
	}
	
	
	// 삭제
	public int delete(int userId, int id) {
		int resultRow = 0;
		
		if(userDTO.getId() != 0) {
			int todoId = userDTO.getId();
			if(todoId == id) {
				resultRow = userDAO.delete(userId, id);
			}
		}
		return resultRow;
	}
	
	
}
