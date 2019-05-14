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
	$(this).html('已确认').css({'color':'#666'});
})

