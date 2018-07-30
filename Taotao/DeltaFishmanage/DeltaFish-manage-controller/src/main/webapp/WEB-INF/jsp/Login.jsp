<%--
  Created by IntelliJ IDEA.
  User: hasee
  Date: 2018/5/7
  Time: 17:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html lang="zh">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>登录</title>
    <link rel="stylesheet" type="text/css" href="<c:url value="/static/css/LoginStyle.css"/>">
</head>

<body>

<div id="header" class="container">
    <div id="logo">
        <h1><a href="#">DeltaFish</a></h1>
    </div>
    <div id="menu">
        <ul>
            <li><a href="<c:url value="/MainWindow"/>" title="">主页</a></li>
            <li><a href="<c:url value="/Mall"/>" title="">交易市场</a></li>
            <li><a href="<c:url value="/AboutUs"/>" title="">关于我们</a></li>
            <li><a href="<c:url value="/Login"/>" title="">登录</a></li>
            <li><a href="<c:url value="/Register"/>" title="">注册</a></li>
        </ul>
    </div>
</div>

<div class="htmleaf-container">
    <div class="wrapper">
        <div class="container">
            <h2>Welcome</h2>
            <form class="form" action="LoginCheck" method="post">
                <input type="text" placeholder="Username" name="userName">
                <input type="password" placeholder="Password" name="password">
                <button type="submit" id="login-button">Log in</button>
            </form>
        </div>
    </div>
</div>


<script>
    $('#login-button').click(function (event) {
        event.preventDefault();
        $('form').fadeOut(500);
        $('.wrapper').addClass('form-success');
    });
</script>

</body>

</html>
