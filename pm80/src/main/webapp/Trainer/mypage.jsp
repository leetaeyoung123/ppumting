<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h3>My Page</h3>
	<a href='<c:url value="login" />'>로그아웃</a>
	<a href='<c:url value="deleteTrainer.jsp" />'>회원탈퇴</a>
	
</body>
</html>