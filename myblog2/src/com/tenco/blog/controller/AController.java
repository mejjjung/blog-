package com.tenco.blog.controller;

import com.tenco.blog.service.AService;

public class AController {

	private AService aService;

	public AController() {
		aService = new AService();
	}
	
	
	public String select(String msg) {
	String result1 = aService.select(msg);
		return result1;
	};
}
