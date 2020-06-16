package com.example.controller;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ex03")
public class Ex03Controller {

	@Autowired
	private ServletContext application;
	
	@RequestMapping("")
	public String index() {
		return "ex03-input";
	}
	
	@RequestMapping("/calc")
	public String calc(int item1Price, int item2Price, int item3Price) {
		int total = item1Price + item2Price + item3Price;
		int totalInTax = (int)(total * 1.1);
		application.setAttribute("total", total);
		application.setAttribute("totalInTax", totalInTax);
		return "ex03-result";
	}
}
