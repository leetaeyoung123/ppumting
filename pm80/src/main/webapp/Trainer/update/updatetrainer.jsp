<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="java.util.List, java.net.URLEncoder"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html lang="ko" dir="ltr">
<head>
<link rel="icon" type="image/png" sizes="32x32"
	href="../../../ico/favicon-32x32.png">
<meta charset="utf-8">
<link href="../mypagecss/update.css" rel="stylesheet" type="text/css">
<title>ppumting | 트레이너 정보수정</title>
</head>

<body>
	<div id="wrap">
		<header id="header">
			<h1 class="logo">PPUMTING | 트레이너정보수정</h1>
		</header>
		
		<div id="login_wrap">
			<form action="updateTrainer" method="Post">
				아이디:
				<div class="id_input">
					<input type="text" name="trainerId" value="${trainerId}" readonly>
				</div>
				<span class="idtext"> *아이디 변경은 불가능합니다.</span><br>
				비밀번호:
				<div class="id_input">
					<input type="password" name="passwd" value="${trainer.passwd}" maxlength="20" required>
				</div>
				<br>
				이름:
				<div class="name_input">
					<input type="text" name="name" value="${trainer.name}" required>
				</div>
				<br>
				전화번호:
				<div class="phone_input">
					<input type="text" name="phone" value="${trainer.phone}" maxlength="13" required>
				</div>
				<br>
				주소:
				<div class="addr_input">
					<input type="text" name="addr" value="${trainer.addr}" required><br>
				</div>
				<br>
				<button class="update_btn" type="submit">회원정보 수정하기</button>
			</form>

			<form action="deleteTrainer" method="Post">
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