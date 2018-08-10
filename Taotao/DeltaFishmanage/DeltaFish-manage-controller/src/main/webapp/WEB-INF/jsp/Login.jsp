<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head></head>
<body>
<title>注册</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<link rel="stylesheet" type="text/css" href="/static/css/bootstrap.min.css" />
<link rel="stylesheet" type="text/css" href="/static/css/custom.css" />
<script src="/static/js/jquery.min.js" type="text/javascript"></script>
<script src="/static/js/jquery.validate.min.js" type="text/javascript"></script>
<script src="/static/js/bootstrap.min.js" type="text/javascript"></script>

<div class="container">
    <div id="wrap">
        <div id="top_content">
            <p>&nbsp;</p>
            <p>&nbsp;</p>
            <div class="col-sm-12">
                <p class="text-center blog_title" style="text-indent:0em;">DeltaFish</p>
                <h4 class="text-center sub_title"> <span> <a class="active" href="/Login">登录</a> <b>&middot;</b> <a href="/Register">注册</a> </span> </h4>
            </div>
            <div id="content">
                <form:form action="person" method="POST" id="logform" class="col-sm-offset-4 col-sm-8 form-horizontal" role="form" modelAttribute="tUser">
                    <fieldset>

                        <div class="row">
                            <div class="col-sm-6">
                                <div class="input-group">
                                    <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
                                    <form:input type="text" class="form-control input-lg input_size" id="userName" path="userName" placeholder="请输入用户名" required="" />
                                </div>
                            </div>
                            <div id="userNameinfo" class="col-sm-6">
                                <span class="notice"></span>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-sm-6">
                                <div class="input-group">
                                    <span class="input-group-addon"><i class="glyphicon glyphicon-lock"></i></span>
                                    <form:input type="password" class="form-control input-lg input_size" path="password" id="password" placeholder="请输入密码" required="" />
                                </div>
                            </div>
                            <div id="passwordinfo" class="col-sm-6">
                                <span class="notice"></span>
                            </div>
                        </div>

                        <div class="row">
                            <div class="col-sm-6">
                                <input type="submit" class="btn btn-info btn-lg btn-block bottom-space" style="background-color: #50a3a2" value="登录" />
                            </div>
                        </div>
                    </fieldset>
                </form:form>
            </div>
        </div>
    </div>
</div>

<script src="/static/js/logvalidate.js" type="text/javascript"></script>
</body>
</html>