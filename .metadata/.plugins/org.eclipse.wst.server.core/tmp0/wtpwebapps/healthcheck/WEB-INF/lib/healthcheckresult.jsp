<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="servlet.*,model.*" %>
    <%
    	double he;
		Health h=(Health)request.getAttribute("bmi");
	
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>kekka-</title>
</head>
<body>
<h1>kekka</h1>
身長:<%h.getHeight(); %>cm
体重:<%h.getWeight(); %>cm
</body>
</html>