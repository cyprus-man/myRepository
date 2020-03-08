package com.javalec.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.javalec.service.member.MemberService;

@Controller
public class MemberController {
	
	@Autowired
	ApplicationContext context;
	
	MemberService service;
	
	@RequestMapping("/testSign")
	public String signUp(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException{
		service = (MemberService)context.getBean("loginServiceImpl");
		return service.execute(request, response);
	}
	
	@RequestMapping("loginAction")
	public String logInAction(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		service=(MemberService) context.getBean("loginServiceImpl");		
		return service.execute(request, response);	
	}	
	@RequestMapping("searchPwd")//page
	public String searchPwd() {
		return "searchPwd";
	}
	
	@RequestMapping("searchPwdAction")
	public String searchPwdAction(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		service=(MemberService) context.getBean("searchPwdServiceImpl");
		service.execute(request, response);		
		return "login";
	}
}
