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
    <title>用户信息</title>
    <link rel="stylesheet" href="resource/css/layui.css" />
    <link rel="stylesheet" href="resource/css/public.css" />
    <link rel="stylesheet" href="resource/css/wlbt.css" />
    <script SRC="resource/js/jquery-3.3.1.min.js"></script>
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
        <div class="nav_row left_active">
            <div class="black"></div>
            <div class="nav_box clearfix ">
                <div class="row_l ">数据分析</div>
                <div class="row_r open">+</div>
            </div>
            <a href="info">
                <div class="nav_box hide_box clearfix left_active_c">
                    <div class="row_l ">用户信息</div>
                    <div class="row_r">&gt;</div>
                </div>
            </a>
            <a href="data">
                <div class="nav_box hide_box clearfix ">
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
            <p class="right_title">后台 》 数据分析 》 用户信息</p>
            <div class="top_seek">
                <form action="" id="form">
                <ul class="clearfix">
                    <li>按用户名搜索：<input type="text" class="account"/></li>
                    <li>按手机号搜索：<input type="text" class="phone_number"/></li>
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
                    <th>序列</th>
                    <th>昵称</th>
                    <th>名字</th>
                    <th>联系方式</th>
                    <th>下单次数</th>
                    <th>优惠券数量</th>
                    <th>地区</th>
                    <th>总重量</th>
                    <th>来源</th>
                </tr>
                </thead>
                <tbody id="table">
                <c:forEach items="${list}" var="l">
                <tr>
                    <td>1</td>
                    <td>${l.nickname}</td>
                    <td>${l.name}</td>
                    <td>${l.phone_number}</td>
                    <td>${l.back_number}</td>
                    <td>${l.coupon_number}</td>
                    <td>${l.location}</td>
                    <td>${l.weight}KG</td>
                    <td>${l.user_from}</td>
                </tr>
                </c:forEach>
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

</script>
<script type="text/javascript">
    function sub(){
        let account = $('.account').val();
        let phone_number = $('.phone_number').val();
        if(account!=""){
            if(phone_number!=""){
                $.ajax({
                    url:"info_y_s",
                    type:"Post",
                    data:{account:account,phone_number:phone_number},
                    success:function(data){
                        $('#table').html("");
                        for(var i=0;data.length>i;i++){
                            var str = '<tr>';
                            str += '<td>'+i+1+'</td>\n' +
                                '                    <td>'+data[i].nickname+'</td>\n' +
                                '                    <td>'+data[i].name+'</td>\n' +
                                '                    <td>'+data[i].phone_number+'</td>\n' +
                                '                    <td>'+data[i].back_number+'</td>\n' +
                                '                    <td>'+data[i].coupon_number+'</td>\n' +
                                '                    <td>'+data[i].location+'</td>\n' +
                                '                    <td>'+data[i].weight+'KG</td>\n' +
                                '                    <td>'+data[i].user_from+'</td>';
                            str += '<tr/>';
                            $('#table').append(str);
                        }
                    },
                    error:function(){

                    }
                })
            }else {
                $.ajax({
                    url:"info_y",
                    type:"Post",
                    data:{account:account},
                    success:function(data){
                        $('#table').html("");
                        for(var i=0;data.length>i;i++){
                            var str = '<tr>';
                            str += '<td>'+i+1+'</td>\n' +
                                '                    <td>'+data[i].nickname+'</td>\n' +
                                '                    <td>'+data[i].name+'</td>\n' +
                                '                    <td>'+data[i].phone_number+'</td>\n' +
                                '                    <td>'+data[i].back_number+'</td>\n' +
                                '                    <td>'+data[i].coupon_number+'</td>\n' +
                                '                    <td>'+data[i].location+'</td>\n' +
                                '                    <td>'+data[i].weight+'KG</td>\n' +
                                '                    <td>'+data[i].user_from+'</td>';
                            str += '<tr/>';
                            $('#table').append(str);
                        }
                    },
                    error:function(){

                    }
                })
            }
        }else {
            if(phone_number!=""){
                $.ajax({
                    url:"info_s",
                    type:"Post",
                    data:{phone_number:phone_number},
                    success:function(data){
                        $('#table').html("");
                        for(var i=0;data.length>i;i++){
                            var str = '<tr>';
                            str += '<td>'+i+1+'</td>\n' +
                                '                    <td>'+data[i].nickname+'</td>\n' +
                                '                    <td>'+data[i].name+'</td>\n' +
                                '                    <td>'+data[i].phone_number+'</td>\n' +
                                '                    <td>'+data[i].back_number+'</td>\n' +
                                '                    <td>'+data[i].coupon_number+'</td>\n' +
                                '                    <td>'+data[i].location+'</td>\n' +
                                '                    <td>'+data[i].weight+'KG</td>\n' +
                                '                    <td>'+data[i].user_from+'</td>';
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
