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
    <title>物流补贴</title>
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
        <div class="nav_row left_active">
            <div class="black"></div>
            <a href="wlbt">
                <div class="nav_box clearfix left_active_c">
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
            <p class="right_title">后台 》 物流补贴</p>
            <div class="top_seek">
                <form action="" id="form">
                <ul class="clearfix">
                    <li>按用户名搜索：<input type="text" class="name"/></li>
                    <li>按快递单号搜索：<input type="text" class="express_number"/></li>
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
                    <th>快递单号</th>
                    <th>姓名</th>
                    <th>下单时间</th>
                    <th>输入重量</th>
                    <th>确认重量</th>
                    <th>返赠金额</th>
                    <th>当前状态</th>
                    <th>备注</th>
                    <th>操作</th>
                </tr>
                </thead>
                <tbody id="table">
                <c:forEach items="${list}" var="l">
                <tr>
                    <td>${l.express_number}</td>
                    <td>${l.name}</td>
                    <td>${l.time}</td>
                    <td>${l.weight} KG</td>
                    <td class="w">
                        <input type="text" placeholder="请输入.." class="weight" />
                    </td>
                    <td class="p">
                        <input type="text" placeholder="请输入.."  class="price"/>
                    </td>
                    <td>
                        <select name="" id="">
                            <option value="已返赠">已返赠</option>
                            <option value="未返赠">未返赠</option>
                            <option value="异常">异常</option>
                        </select>
                    </td>
                    <td>
                        <input  type="text" placeholder="请输入内容..." class="remark"/>
                    </td>
                    <td>
                        <p class="affirm" id="${l.id}">
                            确认
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


    //状态选择
    $('select').change(function(){
        if($(this).val()=='异常'){
            $(this).css({'color':'red'})
        }else{
            $(this).css({'color':'#666'})

        }
    })
    //操作
    $('.affirm').click(function(){
        let id = $(this).attr('id');
        let weight = $(this).parent().parent().find('.weight').val();
        let price = $(this).parent().parent().find('.price').val();
        let remark = $(this).parent().parent().find('.remark').val();
        let state = $('.state').find('option:selected').val();

        if(weight==""||price==""){
            alert("请确认重量和反赠金额");
        }else {
            $.ajax({
                url:"wlbt_edit",
                type:"Post",
                data:{id:id,confim_weight:weight,back_money:price,state:state,remark:remark}
//                success:function(){
//
//                },
//                error:function(){
//
//                }

            })
            $(this).html('已确认').css({'color':'#666'});

        }


    })
</script>
<script type="text/javascript">
    function sub() {
        let account = $('.name').val();
        let express_number = $('.express_number').val();
        alert(account);
        alert(express_number);
        if (account != "" || express_number != "") {
            alert(account + "============" + express_number);
            $.ajax({
                url: "sub",
                type: "Post",
//                dataType:"json",
                data: {name: account, express_number: express_number},
                success: function (data) {
                    alert("成功");
//                    console.log(data);
//                    $.each(data, function (name, value) {
//                        console.log(name);
//                        console.log(value);
//                    })
//                    alert(data);
                    $('#table').html("");
                    for (var i=0;data.length>i;i++){
                        var str = "<tr>";
                        str +='<td>'+data[i].express_number+'</td>\n' +
                            '                    <td>'+data[i].name+'</td>\n' +
                            '                    <td>'+data[i].time+'</td>\n' +
                            '                    <td>'+data[i].weight+'KG</td>\n' +
                            '                    <td class="w">\n' +
                            '                        <input type="text" placeholder="请输入.." class="weight" value="'+data[i].confim_weight+'"/>\n' +
                            '                    </td>\n' +
                            '                    <td class="p">\n' +
                            '                        <input type="text" placeholder="请输入.."  class="price" value="'+data[i].back_money+'"/>\n' +
                            '                    </td>\n' +
                            '                    <td>\n' +
                            '                        <select name="" id="" selected="'+data[i].state+'">\n' +
                            '                            <option value="1">已返赠</option>\n' +
                            '                            <option value="0">未返赠</option>\n' +
                            '                            <option value="-1">异常</option>\n' +
                            '                        </select>\n' +
                            '                    </td>\n' +
                            '                    <td>\n' +
                            '                        <input  type="text" placeholder="请输入内容..." class="remark" value="'+data[i].remark+'"/>\n' +
                            '                    </td>\n' +
                            '                    <td>\n' +
                            '                        <p class="affirm" id="'+data[i].id+'">\n' +
                            '                            确认\n' +
                            '                            <span></span>\n' +
                            '                        </p>\n' +
                            '                    </td>';
                        str += "<tr/>";
                        $('#table').append(str);

                    }


                },
                error: function () {
                    alert("失败");
                }
            })

        } else {

        }
    }


</script>
</body>
</html>
