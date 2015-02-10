<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/script/jquery.js"></script>
<script type="text/javascript">

function madeAjaxCallOnDone(){
	 $.ajax({
		  type: "post",
		  url: "http://localhost:8080/helloworld/message",
		  cache: false,    
		  data:$("#text").val(),
		  success: function(response){
		   $('#displayText').html("");
		   var obj = JSON.parse(response);
		   $('#displayText').html(obj);
		  },
		  error: function(){      
		   alert('Error while request..');
		  }
		 });
}

</script>
</head>


<body>

<form id="textForm" method="post">
<table class="formtable">
<tr><td class="label">Enter Text -> </td><td><textarea id="text" name="text" rows="10" cols="10"></textarea></td></tr>
<tr><td class="label"> </td><td><input type="submit" value="Done" onclick="madeAjaxCallOnDone"/></td></tr>
</table>
<h1>Text Display Below:</h1>
<div id="displayText"></div>
</form>

</body>
</html>