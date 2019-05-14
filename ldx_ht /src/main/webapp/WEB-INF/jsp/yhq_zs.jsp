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
    <title>优惠券赠送</title>
    <link rel="stylesheet" href="resource/css/layui.css" />
    <link rel="stylesheet" href="resource/css/public.css" />
    <link rel="stylesheet" href="resource/css/wlbt.css" />
    <link rel="stylesheet" href="resource/css/yhq_zs.css" />
    <script src="resource/js/jquery-3.3.1.min.js"></script>
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
                <div class="nav_box hide_box clearfix left_active_c">
                    <div class="row_l ">赠送</div>
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
        <div class="nav_row">
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
            <p class="right_title">后台 》 优惠券 》 赠送</p>
            <div class="yhq_out">
                <div class="yhq_in clearfix">
                    <div class="yhq_box">
                        <div class="yhq clearfix">
                            <div class="yhq_text">
                                <p class="money">￥<span>10</span></p>
                                <p class="yhq_time">有效期：2018.04.20－05.20满100元使用</p>
                            </div>
                            <div class="yhq_img">
                                <img src="resource/img/yhq.png" alt="" />
                            </div>
                        </div>
                        <div class="check"><input type="checkbox" />10元优惠券</div>
                    </div>
                    <div class="yhq_box">
                        <div class="yhq clearfix">
                            <div class="yhq_text">
                                <p class="money">￥<span>20</span></p>
                                <p class="yhq_time">有效期：2018.04.20－05.20满100元使用</p>
                            </div>
                            <div class="yhq_img">
                                <img src="resource/img/yhq.png" alt="" />
                            </div>
                        </div>
                        <div class="check"><input type="checkbox" />20元优惠券</div>
                    </div>
                    <div class="yhq_box">
                        <div class="yhq clearfix">
                            <div class="yhq_text">
                                <p class="money">￥<span>30</span></p>
                                <p class="yhq_time">有效期：2018.04.20－05.20满100元使用</p>
                            </div>
                            <div class="yhq_img">
                                <img src="resource/img/yhq.png" alt="" />
                            </div>
                        </div>
                        <div class="check"><input type="checkbox" />30元优惠券</div>
                    </div>
                </div>
                <div class="yhq_left">&lt;</div>
                <div class="yhq_right">&gt;</div>
            </div>
            <div class="top_seek">
                <form action="" id="from">
                <ul class="clearfix">
                    <li>按用户名搜索：<input type="text" placeholder="请输入..." class="account"/></li>
                    <li>按订单编号搜索：<input type="text" placeholder="00000001" class="order_id"/></li>
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
                    <th><input type="checkbox" name="allSel" />全选</th>
                    <th>订单编号</th>
                    <th>用户昵称</th>
                    <th>发布时间</th>
                    <th>重量</th>
                    <th>快递单号</th>
                </tr>
                </thead>
                <tbody id="">
                <c:forEach items="${list}" var="l">
                <tr>
                    <td><input type="checkbox" name="select" value="1"/></td>
                    <td>${l.order_id}</td>
                    <td>${l.user_nickanem}</td>
                    <td>${l.time}</td>
                    <td>${l.weight}KG</td>
                    <td>${l.express_number}</td>
                </tr>
                </c:forEach>
                </tbody>
            </table>
            <div class="zs">赠送</div>
            <div id="test1" class="clearfix"></div>
        </div>
    </div>
</div>
<div class="shade"></div>
<div class="tc">
    <p class="close_2"><img src="resource/img/close_2.png" alt="" /></p>
    <div class="tc_top">是否确认赠送？操作不可修改</div>
    <div class="tc_bottom clearfix">
        <p class="tc_ok">是</p>
        <p class="tc_no">否</p>
    </div>
</div>
<script src="resource/js/layui.all.js"></script>
<script src="resource/js/public.js"></script>
<script src="resource/js/yhq_zs.js"></script>
<script type="text/javascript">
    function sub(){
        let account = $('.account').val();
        let order_id = $('.order_id').val();
        if(account!=""){
            if(order_id!=""){
                $.ajax({
                    url:"coupon_z_n_d",
                    type:"Post",
                    data:{account:account,order_id:order_id},
                    success:function(data){
                        $('#table').html("");
                        for (var i=0;data.length>i;i++){
                            var str = '<tr>';
                            str+='<td><input type="checkbox" name="select" value="1"/></td>\n' +
                                '                    <td>'+data[i].order_id+'</td>\n' +
                                '                    <td>'+data[i].user_nickname+'</td>\n' +
                                '                    <td>'+data[i].time+'</td>\n' +
                                '                    <td>'+data[i].weight+'KG</td>\n' +
                                '                    <td>'+data[i].express_number+'</td>';
                            str+='<tr/>';
                            $('#table').append(str);
                        }

                    },
                    error:function(){

                    }
                })
            }else {
                $.ajax({
                    url:"coupon_z_n",
                    type:"Post",
                    data:{account:account},
                    success:function(){
                        $('#table').html("");
                        for (var i=0;data.length>i;i++) {
                            var str = '<tr>';
                            str += '<td><input type="checkbox" name="select" value="1"/></td>\n' +
                                '                    <td>' + data[i].order_id + '</td>\n' +
                                '                    <td>' + data[i].user_nickname + '</td>\n' +
                                '                    <td>' + data[i].time + '</td>\n' +
                                '                    <td>' + data[i].weight + 'KG</td>\n' +
                                '                    <td>' + data[i].express_number + '</td>';
                            str += '<tr/>';
                            $('#table').append(str);
                        }
                    },
                    error:function(){

                    }
                })
            }

        }else {
            if(order_id!=""){
                $.ajax({
                    url:"coupon_z_d",
                    type:"Post",
                    data:{order_id:order_id},
                    success:function(){
                        $('#table').html("");
                        for (var i=0;data.length>i;i++) {
                            var str = '<tr>';
                            str += '<td><input type="checkbox" name="select" value="1"/></td>\n' +
                                '                    <td>' + data[i].order_id + '</td>\n' +
                                '                    <td>' + data[i].user_nickname + '</td>\n' +
                                '                    <td>' + data[i].time + '</td>\n' +
                                '                    <td>' + data[i].weight + 'KG</td>\n' +
                                '                    <td>' + data[i].express_number + '</td>';
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
