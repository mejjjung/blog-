package com.tenco.myblog.controller;

import com.tenco.myblog.dto.BlogDto;
import com.tenco.myblog.service.BlogService;

public class BlogController {

	private BlogService blogService;
	
	public BlogController() {
		blogService = new BlogService();
	}
	
	// 외부에서 오는 요청을 담당 하는 녀석
	public BlogDto requestBoardContentById(int id) {
		BlogDto responsDto = blogService.selectByBoardId(id);
		return responsDto;	
	}
	
	// 하나의 게시글 삭제 하기
	public int requestDeleteBoardById(int boardId, int userId) {
		int responseRow = 
				blogService.deleteBoardById(boardId, userId);
		return responseRow; 
	}
}
