<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="model.*,java.util.*" %>
    <%
    User loginUser=(User) session.getAttribute("loginUser");
	List<Mutter> mutterList=(List<Mutter>) request.getAttribute("mutterList");
	String errMsg=(String)request.getAttribute("errorMsg");
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>どこつぶ</title>
</head>
<body>

<h1>どこつぶめいん</h1>
<p>
<%=loginUser.getName() %>さんログイン中
<a href="/docoTsubuDB/Logout">ログアウト</a>
</p>
<p><a href="/docoTsubuDB/Main">更新</a></p>
<form action="/docoTsubuDB/Main" method="post">
<input type="text" name="text">
<input type="submit" value="つぶやく">

</form>
<%if(errMsg!=null){ %>
<p><%= errMsg %></p>

<%} %>
<%if(mutterList !=null && mutterList.size()>0){ %>
<%for(Mutter mutter:mutterList){ %>
<p><%=mutter.getUserName() %>:<%=mutter.getText() %></p>
<%} %>
<%} %>
</body>
</html>