<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="model.*,java.util.*"%>
    <%
    List<Dounut> list=(List<Dounut>)request.getAttribute("list");
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <title>Donut Menu</title>
  <link rel="stylesheet" href="http://yui.yahooapis.com/3.18.1/build/cssreset/cssreset-min.css">
  <link rel="stylesheet" href="css/main.css"/>
<title>Insert title here</title>
</head>
<body>
	<div id="wrapper">
	<h1>Donut menu</h1>
		<div id="menu">
			<%for(Dounut d:list ){ %>
				<div>
					<img src="upload/<%=d.getImgname() %>">
					<p><%=d.getName() %></p>
					<p><%=d.getPrice() %>円</p>
				</div>
			<%} %>
		</div>
	</div>
</body>
</html>