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

<div id="introduction">
    <div class="container">
        <div class="title">
            <h2>校园物资共享平台</h2>
        </div>
        <div class="description" >
            <h3>旧物交易、启事共享、借租捐赠</h3>
        </div>
        <ul class="actions">
            <li><a href="<c:url value="/Mall"/>" class="button">进入商城看一看</a></li>
        </ul>
    </div>
</div>

</body>

</html>