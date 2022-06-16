<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="model.*"%>
    <%
    Nagasu nagasu=(Nagasu)request.getAttribute("nagasu");
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>お土産検索</title>
</head>
<body>
<h1>お土産</h1>
<form action="/Nagasu/Main" method="post">
都道府県名:<input type="text" name="name">
<button type="submit">調べる</button>

</form>
<%if(nagasu!=null){ %>
<table>
<tr><th>都道府県名:</th><td><%=nagasu.getName() %> </td><th>お土産:</th><td><%=nagasu.getSpecialty() %></td></tr>
</table>
<table>
<thead >
	<tr align=center>
		<th>説明</th>
		</tr>
		</thead>
		<tbody><tr><td><%=nagasu.getDescription() %></td></tr></tbody>
</table>
<%} %>

</body>
</html>