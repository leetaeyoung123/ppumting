<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.net.URLEncoder,java.util.*" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>에러</title>
</head>
<body>
      <h3>다음과 같은 에러가 발생했습니다.</h3>
	 <c:if test="${not empty errorMsgs}">
      <ul>
         <c:forEach var="errorMsg" items="${errorMsgs}">
         <li>${errorMsg}</li>
         </c:forEach>      
      </ul>
      </c:if>
</body>
</html>