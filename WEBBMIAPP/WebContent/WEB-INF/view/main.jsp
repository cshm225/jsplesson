<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="model.*"%>
    <%
    BMI bmi=(BMI)request.getAttribute("bmi");
    String height=bmi==null?"":bmi.getHeight()+"";
    String weight=bmi==null?"":bmi.getHeight()+"";

    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="/WEBBMIAPP/Main" method="post">
height:<input type="number" name="height" step="0.1" min="0.0" placeholder="EnterHeight(cm)"><br>
weight:<input type="number" name="weight" step="0.1" min="0.0" placeholder="EnterWeight(cm)" ><br>
<button type="submit">send </button>
</form>
<%if(bmi!=null){ %>
height:<%=bmi.getHeight() %>
weight:<%=bmi.getWeight() %>
bmi:<%=bmi.getBmi() %>
<img src="<%=bmi.getImgPath() %>" width="100">
<%} %>
</body>
</html>