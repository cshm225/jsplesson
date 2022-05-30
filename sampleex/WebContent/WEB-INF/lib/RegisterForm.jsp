<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="model.*"%>
    <%
    User user=(User)session.getAttribute("registerUser");
    String id=user==null?"":user.getId();
    String name=user==null?"":user.getName();
    String pass=user==null?"":user.getPass();
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="/sampleex/RegisterUser" method="post">
ログインid:<input type="text" name="id" value="<%=id%>"><br>
パスワード:<input type="password" name="pass" value="<%=pass%>"><br>
なまえ:<input type="text" name="name" value="<%=name %>"><br>
<input type="submit" value="送信">
</form>
</body>
</html>