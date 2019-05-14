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
    <title>优惠券核销</title>
    <link rel="stylesheet" href="resource/css/layui.css" />
    <link rel="stylesheet" href="resource/css/public.css" />
    <link rel="stylesheet" href="resource/css/wlbt.css" />
    <script SRC="resource/js/jquery-3.3.1.min.js"></script>
    <style>
        .top_seek select{border:1px solid #ddd;height:30px;}
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
        <div class="nav_row left_active">
            <div class="black"></div>
            <div class="nav_box clearfix ">
                <div class="row_l ">优惠券</div>
                <div class="row_r open">+</div>
            </div>
            <a href="coupon">
                <div class="nav_box hide_box clearfix">
                    <div class="row_l">赠送</div>
                    <div class="row_r">&gt;</div>
                </div>
            </a>
            <a href="coupon_h">
                <div class="nav_box hide_box clearfix left_active_c">
                    <div class="row_l ">核销</div>
                    <div class="row_r">&gt;</div>
                </div>
            </a>
        </div>
        <div class="nav_row">
            <div class="black"></div>
            <div class="nav_box clearfix">
                <div class="row_l">圈子生活</div>
                <div class="row_r open">+</div>
            </div>
            <a href="say_c">
                <div class="nav_box hide_box clearfix">
                    <div class="row_l">圈子查询</div>
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
            <p class="right_title">后台 》 优惠券 》 核销</p>
            <div class="top_seek">
                <form action="" id="form">
                <ul class="clearfix">
                    <li>按券号搜索：<input type="text" placeholder="YHQ10-001" class="coupon_cord_id"/></li>
                    <li>
                        使用情况搜索：
                        <select name="" id="" class="state">
                            <option value="1">已使用</option>
                            <option value="0">未使用</option>
                            <option value="-1">已过期</option>
                        </select>
                    </li>
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
                    <th>券号</th>
                    <th>面值</th>
                    <th>有效期</th>
                    <th>条件</th>
                    <th>领取人</th>
                    <th>领取时间</th>
                    <th>使用情况</th>
                    <th>操作</th>
                </tr>
                </thead>
                <tbody id="table">
                <c:forEach items="${list}" var="l">
                <tr>
                    <td>${l.coupon_cord_id}</td>
                    <td>${l.money}元</td>
                    <td>${l.valid_date}</td>
                    <td>满${l.condition}元使用</td>
                    <td>${l.nickname}</td>
                    <td>${l.get_time}</td>
                    <td>未使用</td>
                    <td>
                        <p class="affirm" id="${l.coupon_id}">
                            核销
                            <span></span>
                        </p>
                    </td>
                </tr>
                </c:forEach>
                <%----%>
                </tbody>
            </table>
            <div id="test1" class="clearfix"></div>
        </div>
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

    //			操作
    $('.affirm').click(function(){
        $(this).css({'color':'#ccc'});
        $(this).find('span').css({'backgroundColor':'#ccc'});
        let coupon_id = $(this).attr('id');
        $.ajax({
            url:"coupon_hx",
            type:"Post",
            data:{coupon_id:coupon_id}
        })
    })
</script>
<script type="text/javascript">
    function sub(){
        let coupon_cord_id = $('.coupon_cord_id').val();
        let state = $('.state').find('option:selected').val();
        if(coupon_cord_id!=""){
            if(state!=""){
                $.ajax({
                    url:"coupon_h_q_z",
                    type:"Post",
                    data:{coupon_cord_id:coupon_cord_id,state:state},

                    success:function(data){
                        $('#table').html("");
                        for (var i=0;data.length>i;i++){
                            var str = '<tr>';
                            str +='<td>'+data[i].coupon_cord_id+'</td>\n' +
                                '                    <td>'+data[i].money+'元</td>\n' +
                                '                    <td>有效期限</td>\n' +
                                '                    <td>满'+data[i].valid_date+'元使用</td>\n' +
                                '                    <td>'+data[i].nickname+'</td>\n' +
                                '                    <td>'+data[i].get_time+'</td>\n' +
                                '                    <td>未使用</td>\n' +
                                '                    <td>\n' +
                                '                        <p class="affirm" id="'+data[i].coupon_id+'">\n' +
                                '                            核销\n' +
                                '                            <span></span>\n' +
                                '                        </p>\n' +
                                '                    </td>';
                            str +='<tr/>';
                            $('#table').append(str);
                        }
                    },
                    error:function(){

                    }
                })
            }else {
                $.ajax({
                    url:"coupon_h_q",
                    type:"Post",
                    data:{coupon_cord_id:coupon_cord_id},

                    success:function(data){
                        $('#table').html("");
                        for (var i=0;data.length>i;i++){
                            var str = '<tr>';
                            str +='<td>'+data[i].coupon_cord_id+'</td>\n' +
                                '                    <td>'+data[i].money+'元</td>\n' +
                                '                    <td>有效期限</td>\n' +
                                '                    <td>满'+data[i].valid_date+'元使用</td>\n' +
                                '                    <td>'+data[i].nickname+'</td>\n' +
                                '                    <td>'+data[i].get_time+'</td>\n' +
                                '                    <td>未使用</td>\n' +
                                '                    <td>\n' +
                                '                        <p class="affirm">\n' +
                                '                            核销\n' +
                                '                            <span></span>\n' +
                                '                        </p>\n' +
                                '                    </td>';
                            str +='<tr/>';
                            $('#table').append(str);
                        }
                    },
                    error:function(){

                    }
                })
            }

        }else {
            if(state!=""){
                $.ajax({
                    url:"coupon_h_z",
                    type:"Post",
                    data:{state:state},

                    success:function(data){
                        $('#table').html("");
                        for (var i=0;data.length>i;i++){
                            var str = '<tr>';
                            str +='<td>'+data[i].coupon_cord_id+'</td>\n' +
                                '                    <td>'+data[i].money+'元</td>\n' +
                                '                    <td>有效期限</td>\n' +
                                '                    <td>满'+data[i].valid_date+'元使用</td>\n' +
                                '                    <td>'+data[i].nickname+'</td>\n' +
                                '                    <td>'+data[i].get_time+'</td>\n' +
                                '                    <td>未使用</td>\n' +
                                '                    <td>\n' +
                                '                        <p class="affirm">\n' +
                                '                            核销\n' +
                                '                            <span></span>\n' +
                                '                        </p>\n' +
                                '                    </td>';
                            str +='<tr/>';
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
