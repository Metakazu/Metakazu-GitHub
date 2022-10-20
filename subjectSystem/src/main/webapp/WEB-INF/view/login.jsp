<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
  <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <!DOCTYPE html>
    <html>

    <head>
      <meta charset="UTF-8">
      <title>LOGIN</title>
      <script type="text/javascript" src="js/jquery.min.js"></script>
      <script type="text/javascript" src="js/ajax.js"></script>
      <link rel="stylesheet" href="style/login.css">
      <link rel="shortcut icon" href="images/UniLogo.png">
    </head>

    <body>
      <div class="box">
        <video autoplay muted loop style="width:100%">
          <source src="images/Login.mp4">
        </video>
      </div>
      <form action="nama" method="post">
        <div class="iv">
          <img src="images/UniLogo.png">
          <input type="text" name="sid" id="sid" placeholder="ユーザー名" class="ac"><br> <br>
          <input type="password" name="password" id="password" placeholder="パスワード" class="ac">
          <input type="submit" id="nameCheck" value="Login" class="btn">
        </div>
      </form>
      <div id="loginMsg">${msg}</div>
      <footer>
        <img src="images/UniLogo.png" width="25px" height=25px />@Copyright 2022 Brightstar University.All Rights
        Reserved. <img src="images/UniLogo.png" width="25px" height=25px />
      </footer>
    </body>

    </html>