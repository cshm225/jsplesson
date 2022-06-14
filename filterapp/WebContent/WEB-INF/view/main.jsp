<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
    <%
    String name=(String)request.getAttribute("name");
    name=name==null?"":name;
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="/filterapp/Main" method="post">
name:<input type="text"name="name">
<input type="submit">
</form>
<%if(!name.equals("")){ %>
youkoso<%=name %>
<%} %>
</body>
</html>