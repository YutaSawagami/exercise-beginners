package com.example.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.domain.MemberDomain;
import com.example.service.MemberService;

@Controller
@RequestMapping("ex05")
public class Ex05Controller {

	@Autowired
	private MemberService service;
	
	@Autowired
	private HttpSession session;
	
	@RequestMapping("")
	public String index() {
		return "ex05-input";
	}
	
	@RequestMapping("/result")
	public String result(String word) {
		List<MemberDomain> memberList = service.load(word);
		session.setAttribute("memberList", memberList);
		return "ex05-result";
	}
}
