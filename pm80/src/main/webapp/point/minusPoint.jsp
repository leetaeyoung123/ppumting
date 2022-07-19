<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> <%-- 커스텀태그 --%>
<%@ page import="java.net.URLEncoder" %>
<%@ page isELIgnored="false" %>

<!doctype html>
<html lang="ko">
  <head>
    <meta charset="utf-8">
    <link rel="icon" type="image/png" sizes="32x32" href="../ico/favicon-32x32.png">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="Mark Otto, Jacob Thornton, and Bootstrap contributors">
    <meta name="generator" content="Hugo 0.88.1">
    <title>HOME | PUMTTING</title>

    <link rel="canonical" href="https://getbootstrap.com/docs/5.1/examples/carousel/">



    <!-- Bootstrap core CSS -->
<link href="../assets/dist/css/bootstrap.min.css" rel="stylesheet">

    <style>
      .bd-placeholder-img {
        font-size: 1.125rem;
        text-anchor: middle;
        -webkit-user-select: none;
        -moz-user-select: none;
        user-select: none;
      }

      @media (min-width: 768px) {
        .bd-placeholder-img-lg {
          font-size: 3.5rem;
        }
      }
    </style>


    <!-- Custom styles for this template -->
    <link href="homecss/carousel.css" rel="stylesheet">
  </head>
  <body>

<header>
  <nav class="navbar navbar-expand-md fixed-top">
    <div class="container-fluid">
      <a class="navbar-brand" href="#" onClick="top.location='javascript:location.reload()'">PPUMTING</a>
      <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarCollapse" aria-controls="navbarCollapse" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
      </button>
      <div class="collapse navbar-collapse" id="navbarCollapse">
        <ul class="navbar-nav me-auto mb-2 mb-md-0">
          <li class="nav-item">
            <a class="nav-link" aria-current="page" href='<c:url value="/Qna/qnaInfo/inquiryQna.jsp"/>'>게시판</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="../Trainer/mypage.jsp">P.P.T</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="#">Info</a>
          </li>
        </ul>
        <div class="login_info">
          쪽지함 :
          <a type="hidden" href='<c:url value="/Note/selectTitleMsg"/>'>${countNote}</a>
          ${userId}님
          <button class="login_btn"><a href='<c:url value="/User/mypage/userUpdate/userSelect"/>'>수정</a></button>
          포인트 : ${checkPoint}p
          <button class="login_btn"><a href='<c:url value="/point/addPoint"/>'>충전</a></button>
          <button class="login_btn"><a href='<c:url value="/User/mypage/loginout/logout"/>'>로그아웃</a></button>
        </div>
      </div>
    </div>
  </nav>
</header>

<main>

  <div class="container marketing">
    <!-- Three columns of text below the carousel -->
    <form action="minusPoint" method="post">
    <div class="row">
      <div class="col-lg-4">
        <img class="radius_img" src="../img/radius_img01.jpg" alt="">
        <h2>김종국</h2>
        <p>"포기란 없다"</p>
        <input type="radio" name="contact" value="김종국">
      </div><!-- /.col-lg-4 -->
      <div class="col-lg-4">
        <img class="radius_img" src="../img/radius_img02.jpg" alt="">
        <h2>마동석</h2>
        <p>"좋은 몸은 하루아침에 만들어지지 않는다."</p>
        <input type="radio" name="contact" value="마동석">
      </div><!-- /.col-lg-4 -->
      <div class="col-lg-4">
      <img class="radius_img" src="../img/radius_img03.jpg" alt="">
        <h2>양치승</h2>
        <p>'한계'라고 느낄 때 '한 개'를 더 해야 성장한다.</p>
        <input type="radio" name="contact" value="양치승">
      </div><!-- /.col-lg-4 -->
      
    	<button type="submit">결제하기</button>
	</form>
    </div><!-- /.row -->
   </div>
   
   
  <!-- FOOTER -->
  <footer class="container">
    <p class="float-end"><a href="#">Back to top</a></p>
    <p>&copy; 2017–2021 Company, Inc. &middot; <a href="#">Privacy</a> &middot; <a href="#">Terms</a></p>
  </footer>
</main>
    <script src="../assets/dist/js/bootstrap.bundle.min.js"></script>
  </body>
</html>
