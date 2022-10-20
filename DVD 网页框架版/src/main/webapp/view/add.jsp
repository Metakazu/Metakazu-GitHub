<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>新增DVD</title>
<script type="text/javascript" src="view/js/jquery.min.js"></script>
<script type="text/javascript">
$(function(){
	$("#dvdName").blur(function(){
		var dvdName = $(this).val();
		if(dvdName != null && dvdName.length > 0){
			$("#addButton").prop("disabled", false);
		}else{
			$("#addButton").prop("disabled", true);
		}
	})
})
</script>
</head>
<body>
	<form action="/miniDVDManagerDWP/add" method="post">
		<div><c:out value="${msg }"></c:out></div>
		请输入DVD名称：<input type="text" name="dvdName" id="dvdName">
		<br>
		<input type="submit" value="新增" id="addButton" disabled>
	</form>
	<a href="/miniDVDManagerDWP/menu">返回</a>
</body>
</html>