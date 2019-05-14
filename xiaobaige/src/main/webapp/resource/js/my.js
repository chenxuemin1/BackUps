// 我的捐赠
function myjz(){
    $.ajax({
        type:"Post",
        url:"my_jz",
        async:false
    })
}
// 我的优惠券
function myyhq(){
    $.ajax({
        type:"Post",
        url:"my_yhq"
    })
}
// 我的号召力
function mycall(){
    $.ajax({
        type:"Post",
        url:"my_call"
    })
}
// 我的等级
function mygrade(){
    $.ajax({
        type:"Post",
        url:"my_grade"
    })
}
// 我的系统消息
function mynews(){
    $.ajax({
        type:"Post",
        url:"my_news"
    })
}
// 我的物流信息
// function express_info(){
//     var express_number = $(this).attr('id');
//     $.ajax({
//         url:"logistics",
//         type:"Post",
//         data:{express_number:express_number}
//     })
// }

// 我内容页面
$('#null').hide();

// function up(){
//     let id = $("div").attr(id);
//     $.ajax({
//         type:"GET",
//         dataType:"TEXT",
//         async:true,
//         url:"/up",
//         data:{id:id},
//         success:function(result){
//             $(this).find('.num').text(result);
//             // attr("span",result);
//         }
//     })
// }