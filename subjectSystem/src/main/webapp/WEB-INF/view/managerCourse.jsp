<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>コース管理ページ</title>
	<script type="text/javascript" src="js/jquery.min.js"></script>
	<script type="text/javascript" src="js/ajax.js"></script>
	<script type="text/javascript" src="js/function.js"></script>

<link rel="stylesheet" href="https://cdn.datatables.net/t/bs-3.3.6/jqc-1.12.0,dt-1.10.11/datatables.min.css"/> 
<script src="https://cdn.datatables.net/t/bs-3.3.6/jqc-1.12.0,dt-1.10.11/datatables.min.js"></script>
   	<script>
        jQuery(function($){
            $("#course-table").DataTable();
        });
    </script>
</head>
<body>
		<form action="managerAddCourse" method="post">
		<table>
			<thead>
				<tr><td>コース情報を入力してください。</td></tr>
			</thead>
			<tbody>
			<tr>
				<td>学科名:<input type="text" name="dpname"></td>
				<td>専攻ID名:<input type="text" name="mid"></td>
				<td>専攻名:<input type="text" name="mname"></td>
				<td>科目ID:<input type="text" name="cid"></td>
				<td>名称:<input type="text" name="cname"></td>
				<td>区分:<input type="text" name="ctype"></td>
			</tr>
			</tbody>
		</table>
	</form>
	
	
	<form action="managerCourse" method=post>
		 <table id="course-table" class="table table-bordered">
			<thead>
			<tr>
				<th>学科名</th>
				<th>専攻ID</th>
				<th>専攻名</th>
				<th>科目ID</th>
				<th>名称</th>
				<th>区分</th>
				<th>選択欄</th>
			</tr>
			</thead>
			<tbody>
			<c:forEach var="course" items="${course}">
			<tr>
				<td>${course.major.dpname}</td>
				<td>${course.major.mid}</td>
				<td>${course.major.mname}</td>
				<td>${course.cid}</td>
				<td><a href="/selectOneCourse?cid=${course.cid}">${course.cname}</a></td>
				<td>${course.ctype}</td>
				<td><input type="checkbox" name="cid" value="${course.cid}"></td>
			</tr>
			</c:forEach>
			</tbody>
		</table>
		<input type="hidden" name="sid" value="${id}">
		<input type="submit" id="cbox">
		<input type="button" value="戻る" onclick="javascript:location.href='/managerPage'">
	</form>
	
	
</body>
</html>
<!-- 	/**
	 * 名称：管理者的课程管理界面
	 * 更新者：kon
	 * 最终更新日期：10/2
	 */ -->