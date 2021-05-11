<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인</title>
<style>
	.errMsg { color: red; }  
</style>
</head>
<body>
	<div>
		<div class="errMsg">${errMsg}</div>
		<div>
			<form action="login" method="post">
				<div><input type="text" name="uid" placeholder="아이디" value="mic"></div>
				<div><input type="text" name="upw" placeholder="비밀번호" value="1212"></div>
				<div>
					<input type="submit" value="Login">
				</div>
			</form>
		</div>
		<div>
			<a href="join">회원가입</a>
		</div>
	</div>
</body>
</html>



