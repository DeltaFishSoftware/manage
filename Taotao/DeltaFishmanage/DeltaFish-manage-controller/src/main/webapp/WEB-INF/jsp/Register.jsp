<%--
  Created by IntelliJ IDEA.
  User: Rain Lou
  Date: 6/3/2018
  Time: 11:04 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html lang="zh">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login</title>
    <link rel="stylesheet" type="text/css" href="<c:url value="/static/css/RegisterStyle.css"/>">
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
            <h2>Thanks for Joining!</h2>
            <form:form action="addUser" method="post" modelAttribute="tUser">
                <form:input type="text" placeholder="Nickname" path="userName"/>
                <form:input type="password" placeholder="Password" path="password"/>
                <input type="password" placeholder="Reconfirm"/>
                <form:input type="text" placeholder="Email" path="email"/>
                <form:input type="text" placeholder="Student ID" path="userId"/>
                <button type="submit" id="register-button">Register</button>
            </form:form>
        </div>
    </div>
</div>

<%--<script src="/static/js/TextMove.js" type="text/javascript"></script>
<script>
    $('#register-button').click(function (event) {
        event.preventDefault();
        $('form').fadeOut(500);
        $('.wrapper').addClass('form-success');
    });
</script>--%>

</body>

</html>
