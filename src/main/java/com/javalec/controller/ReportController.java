package com.javalec.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.javalec.service.report.APIService;;

@Controller
public class ReportController {
	
	APIService service;
	
	@Autowired
	ApplicationContext ctx;
	
	@RequestMapping("/getList")
	public void searchList(HttpServletRequest request,HttpServletResponse response) throws Exception
	{
		
		service = (APIService) ctx.getBean("send");
		System.out.println(service);
	}
	
	
	
}
