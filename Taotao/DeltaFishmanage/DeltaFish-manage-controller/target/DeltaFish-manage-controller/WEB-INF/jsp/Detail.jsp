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
            <div class="col-sm-3 logo"><a href="MainWindow.html"><img src="/static/images/logo.png" alt=""/></a></div>
            <div class="clearfix"></div>
        </div>
        <div class="content">
            <div class="movie_top">
                <div class="col-md-9 movie_box">
                    <div class="grid images_3_of_2">
                        <div class="movie_image">
                            <span class="movie_rating">5.0</span>
                            <img src="/static/images/slfc.jpg" class="img-responsive" alt=""/>
                        </div>
                        <div class="movie_rate">
                            <div class="rating_desc"><p>Your Vote :</p></div>
                            <form action="" class="sky-form">
                                <fieldset>
                                    <section>
                                        <div class="rating">
                                            <input type="radio" name="stars-rating" id="stars-rating-5">
                                            <label for="stars-rating-5"><i class="icon-star"></i></label>
                                            <input type="radio" name="stars-rating" id="stars-rating-4">
                                            <label for="stars-rating-4"><i class="icon-star"></i></label>
                                            <input type="radio" name="stars-rating" id="stars-rating-3">
                                            <label for="stars-rating-3"><i class="icon-star"></i></label>
                                            <input type="radio" name="stars-rating" id="stars-rating-2">
                                            <label for="stars-rating-2"><i class="icon-star"></i></label>
                                            <input type="radio" name="stars-rating" id="stars-rating-1">
                                            <label for="stars-rating-1"><i class="icon-star"></i></label>
                                        </div>
                                    </section>
                                </fieldset>
                            </form>
                            <div class="clearfix"></div>
                        </div>
                    </div>
                    <div class="desc1 span_3_of_2">
                        <p class="movie_option"><strong>书名: </strong><a>数理方程</a></p>
                        <p class="movie_option"><strong>版次: </strong>第二版</p>
                        <p class="movie_option"><strong>Editor: </strong><a>陈先进</a></p>
                        <p class="movie_option"><strong>Release date: </strong>December 12, 2014</p>
                        <p class="movie_option"><strong>分类: </strong><a href="#">数学 </a>，</strong><a href="#">物理 </a>
                        </p>
                        <p class="movie_option"><strong>Grade restriction: </strong>2</p>
                        <div class="down_btn"><a class="btn1" href="Homepage.html"><span> </span>Contect</a></div>
                    </div>
                    <div class="clearfix"></div>
                    <p class="m_4">这门课很难2333</p>
                    <form method="post" action="contact-post.html">
                        <div class="text">
                            <textarea value="Message:" onfocus="this.value = '';"
                                      onblur="if (this.value == '') {this.value = 'Message';}">Message:</textarea>
                        </div>
                        <div class="form-submit1">
                            <input name="submit" type="submit" id="submit" value="Submit Your Message"><br>
                        </div>
                        <div class="clearfix"></div>
                    </form>
                    <div class="single">
                        <h1>10 Comments</h1>
                        <ul class="single_list">
                            <li>
                                <div class="preview"><a href="Homepage.html"><img src="/static/images/GroupMember/ZWQ.png"
                                                                                  class="img-responsive" alt=""></a>
                                </div>
                                <div class="data">
                                    <div class="title">Movie / 2 hours ago / <a href="Homepage.html">reply</a></div>
                                    <p>卖家好垃圾，明明不难！</p>
                                </div>
                                <div class="clearfix"></div>
                            </li>
                            <li>
                                <div class="preview"><a href="Homepage.html"><img src="/static/images/GroupMember/QTY.png"
                                                                                  class="img-responsive" alt=""></a>
                                </div>
                                <div class="data">
                                    <div class="title">Wernay / 2 hours ago / <a href="Homepage.html">reply</a></div>
                                    <p>真的好 </p>
                                </div>
                                <div class="clearfix"></div>
                            </li>
                            <li>
                                <div class="preview"><a href="Homepage.html"><img src="/static/images/GroupMember/LYZ.png"
                                                                                  class="img-responsive" alt=""></a>
                                </div>
                                <div class="data">
                                    <div class="title">mr.dev / 2 hours ago / <a href="Homepage.html">reply</a></div>
                                    <p>1</p>
                                </div>
                                <div class="clearfix"></div>
                            </li>
                            <li class="middle">
                                <div class="preview"><a href="Homepage.html"><img src="/static/images/GroupMember/LX.png"
                                                                                  class="img-responsive" alt=""></a>
                                </div>
                                <div class="data-middle">
                                    <div class="title">Wernay / 2 hours ago / <a href="Homepage.html">reply</a></div>
                                    <p>2</p>
                                </div>
                                <div class="clearfix"></div>
                            </li>
                            <li class="last-comment">
                                <div class="preview"><a href="Homepage.html"><img src="../images/GroupMember/LYZ.png"
                                                                                  class="img-responsive" alt=""></a>
                                </div>
                                <div class="data-last">
                                    <div class="title">mr.dev / 2 hours ago / <a href="Homepage.html">reply</a></div>
                                    <p>3</p>
                                </div>
                                <div class="clearfix"></div>
                            </li>
                            <li>
                                <div class="preview"><a href="Homepage.html"><img src="/static/images/GroupMember/ZZX.png"
                                                                                  class="img-responsive" alt=""></a>
                                </div>
                                <div class="data">
                                    <div class="title">denpro / 2 hours ago / <a href="Homepage.html">reply</a></div>
                                    <p>2018.6.2</p>
                                </div>
                                <div class="clearfix"></div>
                            </li>
                        </ul>
                    </div>
                </div>
                <div class="col-md-3">
                    <div class="movie_img">
                        <div class="grid_2">
                            <img src="/static/images/slfc.jpg" class="img-responsive" alt="">
                            <div class="caption1">

                                <p class="m_3">数理方程</p>
                            </div>
                        </div>
                    </div>
                    <div class="grid_2 col_1">
                        <img src="/static/images/slfc.jpg" class="img-responsive" alt="">
                        <div class="caption1">

                            <p class="m_3">数理方程</p>
                        </div>
                    </div>
                    <div class="grid_2 col_1">
                        <img src="/static/images/slfc.jpg" class="img-responsive" alt="">
                        <div class="caption1">

                            <p class="m_3">数理方程</p>
                        </div>
                    </div>
                </div>
                <div class="clearfix"></div>
            </div>
        </div>
    </div>
</div>

</body>
</html>
