<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.List, java.net.URLEncoder" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
  <link rel="icon" type="image/png" sizes="32x32" href="../../../ico/favicon-32x32.png">
    <meta charset="utf-8">
    <link rel="stylesheet" href="signupcss/normalize.css">
    <link rel="stylesheet" type="text/css" href="signupcss/style.css?after">
<meta charset="UTF-8">
<title>Error</title>
</head>
<body>
<div>
<h4>실패</h4>
   <%
   List<String> errorMsgs = (List<String>)request.getAttribute("errorMsgs");
   %>
   <%
      for(String x : errorMsgs){
   %>
   <%=
      x
   %><br>
   <%
   } 
   %>
   <button type="button" onClick="history.go(-1)">확인</button>
</div> 
</body>
</html>