<%--
  Created by IntelliJ IDEA.
  User: Rain Lou
  Date: 6/3/2018
  Time: 10:41 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html lang="zh" class="ace ace-card-on ace-tab-nav-on ace-main-nav-on ace-sidebar-on" data-theme-color="#c0e3e7">

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
    <link href="<c:url value="/static/css/HomepageStyle.css"/>" rel="stylesheet">

    <!-- Modernizer -->
    <script type="text/javascript" src="/static/js/modernizr-3.3.1.min.js"></script>

</head>

<body>

<div class="ace-wrapper">
    <header id="ace-header" class="ace-container-shift ace-logo-in ace-head-boxed ace-nav-right">
        <div class="ace-head-inner">
            <div class="ace-head-container ace-container">
                <div class="ace-head-row">
                    <div id="ace-head-col1" class="ace-head-col text-left">

                    </div>
                </div>
            </div><!-- .ace-container -->
        </div><!-- .ace-head-inner -->
    </header><!-- #ace-header -->


    <article id="ace-card" class="ace-card bg-primary">
        <div class="ace-card-inner text-center">
            <img class="avatar avatar-195" src="/static/images/GroupMember/ZWQ_square.png" width="195" height="195" alt="">
            <h1>邹卫其</h1>
            <p class="text-muted">神一样的男人</p>
        </div>

    </article><!-- #ace-card -->

    <div id="ace-content" class="ace-container-shift">
        <div class="ace-container">
            <div id="ace-nav-wrap" class="hidden-sm hidden-xs">
                <div class="ace-nav-cont">


                    <div id="ace-nav-tools" class="hidden">
                        <span class="ace-icon ace-icon-dots-three-horizontal"></span>

                        <button id="ace-nav-arrow" class="clear-btn">
                            <span class="ace-icon ace-icon-chevron-thin-down"></span>
                        </button>
                    </div>
                </div>
                <div class="ace-nav-btm"></div>
            </div><!-- .ace-nav-wrap -->

            <div class="ace-paper-stock">
                <main class="ace-paper clearfix">
                    <div class="ace-paper-cont clear-mrg">

                        <!-- START: PAGE CONTENT -->
                        <div class="padd-box clear-mrg">
                            <section class="section brd-btm">
                                <div class="row">
                                    <div class="col-sm-12 clear-mrg text-box">
                                        <h2 class="title-lg text-upper">About Me</h2>

                                        <p><b>Helo, I’m Zou!</b><br>
                                            Logo or your Company Name, unless of course you are Microsoft or the Yellow
                                            Pages online directorye core of
                                            your marketing, the central theme around your products and services.
                                            Your brand is not your Logo or your Company Name, unless of course you are
                                            Microsoft or the Yellow Pages
                                            online directory.</p>
                                    </div>
                                </div>
                            </section><!-- .section -->

                            <section class="section brd-btm">
                                <div class="row">
                                    <div class="col-sm-6 clear-mrg">
                                        <h2 class="title-thin text-muted">personal information</h2>

                                        <dl class="dl-horizontal clear-mrg">
                                            <dt class="text-upper">Full Name</dt>
                                            <dd>Zou God Weiqi</dd>

                                            <dt class="text-upper">D.o.b.</dt>
                                            <dd>05 Sep 1986</dd>

                                            <dt class="text-upper">address</dt>
                                            <dd>24058, Belgium, Brussels,
                                                Liutte 27, BE
                                            </dd>

                                            <dt class="text-upper">e-mail</dt>
                                            <dd><a href="mailto:robertsmith@company.com">888888888@qq.com</a>
                                            </dd>

                                            <dt class="text-upper">phone</dt>
                                            <dd>+1234565432`</dd>

                                            <dt class="text-upper">freelance</dt>
                                            <dd>Available</dd>
                                        </dl>
                                    </div><!-- .col-sm-6 -->


                                </div><!-- .row -->
                            </section><!-- .section -->

                            <section class="section brd-btm">
                                <div class="row">
                                    <div class="col-sm-6 clear-mrg">
                                        <h2 class="title-thin text-muted">professional skills</h2>

                                        <div class="row">
                                            <div class="col-xs-4">
                                                <div class="progress-chart ace-animate" role="progressbar"
                                                     aria-valuenow="90" aria-valuemin="0" aria-valuemax="100">
                                                    <div class="progress-bar" data-text="90%" data-value="0.9"></div>
                                                    <strong class="progress-title">UX Design</strong>
                                                </div>
                                            </div><!-- .col-xs-4 -->

                                            <div class="col-xs-4">
                                                <div class="progress-chart ace-animate" role="progressbar"
                                                     aria-valuenow="88" aria-valuemin="0" aria-valuemax="100">
                                                    <div class="progress-bar" data-text="81%" data-value="0.81"></div>
                                                    <strong class="progress-title">PHP & MySql</strong>
                                                </div>
                                            </div><!-- .col-xs-4 -->

                                            <div class="col-xs-4">
                                                <div class="progress-chart ace-animate" role="progressbar"
                                                     aria-valuenow="66" aria-valuemin="0" aria-valuemax="100">
                                                    <div class="progress-bar" data-text="66%" data-value="0.66"></div>
                                                    <strong class="progress-title">UI Design</strong>
                                                </div>
                                            </div><!-- .col-xs-4 -->
                                        </div><!-- .row -->
                                    </div><!-- .col-sm-6 -->

                                </div><!-- .row -->
                            </section><!-- .section -->

                            <section class="section brd-btm">
                                <div class="row">
                                    <div class="col-sm-6 clear-mrg">
                                        <h2 class="title-thin text-muted">professional skills</h2>

                                        <div class="progress-line ace-animate" role="progressbar" aria-valuenow="90"
                                             aria-valuemin="0" aria-valuemax="100">
                                            <strong class="progress-title">Php & MySQL</strong>
                                            <div class="progress-bar" data-text="90%" data-value="0.9"></div>
                                        </div>

                                        <div class="progress-line ace-animate" role="progressbar" aria-valuenow="80"
                                             aria-valuemin="0" aria-valuemax="100">
                                            <strong class="progress-title">Javascript</strong>
                                            <div class="progress-bar" data-text="80%" data-value="0.8"></div>
                                        </div>

                                        <div class="progress-line ace-animate" role="progressbar" aria-valuenow="80"
                                             aria-valuemin="0" aria-valuemax="100">
                                            <strong class="progress-title">UX Design</strong>
                                            <div class="progress-bar" data-text="80%" data-value="0.8"></div>
                                        </div>
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
                <p class="text-center">Copyright &copy; 2017.Company name All rights
                    reserved.//cdn.bootcss.com/jquery/1.12.2/jquery.min.js</p>
            </div>
        </div><!-- .ace-container -->
    </footer><!-- #ace-footer -->

    <!-- Triangle Shapes -->
    <svg id="ace-bg-shape-1" class="hidden-sm hidden-xs" height="519" width="758">
        <polygon points="0,455,693,352,173,0,92,0,0,71" style="fill:#d2d2d2;stroke:purple;stroke-width:0; opacity: 0.5">
    </svg>

    <svg id="ace-bg-shape-2" class="hidden-sm hidden-xs" height="536" width="633">
        <polygon points="0,0,633,0,633,536" style="fill:#c0e3e7;stroke:purple;stroke-width:0"/>
    </svg>
</div><!-- .ace-wrapper -->

<!-- Scripts -->
<script type="text/javascript" src="/static/js/jquery-1.12.4.min.js"></script>

<!--<script type="text/javascript" src="http://ditu.google.cn/maps/api/js?key=AIzaSyDiwY_5J2Bkv2UgSeJa4NOKl6WUezSS9XA"></script>-->
<script type="text/javascript" src="/static/js/jquery.mCustomScrollbar.min.js"></script>
<script type="text/javascript" src="/static/js/progressbar.min.js"></script>
<script type="text/javascript" src="/static/js/options.js"></script>
<script type="text/javascript" src="/static/js/main.js"></script>
</body>
</html>
