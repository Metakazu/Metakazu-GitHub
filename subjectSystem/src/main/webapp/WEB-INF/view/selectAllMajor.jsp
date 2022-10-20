<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
      <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>選択システム</title>
<script type="text/javascript" src="js/jquery.min.js"></script>
<script type="text/javascript" src="js/ajax.js"></script>
<script type="text/javascript" src="js/function.js"></script>
<link rel="shortcut icon" href="images/UniLogo.png">
<link rel="stylesheet" href="https://cdn.datatables.net/t/bs-3.3.6/jqc-1.12.0,dt-1.10.11/datatables.min.css"/> 
<script src="https://cdn.datatables.net/t/bs-3.3.6/jqc-1.12.0,dt-1.10.11/datatables.min.js"></script>
<link rel="stylesheet" href="style/main.css">
<script>
	jQuery(function($){
        $("#course-tableup").DataTable({
			"bPaginate":false,
			"bFilter":false,
			"bInfo":false
         });
        $("#cinfo").DataTable({
        	"bPaginate":false,
			"bFilter":false,
			"bInfo":false
          });
    });
</script> 

<script type="text/javascript">
 function postdata() {
		$.ajax({
			url: '/selectAllCourse',
			data: $('#submitForm').serialize(),
			type: 'post',
			success: function(msgs) {   
				console.log(msgs);//打印服务端返回的数据(调试用)
				$.map(msgs,function(value,index){
					console.log(value+index);
					$("#selectInfo").empty();
					if(index>0){
						$("#selectInfo").append("科目ID:"+index+ "の" +value+"<br>");
						//$('#course-tableup').DataTable().reload() //直接刷新
						}else{
						$("#selectInfo").append(value+"<br>");
						//$('#course-tableup').DataTable().reload() //直接刷新
							}
					})
			}
		});
	}
 </script>
</head>


<body>
 		<div class="r"></div>
		<div class="iv">
			<br/>
			<p>学籍番号:${id}</p>
			<p>名前:${name}さん</p>
		</div>
		<h3>星耀学院</h3>
		<h4>シラバスデータベース 2022年度版</h4>
		<div class="g"></div>

<div id="selectInfo"></div>

	
 <table id="course-tableup" class="table table-bordered">
  <thead>
  <tr>
   <th>学科</th>
   <th>専攻</th>
  </tr>
  </thead>
  <tbody>
  <tr>
  
   <td>
    <select id="dpname">
    <option value="0" disabled="disabled" selected="selected">--学科を選択してください--</option>
        <c:forEach var="major" items="${major}">
        <option value="${major.dpid}" >${major.dpname}</option>
        </c:forEach>
    </select> 
   </td> 
    
   <td>
    <select id="mname">
    <option value="0" disabled="disabled" selected="selected">--学科を選択してください--</option>
    </select>
   </td>
  </tr>
  </tbody>
  </table>
  
  <form action="selectAllCourse" id="submitForm" method=post>
   <table id="cinfo" class="table table-bordered">
   <thead>
     <tr>
      <th>科目名称</th>
      <th>区分</th>
      <th>単位数</th>
      <th>上限人数</th>
      <th>選択済</th>
      <th>先修授業名称</th>
      <th>授業形態</th>
     </tr>
   </thead> 
   </table>
 <input type="hidden" name="sid" value="${id}">
 <input class="mo" type="button" id="cbox"  onclick="postdata()" value="提交">
 <input class="mo" type="button" value="戻る" onclick="javascript:location.href='/nama'">
 </form>
</body>
</html>