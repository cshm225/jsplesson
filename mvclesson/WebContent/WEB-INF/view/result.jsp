<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="model.*,java.util.*" %>    
<%
List<Slime> slime=(List<Slime>) request.getAttribute("slime");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% for(Slime s:slime){ %>
name wa <%= s.getName() %> no hp wa <%=s.getHp() %> desu
<%} %>
</body>
</html>