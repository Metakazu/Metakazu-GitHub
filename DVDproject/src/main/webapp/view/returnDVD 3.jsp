<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>归还DVD</title>
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
  color: white;: #999;
  text-shadow: 1px 1px 1px #fff;
  margin-bottom: 30px;
}
 
</style> 
</head>
<body>
<h2>归还DVD</h2>
<form action="/DVDproject/returnDVD" method="get" align="center">

<table align="center">
		<tr>
			<th>选择</th>
			<th>序号</th>
			<th>状态</th>
			<th>名称</th>
			<th>归还日期</th>
		
		</tr>
		<c:forEach var="dvd" items="${dvds }">
			<tr>
				<td><input type="checkbox" name="returnDvd" value="${dvd.ID }"></td>
				<td>${dvd.ID }</td>
				<td>${dvd.state }</td>
				<td>《${dvd.name }》</td>
				<td>${dvd.date }</td> 
			</tr>
		</c:forEach>
				
	</table>
			<input type="submit"  value="归还"><br>
			<div><c:out value="${cost}"></c:out></div>
</form>
</body>
</html>