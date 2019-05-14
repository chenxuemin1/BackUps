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
    <title>登录页</title>
    <link rel="stylesheet" href="resource/css/public.css" />
    <link rel="stylesheet" href="resource/css/index.css" />
    <script SRC="resource/js/jquery-3.3.1.min.js"></script>
</head>
<body>
<div id="main">
    <div id="content">
        <div id="bg"></div>
        <p class="title">小白鸽后台登陆</p>
        <form action="">
            <div class="row">
                <input type="text" placeholder="请输入账号" class="account"/>
                <img src="resource/img/dl_1.png" alt="" />
            </div>
            <div class="row">
                <input type="password" placeholder="请输入密码" class="password"/>
                <img src="resource/img/dl_2.png" alt="" style="top:14px;"/>
            </div>
            <div class="row">
                <input type="button" value="登陆"  onclick="sub()"/>
            </div>
            <div class="row jzmm">
                <input type="checkbox"  />
                记住密码
            </div>
        </form>
    </div>
</div>
<script type="text/javascript">
    function sub(){
        if($('.account').val()==""){
            alert("账号不能为空");
            return false;
        }else {
            if($('.password').val()==""){
                alert("密码不能为空");
                return false;
            }
        }
        let account = $('.account').val();
        let password = $('.password').val();

//            alert(account+"---"+password);

        $.ajax({
            url:"proving",
            type:"Post",
//                dataType:"text",
            data:{account:account,password:password},
            success:function(data){
//                alert(data);
                if(data==1){
//                    alert("成功"+data);
                    window.location.href = "wlbt";
                }else {
                    alert("账号或密码错误");
                }


            }
        })

    }
</script>
</body>
</html>
