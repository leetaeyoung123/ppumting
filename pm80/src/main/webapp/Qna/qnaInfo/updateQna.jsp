<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.List, java.net.URLEncoder" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	수정이 완료되었습니다.<br>
	 <form action="find.do" method="post"><br>
	 <button><a href='<c:url value="/Qna/qnaInfo/find.do"/>'>완료</a></button>
  	</form>
</body>
</html>