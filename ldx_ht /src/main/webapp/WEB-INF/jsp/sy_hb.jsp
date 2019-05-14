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
    <title>首页海报</title>
    <link rel="stylesheet" href="resource/css/public.css" />
    <link rel="stylesheet" href="resource/css/hb.css" />
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
                    <div class="row_l">物流补贴</div>
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
        <div class="nav_row left_active">
            <div class="black"></div>
            <div class="nav_box clearfix ">
                <div class="row_l ">内容修改</div>
                <div class="row_r open">+</div>
            </div>
            <a href="sy_hb">
                <div class="nav_box hide_box clearfix left_active_c">
                    <div class="row_l ">首页海报</div>
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
        <div id="content">
            <div class="section">
                <p class="s_title">首页 >  海报1</p>
                <div class="s_box clearfix">
                    <div class="s_l">
                        <img src="http://www.xiaomingtuan.com/xiaobaige/resource/img/sy_hb1.png" alt="" />
                        <div class="del">x</div>
                    </div>

                    <div class="s_r">
                        <div class="s_r_t">
                            <p class="change_img">
                                +
                                <input type="file"  class="file" id="sy_hb1"/>
                            </p>
                            <p class="s_p1">点击更换图片</p>
                            <p class="s_p2">当前图片大于2M，无法更换</p>
                        </div>
                        <div class="ok" >确定更换</div>
                    </div>

                </div>
            </div>
            <div class="section">
                <p class="s_title">首页 >  海报2</p>
                <div class="s_box clearfix">
                    <div class="s_l">
                        <img src="http://www.xiaomingtuan.com/xiaobaige/resource/img/sy_hb2.png" alt="" />
                        <div class="del">x</div>
                    </div>

                    <div class="s_r">
                        <div class="s_r_t">
                            <p class="change_img">
                                +
                                <input type="file"  class="file" id="sy_hb2"/>
                            </p>
                            <p class="s_p1">点击更换图片</p>
                            <p class="s_p2">当前图片大于2M，无法更换</p>
                        </div>
                        <div class="ok" >确定更换</div>
                    </div>

                </div>
            </div>
            <div class="section">
                <p class="s_title">首页 >  海报3</p>
                <div class="s_box clearfix">
                    <div class="s_l">
                        <img src="http://www.xiaomingtuan.com/xiaobaige/resource/img/sy_hb3.png" alt="" />
                        <div class="del">x</div>
                    </div>

                    <div class="s_r">
                        <div class="s_r_t">
                            <p class="change_img">
                                +
                                <input type="file"  class="file" id="sy_hb3"/>
                            </p>
                            <p class="s_p1">点击更换图片</p>
                            <p class="s_p2">当前图片大于2M，无法更换</p>
                        </div>
                        <div class="ok">确定更换</div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<script src="resource/js/public.js"></script>
<script type="text/javascript">

    $('.ok').on('click',function(){
        var a = $(this);
        sub(a);
    });

    function sub(param)
    {
        var formdata = new FormData();
        let filename = param.parent().find('.file').attr('id');
        let file = $('#'+filename+'')[0].files[0];
        console.log(filename);
        console.log(file);
        if(file==null){
            alert("请先选择海报");
        }else {
            formdata.append("filename", filename);
            formdata.append("file", $('#'+filename+'')[0].files[0]);

            $.ajax({
                url: "gh_sy",
                type: "Post",
                async: false,
                cache: false,
                contentType: false,
                processData: false,
                data: formdata,
                success:function(test){
                    alert("替换成功");
                }
            });
        }


    }

</script>
</body>
</html>
