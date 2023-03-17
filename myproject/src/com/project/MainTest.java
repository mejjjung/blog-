package com.project;

import com.project.ViewFrame.UserViewFrame;
import com.project.controller.UserController;
import com.project.dto.UserDTO;

public class MainTest {

	public static void main(String[] args) {
		
		UserController userController = new UserController();
		UserDTO userDTO = new UserDTO("hyoring","929");
		//UserDTO userInfo = new UserDTO(1, "jjungme", "김미정"," 525","alwjd@naver.com","010-3307-2546","부산시 사하구");
		
		
		// 회원 조회
		UserDTO responseUser = userController.requestSingIn(userDTO.getUserId(),userDTO.getPassword());
		if(responseUser == null) {
			System.out.println("로그인에 실패했습니다.");
		} else {
			System.out.println("로그인에 성공했습니다.");
			String userName = userDTO.getUserId();
			String userPassword = userDTO.getPassword();
			//System.out.println(userController.requestSingIn(userName, userPassword));
			//System.out.println(userDTO.toString());
		}
		
		
		
	}
}
