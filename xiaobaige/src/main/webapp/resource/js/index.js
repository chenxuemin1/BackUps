//头部搜索框显示隐藏
$('.seek').on('touchstart',function(){
	$('.top_2').show();
})
$(document).scroll(function(){
	$('.top_2').hide();
	
})
//兼容调整样式 捐赠达人宽度
for(var i = 0;i<$('.s6_l').length;i++){
	$('.s6_l').eq(i).height($('.s6_l').eq(i).parent().height())
}
function wid_change(){
	var w = $(window).width();
	if(w>374){
		$('.photo').width('40%');
	}else if(w<350){
		$('.photo').width('30%');
		
	}
}
wid_change();
$(window).resize(function(){
	wid_change();
	
})
