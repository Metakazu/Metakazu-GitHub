<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
  <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <!DOCTYPE html>
    <html>

    <head>
      <meta charset="UTF-8">
      <title>変更システム</title>
      <script type="text/javascript" src="js/jquery.min.js"></script>
      <script type="text/javascript" src="js/ajax.js"></script>
      <script type="text/javascript" src="js/function.js"></script>
      <link rel="stylesheet" href="https://cdn.datatables.net/t/bs-3.3.6/jqc-1.12.0,dt-1.10.11/datatables.min.css" />
      <script src="https://cdn.datatables.net/t/bs-3.3.6/jqc-1.12.0,dt-1.10.11/datatables.min.js"></script>
      <link rel="shortcut icon" href="images/UniLogo.png">
      <link rel="stylesheet" href="style/main.css">
      <script>
        jQuery(function ($) {
          $('#course-table').DataTable({
           "paging": false,
             "ordering": false,
             "info": false,
             "searching": false,
          });
        });
      </script>
    </head>


    <body>
      <div class="r"></div>
      <div class="iv">
        <br />
        <p>学籍番号:${id}</p >
        <p>名前:${name}さん</p >
      </div>
      <h3>変更システム</h3>
      <h4>シラバスデータベース 2022年度版</h4>
      <div class="g"></div>

      
    
      <a href="/outputTimetable?sid=${id}">時間割表出力</a>
      <table id="course-tableup" class="table table-bordered">
        <thead>
          <tr>
            <th>科目ID</th>
            <th>科目名</th>
            <th>修得状況</th>
            <th>変更欄</th>
          </tr>
        </thead>
        <tbody>
          <c:forEach var="score" items="${scores}"> 
            <tr>
              <td>${score.cid}</td>
              <td>${score.course.cname}</td>
              <td>${score.master}</td>
              <td>
                <input type="button" value="変更" name="change"
                  onclick="javascript:location.href='/updateOneCourse?cid=${score.cid}'">
                <input type="button" value="削除" name="cid"
                  onclick="javascript:location.href='/deleteOneCourse?cid=${score.cid}&sid=${id}'">
              </td>
            </tr>
          </c:forEach>
        </tbody>
      </table>
      <h1>${msg}</h1>
        <form action="deleteAllCourse" method="post">
        <input type="hidden" name="sid" value="${id}">
        <input  class="mo" type="submit" value="全部删除">

      <input class="mo" type="button" value="戻る" onclick="javascript:location.href='/nama'">
      </form>
      <footer>
        <img src="images/UniLogo.png" width="25px" height=25px />@Copyright 2022 Brightstar University.All Rights
        Reserved. <img src="images/UniLogo.png" width="25px" height=25px />
      </footer>
    </body>

    </html>