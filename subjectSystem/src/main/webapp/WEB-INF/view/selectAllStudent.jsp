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
<style type="text/css">
  .allStudent{
    margin:auto;
    border-width: 1px;
    border-collapse:collapse;
    border-spacing:0;
    border-left:1px solid #888;
    border-top:1px solid #888;
    margin-top:20px;
    height:200px;
  }
  .allStudent th{
    height:50px;
    background:#b5cfd2 url('cell-blue.jpg');
    font-size:20px;
    letter-spacing:4px;
  }
  td{
   width:120px;
   height:80px;
   text-align:center;
    background-color:#ffff66;
  }
  div{
   text-align:left;
   padding-left:391px;
  }
  input{
     margin-left:400px;
     width:90px;
     height:30px;
     background-color:#4a77d4;
     color:#fff;
     border: 1px solid #3762bc;
     border-radius:9px;
     font-size:17px;
  }
  p{
    font-size:20px;
  }
</style>
</head>
<body>
	<div>
		<br>
		<p>学籍番号:${id}　　　名前:${name}さん
		<input type="button" value="戻る" onclick="javascript:location.href='/nama'">
		</p>	
	</div>
	<table border="1" class="allStudent">
		<tr>
			<th>学科ID</th>
			<th>学科名</th>
			<th>専攻ID</th>
			<th>専攻名</th>
			<th>学生番号</th>
			<th>学生名</th>
		</tr>
		<c:forEach var="student" items="${student}">
		<tr>
			<td>${student.major.dpid}</td>
			<td>${student.major.dpname}</td>
			<td>${student.major.mid}</td>
			<td>${student.major.mname}</td>
			<td>${student.sid}</td>
			<td>${student.sname}</td> 
		</tr>
		</c:forEach>
	</table>
</body>
</html>