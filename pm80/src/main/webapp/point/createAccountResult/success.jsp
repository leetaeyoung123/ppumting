<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="java.util.List, java.net.URLEncoder"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>계좌생성 성공</title>
</head>
<body>
	<%
   List<String> accountNum = (List<String>)request.getAttribute("accountNum");
   %>
	<%
      for(String account : accountNum){
   %>
	<%=
      "생성된 가상계좌 : " + account
   %><br>
	<%
   } 
   %>
</body>
</html>