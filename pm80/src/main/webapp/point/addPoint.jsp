<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="addPoint" method="post">
	<fieldset>
	<legend>포인트 충전</legend>
		아이디 : <input type="text" name="userId"/>
		금액 : <input type="text" name="money"/>
    	<button type="submit">충전하기</button>
	</fieldset>
	</form>
</body>
</html>