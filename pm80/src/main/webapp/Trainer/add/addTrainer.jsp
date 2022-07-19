<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.net.URLEncoder" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<br>
	<form action="addTrainer" method="post">
		트레이너 아이디: <input type="text" name="trainerId"><br>
		이름: <input type="text" name="name"><br>
		비밀번호: <input type="password" name="passwd"><br>
		주민번호: <input type="text" name="ssn" placeholder="앞자리 6자리 입력해주세요"><br>
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
		<input type="text" name="addr2" placeholder="상세 주소를 입력하세요"><br>
		가격: <select name = "price">
			<option>1개월 300,000원</option>
		</select><br>
		<input type="submit" value="회원가입">
	 </form>
	 
<br>
	 <form action="findTrainer" method="post">
			<input type="submit" value="트레이너 조회"><br>
	 </form>
	 
</body>
</html>