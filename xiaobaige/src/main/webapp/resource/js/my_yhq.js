
//切换
$('.nav div').on('touchstart',function(){
	$('.nav div').removeClass('nav_active');
	$(this).addClass('nav_active');
	var val = $(this).attr('value');
	if(val==1){
        var number = $('.valid').attr('id');
        if(number==1){
            $('#null').show();
            $('.invalid').hide();
            $('.valid').hide();
        }else {
            $('#null').hide();
            $('.invalid').hide();
            $('.valid').show();
        }
	}else if(val ==2 ){

        var number = $('.invalid').attr('id');
        if(number==1){
            $('#null').show();
            $('.invalid').hide();
            $('.valid').hide();
        }else {
            $('#null').hide();
            $('.invalid').show();
            $('.valid').hide();
        }

	}
})
/*判断上下滑动：*/
 $(document).on('touchstart','.row_active',function(e){
        startX = e.originalEvent.changedTouches[0].pageX;
        startY = e.originalEvent.changedTouches[0].pageY;
    });
    $(document).on("touchmove",'.row_active',function(e){
        //获取滑动屏幕时的X,Y
        endX = e.originalEvent.changedTouches[0].pageX;
        endY = e.originalEvent.changedTouches[0].pageY;
        //获取滑动距离
        distanceX = endX-startX;
        distanceY = endY-startY;
        //判断滑动方向
        if(Math.abs(distanceX)>Math.abs(distanceY) && distanceX>0){
            console.log('往右滑动');
//          $(this).animate({'left':'0px'},200)
            $(this).css({'left':'0px'});
            $(this).find('.del').css({'right':'0px'})
            
        }else if(Math.abs(distanceX)>Math.abs(distanceY) && distanceX<0){
            console.log('往左滑动');
//          $(this).animate({'left':'-60px'},200)
            $(this).css({'left':'-60px'});
            $(this).find('.del').css({'right':'-60px'})
			
        }else
        if(Math.abs(distanceX)<Math.abs(distanceY) && distanceY<0){
            console.log('往上滑动');
        } else if(Math.abs(distanceX)<Math.abs(distanceY) && distanceY>0){
            console.log('往下滑动');

        }
    })
//删除操作
$('.del').on('touchstart',function(){
	$(this).parent().remove();
})
