<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ppumting</title>
</head>
<body>
		<h3>Home</h3>
		<button><a href='<c:url value="/User/mypage/userUpdate/userSelect.jsp"/>'>회원정보 수정</button>
		<button><a href='<c:url value="/User/mypage/loginout/logout"/>'>로그아웃</button>
		<button><a href='<c:url value="/User/mypage/delete/deleteUser.jsp"/>'>회원탈퇴</button>
</body>
</html>