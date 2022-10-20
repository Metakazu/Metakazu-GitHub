<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
  <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

    <!DOCTYPE html>
    <html>

    <head>
      <meta charset="UTF-8">
      <title>Insert title here</title>
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
      <style type="text/css">
        

        .btn {
          /* 文字颜色 */
          color: #0099CC;
          /* 清除背景色 */
          background: transparent;
          /* 边框样式、颜色、宽度 */
          border: 2px solid #0099CC;
          /* 给边框添加圆角 */
          border-radius: 6px;
          /* 字母转大写 */
          border: none;
          color: white;
          padding: 16px 32px;
          text-align: center;
          display: inline-block;
          font-size: 16px;
          margin: 4px 2px;
          -webkit-transition-duration: 0.4s;
          /* Safari */
          transition-duration: 0.4s;
          cursor: pointer;
          text-decoration: none;
          text-transform: uppercase;
        }

        select {
          -webkit-appearance: none;
          text-align: center;
          text-align-last: center;
        }

        div {
          color: white;
          text-align: center;
        }
      </style>
    </head>

    <body>
      <ul>
        <li>
          <a href="javascript:location.href='/nama'">
            <img src="images/UniLogo.png" width="70px" height=70px />
          </a>
        </li>
        <form action="/mainSelectAllCourse" method="post" id="main_form">
          <li>
            <input class="btn" type="text" name="dpname" id="main_dpname" placeholder="学科名">
          </li>
          <li>
            <input class="btn" type="text" name="mname" id="main_mname" placeholder="専攻名">
          </li>
           <li>
            <input class="btn" type="text" name="cname" id="main_cname" placeholder="科目名">
          </li>
          <li>
            <select class="btn" name="ctype" id="main_ctype">
              <option value="0" selected>区分</option>
              <option value="1">必修</option>
              <option value="2">選択必修</option>
              <option value="3">任意科目</option>
            </select>
          </li>
          <li>
            <select class="btn" name="cmode" id="main_cmode">
              <option value="0" selected>授業形態</option>
              <option value="1">対面形式</option>
              <option value="2">テレワーク形式</option>
            </select>
          </li>
          <li>
            <select class="btn" name="weekday" id="main_weekday">
              <option value="0" selected>曜日</option>
              <option value="1">月曜日</option>
              <option value="2">火曜日</option>
              <option value="3">水曜日</option>
              <option value="4">木曜日</option>
              <option value="5">金曜日</option>
            </select>
          </li>
          <li>
            <select class="btn" name="ctime" id="main_ctime">
              <option value="0" selected>時限</option>
              <option value="1">一時限目(9:00～10:20)</option>
              <option value="2">二時限目(10:40～12:00)</option>
              <option value="3">三時限目(13:00～14:20)</option>
              <option value="4">四時限目(14:40～16:00)</option>
              <option value="5">五時限目(16:20～17:40)</option>
              <option value="6">六時限目(18:00～19:20)</option>
            </select>
          </li>
          <li>
            <input class="btn" type="button" id="main_submit" value="検索">
          </li>
          <li>
            <input class="btn" type="reset" value="条件クリア">
          </li>
        </form>
      </ul>
      <div>👤${name}.NO.${id}</div>

      <table id="mianSelection" class="table table-bordered">
        <thead>
          <tr>
            <th>学科名</th>
            <th>専攻名</th>
            <th>科目ID</th>
            <th>名称</th>
            <th>区分</th>
            <th>選択人数</th>
            <th>曜日</th>
            <th>時限</th>
            <th>詳細</th>
          </tr>
        </thead>
        <tbody>
          <c:forEach var="courses" items="${courses}">
            <tr>
              <td>${courses.dpname}</td>
              <td>${courses.mname}</td>
              <td>${courses.cid}</td>
              <td>${courses.cname}</td>
              <td>${courses.ctype}</td>
              <td>${courses.std}</td>
              <td>${courses.weekday}</td>
              <td>${courses.ctime}</td>
              <td><a href="/selectOneCourse?cid=${courses.cid}">詳細</a></td>
            </tr>
          </c:forEach>
        </tbody>
      </table>

      <h1 id="main_msg">${msg}</h1>
      <footer>
        <img src="images/UniLogo.png" width="25px" height=25px />@Copyright 2022 Brightstar University.All Rights
        Reserved. <img src="images/UniLogo.png" width="25px" height=25px />
      </footer>
    </body>

    </html>