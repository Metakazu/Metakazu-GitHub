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
.allCourse{
    margin:auto;
    border-width: 1px;
    border-collapse:collapse;
    border-spacing:0;
    border-left:1px solid #888;
   }
   .allCourse th{
   background:#b5cfd2 url('cell-blue.jpg');
   font-size:19px;
   border-width:1px;
   padding:8px;
   }
    p{
   text-align:center;
   padding-left:30px;
   height:70px;
    display:table-cell; 
    vertical-align:bottom;
    padding-left:85px;
    font-size:20px;
   }
   .allCourse td{
    text-align:center;
    background-color:#ffff66;
    width:220px;
   }
   .inp{
     margin-left:980px;
     width:90px;
     height:30px;
      background-color:#4a77d4;
      color:#fff;
      border: 1px solid #3762bc;
       border-radius:9px;
       font-size:17px;
   }
</style>
</head>
<body>
	<p>学籍番号:${id} 名前:${name}さん
		  <input type="button" value="戻る" onclick="javascript:location.href='/nama'" class="inp">
		</p><br>
	 <table border="1" class="allCourse">
		<tr>
			<th>学科名</th>
			<th>専攻ID</th>
			<th>専攻名</th>
			<th>科目ID</th>
			<th>名称</th>
			<th>区分</th>
		</tr>
		<c:forEach var="course" items="${course}">
		<tr>
			<td>${course.major.dpname}</td>
			<td>${course.major.mid}</td>
			<td>${course.major.mname}</td>
			<td>${course.cid}</td>
			<td>${course.cname}</td>
			<td>${course.ctype}</td>
		</tr>
		</c:forEach>
	</table>
	<input type="button" value="戻る"  class="inp" onclick="javascript:location.href='/nama'">
</body>
</html>