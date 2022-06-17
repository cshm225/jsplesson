<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:out value="${human2.name }">
	</c:out>
	<c:if test="${human2.age>=20 }">
成人
</c:if>
	<p>${human.name }sann${human.age}歳</p>
	<c:choose>
		<c:when test="${human.age ge 50 }">
		otona
		</c:when>
		<c:when test="${human.age ge 20 }">
		otonaaaa
		</c:when>
		<c:otherwise>
		kodomo
		</c:otherwise>
		</c:choose>

		<c:forEach var="i" begin="0" end="9" step="1">
		<c:out value="${i }"></c:out>
		</c:forEach>

		<c:forEach var="h" items="${ list}">
		<p>name:${h.name },age:${h.age }</p>
		</c:forEach>
</body>
</html>