package com.javalec.controller;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * Handles requests for the application home page.
 */
@Controller
public class MainController {

	@RequestMapping("/")
	public String main2() {
		return "main";
	}

	@RequestMapping("/main")
	public String main() {
		return "main";
	}

	@RequestMapping("/signup")
	public String signUp() {

		return "signup";
	}

	@RequestMapping("/login")
	public String login() {
		
		return "login";
	}

	@RequestMapping("/report")
	public String declare() {
		return "report";
	}
	
	
	
}