<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>删除DVD</title>
<style type="text/css">
body{
background-color:rgb(167, 87, 98);
}
h2{
font: 400 16px 'Open Sans';
  text-transform: uppercase;
  color: white;
  text-shadow: 1px 1px 1px #fff;
  margin-bottom: 30px;
}

table{
  width:400px ;
  height:100px ;
  font: 400 16px 'Open Sans';
  text-transform: uppercase;
  color: #999;
  text-shadow: 1px 1px 1px #fff;
  margin-bottom: 30px;
}
</style> 
</head>
<body>
<h2>删除DVD</h2>
<form action="/DVDproject/deleteservlet" method="get" align="center">
	<c:choose>
		<c:when test="${fn:length(dvds) > 0 }">
		<table align="center">
				<tr>
					<th>选择</th>
					<th>序号</th>
					<th>状态</th>
					<th>名称</th>
					<th>借出日期</th>
					<th>借出次数</th>
				</tr>
				<c:forEach var="dvd" items="${dvds }">
					<tr>
						<td><input type="checkbox" name="DVDasd" value="${dvd.ID }"></td>
						<td>${dvd.ID }</td>
						<td>${dvd.state }</td>
						<td>《${dvd.name }》</td>
						<td>${dvd.date }</td> 
						<td>${dvd.count }</td>
					</tr>
				</c:forEach>
			</table>
	
		<input type="submit"  value="删除">   
		</c:when>
		<c:otherwise>
			目前没有可删除的DVD
		</c:otherwise>
	</c:choose>
</form>
<div><c:out value="${msg }"></c:out></div>
</body>
</html>