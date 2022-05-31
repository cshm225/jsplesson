<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="model.*" %>
    <%
    Tform tform=(Tform)session.getAttribute("tform");
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="http://yui.yahooapis.com/3.18.1/build/cssreset/cssreset-min.css">
<link rel="stylesheet" href="/toiawase/css/main.css">
<title>Insert title here</title>
</head>
<body>
<div class="container">

<h1>お問い合わせフォーム</h1>
<table><tr><th>お名前:</th><td><%=tform.getName() %></td></tr>
<tr><th>アドレス:</th><td><%=tform.getAddress() %></td></tr>
<tr><th>内容:</th><td><%=tform.getOtoiawase() %></td></tr></table>

<div class="box">
<a href="/toiawase/RegisterUser">戻る</a>
<a href="/toiawase/RegisterUser?action=done">送信</a></div>
</div>
</body>
</html>