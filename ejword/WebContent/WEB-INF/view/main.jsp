<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>EJWord</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css" integrity="sha384-HSMxcRTRxnN+Bdg0JdbxYKrThecOKuH5zCYotlSAcp1+c8xmyTe9GYg1l9a69psu" crossorigin="anonymous">
<link rel="stylesheet" href="css/main.css">
</head>
<body>
<div class="container">
<form action="/ejword/main" method="get" class="form-inline">
<input type="text" name="searchWord" value="${ ejw.searchWord}" class="form-control" placeholder="検索後を入力" required>
<select name="mode" class="form-control">
<option value="startsWith" ${ejw.mode eq("startsWith")? " selected":"" }>で始まる</option>
<option value="contains" ${ ejw.mode eq("contains")? " selected":"" }>含む</option>
<option value="endsWith" ${ ejw.mode eq("endsWith")? " selected":"" }>で終わる</option>
<option value="match" ${ejw.mode eq("match")? " selected":"" }>一致する</option>
</select>
<button type="submit" class="btn btn-primary">検索</button>
</form>
<c:if test="${ empty ejw.list and empty ejw.searchWord}">
<p>１件も一致しませんでした</p>
</c:if>
<c:if test="${ not empty ejw.list}">
	<c:choose>
	<c:when test="${ejw.total <=ejw.limit }">
		<p>全<c:out value="${ ejw.total} "/></p>
	</c:when><c:otherwise>
		<p>全<c:out value="${ ejw.total} "/>件中
		<c:out value="${ (ejw.pageNo-1)*ejw.limit+1}"/>
		<c:out value="${ ejw.pageNo*ejw.limit > ejw.total? ejw.total:ejw.pageNo*ejw.limit}"/>
		件を表示</p>
		</c:otherwise>
	</c:choose>
		<ul class="pager">
		<c:if test="${ejw.pageNo>1 }">
			<li><a href="/ejword/main?searchWord=${ ejw.searchWord}&mode=${ ejw.mode}&page=${ ejw.pageNo-1 }">←前へ</a></li>
		</c:if>
		<c:if test="${ejw.pageNo*ejw.limit<ejw.total}">
			<li><a href="/ejword/main?searchWord=${ ejw.searchWord}&mode=${ ejw.mode}&page=${ ejw.pageNo+1 }">次へ→</a></li>
		</c:if>
		</ul>
	</c:if>
	<table class="table table-borderd table-striped">
<c:forEach var="w" items="${ejw.list }">
		<tr><th>${ w.title}</th><td>${ w.body}</td></tr>
	</c:forEach>
	</table>

<c:if test="${not empty ejw.pager }">
<div class='paginationBox'>
	<ul class='pagination'>
	<c:forEach var="row" items="${ejw.pager }">
		<li class="${row[0]}">
		<a href="/ejword/main?searchWord=${ejw.searchWord}&mode=${ ejw.mode}&page=${row[1]}">${row[2]}</a>
		</li>
		</c:forEach>
	</ul>
</div>
</c:if>
</div>
<footer>
© 2021 Joytas.net
</footer>
</body>
</html>