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
	<form action="../loginout/login" method="post">
		아이디: <input type="text" name="userId"/><br>
		이름: <input type="text" name="name"/><br>
		주민번호: <input type="text" name="ssn"/><br>
		<input type="submit" value="회원탈퇴">
	</form>
</body>
</html>