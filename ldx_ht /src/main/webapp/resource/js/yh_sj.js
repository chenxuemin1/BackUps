$(function () {
    $.ms_DatePicker({
        YearSelector: ".sel_year",
        MonthSelector: ".sel_month",
        DaySelector: ".sel_day"
    });
});
(function($){
    $.extend({
        ms_DatePicker: function (options) {
            var defaults = {
                YearSelector: "#sel_year",
                MonthSelector: "#sel_month",
                DaySelector: "#sel_day",
                FirstText: "--",
                FirstValue: 0
            };
            var opts = $.extend({}, defaults, options);
            var $YearSelector = $(opts.YearSelector);
            var $MonthSelector = $(opts.MonthSelector);
            var $DaySelector = $(opts.DaySelector);
            var FirstText = opts.FirstText;
            var FirstValue = opts.FirstValue;

            // 初始化
            var str = "<option value=\"" + FirstValue + "\">"+FirstText+"</option>";
            $YearSelector.html(str);
            $MonthSelector.html(str);
            $DaySelector.html(str);

            // 年份列表
            var yearNow = new Date().getFullYear();
            var yearSel = $YearSelector.attr("rel");
            for (var i = yearNow; i >= 1900; i--) {
                var sed = yearSel==i?"selected":"";
                var yearStr = "<option value=\"" + i + "\" " + sed+">"+i+"</option>";
                $YearSelector.append(yearStr);
            }

            // 月份列表
            var monthSel = $MonthSelector.attr("rel");
            for (var i = 1; i <= 12; i++) {
                var sed = monthSel==i?"selected":"";
                var monthStr = "<option value=\"" + i + "\" "+sed+">"+i+"</option>";
                $MonthSelector.append(monthStr);
            }

            // 日列表(仅当选择了年月)
            function BuildDay() {
                if ($YearSelector.val() == 0 || $MonthSelector.val() == 0) {
                    // 未选择年份或者月份
                    $DaySelector.html(str);
                } else {
                    $DaySelector.html(str);
                    var year = parseInt($YearSelector.val());
                    var month = parseInt($MonthSelector.val());
                    var dayCount = 0;
                    switch (month) {
                        case 1:
                        case 3:
                        case 5:
                        case 7:
                        case 8:
                        case 10:
                        case 12:
                            dayCount = 31;
                            break;
                        case 4:
                        case 6:
                        case 9:
                        case 11:
                            dayCount = 30;
                            break;
                        case 2:
                            dayCount = 28;
                            if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
                                dayCount = 29;
                            }
                            break;
                        default:
                            break;
                    }

                    var daySel = $DaySelector.attr("rel");
                    for (var i = 1; i <= dayCount; i++) {
                        var sed = daySel==i?"selected":"";
                        var dayStr = "<option value=\"" + i + "\" "+sed+">" + i + "</option>";
                        $DaySelector.append(dayStr);
                    }
                }
            }
            $MonthSelector.change(function () {
                BuildDay();
            });
            $YearSelector.change(function () {
                BuildDay();
            });
            if($DaySelector.attr("rel")!=""){
                BuildDay();
            }
        } // End ms_DatePicker
    });
})(jQuery);

//时间选择
$('.choose li').click(function(){
	$('.choose li').css({'backgroundColor':'#fff','color':'#29ade1'})
	
	$(this).css({'backgroundColor':'#29ade1','color':'#fff'})

	
})

//表1
var biao1 = echarts.init(document.getElementById('biao1'));

//biao1.title = '坐标轴刻度与标签对齐';

var option1 = {
    color: ['#3398DB'],
    tooltip : {
        trigger: '',
        axisPointer : {            // 坐标轴指示器，坐标轴触发有效
            type : 'shadow'        // 默认为直线，可选为：'line' | 'shadow'
        }
    },
    grid: {
        left: '3%',
        right: '4%',
        bottom: '3%',
        containLabel: true
    },
    xAxis : [
        {
            type : 'category',
            data : ['用户数', '总反馈金额', '优惠券派发数', '下单次数'],
            axisTick: {
                alignWithLabel: true
            }
        }
    ],
    yAxis : [
        {
            type : 'value'
        }
    ],
    series : [
        {
            name:'',
            type:'bar',
            barWidth: '60%',
            data:[50, 52, 200, 334],
            barWidth : 30
        }
    ]
};
// 使用刚指定的配置项和数据显示图表。
biao1.setOption(option1);

//表2
var biao2 = echarts.init(document.getElementById('biao2'));
var option2 = {
    title : {
        text: '',
        subtext: '',
        x:'center'
    },
    tooltip : {
        trigger: '',
        formatter: "{a} <br/>{b} : {c} ({d}%)"
    },
    legend: {
        orient: 'vertical',
        left: 'left',
        data: ['直接访问','邮件营销','联盟广告','视频广告','搜索引擎']
    },
    series : [
        {
            name: '',
            type: 'pie',
            radius : '55%',
            center: ['50%', '60%'],
            data:[
                {value:25, name:'25% pc端',itemStyle:{color:'#ffc025'}},
                {value:75, name:'75% 手机端',itemStyle:{color:'#5dc7f0'}}

            ],
            itemStyle: {
                emphasis: {
                    shadowBlur: 10,
                    shadowOffsetX: 0,
                    shadowColor: 'rgba(0, 0, 0, 0.5)'
                }
            }
        }
    ]
};
biao2.setOption(option2);

//表3
var biao3 = echarts.init(document.getElementById('biao3'));
//app.title = '环形图';

var option3 = {
    tooltip: {
        trigger: '',
        formatter: "{a} <br/>{b}: {c} ({d}%)"
    },
    legend: {
        orient: 'vertical',
        x: 'left',
        data:['30% 直接关注','70% 其他']
    },
    series: [
        {
            name:'',
            type:'pie',
            radius: ['50%', '70%'],
            avoidLabelOverlap: false,
            label: {
                normal: {
                    show: false,
                    position: 'center'
                },
                emphasis: {
                    show: true,
                    textStyle: {
                        fontSize: '30',
                        fontWeight: 'bold'
                    }
                }
            },
            labelLine: {
                normal: {
                    show: false
                }
            },
            data:[
                {value:30, name:'30% 直接关注',itemStyle:{color:'#ffc025'}},
                {value:70, name:'70% 其他',itemStyle:{color:'#5dc7f0'}}

            ]
        }
    ]
};
biao3.setOption(option3);

//表4
var biao4 = echarts.init(document.getElementById('biao4'));
var option4 = {
    title : {
        text: '',
        subtext: '',
        x:'center'
    },
    tooltip : {
        trigger: '',
        formatter: "{a} <br/>{b} : {c} ({d}%)"
    },
    legend: {
        orient: 'vertical',
        left: 'left',
        data: ['直接访问','邮件营销','联盟广告','视频广告','搜索引擎']
    },
    series : [
        {
            name: '',
            type: 'pie',
            radius : '55%',
            center: ['50%', '60%'],
            data:[
                {value:20, name:'20% 湖北',itemStyle:{color:'#ffc025'}},
                {value:70, name:'70% 浙江',itemStyle:{color:'#5dc7f0'}},
                {value:10, name:'10% 广东',itemStyle:{color:'#ff9c87'}},

            ],
            itemStyle: {
                emphasis: {
                    shadowBlur: 10,
                    shadowOffsetX: 0,
                    shadowColor: 'rgba(0, 0, 0, 0.5)'
                }
            }
        }
    ]
};
biao4.setOption(option4);

//表5
var biao5 = echarts.init(document.getElementById('biao5'));
//app.title = '环形图';

var option5 = {
    tooltip: {
        trigger: '',
        formatter: "{a} <br/>{b}: {c} ({d}%)"
    },
    legend: {
        orient: 'vertical',
        x: 'left',
        data:['25% 圆通','75% 中通']
    },
    series: [
        {
            name:'',
            type:'pie',
            radius: ['50%', '70%'],
            avoidLabelOverlap: false,
            label: {
                normal: {
                    show: false,
                    position: 'center'
                },
                emphasis: {
                    show: true,
                    textStyle: {
                        fontSize: '30',
                        fontWeight: 'bold'
                    }
                }
            },
            labelLine: {
                normal: {
                    show: false
                }
            },
            data:[
                {value:25, name:'25% 圆通',itemStyle:{color:'#ffc025'}},
                {value:75, name:'75% 中通',itemStyle:{color:'#5dc7f0'}}
            ]
        }
    ]
};
biao5.setOption(option5);