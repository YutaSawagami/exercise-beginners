package com.example.controller;

import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.domain.UserDomain;
import com.example.form.UserForm;

@Controller
@RequestMapping("/ex04")
public class Ex04Controller {
	
	@ModelAttribute
	public UserForm setUpForm() {
		return new UserForm();
	}
	
	@Autowired
	private HttpSession session;
	
	
	@RequestMapping("")
	public String index() {
		return "ex04-input";
	}
	
	@RequestMapping("/output")
	public String output(
			@Validated UserForm form
			,BindingResult result) {
		if(result.hasErrors()) {
			return index();
		}
		UserDomain userDomain = new UserDomain();
		userDomain.setName(form.getName());
		userDomain.setAge(Integer.parseInt(form.getAge()));
		userDomain.setComment(form.getComment());
		session.setAttribute("user", userDomain);
		return "ex04-output";
	}
}
