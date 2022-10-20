<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="js/jquery.min.js"></script>
<script type="text/javascript" src="js/ajax.js"></script>
<script type="text/javascript" src="js/function.js"></script>
</head>
<body>
	<div style="text-align:right">
		<br>
		<p>学籍番号:${id}</p>
		<p>名前:${name}さん</p>
	</div>
	<table border="1">
		<tr>
			<th>学科名</th>
			<th>専攻ID</th>
			<th>専攻名</th>
			<th>科目ID</th>
			<th>名称</th>
			<th>区分</th>
			<th>選択状態</th>
			<th>選択欄</th>
		</tr>
		<c:forEach var="course" items="${course}">
		<tr>
			<td>${course.major.dpname}</td>
			<td>${course.major.mid}</td>
			<td>${course.major.mname}</td>
			<td>${course.cid}</td>
			<td>${course.cname}</td>
			<td>${course.ctype}</td>
			<td>${course.state}</td>
			<td>
				<form action="updateOneCourse" method=post>
				<input type="hidden" name="sid" value="${id}">
				<input type="hidden" name="cid" value="${cid}">
				<input type="hidden" name="newcid" value="${course.cid}">
				<input type="submit"  value="変更">
				</form>
			</td>
		</tr>
		</c:forEach>
	</table>
	<input type="button" value="戻る" onclick="backto();">
</body>
</html>