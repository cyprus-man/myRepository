<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<title>로그인</title>
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/login.css"  />
</head>
<body>
	<div id="wrap">
		<div id="logo">
			<a href="main"> 로고입니다. </a>
		</div>
		<div id="smallWrap">
			<h1>Login</h1>
			<h5>로그인을 하시면 더욱 다양한 서비스를 이용하실수 있습니다.</h5>
			<div id="loginHeader"></div>
			<div id="wrapForm">
				<form action="loginAction" method="POST">
					<div id="loginForm">

						<label><input type="text" id="uid" name="email" placeholder="email" required="required"
							></label> <label><input type="password" id="uPw" name="pw"
							required="required" placeholder="비밀번호"></label>
					</div>

					<div id="loginButton" style="display: block;">
						<input type="submit" id="btn" value="로그인" placeholder="아이디">
					</div>

					<div class="clear"></div>
					<div id=aTag>
						<a href="searchPwd"> 비밀번호 찾기 </a> 
						<a href="signup">회원가입 </a>
					</div>

					<div id="loginFooter"></div>
				</form>
			</div>
		</div>
	</div>
</body>
<script src="https://code.jquery.com/jquery-3.4.1.js"></script>
<script type="text/javascript">
	
	$(document).ready(function(){
		var message="${message}";
		console.log( "<%= request.getAttribute("message") %>" )
		if( message != ""){
			alert( "${message}" )
		}
	})
</script>
</html>