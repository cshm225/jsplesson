<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    String ans=request.getParameter("ans");
    String path="laugh.png";
    String msg="正解";
    if(!ans.equals("634")){
    	path="cry.png";
    	msg="batu ans 634";

    }
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Quiz</title>
<link rel="stylesheet" href="/quiz/css/main.css">
</head>
<body>
<div id="container">
	<div id="boxA">
		<p><%=msg %></p>
			<a href="/quiz/index.html">戻る</a>
	</div>
	<div id="boxB">
		<div class=imgbox>
			<img src="/quiz/images/<%=path%>">
		</div>
	</div>
</div>
</body>
</html>