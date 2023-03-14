package com.tenco.blog.service;

import com.tenco.blog.dao.ADao;

public class AService {

	private ADao aDao;

	public AService() {
		aDao = new ADao();
	}
	
	public String select(String msg) {
		String amsg = aDao.select(msg);
		return amsg;
	}
}
