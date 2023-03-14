package com.tenco.blog;

import com.tenco.blog.controller.AController;
import com.tenco.blog.controller.UserController;
import com.tenco.blog.dto.UserDto;

public class MainTest1 {

	public static void main(String[] args) {

		// main -> AC -> AS -> AD 
		// 결과를 받아 보기 
		// " [[ >>  " + msg + " << ]] "

		AController ac = new AController();
		String acResult = ac.select("안뇽");
		System.out.println(acResult);
		
		// 2
		// 2 -1 DBHelper 만들기
		// 2 - 1 UserController 만들기
		// 2 -1 UserService 만들기
		// 2- 1 UserDao 만들기 
		UserController userController = new UserController();
		UserDto responseDto = userController.select(1);
		System.out.println(responseDto);
	}

}

