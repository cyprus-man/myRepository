package com.javalec.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.javalec.service.discussionBoard.DiscussionBoardService;
import com.javalec.service.member.MemberService;

@Controller
public class DiscussionBoardController {
	
	@Autowired
	ApplicationContext context;
	
	DiscussionBoardService service;
	
//test
	
	@RequestMapping("/discussionBoard")	
	public String discussionBoard(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		service = (DiscussionBoardService)context.getBean("listServiceImpl");
		service.execute(request, response);
		
		return "discussionBoard";
	}
	
	
	@RequestMapping(value= { "/discDetail", "/discussionBoard/discDetail"})
	public String discDetail(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		service=(DiscussionBoardService)context.getBean("discDetailServiceImpl");
		service.execute(request, response);
		
		return "discDetail";
	}

}
