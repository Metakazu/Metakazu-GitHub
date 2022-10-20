<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>查看DVD</title>
<style type="text/css">
body{
background-color:rgb(167, 87, 98);
}
h2{
font: 400 16px 'Open Sans';
  text-transform: uppercase;
  color: white;or: #999;
  text-shadow: 1px 1px 1px #fff;
  margin-bottom: 30px;
}

table{
  width:400px ;
  height:100px ;
  font: 400 16px 'Open Sans';
  text-transform: uppercase;
  color: white;
  text-shadow: 1px 1px 1px #fff;
  margin-bottom: 30px;
}
</style> 

</head>
<body>
<h2>查看DVD</h2>
<form align="center">

	<table align="center">
		<tr>
			<th>序号</th>
			<th>状态</th>
			<th>名称</th>
			<th>借出日期</th>
			<th>借出次数</th>
		</tr>
		<c:forEach var="dvd" items="${dvds }">
			<tr>
				<td>${dvd.ID }</td>
				<td>${dvd.state }</td>
				<%-- <td>《${dvd.name }》</td> --%>
				<td><a href="http://localhost:8090/DVDproject/view/history.jsp"id="${dvd.ID}"&name="${dvd.name }" target="_blank">《${dvd.name }》</a></td>
				<td>${dvd.date }</td>
				<td>${dvd.count }</td>
			</tr>
		</c:forEach>
	</table>
</form>
</body>
</html>