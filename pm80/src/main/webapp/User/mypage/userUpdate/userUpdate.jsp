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
<h4>원하는 항목을 변경해주세요</h4>
<form action="userUpdate" method="post">
아이디: <input type="text" name="userId" value="${user.userId}" readonly><span>아이디 변경은 불가능 합니다.</span><br>
비밀번호: <input type="text" name="pw" value="${user.pw}"><br>
이름: <input type="text" name="name" value="${user.name}"><br>
주민번호: <input type="text" name="ssn" value="${user.ssn}" readonly><span>주민번호 변경은 불가능 합니다.</span><br>
전화번호: <input type="text" name="phone" value="${user.phone}"><br>
주소: <input type = "text" name="addr" value="${user.addr}"><br>
<input type="submit" value="회원정보 수정 완료">
</form>
</body>
</html>