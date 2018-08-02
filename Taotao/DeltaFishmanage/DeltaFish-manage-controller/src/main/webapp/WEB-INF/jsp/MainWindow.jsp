<%--
  Created by IntelliJ IDEA.
  User: Rain Lou
  Date: 5/31/2018
  Time: 9:56 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html lang="zh">

<head>
    <meta charset="UTF-8">
    <title>DeltaFish</title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <link rel="stylesheet" type="text/css" href="<c:url value="/static/css/MainWindowStyle.css"/>">
</head>

<title>DeltaFish</title>

<body>

<div id="header" class="container">
    <div id="logo">
        <h1><a href="MainWindow.html">DeltaFish</a></h1>
    </div>
    <div id="menu">
        <ul>
            <li><a href="MainWindow.html" title="">主页</a></li>
            <li><a href="Mall.html" title="">交易市场</a></li>
            <li><a href="AboutUs.html" title="">关于我们</a></li>
            <li><a href="Login.html" title="">登录</a></li>
            <li><a href="Register.html" title="">注册</a></li>
        </ul>
    </div>
</div>

<div id="introduction">
    <div class="container">
        <div class="title">
            <h2>校园物资共享系统</h2>
        </div>
        <div class="description">
            <h3>一个包括旧物交易、启事发布、借租物资等功能的网站平台</h3>
        </div>
    </div>
</div>

</body>

</html>