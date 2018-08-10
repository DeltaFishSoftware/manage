<%--
  Created by IntelliJ IDEA.
  User: Rain Lou
  Date: 6/5/2018
  Time: 2:11 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
    <title>商品详情</title>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel='stylesheet' type='text/css' href="<c:url value="/static/css/DetailStyle.css"/>">

</head>
<body>
<div class="container">
    <div class="container_wrap">
        <div class="header_top">
            <div class="col-sm-3 logo"><a href="MainWindow"><img src="/static/images/logo.png" alt=""/></a></div>
            <div class="clearfix"></div>
        </div>
        <div class="content">
            <div class="movie_top">
                <div class="col-md-9 movie_box">
                    <div class="grid images_3_of_2">
                        <div class="movie_image">
                            <img src="/static/images/slfc.jpg" class="img-responsive" alt=""/>
                        </div>
                    </div>
                    <div class="desc1 span_3_of_2">
                        <p class="movie_option"><strong>书名: </strong><a>数理方程</a></p>
                        <p class="movie_option"><strong>版次: </strong>第二版</p>
                        <p class="movie_option"><strong>作者: </strong><a>陈先进</a></p>
                        <p class="movie_option"><strong>出版日期: </strong>2014 年 8 月 14 日</p>
                        <p class="movie_option"><strong>分类: </strong>数学、物理</p>
                        <p class="movie_option"><strong>建议修读年级: </strong>大二</p>
                        <p class="movie_option"><strong>卖家: </strong>齐天杨</p>
                        <p class="movie_option"><strong>卖家说明：</strong>这门课很难，一定要好好学！学得好对后面的课程帮助很大！请各位同学对数理方程保持敬畏的心理！</p>
                        <div class="down_btn"><a class="btn1" href="User"><span> </span>CONTACT</a></div>
                    </div>
                    <div class="clearfix"></div>

                    <div class="single">
                        <h1>COMMENTS</h1>
                        <ul class="single_list">
                            <li>
                                <div class="preview"><img src="/static/images/GroupMember/ZWQ.png"
                                                          class="img-responsive"></a>
                                </div>
                                <div class="data">
                                    <div class="title">邹卫其</div>
                                    <p>卖家好垃圾，明明不难！</p>
                                </div>
                                <div class="clearfix"></div>
                            </li>
                            <li>
                                <div class="preview"><img src="/static/images/GroupMember/QTY.png"
                                                          class="img-responsive"></a>
                                </div>
                                <div class="data">
                                    <div class="title">齐天杨</div>
                                    <p>真的好！</p>
                                </div>
                                <div class="clearfix"></div>
                            </li>
                            <li>
                                <div class="preview"><img src="/static/images/GroupMember/LYZ.png"
                                                          class="img-responsive"></a>
                                </div>
                                <div class="data">
                                    <div class="title">娄雨禛</div>
                                    <p>就这样子吧，可以了。</p>
                                </div>
                                <div class="clearfix"></div>
                            </li>
                            <li>
                                <div class="preview"><img src="/static/images/GroupMember/ZZX.png"
                                                          class="img-responsive"></a>
                                </div>
                                <div class="data">
                                    <div class="title">曾子轩</div>
                                    <p>脑壳有屎，他妈的！这种吃翔的东西还拿出来卖！</p>
                                </div>
                                <div class="clearfix"></div>
                            </li>
                        </ul>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>

</body>
</html>
