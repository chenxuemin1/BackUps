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
    <title>清算</title>
    <link rel="stylesheet" href="resource/css/layui.css" />
    <link rel="stylesheet" href="resource/css/public.css" />
    <link rel="stylesheet" href="resource/css/wlbt.css" />
    <link rel="stylesheet" href="resource/css/qs.css" />
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
            <div class="nav_box clearfix ">
                <div class="row_l ">物资库存</div>
                <div class="row_r open">+</div>
            </div>
            <a href="kc">
                <div class="nav_box hide_box clearfix">
                    <div class="row_l">库存</div>
                    <div class="row_r">&gt;</div>
                </div>
            </a>
            <a href="qs">
                <div class="nav_box hide_box clearfix left_active_c">
                    <div class="row_l ">清算</div>
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
            <p class="right_title">后台 》 物资库存  》 清算</p>
            <div class="top_seek">
                <ul class="clearfix">
                    <li>+ 导入EXCEL</li>
                    <li class="lr">+ 手动录入</li>
                </ul>
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
                <tbody id="table">
                <c:forEach items="${list}" var="l">
                <tr>
                    <td>1</td>
                    <td>${l.clothes_type}</td>
                    <td>${l.name}</td>
                    <td>${l.phone_number}</td>
                    <td>${l.buy_time}</td>
                    <td>${l.remark}</td>
                    <td>${l.weight}KG</td>
                    <td>${l.price}</td>
                </tr>
                </c:forEach>
                </tbody>
            </table>
            <div class="btn clearfix">
                <p class="save">保存</p>
                <p class="cancel">取消</p>
            </div>
            <div id="test1" class="clearfix"></div>
        </div>
    </div>
</div>
<div class="shade"></div>
<div class="lr_tc">
    <p class="lr_title">手动录入</p>
    <div class="lr_ipt">
        <form action="" >
        <div class="lr_row clearfix">
            <p class="lr_l">种类：</p>
            <p class="lr_r">
                <select name="" id="kind">
                    <option value="2">冬装</option>
                </select>
            </p>
        </div>
        <div class="lr_row clearfix">
            <p class="lr_l">买家：</p>
            <p class="lr_r">
                <input type="text" name="" id="buyer" value="" />
            </p>
        </div>
        <div class="lr_row clearfix">
            <p class="lr_l">联系方式：</p>
            <p class="lr_r">
                <input type="text" name=""  value="" id="phone"/>
            </p>
        </div>
        <div class="lr_row clearfix">
            <p class="lr_l">时间：</p>
            <p class="lr_r">
                <input type="text" class="layui-input" id="test2" />
            </p>
        </div>
        <div class="lr_row clearfix">
            <p class="lr_l">重量：</p>
            <p class="lr_r">
                <input type="text" name="" id="weight" value="" />KG
            </p>
        </div>
        <div class="lr_row clearfix">
            <p class="lr_l">价格：</p>
            <p class="lr_r">
                <input type="text" name="" id="money" value="" />RMB
            </p>
        </div>
        <div class="lr_row clearfix">
            <p class="lr_l">备注：</p>
            <p class="lr_r">
                <input type="text" name="" id="remark" value="" />
            </p>
        </div>
        <div class="lr_btn clearfix">
            <p class="lr_ok">确定</p>
            <p class="lr_cancel">取消</p>
        </div>
        </form>
    </div>
</div>
<script src="resource/js/layui.all.js"></script>
<script src="resource/js/public.js"></script>
<script src="resource/js/qz_sj.js"></script>
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

    //			弹窗
    $('.lr').click(function(){
        $('.shade').show();
        $('.lr_tc').show();
    })
    function hide(){
        $('.shade').hide();
        $('.lr_tc').hide();
    }
    $('.lr_ok').click(function(){
        let type = $('#kind').find('option:selected').val();
        let buyer = $('#buyer').val();
        let phone = $('#phone').val();
        let text2 = $('#test2').val();
        let weight = $('#weight').val();
        let money = $('#money').val();
        let remark = $('#remark').val();
        $.ajax({
            url:"qs_add",
            type:"Post",
            data:{clothes_type:type,name:buyer,phone_number:phone,buy_time:text2,weight:weight,price:money,remark:remark},
            success:function(data){
               var str = '<tr>';
               str += '<td>1</td>\n' +
                   '   <td>'+data.clothes_type+'</td>\n' +
                   '   <td>'+data.name+'</td>\n' +
                   '   <td>'+data.phone_number+'</td>\n' +
                   '   <td>'+data.buy_time+'</td>\n' +
                   '   <td>'+data.remark+'</td>\n' +
                   '   <td>'+data.weight+'KG</td>\n' +
                   '   <td>'+data.price+'</td>';
               str += '<tr/>';
               $('#table').append(str);
            },
            error:function(){

            }
        })
        hide()
    })
    $('.lr_cancel').click(function(){
        hide()
    })
</script>
<script type="text/javascript">

</script>
</body>
</html>
