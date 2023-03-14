package com.mijjung.blog;

import com.mijjung.blog.controller.UserController;
import com.mijjung.blog.dto.UserDTO;

public class MainTest {

	public static void main(String[] args) {
		

		UserController userController = new UserController();
		UserDTO userDTO = new UserDTO("김미정", "5555", "whitedog@naver.com", "짱구네집");
		
	
		
		
//		// 회원 가입
//				String result = userController.requestSignUp(userDTO, "localhost");
//				System.out.println(result);
		
		
		// 회원 조회 
		UserDTO responseUser = userController.requestSingIn(userDTO.getUsername(), userDTO.getPassword());
		if(responseUser == null) {
			System.out.println("로그인에 실패했습니다.");
		} else {
			System.out.println("로그인에 성공했습니다.");
		}
		
		
	}

}
