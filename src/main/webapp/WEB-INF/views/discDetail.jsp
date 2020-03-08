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
<title>토론 게시판 글 읽기</title>
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
		discBoardId : ${board.discBoardId} <br>
		email : ${board.email}<br>
		matchId  : ${match.matchId}<br>
		gameDuratipn :  ${match.gameDuration }<br>
		
		<hr>
		
		<c:forEach var="teamStat" items="${teamStats }">
			matchId : ${teamStat.matchId}<br>
			statsId : ${teamStat.statsId }<br>
			win : ${teamStat.win }<br>
			inhibitorKills : ${teamStat.inhibitorKills }<br>
		</c:forEach>
		<hr>
		
		<c:forEach var="participant" items="${participants}">
			matchId : ${participant.matchId}<br>
			participantId : ${participant.participantId }<br>
			summonerName : ${participant.summonerName }<br>
			lane : ${participant.lane}<br>
		</c:forEach>
		
	
		
			

		</div>
	</article>
	<script type="text/javascript">
		
	</script>
</body>
</html>