<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
</style>
</head>
<body>
<form action="sendMsg.do" method="post">
메세지 입력<br>
<div class= "text_box">
<textarea name="msg"></textarea><br>
<div class="count"><span>0</span>/200</div>
</div>
보내실 분 : <input type="text" name="toMsg"><br>
본인 ID : <input type="text" name="userId"><br>
<input type="submit" value="전송">
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