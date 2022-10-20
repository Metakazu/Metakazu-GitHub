<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>管理者システム</title>
</head>
<body>
<div style="text-align:right">
	<br>
	<p>管理者:${id}</p>
	<p>名前:${name}さん</p>
</div>
<form action="managerCourse" method="get"><input type="submit" value="科目一覧"> </form>
<form action="managerStudent" method="get"><input type="submit" value="学生一覧"> </form>
<form action="managerScore" method="post">
	<input type="hidden" name="sid" value="${id}">
	<input type="submit" value="学生成績"> 
</form>

</body>
</html>
<!-- 	/**
	 * 名称：管理者系统主页
	 * 更新者：kon
	 * 最终更新日期：10/02
	 */ -->