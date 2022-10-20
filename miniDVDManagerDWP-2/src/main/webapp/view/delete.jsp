<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>删除DVD</title>
</head>
<body>
	<form action="/miniDVDManagerDWP/delete" method="post">
	<div><c:out value="${msg }"></c:out></div>
	<c:choose>
		<c:when test="${fn:length(dvds) > 0 }">
			<table border="1">
				<tr>
					<th></th>
					<th>序号</th>
					<th>状态</th>
					<th>名称</th>
					<th>借出日期</th>
					<th>借出次数</th>
				</tr>
				<c:forEach var="dvd" items="${dvds }">
					<tr>
						<td><input type="checkbox" name="dvdId" value="${dvd.id }"></td>
						<td>${dvd.id }</td>
						<td>${dvd.state }</td>
						<td>${dvd.name }</td>
						<td>${dvd.date }</td>
						<td>${dvd.count }</td>
					</tr>
				</c:forEach>
			</table>
			<input type="submit" value="删除">
		</c:when>
		<c:otherwise>
			目前没有可删除的DVD
		</c:otherwise>
	</c:choose>
	</form>
	<a href="/miniDVDManagerDWP/menu">返回</a>
</body>
</html>