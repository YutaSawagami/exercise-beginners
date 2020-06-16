package com.example.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ex02")
public class Ex02Controller {

	@Autowired
	private HttpSession session;
	
	@RequestMapping("")
	public String index() {
		return "ex02-input";
	}
	
	@RequestMapping("/result")
	public String result(int num1, int num2) {
		int answer = num1 + num2;
		session.setAttribute("num1", num1);
		session.setAttribute("num2", num2);
		session.setAttribute("answer", answer);
		return "ex02-result";
	}
	
	@RequestMapping("/redirect")
	public String redirect() {
		return "ex02-result02";
	}
}
