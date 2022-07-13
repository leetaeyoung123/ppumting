<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.List, java.net.URLEncoder" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>실패 ㅠㅠ</title>
</head>
<body>
<h4>회원가입 실패</h4>
<div>
<ul>
<c:forEach var="message" items="${errorMsgs}"> 
<li>${message}</li>
</c:forEach>
</ul>
</div>
</body>
</html>