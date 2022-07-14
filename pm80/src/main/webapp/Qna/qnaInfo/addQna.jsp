<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="add_qna.do" method="post">
	제목: <input type="text" name="qna_title"><br>
	내용: <input type="text" name="qna_content"><br>
		<input type="submit" value="등록">
		<input type="submit" value="취소">
		</form>
  		<form action="find.do" method="post"><br>
  		<input type="submit" value="게시글 조회">
  	</form>
</body>
</html>