<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html lang="zh">
<head>
    <meta charset="UTF-8">
    <title>Book List</title>
    <link rel="stylesheet" type="text/css" href="/static/css/easyui.css">
    <link rel="stylesheet" type="text/css" href="/static/css/icon.css">
    <link rel="stylesheet" type="text/css" href="/static/css/demo.css">
    <script type="text/javascript" src="/static/js/jquery.min.js"></script>
    <script type="text/javascript" src="/static/js/jquery.easyui.min.js"></script>

    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <link rel="stylesheet" type="text/css"  href="/static/css/MainWindowStyle.css" media="all"/>
</head>
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

        <table id="dg" title="DeltaFish Books Mall" style="width:1000px;height:250px"></table>

    </div>
</div>

<script type="text/javascript">

    $(function () {
        //datagrid初始化
        var pager = $('#dg').datagrid({
            //请求数据的url
            url: 'list.do',

            //载入提示信息
            loadMsg: 'loading...',

            methord:'post',

            rownumbers:true,

            //水平自动展开，如果设置此属性，则不会有水平滚动条，演示冻结列时，该参数不要设置
            fitColumns: true,

            //数据多的时候不换行
            nowrap: true,

            //设置分页
            pagination: true,

            //设置每页显示的记录数，默认是10个
            pageSize: 5,

            //每页显示记录数项目
            pageList: [5, 10, 15, 20],

            //指定id为标识字段，在删除，更新的时候有用，如果配置此字段，在翻页时，换页不会影响选中的项
            idField: 'id',

            striped:true,



            columns:[[
                {field:'bookId',title:"Book Id",width:100,align:'center'},
                {field:'bookName',title:"Book Name",width:100,align:'center'},
                {field:'edition',title:"Book Edition",width:100,align:'center'},
                {field:'ownerId',title:"Owner Id",width:100,align:'center'},
                {field:'operation',title:"Operation",width:100,align:'center'}
            ]],


        }).datagrid("getPager");

        pager.pagination({
            buttons:['--','--',{
                iconCls:'icon-search',
                text:'Search',
                handler:function(){
                    alert('search');
                }
            }]
        })
    });

</script>


</body>
</html>