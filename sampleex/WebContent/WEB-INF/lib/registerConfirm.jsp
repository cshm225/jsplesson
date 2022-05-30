<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="model.User" %>
    <%
    User registerUser=(User) session.getAttribute("registerUser");
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<p>touroku-</p>
<p>
id:<%=registerUser.getId() %>
name:<%=registerUser.getName() %>
</p>
<a href="/sampleex/RegisterUser">return</a>
<a href="/sampleex/RegisterUser?action=done">TOUROKU!</a>
</body>
</html>