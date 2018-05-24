<%--
  Created by IntelliJ IDEA.
  User: hasee
  Date: 2018/5/7
  Time: 17:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>。
<html lang="zh">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>登录</title>
    <link rel="stylesheet" type="text/css" href="<c:url value="/static/css/LoginStyle.css"/>">
</head>
<body>
<div class="htmleaf-container">
    <div class="wrapper">
        <div class="container">
            <h1>Welcome</h1>
            <form class="form" action="Login_do" method="get">
                <input type="text" placeholder="Username" name="userName">
                <input type="password" placeholder="Password" name="password">
                <button type="submit" id="login-button">Login</button>
            </form>
        </div>
    </div>
</div>

<script src="/static/js/TextMove.js" type="text/javascript"></script>
<script>
    $('#login-button').click(function (event) {
        event.preventDefault();
        $('form').fadeOut(500);
        $('.wrapper').addClass('form-success');
    });
</script>
<div style="text-align:center;margin:60px 0; font:normal 20px/26px 'MicroSoft YaHei';color:#000000">
    <h1>DeltaFish</h1>
</div>
</body>
</html>
