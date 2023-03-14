package com.tenco.myblog;

import com.tenco.myblog.controller.BlogController;
import com.tenco.myblog.dto.BlogDto;
import com.tenco.myblog.utils.DBHelper;

public class MainTest1 {

	public static void main(String[] args) {
		
		// 코드 테스트
//		DBHelper dbHelper =  DBHelper.getinstance();
//		dbHelper.getConnection();
//		System.out.println("main 에서 주소값 찍음 : " + dbHelper);
		
		// 코드 테스트
		BlogController blogController = new BlogController();
//		BlogDto dto = blogController.requestBoardContentById(1);
//		System.out.println(dto);
		
		int result = blogController.requestDeleteBoardById(90, 8);
		System.out.println(result);
		
		
	}

}
