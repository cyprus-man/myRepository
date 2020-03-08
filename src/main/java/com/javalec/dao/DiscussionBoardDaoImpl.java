package com.javalec.dao;


import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.javalec.vo.DiscussionBoardVO;
import com.javalec.vo.MatchVO;

@Repository
public class DiscussionBoardDaoImpl implements DiscussionBoardDao {
	@Autowired
	SqlSession sqlSession;
	
	
	@Override
	public List<DiscussionBoardVO> list(int page) {
		// TODO Auto-generated method stub
		
		System.out.println("DiscussionBoardDaoImpl");
		
		List<DiscussionBoardVO> boards=null;
		boards= sqlSession.selectList("DiscussionBoardNS.list",page);
		
//		for(DiscussionBoardVO board : boards)
//		{
//			System.out.println(board.toString());
//		}
		
		return boards;
	}
	
	public int listForLast() {
		int dataCount=sqlSession.selectOne("DiscussionBoardNS.listForLast");
		return dataCount;		
	}
	
	public DiscussionBoardVO getDiscBoardById(int discBoardId) {
		System.out.println("DiscussionBoardDaoImpl");		
		DiscussionBoardVO board=null;
		
		board=(DiscussionBoardVO)sqlSession.selectOne("DiscussionBoardNS.getDiscBoardById", discBoardId);

		return board;
	}
	
	public MatchVO getMatchById(long matchId) {
		System.out.println("DiscussionBoardDaoImpl");
		
		MatchVO match=null;
		match=(MatchVO)sqlSession.selectOne("DiscussionBoardNS.getMatchById",matchId);
		System.out.println(match.toString());
		return match;
		
	}
	
	

}
