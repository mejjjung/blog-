package com.tenco.blog.dao;

public class ADao {

	public String select(String msg) {
		
		String copyMsg = " [[ >>  " + msg + " << ]] ";
		return copyMsg;
	}
}
