<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h4>제목 or 내용을 변경해 주세요</h4>
	<form action="update.do" method="post">
	게시글 번호: <input type="text" name="qna_no" value="${qnas.qnaNo}" readonly><br>
	제목: <input type="text" name="qna_title" value="${qnas.qnaTitle}"><br>
	내용: <input type="text" name="qna_content" value="${qnas.qnaContent}"><br>
	게시일자: <input type="text" name="qna_reg_date" value="${qnas.qnaRegDate}"><br>
		<input type="submit" value="게시글 수정 완료">
	</form>
</body>
</html>