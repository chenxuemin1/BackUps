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

//			全选
$("[name='allSel']").click(function(){
    if($(this).is(':checked')){
        $("[name='select']").attr('checked',true);
    }else{
        $("[name='select']").attr('checked',false);
    }
})
$("[name='select']").click(function(){
	
    var allSel = false;
    $("[name='select']").each(function(){
        if(!$(this).is(':checked')){
            allSel = true;
        }
    })
    if(allSel){
        $("[name='allSel']").attr('checked',false);
    }else{
        $("[name='allSel']").attr('checked',true);
    }
})
//          优惠券
$('.yhq_right').click(function(){
	var box = document.getElementsByClassName('yhq_in')[0];
	var fir = box.getElementsByClassName('yhq_box')[0];
	box.removeChild(fir);
	box.appendChild(fir)
})
$('.yhq_left').click(function(){
	var box = document.getElementsByClassName('yhq_in')[0];
	var fir = box.getElementsByClassName('yhq_box')[0];
	
	var len = box.getElementsByClassName('yhq_box').length;
	
	var last = box.getElementsByClassName('yhq_box')[len-1];
	box.removeChild(last);
	
	box.insertBefore(last,fir);
})
//弹窗
$('.zs').click(function(){
	$('.shade').show();
	$('.tc').show();
})
$('.tc_bottom p').click(function(){
	$('.shade').hide();
	$('.tc').hide();
})
$('.close_2').click(function(){
	$('.shade').hide();
	$('.tc').hide();
})