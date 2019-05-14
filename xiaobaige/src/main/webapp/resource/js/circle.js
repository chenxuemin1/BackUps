//点赞
// $('.bottom_data ul li')
$('.bottom_data ul li').on('touchstart',function(){
	if($(this).find('.img_active').is(':hidden')){
		$(this).find('.img_active').show();

        // var num = $(this).find('.num').html();
        // var iNum = parseInt(num);
        // $(this).find('.num').html(iNum+1);
        var num = $(this).find('.num').html();
        // alert("点赞的数量:"+num);
        var iNum = parseInt(num);
        $(this).find('.num').html(iNum+1);
		var say_id = $(this).find('.num').attr('id');
		// alert("说说ididid:"+say_id);
        $.ajax({
            url:"up",
            type:"Post",
            async:true,
            data:{say_id:say_id},
            success:function(text){
                // alert("text:"+text);
                if(text==1){
                    alert("你已经点赞过了");
                }else {
                    // alert("点赞的数量："+num);
                    // var z_num = $(this).find('#'+say_id+'').val();
                    // alert(z_num);
                    // $('#'+say_id+'').attr('value',z_num+1);

                }
            }

        })

	}
	// else{
//		$(this).find('.img_active').hide();
//		var num = $(this).find('.num').html();
//		var iNum = parseInt(num);
//		$(this).find('.num').html(iNum-1)
// 	}
})
//搜索框
$('.top_1').on('touchstart',function(){
	$('.top_2').show();
})
//关注
$('.gz').on('touchstart',function(){
	if($(this).find('.gz_active').is(':hidden')){

		$(this).find('.gz_active').show();
        // $(this).find('.gz_span2').html('已关注').css({'color':'#ffc019'});

        let openid = $(this).find(".gz_span2").attr('id');
        // $(this).find(".gz_span2").hide();
        // alert(openid);
        $.ajax({
            type:"Post",
            async:true,
            url:"gz",
            data:{be_openid:openid},
            success:function(text){
                // alert(text);
                if(text==1){
                    alert("你已经关注过了");
                }else {
                    $(this).find('.gz_span2').html('已关注').css({'color':'#ffc019'});
                }
            }
        });

	}else{

        let openid = $(this).find(".gz_span2").attr('id');
        // $(this).find(".gz_span2").hide();
        $.ajax({
            type:"Post",
            async:true,
            url:"gz_qx",
            data:{be_openid:openid}
        });

		$(this).find('.gz_active').hide();
		$(this).find('.gz_span2').html('关注').css({'color':'#adadad'});
	}

})


//控件显示隐藏
$('.pz').on('touchstart',function(){
	$('.fb').toggle(200);
	$('.pl').toggle(200);
	
})
// 评论页面
// function comment(){
// 	// var id = $('.row').attr("id");
//     var id = $(this).find('.z').attr('id');
// 	$.ajax({
// 		type:'Post',
// 		url:"pl_page",
// 		date:{id:id},
//      async:false
//
// 	})
// }

// $('.bottom_data ul li')
// $('.bottom_data ul li').on('touchstart',function() {

$('.pl_list').on('click',function(){
    var say_id = $(this).find('.z').attr('id');
    // alert("说说id："+say_id);
    $.ajax({
        type:'Post',
        url:"pl_page",
        async:false,
        data: {id:say_id},
        success:function(text){
            // alert(text);
            document.write(text);
        }

    })
})


// 搜索(my)
$('#query_my').on('click',function(){

	let message = $('.seek').val();

	$.ajax({
		type:'Post',
		url:'my_fb_query',
		data:{message:message},
		success:function (saylist) {

		    document.write(saylist);

        //     var $div=$('.section');
        //     var html='';
        //
        //     if(saylist.length>0) {
        //         saylist.forEach(function (s) {
        //
        //             html += '<div class="section" id="' + s.id +'">';
        //             html += '<div class="name clearfix">';
        //             html += '<span class="touxiang"><img src="resource/img/touxiang.png" alt="" /></span>';
        //             html += '<span class="nickname">' + s.man_nickname +'</span>';
        //             html += '</div>';
        //             html += '<p class="text">' + s.say_message +'</p>';
        //             html += '<div class="photo ">';
        //             html += '<ul class="clearfix">';
        //             html += '<li>';
        //             html += '<img src="' + s.photo_loca1 +'" alt="" />';
        //             html += '</li>';
        //             html += '<li>';
        //             html += '<img src="' + s.photo_loca2 +'" alt="" />';
        //             html += '</li>';
        //             html += '<li>';
        //             html += '<img src="' + s.photo_loca3 +'" alt="" />';
        //             html += '</li>';
        //             html += '</ul>';
        //             html += '</div>';
        //             html += '<div class="bottom_data clearfix">';
        //             html += '<p class="time">' + s.public_time +'</p>';
        //             html += '<ul>';
        //             html += '<li>';
        //             html += '<span>';
        //             html += '<img src="resource/img/circle_z_1.png" alt="" />';
        //             html += '<img class="img_active" src="resource/img/circle_z.png" alt="" />';
        //             html += '</span>';
        //             html += '<span class="num">' + s.up_number +'</span>';
        //             html += '</li>';
        //             html += '<li>';
        //             html += '<span>';
        //             html += '<img src="resource/img/circle_p.png" alt="" />';
        //             html += '</span>';
        //             html += '<span>99</span>';
        //             html += '</li>';
        //             html += '</ul>';
        //             html += '</div>';
        //             html += '</div>';
        //
        //         });
        //         $div.html(html);
        //
        //     }else{
        //
			// }
        },

		error:function(){

		}
	})

})


// 搜索(gz)
$('#query_gz').on('click',function(){

    let message = $('.seek').val();


    $.ajax({
        type:'Post',
        url:'gz_fb_query',
        data:{message:message},
        success:function (saylist) {

        	alert(saylist);

        	document.write(saylist);

        	re
            // var $div=$('.section');
            // var html='';
            //
            // if(saylist.length>0) {
            //     saylist.forEach(function (s) {
            //
            //         html += '<div class="section" id="' + s.id +'">';
            //         html += '<div class="name clearfix">';
            //         html += '<span class="touxiang"><img src="resource/img/touxiang.png" alt="" /></span>';
            //         html += '<span class="nickname">' + s.man_nickname +'</span>';
            //         html += '</div>';
            //         html += '<p class="text">' + s.say_message +'</p>';
            //         html += '<div class="photo ">';
            //         html += '<ul class="clearfix">';
            //         html += '<li>';
            //         html += '<img src="' + s.photo_loca1 +'" alt="" />';
            //         html += '</li>';
            //         html += '<li>';
            //         html += '<img src="' + s.photo_loca2 +'" alt="" />';
            //         html += '</li>';
            //         html += '<li>';
            //         html += '<img src="' + s.photo_loca3 +'" alt="" />';
            //         html += '</li>';
            //         html += '</ul>';
            //         html += '</div>';
            //         html += '<div class="bottom_data clearfix">';
            //         html += '<p class="time">' + s.public_time +'</p>';
            //         html += '<ul>';
            //         html += '<li>';
            //         html += '<span>';
            //         html += '<img src="resource/img/circle_z_1.png" alt="" />';
            //         html += '<img class="img_active" src="resource/img/circle_z.png" alt="" />';
            //         html += '</span>';
            //         html += '<span class="num">' + s.up_number +'</span>';
            //         html += '</li>';
            //         html += '<li>';
            //         html += '<span>';
            //         html += '<img src="resource/img/circle_p.png" alt="" />';
            //         html += '</span>';
            //         html += '<span>99</span>';
            //         html += '</li>';
            //         html += '</ul>';
            //         html += '</div>';
            //         html += '</div>';
            //
            //     });
            //     $div.html(html);
            //
            // }else{
            //
            // }
        },

        error:function(){

        }
    })

})

