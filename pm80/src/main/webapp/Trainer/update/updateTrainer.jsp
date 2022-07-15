<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.net.URLEncoder" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h3>회원정보수정</h3>
	<form action="updateTrainer" method="post">
		이름: <input type="text" name="name"><br>
		비밀번호: <input type="password" name="passwd"><br>
		전화번호: <input type="text" name="phone" placeholder="-를 제외한 전화번호"><br>
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
		<input type="submit" value="정보수정">
	 </form>
	 
</body>
</html>