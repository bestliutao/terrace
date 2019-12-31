var jrjqchart = echarts.init(document.getElementById('jrjq'));
var d = new Date();
var year=d.getFullYear();
var moth = d.getFullYear() + "-" + d.getMonth();
var date = d.getFullYear() + "-" + (d.getMonth() + 1) + "-" + d.getDate();

//所内人数分析
$.get("/police/inSideChange", {
}, function(date) {
    if(date.status == 200) {
    	// console.log(date.data.totalnumber);
       $('#totalNumber').text(date.data.totalnumber);
        $('#entryNumber').text(date.data.entrynumber);
        $('#outNumber').text(date.data.outnumber);
    } else {
        alert("数据为空");
    }
}, 'json')

//今日警情事件（起)
$.get("/police/todayNum", {
	date:date
}, function(date) {
	if(date.status == 200) {
		//var tableData = date.data;
		var col;
		var num = date.data;
		if(num > 0) {
			col = '#df5b6a'
		} else if(num == 0) {
			col = '#21cdcc'
		} else {
			alert('设备状态数据异常');
		}
		var jryj = {
			color: col,
			tooltip: {
				show: false,
				backgroundColor: 'rgba(0,183,238,0.5)',
				trigger: 'item',
				formatter: "{c}"
			},
			graphic: [ {
                    type: 'text',
                    left: 'center',
                    top: '34%',
                    style: {
                        text: num,
                        textAlign: 'center',
                        fill: '#fff',
//                      width: 30,
//                      height: 30,
                        fontSize: 48,
                    }
                }],
			series: [{
				type: 'pie',
				radius: [45, 55],
				center: ['50%', '50%'],
				avoidLabelOverlap: false,
				silent: true,
				label: {
					normal: {
						show: false,
						position: "center",
						formatter: num,
						textStyle: {
							fontSize: 48,
							color: '#fff'
						}
					},
					emphasis: {
						show: false
					}
				},
				lableLine: {
					normal: {
						show: false
					},
					emphasis: {
						show: false
					}
				},
				data: [{
					value: num,
				}]
			}]
		};
		jrjqchart.setOption(jryj);
	} else {
		alert("数据为空");
	}
}, 'json')

var qyfbchart = echarts.init(document.getElementById('qyfb'));
//近7天警情区域分布
$.get("/police/distributionNum", {
	date:date
}, function(date) {
	if(date.status == 200) {
		var tableData = date.data;
        var arr1 = [];
        var arr2 = [];

        for(var i = 0;i<tableData.length;i++){
            arr1.push(tableData[i].title);
            arr2.push(tableData[i].number);
        }
        var max=0;
        for(i=0;i<arr2.length;i++){
            if(parseInt(arr2[i])>parseInt(max)){
                max=arr2[i];
            }
        }

		console.log(max)
		var qyfb = {
			textStyle: {
				color: 'white',
				fontSize: 11
			},

			color: ['rgba(0,183,238,0.5)'],
			tooltip: {
				backgroundColor: 'rgba(0,183,238,0.5)',
				trigger: 'axis',
				axisPointer: { // 坐标轴指示器，坐标轴触发有效
					type: 'shadow' // 默认为直线，可选为：'line' | 'shadow'
				}
			},

			grid: {
				show: true,
				left: 0,
				right: 0,
				top: 10,
				bottom: 0,
				containLabel: true,
			},
			xAxis: [{
				type: 'category',
				data: arr1,
				textStyle: {

					fontSize: 9,
					fontFamily: 'microsoft yahei light',
					fontWeight: 'normal'
				},
				axisLine: {
					show: true,
					lineStyle: {
						color: "#9b959b",

					}
				},
				axisLine: {
					show: true,
					lineStyle: {
						color: "#777777"
					}
				},
				splitLine: {
					show: false,
					lineStyle: {
						color: ["#102d51"]
					}
				},
				axisLabel: {
					interval: 0, //横轴信息全部显示

					rotate: 45, //度角倾斜显示
					//                    formatter:function(value){//只显示五个字 其余省略号
					//                        return value.length > 5?value.substring(0,5)+'...':value;
					//                   }
					margin: 20,
					fontSize: 12, //度角倾斜显示
				}
			}],
			yAxis: [{
				type: 'value',
				axisLine: {
					show: true,
					lineStyle: {
						color: "#9b959b"
					}
				},
				splitLine: {
					show: true,
					lineStyle: {
						color: ["#777777"]
					}
				},
				min: '0',
				max:  parseInt(max)+parseInt(5)
			}],
			series: [{
				name: '危险性分析',
				type: 'bar',
				barWidth: 20,
				center: ['50%', '50%'],
				itemStyle: {
					barBorderRadius: [10, 10, 0, 0],
				},
				data: arr2
			}],
			label: {
				show: true,
				position: 'top',
				distance: 5
			}
		};
		// 使用刚指定的配置项和数据显示图表。
		qyfbchart.setOption(qyfb);
	} else {
		alert("数据为空");
	}
}, 'json')



var xychart = echarts.init(document.getElementById('xy'));
var sbchart = echarts.init(document.getElementById('sb'));
//未处理警情（起）
$.get("/police/untreatedPoliceNum", {
		date:date
	}, function(date) {
		var wclid = ['xy', 'sb'];
		var wclch = [xychart, sbchart];
		if(date.status == 200) {
			var tableData = date.data;
			var col;
			var wclxy = tableData.people;//人员
			var wclsb = tableData.equipment;//设备
			var wcls = [wclxy, wclsb];

			for(var i = 0; i < 2; i++) {
				var num = wcls[i];
				if(num > 0) {
					col = '#df5b6a'
				} else if(num == 0) {
					
					col = '#21cdcc'
				} else {
					alert('设备状态数据异常');
				}
				wclid[i] = {
					color: col,
					tooltip: {
						show: false,
						backgroundColor: 'rgba(0,183,238,0.5)',
						trigger: 'item',
						formatter: "{c}"
					},
					graphic: [ {
                    type: 'text',
                    left: 'center',
                    top: '34%',
                    style: {
                        text: num,
                        textAlign: 'center',
                        fill: '#fff',
//                      width: 30,
//                      height: 30,
                        fontSize: 48,
                    }
                }],
					series: [{
						type: 'pie',
						radius: [45, 55],
						center: ['50%', '50%'],
						avoidLabelOverlap: false,
						silent: true,
						label: {
							normal: {
								show: false,
								position: "center",
								formatter: num,
								textStyle: {
									fontSize: 48,
									color: '#fff'
								}
							},
							emphasis: {
								show: false
							}
						},
						lableLine: {
							normal: {
								show: false
							},
							emphasis: {
								show: false
							}
						},
						data: [{
							value: num,
						}]
					}]
				};
				wclch[i].setOption(wclid[i]);
			}
			// 使用刚指定的配置项和数据显示图表。

		} else {
			alert("数据为空");
		}
	}, 'json')

var total=0;
var last=0;

function showReocrd(pageNo, pageSize) {
		$.get("/police/untreatedPolice", {
				pageNo: pageNo,
				pageSize: pageSize,
				date:date
			},
			function(date) {
				if(date.status == 200) {
					//加载后台返回的List集合数据
					var tableData = date.data;
					total = tableData.total;
					last = tableData.last;
					var data = tableData.data;
					for(var i = 0; i < data.length; i++) {
                        var aaa = data[i].alarmTime
                        var ymd = aaa.split('T')[0].split('-')
                        var msm = aaa.split('T')[1].split('.')[0].split(':')
                        var time = ymd[0]+"年"+ymd[1]+"月"+ymd[2]+"日"+msm[0]+"点"+msm[1]+"分"

						var td = $("<td class='' style='width:100%;height:134px;'>\
						<div class='tabtrdiv '>\
						<div class='tr_content lightboder3'>\
						<div style='margin-top: 20px;margin-left: 24px;'>时间：<span class='tr_msg_time'>" + time + "</span></div>\
						<div style='margin-top: 21px;margin-left: 23px;'><span class='tr_msg_content' title='" + data[i].alarmGroup+ data[i].alarmArea+data[i].alarmTitle + "'>" + data[i].alarmGroup+ data[i].alarmArea+data[i].alarmTitle+ "</span></div>\
						<a href=''>详细信息</a></div>\
						<div class='tr_level lightboder3 wxxfclevelA'><p class='tr_level_sc'>" + data[i].alarmLevel + "</p>\
						<p class='trlevel_title'>风险等级</p></div></div></td>");
						//					
						var tr = $("<tr class='' style='width:423px;height:134px;' ></tr>").append(td);
						$('tbody').append(tr);
					}
				} else {
					alert("数据出错");
				}

			},
			"json"
		);
	}
	showReocrd(1, 3);
	layui.use(['laypage', 'table', 'jquery'], function() {
		var laypage = layui.laypage;
		var table = layui.table;
		$ = layui.$;
		$(".page").each(function(i, the) {
			laypage.render({
				elem: the, //注意，这里的 test1 是 ID，不用加 # 号
				count: total //数据总数，从服务端得到
					,
				limit: 3, //每页显示条数
				curr: 1, //起始页
				groups: 5, //连续页码个数
				prev: '<em>' + '<' + '</em>',
				next: '<em>' + '>' + '</em>',
				//下一页文本

				first: 1, //首页文本

				last: last, //尾页文本

				//				done: function() {
				//					var fristmsg = $('.layui-table tbody tr').eq(0);
				//					fristmsg.addClass('active');
				//
				//				},
				layout: ['prev', 'page', 'next', 'refresh', 'skip']
					//跳转页码时调用
					,
				jump: function(obj, first) { //obj为当前页的属性和方法，第一次加载first为true
					//非首次加载 do something
					if(!first) {
						//清空以前加载的数据
						$('tbody').empty();
						//调用加载函数加载数据
						showReocrd(obj.curr, obj.limit);
					}
				},

			});
			//			table.on('row(wxxjdtable)', function(obj) {
			//			$('.layui-table tbody tr').removeClass('active');
			//			$(obj.tr).addClass('active');
			//			var data = obj.data;
			//			alert(data)
			//		});
		})
	})
	

