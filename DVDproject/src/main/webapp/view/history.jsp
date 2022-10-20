<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>《${dvd.name }》的借出记录</title>
</head>
<body>
<h2>DVD借出记录</h2>
<table align="center">
<tr>
<th>序号</th>
<th>名称</th>
</tr>
<tr>
<td>${dvd.ID }</td>
<td>《${dvd.name }》</td>
</tr>
</table>


<table align="center">
		<tr>
			<th>借出日期</th>
			<th>归还日期</th>
			<th>花费金额</th>
		</tr>
			<tr>
				<td>${dvd.lendDate }</td> 
				<td>${dvd.returnDate }</td> 
				<th>${dvd.cost}</th>
			</tr>
	</table>
</body>
</html>