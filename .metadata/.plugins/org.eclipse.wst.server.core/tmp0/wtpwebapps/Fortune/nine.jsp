<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body style=text-align:center>
	<table border="1">
		<%
		for (int i = 1; i < 10; i++) {
		%>
		<tr>
			<%
			for (int j = 1; j < 10; j++) {
			%>
			<td width=60px>
				<p><%
				out.print(i * j);
				%></p>
			</td>
			<%
			}
			%>
		</tr>
		<%
		}
		%>
	</table>
</body>
</html>