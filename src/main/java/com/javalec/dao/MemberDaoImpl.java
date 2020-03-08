package com.javalec.dao;


import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.javalec.vo.MemberVO;

@Repository
public class MemberDaoImpl implements MemberDao{

	@Autowired
	SqlSession sqlSession;
	
	@Override
	public MemberVO getMemberByEmail(String email) {
		// TODO Auto-generated method stub
		MemberVO member = null;
		member = (MemberVO)sqlSession.selectOne("MemberNS.getUserByEmail",email);
		return member;
	}

	@Override
	public MemberVO getMemberByPw(String pwd) {
		// TODO Auto-generated method stub
		MemberVO member = null;
		member = (MemberVO)sqlSession.selectOne("MemberNS.getUserByPw", pwd);
		return member;
	}

	@Override
	public MemberVO getMemberForLogin(String email,String pwd) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(MemberVO member) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(MemberVO member) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void insertMember(MemberVO member) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateMember(MemberVO member) {
		// TODO Auto-generated method stub
		
	}

}
