<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="user" method="post">
	회원 아이디: <input type="text" name="userId"><br>
	비밀번호: <input type="password" name="pw"><br>
	이름: <input type="text" name="name"><br>
	주민번호: <input type="text" name="ssn" placeholder="앞자리 6자리만 입력해주세요"><br>
	주소: <select name = "addr1">
			<option>지역 선택</option>
			<option>서울</option>
			<option>대구</option>
			<option>대전</option>
			<option>부산</option>
			<option>포항</option>
			<option>제주</option>
			<option>울산</option>
			<option>경기도</option>
			<option>경상 북도</option>
			<option>경상 남도</option>
			<option>강원도</option>
			<option>전라 남도</option>
			<option>전라 북도</option>
		</select>
		<input type = "text" name="addr2" placeholder="상세 주소를 적어주세요"><br>
		<input type="submit" value="회원가입">
</body>
</html>