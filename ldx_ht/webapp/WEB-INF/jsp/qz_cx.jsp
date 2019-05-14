<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page language="java" pageEncoding="UTF-8"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
            + path + "/";
%>
<html>
<head>
    <base href="<%=basePath%>">
    <meta charset="UTF-8">
    <title>圈子查询</title>
    <link rel="stylesheet" href="resource/css/layui.css" />
    <link rel="stylesheet" href="resource/css/public.css" />
    <link rel="stylesheet" href="resource/css/wlbt.css" />
    <script SRC="resource/js/jquery-3.3.1.min.js"></script>
    <style>
        td p{display: inline-block;}
        .tc{width:560px;border-radius:10px;color:#fff;position:fixed;left:50%;margin-left:-280px;top:50%;margin-top:-160px;z-index:9996;overflow: hidden;display: none;}
        .tc_top{width:100%;height:220px;background:#29ade1;line-height:220px;text-align: center;}
        .tc_bottom{padding:20px 108px 0px 108px;background:#fff;height:60px;}
        .tc_bottom p{width:108px;padding:5px 0;text-align: center;border-radius:20px;cursor:pointer;}
        .tc_bottom p:hover{background:red;}
        .tc_ok{background:#0893c9;clear: both;margin:0 auto;}
        .close_2{padding:10px 20px;position:absolute;top:0;right:0;cursor:pointer;}
    </style>
</head>
<body>
<div id="main">
    <div id="top" class="clearfix">
        <div id="top_logo"></div>
        <div id="top_right">
            <div id="photo">
                <img src="resource/img/touxiang.png" alt="" />
            </div>
            <div id="top_text">欢迎您，管理员</div>
            <div id="close">
                <img src="resource/img/close.png" alt="" />
            </div>
        </div>
    </div>
    <div id="left">
        <div class="nav_row ">
            <div class="black"></div>
            <a href="wlbt">
                <div class="nav_box clearfix ">
                    <div class="row_l ">物流补贴</div>
                    <div class="row_r">&gt;</div>
                </div>
            </a>
        </div>
        <div class="nav_row">
            <div class="black"></div>
            <div class="nav_box clearfix">
                <div class="row_l">优惠券</div>
                <div class="row_r open">+</div>
            </div>
            <a href="coupon">
                <div class="nav_box hide_box clearfix">
                    <div class="row_l">赠送</div>
                    <div class="row_r">&gt;</div>
                </div>
            </a>
            <a href="coupon_h">
                <div class="nav_box hide_box clearfix">
                    <div class="row_l">核销</div>
                    <div class="row_r">&gt;</div>
                </div>
            </a>
        </div>
        <div class="nav_row left_active">
            <div class="black"></div>
            <div class="nav_box clearfix ">
                <div class="row_l ">圈子生活</div>
                <div class="row_r open">+</div>
            </div>
            <a href="say_c">
                <div class="nav_box hide_box clearfix left_active_c">
                    <div class="row_l ">圈子查询</div>
                    <div class="row_r">&gt;</div>
                </div>
            </a>
            <a href="say_s">
                <div class="nav_box hide_box clearfix">
                    <div class="row_l">圈子数据</div>
                    <div class="row_r">&gt;</div>
                </div>
            </a>
        </div>
        <div class="nav_row ">
            <div class="black"></div>
            <a href="order">
                <div class="nav_box clearfix">
                    <div class="row_l">订单查询</div>
                    <div class="row_r">&gt;</div>
                </div>
            </a>
        </div>
        <div class="nav_row">
            <div class="black"></div>
            <div class="nav_box clearfix">
                <div class="row_l">数据分析</div>
                <div class="row_r open">+</div>
            </div>
            <a href="info">
                <div class="nav_box hide_box clearfix">
                    <div class="row_l">用户信息</div>
                    <div class="row_r">&gt;</div>
                </div>
            </a>
            <a href="data">
                <div class="nav_box hide_box clearfix">
                    <div class="row_l">用户数据</div>
                    <div class="row_r">&gt;</div>
                </div>
            </a>
        </div>
        <div class="nav_row">
            <div class="black"></div>
            <div class="nav_box clearfix">
                <div class="row_l">物资库存</div>
                <div class="row_r open">+</div>
            </div>
            <a href="kc">
                <div class="nav_box hide_box clearfix">
                    <div class="row_l">库存</div>
                    <div class="row_r">&gt;</div>
                </div>
            </a>
            <a href="qs">
                <div class="nav_box hide_box clearfix">
                    <div class="row_l">清算</div>
                    <div class="row_r">&gt;</div>
                </div>
            </a>
            <a href="bb">
                <div class="nav_box hide_box clearfix">
                    <div class="row_l">报表</div>
                    <div class="row_r">&gt;</div>
                </div>
            </a>
        </div>
        <div class="nav_row ">
            <div class="black"></div>
            <a href="fybb">
                <div class="nav_box clearfix">
                    <div class="row_l">费用报表</div>
                    <div class="row_r">&gt;</div>
                </div>
            </a>
        </div>
        <div class="nav_row ">
            <div class="black"></div>
            <div class="nav_box clearfix">
                <div class="row_l">内容修改</div>
                <div class="row_r open">+</div>
            </div>
            <a href="sy_hb">
                <div class="nav_box hide_box clearfix ">
                    <div class="row_l">首页海报</div>
                    <div class="row_r">&gt;</div>
                </div>
            </a>
            <a href="dj_hb">
                <div class="nav_box hide_box clearfix ">
                    <div class="row_l">捐赠登记海报</div>
                    <div class="row_r">&gt;</div>
                </div>
            </a>
            <a href="dr_hb">
                <div class="nav_box hide_box clearfix ">
                    <div class="row_l">捐赠达人海报</div>
                    <div class="row_r">&gt;</div>
                </div>
            </a>
            <a href="gd_tg">
                <div class="nav_box hide_box clearfix ">
                    <div class="row_l">滚动通告</div>
                    <div class="row_r">&gt;</div>
                </div>
            </a>
        </div>
    </div>
    <div id="right">
        <div id="right_box">
            <p class="right_title">后台 》 圈子生活 》 圈子查询</p>
            <div class="top_seek">
                <form action="" id="form">
                <ul class="clearfix">
                    <li>按用户名搜索：<input type="text" class="account" /></li>
                    <li>按消息内容搜索：<input type="text" class="message"/></li>
                    <li><input type="button" value="查询" onclick="sub()"/></li>
                </ul>
                </form>
            </div>
            <table class="layui-table" lay-skin="row" lay-even>
                <!--<colgroup>
                  <col width="150">
                  <col width="200">
                  <col>
                </colgroup>-->
                <thead>
                <tr>
                    <th>用户昵称</th>
                    <th>发布时间</th>
                    <th>发布内容</th>
                    <th>图片</th>
                    <th>状态操作</th>
                </tr>
                </thead>
                <tbody id="table">
                <c:forEach items="${list}" var="l">
                <tr>
                    <td>${l.nickanme}</td>
                    <td>${l.time}</td>
                    <td>${l.message}</td>
                    <td>
                        <img src="${l.photo_loca1}" alt="" />
                        <img src="${l.photo_loca2}" alt="" />
                        <img src="${l.photo_loca3}" alt="" />

                    </td>
                    <td>
                        <p class="affirm" value="1" id="${l.say_id}">
                            拉黑
                            <span></span>
                        </p>
                        <p class="affirm" value="2" id="${l.say_id}">
                            删除
                            <span></span>
                        </p>
                    </td>
                </tr>
                </c:forEach>
                </tbody>
            </table>
            <div id="test1" class="clearfix"></div>
        </div>
    </div>
</div>
<div class="shade"></div>
<div class="tc">
    <p class="close_2"><img src="resource/img/close_2.png" alt="" /></p>
    <div class="tc_top">确认恢复吗？</div>
    <div class="tc_bottom clearfix">
        <p class="tc_ok">是的</p>
        <!--<p class="tc_no">否</p>-->
    </div>
</div>
<script src="resource/js/layui.all.js"></script>
<script src="resource/js/public.js"></script>
<script>
    ;!function(){
        //无需再执行layui.use()方法加载模块，直接使用即可
        var form = layui.form
            ,layer = layui.layer;
        var laypage = layui.laypage;

        //执行一个laypage实例 分页
        laypage.render({
            elem: 'test1' //注意，这里的 test1 是 ID，不用加 # 号
            ,count: 50 //数据总数，从服务端得到
            ,layout:['skip','prev', 'page', 'next']
        });
        //…
    }();

    //操作
    $('.affirm').click(function(){
        var val = $(this).attr('value');
        if(val==1 && $(this).find('span').length>0){
//					alert($(this).find('span').length)
            $('.tc_top').html('确定要拉黑吗？')
            var self = $(this);
            $('.tc_ok').click(function(){
                self.html('恢复').css({'color':'red'});
                self.parents('tr').css({'color':'#ccc'});
                let say_id = $(this).attr('id');
                $.ajax({
                    url:"say_lh",
                    type:"Post",
                    data:{say_id:say_id},
                })
                close();
            })
        }else if(val==2){
            $('.tc_top').html('确定要删除吗？')
            var self = $(this);
            $('.tc_ok').click(function(){
                let say_id = $(this).attr('id');
                $.ajax({
                    url:"say_del",
                    type:"Post",
                    data:{say_id:say_id},
                })
                self.parents('tr').remove();
                close();
            })

        }else if(val == 1 && $(this).find('span').length==0){
            $('.tc_top').html('确定要恢复吗？')

            var self = $(this);
            $('.tc_ok').click(function(){

                self.html('拉黑 <span></span>').css({'color':'#0893c9'});
                self.parents('tr').css({'color':'#666'});
                let say_id = $(this).attr('id');
                $.ajax({
                    url:"say_hf",
                    type:"Post",
                    data:{say_id:say_id}
                })
                close();
            })
        }
        $('.shade').show();
        $('.tc').show();
    })
    function close(){
        $('.shade').hide();
        $('.tc').hide();
    }
    $('.close_2').click(function(){
        close();
    })
    $('.tc_ok').click(function(){
        close();
    })
</script>
<script type="text/javascript">
    function sub(){
        let account = $('.account').val();
        let message = $('.message').val();
        if(account!=""){
            if(message!=""){
                $.ajax({
                    url:"say_c_n_m",
                    type:"Post",
                    data:{account:account,message:message},
                    success:function(data){
                        $('#table').html("");
                        for (var i=0;data.length>i;i++){
                            var str = '<tr>';
                            str += '<td>'+data[i].nickanme+'</td>\n' +
                                '                    <td>'+data[i].time+'</td>\n' +
                                '                    <td>'+data[i].message+'</td>\n' +
                                '                    <td>\n' +
                                '                        <img src="'+data[i].photo_loca1+'" alt="" />\n' +
                                '                        <img src="'+data[i].photo_loca2+'" alt="" />\n' +
                                '                        <img src="'+data[i].photo_loca3+'" alt="" />\n' +
                                '                    </td>\n' +
                                '                    <td>\n' +
                                '                        <p class="affirm" value="1" id="'+data[i].say_id+'">\n' +
                                '                            拉黑\n' +
                                '                            <span></span>\n' +
                                '                        </p>\n' +
                                '                        <p class="affirm" value="2" id="'+data[i].say_id+'">\n' +
                                '                            删除\n' +
                                '                            <span></span>\n' +
                                '                        </p>\n' +
                                '                    </td>';
                            str += '<tr/>';
                            $('#table').append(str);
                        }
                    },
                    error:function(){

                    }
                })
            }else {
                $.ajax({
                    url:"say_c_n",
                    type:"Post",
                    data:{account:account,message:message},
                    success:function(data){
                        $('#table').html("");
                        for (var i=0;data.length>i;i++){
                            var str = '<tr>';
                            str += '<td>'+data[i].nickanme+'</td>\n' +
                                '                    <td>'+data[i].time+'</td>\n' +
                                '                    <td>'+data[i].message+'</td>\n' +
                                '                    <td>\n' +
                                '                        <img src="'+data[i].photo_loca1+'" alt="" />\n' +
                                '                        <img src="'+data[i].photo_loca2+'" alt="" />\n' +
                                '                        <img src="'+data[i].photo_loca3+'" alt="" />\n' +
                                '                    </td>\n' +
                                '                    <td>\n' +
                                '                        <p class="affirm" value="1" id="'+data[i].say_id+'">\n' +
                                '                            拉黑\n' +
                                '                            <span></span>\n' +
                                '                        </p>\n' +
                                '                        <p class="affirm" value="2" id="'+data[i].say_id+'">\n' +
                                '                            删除\n' +
                                '                            <span></span>\n' +
                                '                        </p>\n' +
                                '                    </td>';
                            str += '<tr/>';
                            $('#table').append(str);
                        }
                    },
                    error:function(){

                    }
                })
            }

        }else {
            if(message!=""){
                $.ajax({
                    url:"say_c_m",
                    type:"Post",
                    data:{account:account,message:message},
                    success:function(data){
                        $('#table').html("");
                        for (var i=0;data.length>i;i++){
                            var str = '<tr>';
                            str += '<td>'+data[i].nickanme+'</td>\n' +
                                '                    <td>'+data[i].time+'</td>\n' +
                                '                    <td>'+data[i].message+'</td>\n' +
                                '                    <td>\n' +
                                '                        <img src="'+data[i].photo_loca1+'" alt="" />\n' +
                                '                        <img src="'+data[i].photo_loca2+'" alt="" />\n' +
                                '                        <img src="'+data[i].photo_loca3+'" alt="" />\n' +
                                '                    </td>\n' +
                                '                    <td>\n' +
                                '                        <p class="affirm" value="1" id="'+data[i].say_id+'">\n' +
                                '                            拉黑\n' +
                                '                            <span></span>\n' +
                                '                        </p>\n' +
                                '                        <p class="affirm" value="2" id="'+data[i].say_id+'">\n' +
                                '                            删除\n' +
                                '                            <span></span>\n' +
                                '                        </p>\n' +
                                '                    </td>';
                            str += '<tr/>';
                            $('#table').append(str);
                        }
                    },
                    error:function(){

                    }
                })
            }else {

            }
        }
    }
</script>
</body>
</html>
