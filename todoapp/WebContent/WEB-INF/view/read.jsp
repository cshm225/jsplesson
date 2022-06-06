<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="model.*,java.util.*"%>
    <%
    List<Todo> list=(List<Todo>)request.getAttribute("list");
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<a href="/todoapp/Create">新規</a>
<%if(list!=null&&list.size()!=0){%>
<table>
<%for(Todo t:list){ %>
<tr>
<td>
●<%=t.getTitle() %></td><td><%=t.getStar() %></td>
<td><a href="/todoapp/Update?=<%=t.getId() %>">更新</a>
<a href="/todoapp/Delete?id=<%=t.getId()%>" onclick="return confirm('[<%=t.getTitle()%>]を削除してよろしいですか？');">削除</a>
</td>
</tr>
<% }%>

</table>
<%} %>
</body>
</html>