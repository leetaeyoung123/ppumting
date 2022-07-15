<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:forEach var = "selectQnaNo" items="${selectQnaNo}">
	<a onclick = ${selectTitle.qnaTitle}>
	${selectTitle.qnaNo} ${selectTitle.qnaTitle} ${selectTitle.qnaContent} ${selectTitle.qnaRegDate}
	</a>
	</c:forEach>
</body>
</html>