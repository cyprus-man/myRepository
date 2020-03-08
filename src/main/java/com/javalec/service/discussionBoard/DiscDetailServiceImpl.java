package com.javalec.service.discussionBoard;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javalec.dao.DiscussionBoardDao;
import com.javalec.vo.DiscussionBoardVO;
import com.javalec.vo.MatchVO;
import com.javalec.vo.ParticipantVO;
import com.javalec.vo.TeamStatsVO;

@Service
public class DiscDetailServiceImpl implements DiscussionBoardService {
	
	@Autowired
	public DiscussionBoardDao dao;

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("DiscDetailServiceImpl");
		
		int discBoardId=Integer.parseInt(request.getParameter("discBoardId"));
		
		DiscussionBoardVO board=dao.getDiscBoardById(discBoardId);
//		MatchVO match=dao.getMatchById(board.getMatchVO().getMatchId());
//		System.out.println(board.toString());
		MatchVO match=board.getMatchVO();
//		System.out.println(match.toString());
		ArrayList <TeamStatsVO> teamStats=match.getTeamStatsVOList();
		System.out.println(teamStats);
		ArrayList <ParticipantVO> participants=match.getParticipantsVOList();
		System.out.println(participants);
		
		
		request.setAttribute("board", board);
		request.setAttribute("match",match);
		request.setAttribute("teamStats", teamStats);
		request.setAttribute("participants", participants);
		
		
		
		return null;
	}

}
