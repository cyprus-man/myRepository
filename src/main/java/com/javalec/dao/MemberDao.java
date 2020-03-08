package com.javalec.dao;


import com.javalec.vo.MemberVO;

public interface MemberDao {
	public MemberVO getMemberByEmail(String email);
	public MemberVO getMemberByPw(String pwd);
	public MemberVO getMemberForLogin(String email,String pwd);
	public void update(MemberVO member);
	public void delete(MemberVO member);
	public void insertMember(MemberVO member);
	public void updateMember(MemberVO member);
}
