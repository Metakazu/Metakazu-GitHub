<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
  <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <!DOCTYPE html>
    <html>

    <head>
      <meta charset="UTF-8" />
      <title>科目詳細</title>
      <script type="text/javascript" src="js/jquery.min.js"></script>
      <script type="text/javascript" src="js/function.js"></script>
      <script type="text/javascript" src="js/ajax.js"></script>
      <link rel="stylesheet" href="https://cdn.datatables.net/t/bs-3.3.6/jqc-1.12.0,dt-1.10.11/datatables.min.css" />
      <script src="https://cdn.datatables.net/t/bs-3.3.6/jqc-1.12.0,dt-1.10.11/datatables.min.js"></script>
      <link rel="stylesheet" href="style/main.css" />
      <link rel="shortcut icon" href="images/UniLogo.png">
      <script>
        jQuery(function ($) {
          $('#course-table').DataTable({
            "bPaginate": false,
            "bFilter": false,
            "bInfo": false
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
      <h3>星耀学院</h3>
      <h4>シラバスデータベース 2022年度版</h4>
      <div class="g"></div>
      <h1>科目詳細：${course.cname}</h1>

      <table id="course-table" class="table table-bordered">
        <thead>
          <tr>
            <th>科目ID</th>
            <th>区分</th>
            <th>担任教授</th>
            <th>単位数</th>
            <th>曜日</th>
            <th>時限</th>
            <th>上限人数</th>
            <th>選択済</th>
            <th>先修授業名称</th>
            <th>授業形態</th>
          </tr>
        </thead>
        <tbody>
          <tr>
            <td>${course.cid}</td>
            <td>${course.ctype}</td>
            <td>${course.teacher}</td>
            <td>${course.credit}</td>
            <td>${course.weekday}</td>
            <td>${course.ctime}</td>
            <td>${course.std_max}</td>
            <td>${course.std}</td>
            <td>${prename}</td>
            <td>${course.cmode}</td>
          </tr>
        </tbody>
      </table>
      <input class="mo" type="button" value="戻る" onclick="backto();" />
    </body>

    </html>