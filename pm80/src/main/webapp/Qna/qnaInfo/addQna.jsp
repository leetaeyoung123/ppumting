<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글 등록</title>
</head>
<body>
	<form action="add_qna.do" method="post">
	제목: <input type="text" name="qna_title"><br>
	내용: <input type="text" name="qna_content"><br>
		<input type="submit" value="등록">
	</form>
</body>
</html>