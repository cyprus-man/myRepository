<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ include file="/WEB-INF/views/header.jsp"%>
<%@ include file="/WEB-INF/views/footer.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>토론 게시판</title>
<script src="https://code.jquery.com/jquery-3.4.1.js"></script>
<style type="text/css">
	*{
		color:black;
	}
</style>
</head>
<body>
	<article>
		<div id="wrap">
			<table border="1">
				<c:forEach var="board" items="${boards}">
					<tr>
						<td><a href="discDetail?discBoardId=${board.discBoardId}">${board.discBoardId}</a></td>
						<td><a href="discDetail?discBoardId=${board.discBoardId}">${board.email}</a></td>
						<td><a href="discDetail?discBoardId=${board.discBoardId}">${board.writeDate}</a></td>	
						<td><a href="discDetail?discBoardId=${board.discBoardId}">${board.readCount}</a></td>
						<td><a href="discDetail?discBoardId=${board.discBoardId}">${board.up}</a></td>
						<td><a href="discDetail?discBoardId=${board.discBoardId}">${board.down}</a></td>
					</tr>
				</c:forEach>			
			</table>
			
			<a href="discussionBoard?page=1"><button class="previous_btn">처음</button></a>
			<a href="discussionBoard?page=${pageStart-1}&beforeNext=before"><button class="before">이전</button></a>
			
			<c:forEach begin="${pageStart }" var="page" end="${pageEnd }">
				<a href="discussionBoard?page=${page}">${page}</a>
			</c:forEach>
			
			<a href="discussionBoard?page=${pageEnd+1}&beforeNext=next"><button class="next">다음</button></a> 
			<a href="discussionBoard?page=${lastPage}"><button class="next_btn">마지막</button></a>

		</div>
	</article>
	<script type="text/javascript">
		
	</script>
</body>
</html>