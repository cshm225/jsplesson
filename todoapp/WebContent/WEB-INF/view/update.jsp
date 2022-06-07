<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="model.*"%>
    <%
    Todo todo=(Todo)request.getAttribute("todo");

    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="/todo/Update" method="post">
タイトル:<input type="text" name="title" value=<%=todo.getTitle() %>>
重要度:<input type="number" name=

</form>
</body>
</html>