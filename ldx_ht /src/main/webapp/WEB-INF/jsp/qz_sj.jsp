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
    <title>圈子数据</title>
    <link rel="stylesheet" href="resource/css/public.css" />
    <link rel="stylesheet" href="resource/css/qz_sj.css" />
    <script SRC="resource/js/jquery-3.3.1.min.js"></script>
    <script src="resource/js/echarts.common.min.js"></script>
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
                <div class="nav_box hide_box clearfix">
                    <div class="row_l">圈子查询</div>
                    <div class="row_r">&gt;</div>
                </div>
            </a>
            <a href="say_s">
                <div class="nav_box hide_box clearfix left_active_c">
                    <div class="row_l ">圈子数据</div>
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
            <p class="right_title">后台 》 圈子生活 》 圈子数据</p>
            <div class="top_seek">
                <form action="" id="form">
                <ul class="clearfix">
                    <li>
                        <select class="sel_year" rel="2018"> </select> 年
                        <select class="sel_month" rel="5"> </select> 月
                        <select class="sel_day" rel="4"> </select> 日
                    </li>
                    <li>至</li>
                    <li>
                        <select class="sel_year" rel="2018" id="year"> </select> 年
                        <select class="sel_month" rel="5" id="month"> </select> 月
                        <select class="sel_day" rel="4" id="day"> </select> 日
                    </li>
                    <li><input type="submit" value="查询"/></li>
                </ul>
                </form>
            </div>
            <div class="clearfix section_1">
                <div id="biao1"></div>
                <div id="biao1_data">
                    <p class="biao1_title">数据总览</p>
                    <div class="s1_row">
                        <p class="biao1_num">${list[0].public_number}</p>
                        <p>总发布用户数</p>
                        <p class="dian dian_1"></p>
                    </div>
                    <div class="s1_row">
                        <p class="biao1_num">${list[0].z_active_number}</p>
                        <p>总活跃用户数</p>
                        <p class="dian dian_2"></p>
                    </div>
                    <div class="s1_row">
                        <p class="biao1_num">${list[0].r_active_number}</p>
                        <p>日活跃用户数</p>
                        <p class="dian dian_3"></p>
                    </div>
                </div>
            </div>
            <div class="section_2 clearfix">
                <div class="s2_l">
                    <p class="s2_title">顾客停留时间统计</p>
                    <div id="biao2"></div>
                </div>
                <div class="s2_r">
                    <p class="s2_title">顾客终端品牌统计</p>
                    <div id="biao3"></div>
                </div>
            </div>
        </div>
    </div>
</div>
<script src="resource/js/public.js"></script>
<script src="resource/js/qz_sj.js"></script>
<script type="text/javascript">
    $('#form').submit(function(){
        let s_year = $('.sel_year').find('option:selected').val();
        let s_month= $('.sel_month').find('option:selected').val();
        let s_day = $('.sel_day').find('option:selected').val();

        let e_year = $('#year').find('option:selected').val();
        let e_month = $('#month').find('option:selected').val();
        let e_day = $('#day').find('option:selected').val();

        let start = s_year+"/"+s_month+"/"+s_day;
        let end = e_year+"/"+e_month+"/"+e_day;

        if(start != ""){
            if(end != ""){
                $.ajax({
                    url:"say_s_t",
                    type:"Post",
                    data:{start:start,end:end},
                    success:function(data){

                    },
                    error:function(){

                    }
                })
            }else {

            }
        }else {
            if(end != ""){

            }else {

            }
        }
    })
</script>
</body>
</html>
