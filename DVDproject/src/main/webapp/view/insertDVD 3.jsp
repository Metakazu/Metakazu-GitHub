<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>新增DVD</title>
<script type="text/javascript" src="js/jquery.min.js "></script>
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
<style type="text/css">
body{ 
background-color:rgb(167, 87, 98);
}
h2{
font: 400 16px 'Open Sans';
  text-transform: uppercase;
  color: white;
  text-shadow: 1px 1px 1px #fff;
  margin-bottom: 30px;
}
</style> 
</head>
<body >
<h2>新增DVD</h2>
<form action="/DVDproject/dvdServlet" method="get" align="center">
<input type="text"  name="DVD_Name" placeholder="请输入DVD的名字" id="dvdName"><br> 
<div><c:out value="${msg}"></c:out></div>
<div></div> <br>  
<div></div> <br> 

<input type="submit"  value="提交" id="addButton" disabled>  
</form>
</body>
</html>