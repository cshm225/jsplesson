<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="model.*" %>
    <%
    SiteEV siteEV=(SiteEV) application.getAttribute("siteEV");
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>湊君のページ</h1>
<p>
<a href="/application/Minatoindex?action=like">yoine</a>
<%=siteEV.getLike() %>
<a href="/application/Minatoindex?action=dislike">yokunaine</a>
<%=siteEV.getDislike() %>
</p>
</body>
</html>