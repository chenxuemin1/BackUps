//左侧导航
$('.nav_row').click(function(){
	if($(this).find('.hide_box').is(':hidden')){
		$(this).find('.hide_box').show();
		$(this).find('.open').html('-');
		
	}else{
		$(this).find('.hide_box').hide();
		$(this).find('.open').html('+');
		
	}


})

$('.left_active_c').parents('.nav_row').find('.open').html('-')

var h = $(window).height();
$('#main').height(h);
$('#right').height(h-114);
$('#left').height(h-114);
