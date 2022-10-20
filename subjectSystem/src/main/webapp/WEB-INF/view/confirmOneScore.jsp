<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
  <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <!DOCTYPE html>
    <html>

    <head>
      <meta charset="UTF-8">
      <title>学生成績</title>
      <script type="text/javascript" src="js/jquery.min.js"></script>
      <script type="text/javascript" src="js/ajax.js"></script>
      <script type="text/javascript" src="js/function.js"></script>
      <link rel="stylesheet" href="https://cdn.datatables.net/t/bs-3.3.6/jqc-1.12.0,dt-1.10.11/datatables.min.css" />
      <script src="https://cdn.datatables.net/t/bs-3.3.6/jqc-1.12.0,dt-1.10.11/datatables.min.js"></script>
      <link rel="stylesheet" href="style/main.css" />
      <link rel="shortcut icon" href="images/UniLogo.png">
      <script src="js/loginBackground.js" type="text/javascript"></script>
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
      <ul>
        <li>
          <a href="javascript:location.href='/nama'">
            <img src="images/UniLogo.png" width="70px" height=70px />
          </a>
        </li>
        <li>
          <form>
            <input type="button" value="学生成績" class="btn">
          </form>
        </li>
      </ul>


      <table id="course-table" class="table table-bordered">
        <thead>
          <tr>
            <th>科目ID</th>
            <th>科目名</th>
            <th>修得状況</th>
          </tr>
        </thead>
        <tbody>
          <c:forEach var="score" items="${scores}">
            <tr>
              <td>${score.cid}</td>
              <td>${score.course.cname}</td>
              <td>${score.master}</td>
            </tr>
          </c:forEach>
        </tbody>
      </table>
      <footer>
        <img src="images/UniLogo.png" width="25px" height=25px />@Copyright 2022 Brightstar University.All Rights
        Reserved. <img src="images/UniLogo.png" width="25px" height=25px />
      </footer>
    </body>

    </html>