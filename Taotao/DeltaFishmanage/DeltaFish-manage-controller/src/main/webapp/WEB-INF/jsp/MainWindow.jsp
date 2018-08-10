<%@ page import="com.DeltaFish.pojo.TUser" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<% TUser tUser = (TUser)session.getAttribute("user"); %>
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
        <h1><a href="MainWindow">DeltaFish</a></h1>
    </div>
    <div id="menu">
        <ul>
            <li><a href="MainWindow" title="">主页</a></li>
            <li><a href="List" title="">交易市场</a></li>
            <li><a href="AboutUs" title="">关于我们</a></li>
            <%if(tUser == null) {%>
            <li><a href="Login" title="">登录</a></li>
            <%} else {%>
            <li><a href="User" title="">个人中心</a></li>
            <%}
            %>
            <li><a href="Register" title="">注册</a></li>

        </ul>
    </div>
</div>

<div id="introduction">
    <div class="container">
        <div class="title">
            <h2>校园物资共享平台</h2>
        </div>
        <div class="description">
            <h3>一个包括旧物交易、启事发布、借租物资等功能的网站平台</h3>
        </div>
    </div>
</div>

</body>

</html>