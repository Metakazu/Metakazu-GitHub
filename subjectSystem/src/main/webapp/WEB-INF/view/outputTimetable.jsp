<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    <%@ page import="com.brightstar.model.Course" %>
    <%@ page import="java.util.List" %>
  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>outputTimetable</title>
<script type="text/javascript" src="js/jquery.min.js"></script>
<script type="text/javascript" src="js/ajax.js"></script>
<script type="text/javascript" src="js/function.js"></script>
</head>
<body>
	<table border="1">
		<tr>
			<th></th>
			<th>月曜日</th>
			<th>火曜日</th>
			<th>水曜日</th>
			<th>木曜日</th>
			<th>金曜日</th>
		</tr>
		<c:forEach var="i" begin="1" end="6" step="1">
			<tr>
			<th>${i}時間目</th>
			<c:forEach var="j" begin="1" end="5" step="1">
				<td><c:forEach var="scores" items="${scores}">
					<c:choose>
						<c:when test="${scores.weekday == j and scores.ctime == i }">${scores.name}</c:when>
					</c:choose>
				</c:forEach>
				</td>
			</c:forEach>
			</tr>
		</c:forEach>
	</table>
	<input type="button" value="戻る" onclick="backto();">
</body>
</html>