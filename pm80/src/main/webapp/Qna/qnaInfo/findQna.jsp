<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="java.util.List, java.net.URLEncoder"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="utf-8">
<link rel="icon" type="image/png" sizes="32x32"
	href="../../ico/favicon-32x32.png">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author"
	content="Mark Otto, Jacob Thornton, and Bootstrap contributors">
<meta name="generator" content="Hugo 0.88.1">
<link href="../findqna/board.css" rel="stylesheet">

<title>HOME | PUMTTING</title>

<link rel="canonical"
	href="https://getbootstrap.com/docs/5.1/examples/carousel/">

<!-- Bootstrap core CSS -->
<link href="../../assets/dist/css/bootstrap.min.css" rel="stylesheet">

<style>
.bd-placeholder-img {
	font-size: 1.125rem;
	text-anchor: middle;
	-webkit-user-select: none;
	-moz-user-select: none;
	user-select: none;
}

@media ( min-width : 768px) {
	.bd-placeholder-img-lg {
		font-size: 3.5rem;
	}
}
</style>

<!-- Custom styles for this template -->
<link href="../qnacss/carousel.css" rel="stylesheet">
</head>
<body>
	<%-- header Area --%>
	<div id="header">
		<jsp:include page="/incl/banner.jsp">
			<jsp:param name="subtitle"
				value="<%=URLEncoder.encode(\"mod010: Login.jsp\", \"UTF-8\")%>" />
		</jsp:include>
	</div>
	<%-- content Area --%>

  <div class="trainer-wrapper">
        <div class="inner">
          <div class="trainer-container">
            <h1 style="margin-top: 50px; text-align: center; font-size: 80px;"><span class="trainer-hover"
            style=" font-weight: bold; color: #0d6efd;">BOARD</span></h1>
          </div>
        </div>
      </div>
      <div style="margin-left: 1210px;color: violet;font-weight: bold;">※ 상세보기를 원하시면 원하시는 번호를 클릭하세요</div>
    <div class="form" style="height: 550px;">
    <form action="find.do" method="post" style="text-align: center;"><br>
    <table>
    	<th>번호</th>
		<th>제목</th>
		<th>아이디</th>
		<th>게시일자</th>
		<c:forEach var="qna" items="${qnaList}" varStatus="x">	<!-- varStatus는 인덱스값 사용가능한 문법 -->
		<tr>
			<td style="font-weight: 400;color: black;"><a href="selectNoQna.do?qnaNo=${qna.qnaNo}" style="color: black;text-decoration: none;">${x.index+1}</td>
			<td style="font-weight: 400;color: black;">${qna.qnaTitle}</td>
			<td style="font-weight: 400;color: black;">${qna.userId}</td>
			<td style="font-weight: 400;color: black;">${qna.qnaRegDate}</td>
		</tr>
	
		</c:forEach>
	</table>
	</form>
	</div>
	
	<!-- 등록버튼 -->
	<div style="height: 45px;">
		<button class="addBu" style="margin-top: -50px;">
			<a href='<c:url value="/Qna/qnaInfo/addQna.jsp"/>' style="font-weight: bold;">등록</a>
		</button>
	</div>


	<%-- footer Area --%>
	<div id="footer" style="margin-top: 28px;">
		<%@ include file="/incl/footer.jsp"%>
	</div>

</body>
</html>
