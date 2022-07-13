<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.net.URLEncoder" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="trainer" method="post">
		트레이너 아이디: <input type="text" name="trainerId"><br>
		이름: <input type="text" name="name"><br>
		비밀번호: <input type="password" name="passwd"><br>
		주민번호: <input type="text" name="ssn" placeholder="앞자리 6자리 입력해주세요"><br>
		주소: <select name = "addr1">
			<option>서울</option>
			<option>대구</option>
			<option>대전</option>
			<option>부산</option>
			<option>경기</option>
			<option>경북</option>
			<option>경남</option>
			<option>전남</option>
			<option>전북</option>
			<option>강원도</option>
		</select>
		<input type = "text" name="addr2" placeholder="상세 주소를 입력하세요"><br><br>
		<input type="submit" value="회원가입">
	 </form>
</body>
</html>