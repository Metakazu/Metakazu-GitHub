<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>

body{ 
    background: #f1c40f;
	width: 100%;
	height: 40%;
	background-size: 100% 100%;
	display: center; 
	align: center; 
	justify-content: center;
	min-height: 100vh;
	margin: 0;
	background-image: linear-gradient(-20deg, #e9defa 0%, #fbfcdb 100%);
}



input{
  width: 100%;
  height: 40px;
  background: linear-gradient(to bottom, #4eb5e5 0%,#389ed5 100%); /* W3C */
  border: none;
  position: relative;
  color: #fbfbfb;
  font-family: 'Roboto'; 
  text-shadow: 1px 1px 1px rgba(0,0,0,.4);
  font-size: 15px;
  text-align:center;
  text-indent: 5px;
  cursor: pointer;
  display: block;
}absolute
input:active {
  box-shadow: 0px 2px 0px 0px rgba(0,0,0,.2);
  top: 1px;
}
  
input:hover {
	cursor: pointer;
} 

 
</style>
</head>
<body>
<a href="/DVDproject/selectDVD" target="right">
<input type="button" value="查看"><br>
</a>

<a href="/DVDproject/dvdServlet" target="right">
<input type="button" value="新增"><br>
</a>

<a href="/DVDproject/deleteservlet" target="right">
<input type="button" value="删除"><br>
</a>

<a href="/DVDproject/lend" target="right">
<input type="button" value="借出"><br>
</a>

<a href="/DVDproject/returnDVD" target="right">
<input type="button" value="归还"><br>
</a>

<a href="http://localhost:8080/DVDproject/view/表单验证.html" target="left">
<input type="button" value="退出"><br> 
</a>
</body>
</html>  