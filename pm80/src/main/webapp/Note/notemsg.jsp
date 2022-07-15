<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>쪽지내용 확인</title>
</head>
<body>
쪽지 번호 : ${notes.no}<br>
쪽지 제목 : ${notes.title}<br><br>
보내신분 : ${notes.sendUserId}<br>
받으신분 : ${notes.receiveUserId}<br><br>
쪽지 내용<br>
${notes.msg}
</body>
</html>