//触发快递单号弹窗
$('#kd').on('touchstart',function(){
	$('.shade').show();
	$('#kd_popup').show();
})
$('.ok').on('click',function(){
	var kd_name = $('#kd_name').val();
	var kd_number = $('#kd_number').val();
	var kd_zz = /\w+/;
	if(kd_zz.test($('#kd_number').val())){
		$('#kd_num').val(kd_name+''+kd_number);
		$('.shade').hide();
		$('#kd_popup').hide();
    }else{
    	$('.remind_1').html('快递单号格式不正确~')
		remind();
    }
	
})
//适配右侧边距
function s2_p2(){
	var w = $(window).width();
	if(w<350){
		$('.s2_p2').css({'right':'8px'})
	}else{
		$('.s2_p2').css({'right':'15px'})
	}
}
s2_p2();
$(window).resize(function(){
	s2_p2();
})
//以下为表单验证
//公用
function remind(){
	$('.shade').show();
	$('.remind').show();
}
$('.remind_2').click(function(){
	$('.shade').hide();
	$('.remind').hide();
})
//姓名验证
$('#name').blur(function(){
	var val_len = $(this).val().length;
	if(val_len<2 || val_len>6){
		$('.remind_1').html('请输入2-6位字符')
		remind();
		$(this).val('')
	}
})
//手机号验证
$('#number').blur(function(){
	var myreg=/^[1][3,4,5,7,8][0-9]{9}$/;  
    if(myreg.test($('#number').val())){
    }else{
    	$('.remind_1').html('手机号格式不正确哦')
		remind();
		$(this).val('')
    }
})
//重量
$('#weight').blur(function(){
	var myreg= /^[0-9]+([.][0-9]{1}){0,1}$/;  
    if(myreg.test($('#weight').val())){
    }else{
    	$('.remind_1').html('请输入数字并只能保留一位小数')
		remind();
		$(this).val('')
    }
})
//地址验证
$('#city_1').blur(function(){
	var val_len = $(this).val().length;
	if(val_len<2){
		$('.remind_1').html('请输入详细地址')
		remind();
		$(this).val('')
	}
})
//表单验证
function verify(){
	if($('#name').val()=='' || $('#number').val()=='' || $('#city-picker').val()=='' || $('#city_1').val()=='' || $('#kd_num').val()=='' || $('#weight').val()==''){
		$('.remind_1').html('亲，需填写完整才可提交哦')
		remind();
	}else{

        var sender_name = $('#name').val();
        var sender_phone = $('#number').val();
        var city_picker = $('#city-picker').val();
        var minute_loca = $('#city_1').val();
        var express_type = $('#kd_name').val();
        var express_number = $('#kd_number').val();
        var weight = $('#weight').val();
        var remark = $('#remark').val();

        $.ajax({
            type:"Post",
            url:"backclothes/add",
            async:false,
            data:
                {sender_name:sender_name,sender_phone:sender_phone,
                    city_picker:city_picker,minute_loca:minute_loca,
                    express_type:express_type,express_number:express_number,
                    weight:weight,remark:remark},
            success:function (result) {
                console.log(result);
                if(result.code == 200){
                    $('.remind_1').html('登记成功，感谢爱心捐赠！')
                    remind();
                };
            }
        });

	}
	return false;
}