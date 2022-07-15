<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>쪽지 조회</title>
<style type="text/css">
a {
	cursor: pointer;
}
</style>
</head>
<body>
${userId}님이 보내신 쪽지<br>
쪽지 제목&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;받으신분&nbsp;&nbsp;보낸날짜
<div>
<c:forEach var = "sendTitle" items="${sendTitles}">
	<a onclick="window.open('notemsg?no=${sendTitle.no}', '_blank', 'width=600 height=600')">
	${sendTitle.no} ${sendTitle.title} ${sendTitle.sendUserId} ${sendTitle.regDate}
	</a>
	<br>
</c:forEach>
</div>
<br>
${userId}님이 받으신 쪽지<br>
쪽지 제목&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;보내신분&nbsp;&nbsp;받은날짜
<div>
<c:forEach var = "receiveTitle" items="${receiveTitles}">
	<a onclick="window.open('notemsg?no=${receiveTitle.no}', '_blank', 'width=600 height=600')">
	${receiveTitle.no} ${receiveTitle.title} ${receiveTitle.sendUserId} ${receiveTitle.regDate}
	</a>
	<br>
</c:forEach>
</div>
</body>
</html>