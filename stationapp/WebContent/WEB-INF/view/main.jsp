<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*"%>
<%
List<String> area=(List<String>)request.getAttribute("area");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>駅検索</title>
</head>
<body>
<p>路線を選んでください</p>
<form action="Main" method="post">
<select name="area">

<% for(String s:area){ %>
<option value="<%=s %>"><%=s %></option>
<%} %>
</select>
<input type="submit" value="送信">
</form>
</body>
</html>