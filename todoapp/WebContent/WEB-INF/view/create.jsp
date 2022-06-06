<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="model.*,java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="/todoapp/Create" method="post">
title:<input type="text" name=title><br>
重要度:<input type="number" name=importance><br>
<button type="submit">登録</button>
</form>
</body>
</html>