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
	<h3>게시글 상세 내용 조회</h3>
	<!-- qnas는 servlet에 있는 setAttribute안에 키값이랑 같아야 함 -->
	No : ${qnas.qnaNo}<br> 
	제목 : ${qnas.qnaTitle}<br> 
	게시글 내용 : ${qnas.qnaContent}<br>
	등록 일자 : ${qnas.qnaRegDate}	
	<form action="modifyQna.do" method="post">
		<!--  <button type="submit" value="${qnas.qnaNo}" name="qnaNo">수정</button> -->
		<button type="submit" value="${qnas.qnaNo}" name="qnaNo" onclick="location.href='modifyQna.jsp'">수정</button>
  	</form>
	<form action="deleteQna.do" method="post"  >
		<button type="submit" value="${qnas.qnaNo}" name="qnaNo" >삭제</button>
  	</form>
</body>
</html>