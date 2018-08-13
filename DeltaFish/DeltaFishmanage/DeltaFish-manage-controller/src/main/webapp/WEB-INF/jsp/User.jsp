<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="com.DeltaFish.pojo.TUser" %>
<% TUser tUser = (TUser)session.getAttribute("user"); %>

<html lang="en" class="ace ace-card-on ace-tab-nav-on ace-main-nav-on ace-sidebar-on" data-theme-color="#c0e3e7">

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <title>个人主页</title>
    <meta name="description" content="">

    <!-- Google Fonts -->
    <link href="https://fonts.googleapis.com/css?family=Quicksand:400,700" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css?family=Pacifico" rel="stylesheet">

    <!-- Styles -->
    <link href="/static/css/HomepageStyle.css" rel="stylesheet">

    <!-- Modernizer -->
    <script type="text/javascript" src="/static/js/modernizr-3.3.1.min.js"></script>

</head>

<body>

<div class="ace-wrapper">
    <header id="ace-header" class="ace-container-shift ace-logo-in ace-head-boxed ace-nav-right">
        <div class="ace-head-inner">
            <div class="ace-head-container ace-container">
                <div class="ace-head-row">
                    <div id="ace-head-col1" class="ace-head-col text-left"></div>
                </div>
            </div><!-- .ace-container -->
        </div><!-- .ace-head-inner -->
    </header><!-- #ace-header -->

    <article id="ace-card" class="ace-card bg-primary">
        <div class="ace-card-inner text-center">
            <img class="avatar avatar-195" src="/static/images/GroupMember/user.jpg" width="195" height="195" alt="">
            <h1><%=tUser.getUserName()%></h1>
            <p class="text-muted">神一样的人</p>
        </div>

    </article><!-- #ace-card -->

    <div id="ace-content" class="ace-container-shift">
        <div class="ace-container">

            <div class="ace-paper-stock">
                <main class="ace-paper clearfix">
                    <div class="ace-paper-cont clear-mrg">

                        <!-- START: PAGE CONTENT -->
                        <div class="padd-box clear-mrg">
                            <section class="section brd-btm">
                                <div class="row">
                                    <div class="col-sm-12 clear-mrg text-box">
                                        <h2 class="title-lg text-upper">About Me</h2>
                                        <p><b>不敢相信吧，我就是那个传说中神一样的人!</b><br></p>
                                    </div>
                                </div>
                            </section><!-- .section -->

                            <section class="section brd-btm">
                                <div class="row">
                                    <div class="col-sm-6 clear-mrg">
                                        <h2 class="title-thin text-muted">PERSONAL INFORMATION</h2>

                                        <dl class="dl-horizontal clear-mrg">
                                            <dt class="text-upper">FULL NAME</dt>
                                            <dd><%=tUser.getUserName()%></dd>

                                            <dt class="text-upper">CREDITS</dt>
                                            <dd><%=tUser.getCredits()%></dd>

                                            <dt class="text-upper">ADDRESS</dt>
                                            <dd>中国科学技术大学</dd>

                                            <dt class="text-upper">EMAIL</dt>
                                            <dd><a href="mailto:<%=tUser.getEmail()%>"><%=tUser.getEmail()%></a></dd>

                                            <dt class="text-upper">PHONE</dt>
                                            <dd><%=tUser.getMobile()%></dd>

                                            <dt class="text-upper">JOB</dt>
                                            <dd>学生</dd>
                                        </dl>
                                    </div><!-- .col-sm-6 -->

                                </div><!-- .row -->
                            </section><!-- .section -->
                        </div><!-- .padd-box -->
                        <!-- END: PAGE CONTENT -->

                    </div><!-- .ace-paper-cont -->
                </main><!-- .ace-paper -->
            </div><!-- .ace-paper-stock -->
        </div><!-- .ace-container -->
    </div><!-- #ace-content -->

    <footer id="ace-footer" class="ace-container-shift">
        <div class="ace-container">
            <div class="ace-footer-cont clear-mrg">
                <p class="text-center">&nbsp</p>
            </div>
        </div><!-- .ace-container -->
    </footer><!-- #ace-footer -->

    <!-- Triangle Shapes -->
    <svg id="ace-bg-shape-1" class="hidden-sm hidden-xs" height="519" width="758">
        <polygon points="0,455,693,352,173,0,92,0,0,71" style="fill:#d2d2d2;stroke:purple;stroke-width:0; opacity: 0.5"/>
    </svg>

    <svg id="ace-bg-shape-2" class="hidden-sm hidden-xs" height="536" width="633">
        <polygon points="0,0,633,0,633,536" style="fill:#50a3a2;stroke:purple;stroke-width:0"/>
    </svg>
</div><!-- .ace-wrapper -->

<!-- Scripts -->
<script type="text/javascript" src="/static/js/jquery-1.12.4.min.js"></script>
</body>
</html>