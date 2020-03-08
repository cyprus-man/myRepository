package com.javalec.dao;


import java.util.List;

import com.javalec.vo.DiscussionBoardVO;
import com.javalec.vo.MatchVO;


public interface DiscussionBoardDao {

	public List<DiscussionBoardVO> list(int page);
	public int listForLast();
	public DiscussionBoardVO getDiscBoardById(int discBoardId);
	public MatchVO getMatchById(long matchId);
	
}
