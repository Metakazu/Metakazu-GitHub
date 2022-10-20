<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
  <!DOCTYPE html>
  <html>

  <head>
    <meta charset="UTF-8" />
    <title>ホームページ</title>
    <link rel="stylesheet" href="style/main.css">
    <link rel="shortcut icon" href="images/UniLogo.png">
    <script src="js/loginBackground.js" type="text/javascript"></script>
  </head>

  <body>
    <ul>
      <li>
        <form action="mainSelectAllCourse" method="get"><input type="submit" value="科目検索" class="btn"> </form>
      </li>
      <li>
        <form action="selectAllMajor" method="get"><input type="submit" value="履修登録" class="btn"> </form>
      </li>
      <li>
        <form action="selectStuWithSAndC" method="post">
          <input type="hidden" name="sid" value="${id}">
          <input type="submit" value="修改科目" class="btn">
        </form>
      </li>
      <li>
        <form action="confirmOneScore" method="post">
          <input type="hidden" name="sid" value="${id}">
          <input type="submit" value="学生成績" class="btn">
        </form>
      </li>
    </ul>
    <div class="SID" align=center>
      <div>WELCOME</div>
      <div>BSU OBJECT SYSTEM</div>
      <br>
      <div>👤${name}</div>
      <div>NO.${id}</div>
    </div>
    <footer>
      <img src="images/UniLogo.png" width="25px" height=25px />@Copyright 2022 Brightstar University.All Rights
      Reserved. <img src="images/UniLogo.png" width="25px" height=25px />
    </footer>
  </body>

  </html>