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
	<c:forEach var="msg" items="${msgs}">
		<c:choose>
			<c:when test="${msg.key >= 0}">
				<div> 科目ID:『${msg.key}』,${msg.value}</div>
			</c:when>
			<c:otherwise>
				<div>${msg.value}</div>
			</c:otherwise>
		</c:choose>
	</c:forEach>
	<form action="selectAllCourse" method=post>
		 <table border="1">
			<tr>
				<th>学科名</th>
				<th>専攻ID</th>
				<th>専攻名</th>
				<th>科目ID</th>
				<th>名称</th>
				<th>区分</th>
				<th>選択人数</th>
				<th>選択欄</th>
				<th>曜日</th>
				<th>時限</th>
			</tr>
			<c:forEach var="course" items="${course}">
			<tr>
					<td>${course.major.dpname}</td>
					<td>${course.major.mid}</td>
					<td>${course.major.mname}</td>
					<td>${course.cid}</td>
					<td><a href="/selectOneCourse?cid=${course.cid}">${course.cname}</a></td>
					<td>${course.ctype}</td>
					<td>${course.std}</td>
					<td><input type="checkbox" name="cid" value="${course.cid}"></td>
					<td>${course.weekday}</td>
					<td>${course.ctime}</td>
			</tr>
			</c:forEach>
		</table>
		<input type="hidden" name="sid" value="${id}">
		<input type="submit" id="cbox">
		<input type="button" value="戻る" onclick="javascript:location.href='/nama'">
	</form>
</body>
</html>