package com.javalec.service.discussionBoard;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.javalec.dao.DiscussionBoardDao;
import com.javalec.vo.DiscussionBoardVO;

@Service
public class ListServiceImpl implements DiscussionBoardService {
	
	@Autowired
	public DiscussionBoardDao dao;
//	private String list;
	
	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {		
		System.out.println("ListServiceImpl");
		int page=Integer.parseInt(request.getParameter("page"));
		int lastPage=((dao.listForLast())/15)+1;
		int pageStart;
		if(page%5==0) {
			pageStart=page-4;
		}else {
			pageStart = (page/5)*5+1;			
		}
		int pageEnd = pageStart+4;
		pageEnd = (pageEnd > lastPage) ? lastPage : pageEnd;
		System.out.println("now page:"+page);
		System.out.println("page Start:"+pageStart);
		System.out.println("page End:"+pageEnd);
		System.out.println("lastPage:"+lastPage);
		
		List<DiscussionBoardVO> boards=(List<DiscussionBoardVO>) dao.list(page);				

		request.setAttribute("boards", boards);
		request.setAttribute("page",page);				
		request.setAttribute("pageStart",pageStart);
		request.setAttribute("pageEnd", pageEnd);
		request.setAttribute("lastPage",lastPage);

		System.out.println("-----------------------------------------------");
	return null;	
	}
	

}
