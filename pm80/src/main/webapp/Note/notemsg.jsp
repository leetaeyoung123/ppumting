<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>쪽지내용 확인</title>
<script type="text/javascript">
	
	function toDelete() {
	        if(confirm("삭제 하시겠습니까?")) {
	          alert("삭제를 완료했습니다.");
	          window.opener.location.href="delete?no=${notes.no}";
	  		  window.close();
	        } else {
	          alert("삭제를 취소했습니다.");
	        }
	      }
	function toReply() {
		window.opener.location.href="sendMsg.jsp";
		window.close();
	}
	function reload(){
    window.opener.location.reload();
    window.close();
	}
	
</script>
</head>
<body>
쪽지 번호 : ${notes.no}<br>
쪽지 제목 : ${notes.title}<br><br>
보내신분 : ${notes.sendUserId}<br>
받으신분 : ${notes.receiveUserId}<br><br>
쪽지 내용<br>
${notes.msg}
<div>
<button onclick="toDelete()" id="Delete">삭제</button>
<button onclick="toReply()" id="Reply">답장</button>
<!-- 보낸 메세지에는 로그인 세션 유효성 검사로 답장 없애기 -->
</div>
</body>
</html>