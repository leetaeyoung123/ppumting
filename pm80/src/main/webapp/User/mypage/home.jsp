<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.List, java.net.URLEncoder" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ppumting</title>
</head>
<body>
		<h3>Home</h3>
		<button><a href='<c:url value="/User/mypage/userUpdate/userSelect"/>'>회원정보 수정</button>
		<button><a href='<c:url value="/User/mypage/loginout/logout"/>'>로그아웃</button>
		<button><a href='<c:url value="/User/mypage/delete/deleteUser.jsp"/>'>회원탈퇴</button>
		<button><a href='<c:url value="/point/createAccount.jsp"/>'>계좌생성</button>
		<label>Last Access Time : </label> ${lastAccessTime}
		
</body>
</html>