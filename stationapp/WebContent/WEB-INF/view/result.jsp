<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*,model.*"%>
    <%
    List<Station> list=(List<Station>)request.getAttribute("list");
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%for(Station s:list){ %>
<%=s.getName() %><%=s.getPrefecture() %>
<%} %>
</body>
</html>