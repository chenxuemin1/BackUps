$('.title').on('touchstart',function(){
	if($(this).next().is(':hidden')){
		$(this).css({'background':'#ffc019','color':'#fff'}).next().show(200);
		$(this).find('.title_right').hide();
	}else{
		$(this).css({'background':'#fff','color':'#676767'}).next().hide(200);
		$(this).find('.title_right').show();
		
	}

})