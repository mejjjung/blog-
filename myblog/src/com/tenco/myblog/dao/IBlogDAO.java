package com.tenco.myblog.dao;

import com.tenco.myblog.dto.BlogDto;

public interface IBlogDAO {

	// public abstract 생략
	
	void select(); // 전체 조회
	
	BlogDto select(int id); // id 기반으로 조회 
	
	int delete(int boardId);
	
}
