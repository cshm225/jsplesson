<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="model.*" %>
    <%
    Tform tform=(Tform)session.getAttribute("tform");
    String name=tform==null?"":tform.getName();
    String address=tform==null?"":tform.getAddress();
    String otoiawase=tform==null?"":tform.getOtoiawase();
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

<form action="/toiawase/RegisterUser" method="post" >
<table><tr><th>お名前:</th><td><input type="text" name="name" value="<%=name %>"></td></tr>
<tr><th>アドレス:</th><td><input type="text" name="address" value="<%=address%>"></td></tr>
<tr><th>内容:</th><td><textarea name="otoiawase"><%=otoiawase%></textarea></td></tr></table>
<button type="submit" value="確認">aaa</button>
</form>
</div>
</body>
</html>