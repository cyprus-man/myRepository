<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>트롤경찰청</title>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resources/css/header.css" />
</head>
<body>
	<header>
		<div id="hid">
			<a href="main" id="logo"></a>
			<div class="clear"></div>
			<div id="buttonDiv">
				<a href="discussionBoard?page=1" id="discussion">토론</a> <a href="" id="rank">랭킹</a>
				<c:choose>
					<c:when test="${!empty loginUser}">
						<a href="#" id="myReport">나의 신고목록</a>
						<a href="" id="report">신고하기</a>
					</c:when>

					<c:otherwise>
						<a href="login">로그인</a>
						<a href="signup">회원가입</a>
					</c:otherwise>
				</c:choose>
			</div>
			<input type="text" id="trollSearch" placeholder="search">
		</div>
	</header>
</body>
</html>