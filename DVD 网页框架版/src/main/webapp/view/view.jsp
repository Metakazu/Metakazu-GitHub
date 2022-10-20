<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>查看DVD</title>
</head>
<body>
	<table border="1">
		<tr>
			<th>序号</th>
			<th>状态</th>
			<th>名称</th>
			<th>借出日期</th>
			<th>借出次数</th>
		</tr>
		<c:forEach var="dvd" items="${dvds }">
			<tr>
				<td>${dvd.id }</td>
				<td>${dvd.state }</td>
				<td>${dvd.name }</td>
				<td>${dvd.date }</td>
				<td>${dvd.count }</td>
			</tr>
		</c:forEach>
	</table>
	<a href="/miniDVDManagerDWP/menu">返回</a>
</body>
</html>