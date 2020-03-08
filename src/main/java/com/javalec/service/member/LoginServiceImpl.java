package com.javalec.service.member;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javalec.dao.MemberDao;
import com.javalec.vo.MemberVO;

@Service
public class LoginServiceImpl implements MemberService{
	@Autowired
	public MemberDao dao;
	
	@Override
	public String execute(HttpServletRequest request,HttpServletResponse response )throws ServletException, IOException {
		
		String email = request.getParameter("email");
		String pw = request.getParameter("pw");
//		String email="elmo@naver.com";
//		String pw = "1234";
		MemberVO member = (MemberVO) dao.getMemberByEmail(email);
		
		
		if(member == null)
		{
			System.out.println("email 없음");
			request.setAttribute("message", "회원정보를 확인하세요.");
			return "login";
		}
		else {
			
			member = (MemberVO) dao.getMemberByPw(pw);
			
			if(member == null) {
				System.out.println("pwd 없음");
				request.setAttribute("message", "회원정보를 확인하세요.");
				return "login";
			}
			else {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");		
			System.out.println(sdf.format(new Date())+" 에"+"[접속유저]"+member.getEmail()+" 로그인 했습니다");
			HttpSession session = request.getSession();
			session.setAttribute("loginUser", member);
			return "main";
			}
		}
	}
}
