<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="sendMsg.do" method="post">
메세지 입력<br>
<textarea rows="10" cols="30" name="msg"></textarea><br>
보내실 분 : <input type="text" name="toMsg"><br>
본인 ID : <input type="text" name="userId"><br>
<input type="submit" value="전송">
</form>
</body>
</html>