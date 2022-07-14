<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="java.util.List, java.net.URLEncoder"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>포인트 조회 성공</title>
</head>
<body>
	<%
    List<String> successPrice = (List<String>)request.getAttribute("successPrice");
	List<String> userId = (List<String>)request.getAttribute("userId"); 
   %>
	<%
      for(String price : successPrice){
   %>
	<%=
      "사용자의 현재 포인트 : " + price
   %><br>
	<%
   }
	%>
	
	
	<%
      for(String x : userId){
   %>
	<%=
      "사용자의 현재 포인트 : " + x
   %><br>
	<%
   }
	%>
  
   
</body>
</html>