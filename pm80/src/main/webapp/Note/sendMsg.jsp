<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>쪽지보내기</title>
<style type="text/css">
textarea {
	width: 500px;
	height: 300px;
	border: 1px solid #f1f1f1;
	resize: none;
}
.gray {
	color: gray;
}

.title {
	width: 500px;
	height: 30px;
	border: 1px solid #f1f1f1;
}
</style>
</head>
<body>
<form action="sendMsg" method="post">
쪽지 입력<br>
<input type="text" name="title" maxlength="30" placeholder="제목은 최대 30자까지 입력가능합니다." class="title"><br>
<div class= "text_box">
<textarea name="msg"></textarea><br>
<div class="count">
<span>0</span>/200<br>
<p class="gray">쪽지 내용은 최대 200자까지만 입력가능합니다.</p>
</div>
</div>
보내실 분 ID : <input type="text" name="receiveUserId"><br>
본인 ID : <input type="text" name="sendUserId"><br>
<input type="submit" value="전송">
</form>

<form action="selectTitleMsg" method="post">
아이디 입력 <input type="text" name="sendUid"><br>
<input type="submit" value="조회">
</form>
<script src="http://code.jquery.com/jquery-1.10.2.min.js"></script>
<script type="text/javascript">
$('.text_box textarea').keyup(function(){
	  var content = $(this).val();
	  $('.text_box .count span').html(content.length);
	  if (content.length > 200){
	    alert("최대 200자까지 입력 가능합니다.");
	    $(this).val(content.substring(0, 200));
	    $('.text_box .count span').html(200);
	  }
	});
</script>
</body>
</html>