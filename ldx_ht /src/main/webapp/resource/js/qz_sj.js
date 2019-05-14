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
            for (var i = yearNow; i >= 1990; i--) {
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

//表1
var app = echarts.init(document.getElementById('biao1'));
//app.title = '多 X 轴示例';
var colors = ['#5793f3', '#d14a61', '#675bba'];
var option = {
    color: colors,
    tooltip: {
        trigger: 'none',
        axisPointer: {
            type: 'cross'
        }
    },
    legend: {
        data:['2015 降水量', '2016 降水量']
    },
    grid: {
        top: 70,
        bottom: 50
    },
    xAxis: [
        {
            type: 'category',
            axisTick: {
                alignWithLabel: true
            },
            axisLine: {
                onZero: false,
                lineStyle: {
                    color: colors[1]
                }
            },
            axisPointer: {
                label: {
                    formatter: function (params) {
//                      return '降水  ' + params.value
//                          + (params.seriesData.length ? '：' + params.seriesData[0].data : '');
                    }
                }
            },
            data: ["0:00", "2:00", "4:00", "6:00", "8:00", "10:00", "12:00", "14:00", "16:00", "18:00", "20:00", "22:00","24:00"]
        },
        {
            type: 'category',
            axisTick: {
                alignWithLabel: true
            },
            axisLine: {
                onZero: false,
                lineStyle: {
                    color: colors[0]
                }
            },
            axisPointer: {
                label: {
                    formatter: function (params) {
                        return '降水量  ' + params.value
                            + (params.seriesData.length ? '：' + params.seriesData[0].data : '');
                    }
                }
            },
//          data: ["2015-1", "2015-2", "2015-3", "2015-4", "2015-5", "2015-6", "2015-7", "2015-8", "2015-9", "2015-10", "2015-11", "2015-12"]
        }
    ],
    yAxis: [
        {
            type: 'value'
        }
    ],
    series: [
        {
            name:'总发布用户数',
            type:'line',
            xAxisIndex: 1,
            smooth: true,
            data: [26, 59, 90, 26, 128, 70, 175, 182, 448, 18, 6, 2]
        },
        {
            name:'总活跃用户数',
            type:'line',
            smooth: true,
            data: [39, 59, 111, 187, 48, 69, 431, 46, 55, 184, 103, 7]
        },
        {
            name:'日活跃用户数',
            type:'line',
            smooth: true,
            data: [139, 25, 61, 98, 68, 79, 331, 146, 155, 68, 50, 20]
        }
    ]
};
 app.setOption(option);
 
//表2
var biao2 = echarts.init(document.getElementById('biao2'));

app.title = '坐标轴刻度与标签对齐';

var option2 = {
    color: ['#3398DB'],
    tooltip : {
        trigger: 'axis',
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
            data : ['0-1分钟', '1-5分钟', '5-10分钟', '10-20分钟', '20-30分钟', '30-60分钟', '>60分钟'],
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
            data:[50, 52, 200, 334, 390, 330, 220]
        }
    ]
};
// 使用刚指定的配置项和数据显示图表。
biao2.setOption(option2);

//表3
var biao3 = echarts.init(document.getElementById('biao3'));
var option3 = {
    title : {
        text: '',
        subtext: '',
        x:'center'
    },
    tooltip : {
        trigger: 'item',
        formatter: "{a} <br/>{b} :  {d}%"
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
                {value:30, name:'iphone6',itemStyle:{color:'#ff524e'}},
                {value:10, name:'其他',itemStyle:{color:'#4db8ec'}},
                {value:20, name:'三星',itemStyle:{color:'#4cd1ee'}},
                {value:30, name:'魅族',itemStyle:{color:'#1581ff'}},
                {value:30, name:'中兴',itemStyle:{color:'#496bb5'}}
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
biao3.setOption(option3);