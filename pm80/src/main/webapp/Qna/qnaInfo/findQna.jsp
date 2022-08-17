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
				<h1 style="margin-top: 50px; text-align: center;">
					<span class="trainer-hover" style="font-weight: bold;">BOARD</span>
				</h1>
			</div>
		</div>
	</div>

  <div class="trainer-wrapper">
        <div class="inner">
          <div class="trainer-container">
            <h1 style="margin-top: 50px; text-align: center;"><span class="trainer-hover"
            style=" font-weight: bold;">BOARD</span></h1>
          </div>
        </div>
      </div>

      </div>
      <div class="form">
      <div style="font-size: 30px;display: flex; margin-left: 100px;">
      <span style="border-bottom: 2px solid black; color: #0d6efd;">제목</span>
      <span style="margin-left: 310px; border-bottom: 2px solid black; color: #0d6efd;">아이디</span>
      <span style="margin-left: 310px; border-bottom: 2px solid black; color: #0d6efd;">게시일자</span>
      </div>

     	<form action="find.do" method="post" style="text-align: center;"><br>
			<c:forEach var="qna" items="${qnaList}">
				<div>
					<a href="selectNoQna.do?qnaNo=${qna.qnaNo}" style="text-decoration: none; text-align: center; display: flex; margin-bottom: 10px; margin-bottom: 20px;"><br>
					<!-- ${qna.qnaNo}.&nbsp; -->
					<div style="font-size: xx-large;"><input type="text" value="${qna.qnaTitle}" style="border: none; margin-left: 40px;"></div>
					<div style="font-size: xx-large;"><input type="text" value="${qna.userId}" style="border: none; margin-left: 40px;"></div>
					<div style="font-size: xx-large;"><input type="text" value="${qna.qnaRegDate}" style="border: none; margin-left: 40px;"></div>
					</a>
				</div>
			</c:forEach>
		</form>
		<br> <br>
	</div>
	<div style="height: 45px;">
		<button class="addBu">
			<a href='<c:url value="/Qna/qnaInfo/addQna.jsp"/>'>등록</a>
		</button>
	</div>


	<%-- footer Area --%>
	<div id="footer">
		<%@ include file="/incl/footer.jsp"%>
	</div>

</body>
</html>
