<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="java.util.List, java.net.URLEncoder"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author"
	content="Mark Otto, Jacob Thornton, and Bootstrap contributors">
<meta name="generator" content="Hugo 0.88.1">
<link href="../mypagecss/update.css" rel="stylesheet">
<title>ppumting</title>
</head>
<body>
	<div id="wrap">
		<header id="header">
			<h1 class="logo">PPUMTING | 트레이너정보수정</h1>
		</header>
		<div id="login_wrap">
			<form action="updateTrainer" method="post">
				아이디:
				<div class="id_input">
					<input type="text" name="name" value="${trainer.name}" readonly>
				</div>
				<span class="idtext"> *아이디 변경은 불가능합니다.</span><br> 
				비밀번호:
				<div class="id_input">
					<input type="password" name="pw" value="${trainer.pw}"
						maxlength="20" required>
				</div>
				<br> 
				이름:
				<div class="name_input">
					<input type="text" name="name" value="${trainer.name}">
				</div>
				<br> 
				전화번호:
				<div class="phone_input">
					<input type="text" name="phone" value="${trainer.phone}"
						maxlength="13" required>
				</div>
				<br> 
				주소:
				<div class="addr_input">
					<input type="text" name="addr" value="${trainer.addr}" required><br>
				</div>
				<br>
				<button class="update_btn" type="submit">회원정보 수정</button>
			</form>

			<form action="/Trainer/loginout/login">
				<button class="delete_btn" type="submit">회원탈퇴</button>
			</form>
		</div>

		<footer id="footer">
			<span class="text">Copyright</span> <span class="corp">©
				PPUMTING Corp.</span> <span class="text">All Rights Reserved.</span>
		</footer>
	</div>
</body>
</html>