<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="ko" dir="ltr">
  <head>
    <meta charset="utf-8">
    <link rel="icon" type="image/png" sizes="32x32" href="../../../ico/favicon-32x32.png">
    <link rel="stylesheet" href="logincss/normalize.css">
    <link rel="stylesheet" type="text/css" href="signupcss/style.css">
    <title>관리자 로그인</title>
  </head>
  <body>
    <div id="wrap">
      <header id="header">
        <h1 class="logo">PPUMTING | 건강한 만남의 시작<h1>
      </header>
      <div id="login_wrap">
        <form class="login_form" action="login" method="post">
        <div class="id_input">
          <input type="text" name="trainerId" placeholder="아이디"/>
        </div>
        <div class="pw_input">
          <input type="password" name="passwd" placeholder="비밀번호"/>
        </div>
        <input class="login" type="submit" value="로그인"/>
        </form>
      </div>
      <div class="sign_up">
        <span>관리자 <a href='<c:url value="../add/addTrainer.jsp"/>'>회원가입</a></span>
      </div>
      <footer id="footer">
        <span class="text">Copyright</span>
        <span class="corp">© PPUMTING Corp.</span>
        <span class="text">All Rights Reserved.</span>
      </footer>
    </div>
  </body>
</html>
