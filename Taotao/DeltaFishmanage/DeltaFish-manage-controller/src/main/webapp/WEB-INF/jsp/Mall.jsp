<%--
  Created by IntelliJ IDEA.
  User: Rain Lou
  Date: 6/3/2018
  Time: 10:33 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>

<head>
    <title>交易商称</title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">

    <link href="<c:url value="/static/css/MallStyle.css"/>" rel="stylesheet" type="text/css" media="all" />
    <script src="/static/js/jquery.min.js"></script>

    <!-- start gallery_sale -->
    <script type="text/javascript" src="/static/js/jquery.easing.min.js"></script>
    <script type="text/javascript" src="/static/js/jquery.mixitup.min.js"></script>
    <script type="text/javascript">
        $(function () {

            var filterList = {
                init: function () {
                    // MixItUp plugin
                    // http://mixitup.io
                    $('#portfoliolist').mixitup({
                        targetSelector: '.portfolio',
                        filterSelector: '.filter',
                        effects: ['fade'],
                        easing: 'snap',
                        // call the hover effect
                        onMixEnd: filterList.hoverEffect()
                    });
                },

                hoverEffect: function () {
                    // Simple parallax effect
                    $('#portfoliolist .portfolio').hover(
                        function () {
                            $(this).find('.label').stop().animate({bottom: 0}, 200, 'easeOutQuad');
                            $(this).find('img').stop().animate({top: -30}, 500, 'easeOutQuad');
                        },
                        function () {
                            $(this).find('.label').stop().animate({bottom: -40}, 200, 'easeInQuad');
                            $(this).find('img').stop().animate({top: 0}, 300, 'easeOutQuad');
                        }
                    );
                }
            };

            // Run the show!
            filterList.init();

        });
    </script>
    <!-- start top_js_button -->
    <script type="text/javascript" src="/static/js/move-top.js"></script>
    <script type="text/javascript" src="/static/js/easing.js"></script>
    <script type="text/javascript">
        jQuery(document).ready(function($) {
            $(".scroll").click(function(event){
                event.preventDefault();
                $('html,body').animate({scrollTop:$(this.hash).offset().top},1200);
            });
        });
    </script>
</head>

<body>

<div id="header" class="container">
    <div id="logo">
        <h1><a href="/MainWindow">DeltaFish</a></h1>
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


<!-- start main -->
<div class="main_bg">
    <div class="wrap">
        <div class="main">
            <!-- start gallery_sale  -->
            <div class="gallery1">
                <div class="container">
                    <ul id="filters" class="clearfix">
                        <li><span class="filter active" data-filter="app card icon logo web">通修课</span></li>
                        <li><span class="filter" data-filter="app card web">学科群基础课</span></li>
                        <li><span class="filter" data-filter="icon web card">专业课</span></li>
                        <li><span class="filter" data-filter="web app icon card">公选课</span></li>
                        <li><span class="filter" data-filter="web app logo card">其他</span></li>
                    </ul>
                    <div id="portfoliolist">
                        <div class="portfolio logo1" data-cat="logo">
                            <div class="portfolio-wrapper">
                                <a href="/Detail">
                                    <img src="/static/images/book.jpg" alt="Image 2"/>
                                </a>
                                <div class="label">
                                    <div class="label-text">
                                        <a class="text-title">原子物理</a>
                                    </div>
                                    <div class="label-bg"></div>
                                </div>
                            </div>
                        </div>

                        <div class="portfolio app" data-cat="app">
                            <div class="portfolio-wrapper">
                                <a href="/Detail">
                                    <img src="/static/images/book.jpg" alt="Image 2"/>
                                </a>
                                <div class="label">
                                    <div class="label-text">
                                        <a class="text-title">光学</a>
                                    </div>
                                    <div class="label-bg"></div>
                                </div>
                            </div>
                        </div>

                        <div class="portfolio web" data-cat="web">
                            <div class="portfolio-wrapper">
                                <a href="/Detail">
                                    <img src="/static/images/book.jpg" alt="Image 2"/>
                                </a>
                                <div class="label">
                                    <div class="label-text">
                                        <a class="text-title">微机原理</a>
                                    </div>
                                    <div class="label-bg"></div>
                                </div>
                            </div>
                        </div>

                        <div class="portfolio card" data-cat="card">
                            <div class="portfolio-wrapper">
                                <a href="/Detail">
                                    <img src="/static/images/book.jpg" alt="Image 2"/>
                                </a>
                                <div class="label">
                                    <div class="label-text">
                                        <a class="text-title">随机过程</a>
                                    </div>
                                    <div class="label-bg"></div>
                                </div>
                            </div>
                        </div>

                        <div class="portfolio app" data-cat="app">
                            <div class="portfolio-wrapper">
                                <a href="/Detail">
                                    <img src="/static/images/book.jpg" alt="Image 2"/>
                                </a>
                                <div class="label">
                                    <div class="label-text">
                                        <a class="text-title">信号与系统</a>
                                    </div>
                                    <div class="label-bg"></div>
                                </div>
                            </div>
                        </div>

                        <div class="portfolio card" data-cat="card">
                            <div class="portfolio-wrapper">
                                <a href="/Detail">
                                    <img src="/static/images/book.jpg" alt="Image 2"/>
                                </a>
                                <div class="label">
                                    <div class="label-text">
                                        <a class="text-title">热学</a>
                                    </div>
                                    <div class="label-bg"></div>
                                </div>
                            </div>
                        </div>

                        <div class="portfolio web" data-cat="web">
                            <div class="portfolio-wrapper">
                                <a href="/Detail">
                                    <img src="/static/images/book.jpg" alt="Image 2"/>
                                </a>
                                <div class="label">
                                    <div class="label-text">
                                        <a class="text-title">力学</a>
                                    </div>
                                    <div class="label-bg"></div>
                                </div>
                            </div>
                        </div>

                        <div class="portfolio card" data-cat="card">
                            <div class="portfolio-wrapper">
                                <a href="/Detail">
                                    <img src="/static/images/book.jpg" alt="Image 2"/>
                                </a>
                                <div class="label">
                                    <div class="label-text">
                                        <a class="text-title">数学分析</a>
                                    </div>
                                    <div class="label-bg"></div>
                                </div>
                            </div>
                        </div>

                    </div>

                </div><!-- container -->
                <script type="text/javascript" src="/static/js/fliplightbox.min.js"></script>
                <script type="text/javascript">$('body').flipLightBox()</script>
                <div class="clear"></div>
            </div>
        </div>
    </div>
</div>

</body>
</html>
