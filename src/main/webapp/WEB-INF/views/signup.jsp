<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
   <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/sign.css"  />
</head>
<body>
    <div id="wrap">
        <div id="header">
        </div>
        <div id="wrapForm">
            <form action="" method="POST">
                <h1>회원가입</h1>

                <div id="checkForm">

                    <div id="inputCon">
                        <h4>이메일</h4>
                        <input type="text" id="email" ><br>
                    </div>

                    <div id="inputCon">
                        <h4>이메일 확인</h4>
                        <input type="text" id="emailCheck"><br>
                    </div>

                    <div id="inputCon">
                        <h4>비밀번호</h4>
                        <input type="password" id="pw"><br>
                    </div>

                    <div id="inputCon">
                        <h4>비밀번호 확인</h4>
                        <input type="password" id="pwCheck">
                    </div>

                    <p>트롤경찰청의 다양한 소식을 받아보시겠어요? &nbsp; <input type="checkbox" checked> </p>

                    <div id="under">
                        <input type="submit" value="가입하기" id="sign">
                            <div id="signText">가입하기를 클릭함으로써 트롤경찰청의 이용약관,개인정보취급 방침에 동의합니다.</div>
                    </div>
                </div>
                <div id=btnForm>
                    <input type="button" value="구글 가입" id="google">
                    <input type="button" value="페이스북 가입" id="face">
                    <input type="button" value="깃허브 가입" id="git">
                </div>
            </form>
        </div>
    </div>
</body>

</html>