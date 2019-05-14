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
    <title>报表</title>
    <link rel="stylesheet" href="resource/css/layui.css" />
    <link rel="stylesheet" href="resource/css/public.css" />
    <link rel="stylesheet" href="resource/css/wlbt.css" />
    <script src="resource/js/jquery-3.3.1.min.js"></script>
    <style>
        .top_seek select{width:80px;height:30px;border:1px solid #ddd;}
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
                <div class="nav_box clearfix">
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
        <div class="nav_row left_active">
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
                <div class="nav_box hide_box clearfix left_active_c" >
                    <div class="row_l ">报表</div>
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
            <p class="right_title">后台 》 费用报表</p>
            <div class="top_seek">
                <form action="" id="form">
                <ul class="clearfix">
                    <li>
                        时间：
                        <select class="sel_year" rel="2018"> </select> 年
                        <select class="sel_month" rel="5"> </select> 月
                        <select class="sel_day" rel="4"> </select> 日
                    </li>
                    <li>至</li>
                    <li>
                        <!--<select class="sel_year" rel="2018"> </select> 年-->
                        <select class="sel_month" rel="5" id="month"> </select> 月
                        <select class="sel_day" rel="4" id="day"> </select> 日
                    </li>
                    <li>
                        类型：
                        <select name="" id="">
                            <option value="全部">全部</option>
                        </select>
                    </li>
                    <li><input type="button" value="查询" onclick="sub()"/></li>
                </ul>
                </form>
            </div>
            <table class="layui-table" lay-skin="row" lay-even>
                <!--<colgroup>
                  <col width="10%">
                  <col width="90%">
                  <col>
                </colgroup>-->
                <thead>
                <tr>
                    <th>序列</th>
                    <th>种类</th>
                    <th>买家</th>
                    <th>联系方式</th>
                    <th>时间</th>
                    <th>备注</th>
                    <th>重量</th>
                    <th>价格</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach items="${list}" var="l">
                <tr>
                    <td>1</td>
                    <td>${l.clothes_type}</td>
                    <td>${l.name}</td>
                    <td>${l.phone_number}</td>
                    <td>${l.buy_time}</td>
                    <td>${l.remark}</td>
                    <td class="num">${l.weight} KG</td>
                    <td class="money">${l.price}</td>
                </tr>
                </c:forEach>
                <tr>
                    <td colspan="6">汇总</td>
                    <td class="all_num"></td>
                    <td class="all_money">2400000.0</td>
                </tr>
                </tbody>
            </table>
            <div id="test1" class="clearfix"></div>
        </div>
    </div>
</div>
<script src="resource/js/public.js"></script>
<script src="resource/js/qz_sj.js"></script>
<script src="resource/js/layui.all.js"></script>
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
    }();

    //			重量汇总
    var all_num = 0;
    for(var i = 0;i<$('.num').length;i++){
        var num = parseFloat($('.num').eq(i).html());
        all_num += num;
    }
    $('.all_num').html(all_num+' KG')

    //			总价
    var all_money = 0;
    for(var i = 0;i<$('.money').length;i++){
        var money = parseFloat($('.money').eq(i).html());
        all_money += money;
    }
    $('.all_money').html(all_money)
</script>
<script type="text/javascript">
    function sub(){
        let s_year = $('.sel_year').find('option:selected').val();
        let s_month= $('.sel_month').find('option:selected').val();
        let s_day = $('.sel_day').find('option:selected').val();

        let e_month = $('#month').find('option:selected').val();
        let e_day = $('#day').find('option:selected').val();

        let start = s_year+"/"+s_month+"/"+s_day;
        let end = s_year+"/"+e_month+"/"+e_day;

        if(start != ""){
            if(end != ""){
                $.ajax({
                    url:"",
                    type:"",
                    data:{start:start,end:end},
                    success:function(data){
                        $('#table').html("");
                        var str = '<tr>';
                        str += '<td>'+i+1+'</td>\n' +
                            '  <td>'+data[i].clothes_type+'</td>\n' +
                            '  <td>'+data[i].name+'</td>\n' +
                            '  <td>'+data[i].phone_number+'</td>\n' +
                            '  <td>'+data[i].buy_time+'</td>\n' +
                            '  <td>'+data[i].remark+'</td>\n' +
                            '  <td class="num">'+data[i].weight+' KG</td>\n' +
                            '  <td class="money">'+data[i].price+'</td>';
                        str += '<tr/>';
                        $('#table').append(str);
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
