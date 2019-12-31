$(document).ready(function() {
	//分页点击效果动态添加移除
	$(document).on("click", '.equipmenttype_ul li', function(d) {
		$('.equipmenttype_ul li').removeClass('licolor');
		$(this).addClass('licolor');
		var msg_id = $(this);
	})
	//时间选择器渲染
	layui.use('laydate', function() {
		var laydate = layui.laydate;
		var d = new Date();
		var dd = d.getFullYear() + " 年 " + (d.getMonth() + 1) + " 月";
		//执行一个laydate实例
		laydate.render({
			elem: '#date_select', //指定元素
			type: 'month',
			format: 'yyyy 年 MM 月',
			isInitValue: true,
			value: dd,
			theme: '#3dd7fd',
			//			showBottom: false,
			//			ready: function(date) {
			//				console.log(date); //得到初始的日期时间对象：{year: 2017, month: 8, date: 18, hours: 0, minutes: 0, seconds: 0}
			//			},
			//日期选择完毕的回调
			//			done: function(value, date, endDate) {
			//				//console.log(value); //得到日期生成的值，如：2017-08-18
			//				console.log(date.year+"-"+date.month); //得到日期时间对象：{year: 2017, month: 8, date: 18, hours: 0, minutes: 0, seconds: 0}
			//			},
			//改变月份时的回调
			change: function(value, date, endDate) {
				//console.log(value); //得到日期生成的值，如：2017-08-18
				var data = date.year + "-" + date.month; //得到日期时间对象：{year: 2017, month: 8, date: 18, hours: 0, minutes: 0, seconds: 0}
				var type = $(".equipmenttype_ul .licolor").text(); //设备类型

				//时间改变时发送时间以及设备类型请求数据
				linechart(type, data)
				console.log(type)
				if (type=="监控"){
                    videoTable(type, data)
				}
				if(type=="环控"){
					envirTable(type,data);
				}


			}
		});
	});

	//5大设备类型选择及请求发送
	//监控
	$(document).on("click", '.jk', function(d) {
		var type = $(this).text();
		var datas = $('#date_select').val().split(' '); //时间选择器val值切割
		var data = datas[0] + '-' + datas[2]
		linechart(type, data)
        videoTable(type, data)
	})
	//门禁
	$(document).on("click", '.mj', function(d) {
		var type = $(this).text();
		var datas = $('#date_select').val().split(' '); //时间选择器val值切割
		var data = datas[0] + '-' + datas[2]
		linechart(type, data)
        videoTable(type, data)
	})
	//消防
	$(document).on("click", '.xf', function(d) {
		var type = $(this).text();
		var datas = $('#date_select').val().split(' '); //时间选择器val值切割
		var data = datas[0] + '-' + datas[2]
		console.log(type)
		linechart(type, data)
        envirTable(type, data)
	})
	//定位
	$(document).on("click", '.dw', function(d) {
		var type = $(this).text();
		var datas = $('#date_select').val().split(' '); //时间选择器val值切割
		var data = datas[0] + '-' + datas[2]
		linechart(type, data)
        videoTable(type, data)
	})
	//其他
	$(document).on("click", '.qt', function(d) {
		var type = $(this).text();
		var datas = $('#date_select').val().split(' '); //时间选择器val值切割
		var data = datas[0] + '-' + datas[2]
		linechart(type, data)
        videoTable(type, data)
	})

	//默认数据value

    var Da = new Date();
    var Defaultdata = Da.getFullYear() + "-" + (Da.getMonth() + 1);
    var Defaultype = $('.equipmenttype_ul .licolor').text(); //默认类型
	//折线图默认数据
	linechart(Defaultype, Defaultdata) //时间由时间选择器获取当前年月份

	//表格默认数据
    videoTable(Defaultype, Defaultdata)
	//折线图数据获取添加
	var date_tablechart = echarts.init(document.getElementById('date_table'));
	//折线图数据获取函数，传值-类型、时间
	function linechart(type, data) {
		var date_table;
		$.get('/safe/monthBadMonitorNum', {
			type: type,
			date: data
		}, function(date) {
			var tableData = date.data;
			var arr1 = [];
			var arr2 = [];
			for(var i = 0; i < tableData.length; i++) {
				arr1.push(tableData[i].title);
				arr2.push(tableData[i].number);
			}
            var max=arr2[0];
            for(i=0;i<arr2.length;i++){
                if(parseInt(arr2[i])>parseInt(max)){
                    max=arr2[i];
                }
            }
            var maxVal=parseInt(max)+parseInt(5)
			date_table = {
				textStyle: {
					color: '#ffffff',
					fontSize: 11
				},
				color: ['rgba(0,183,238,0.5)'],
				tooltip: {
					trigger: 'item',
					position: 'top',
					backgroundColor: 'rgba(0,183,238,0.5)',
					/*ie中下列样式会不兼容*/
					formatter: function(params) {
						let text = `<p style="padding:0 5px;">` + params.data + `</p>`
						return text;
					}
				},
				grid: {
					left: 15,
					bottom: 0,
					right: 35,
					top: 10,
					borderColor: "#000",
					containLabel: true
				},
				xAxis: {
					type: 'category',
					axisLine: {
						show: true,
						lineStyle: {
							color: "#777777"
						}
					},
					axisTick: {
						alignWithLabel: true
					},
					axisLabel: {
						interval: 0, //横轴信息全部显示
						//				rotate: 35,
						margin: 20,
						fontSize: 12, //度角倾斜显示
					},
					data: arr1 //时间
				},
				yAxis: {
					type: 'value',
					axisLine: {
						show: true,
						lineStyle: {
							color: "#777777"
						}
					},
					splitLine: {
						show: true,
						lineStyle: {
							color: ["#777777"]
						}
					},
					min: '0',
					max: maxVal
				},
				series: [{
					data: arr2, //数据
					type: 'line',
					lineStyle: {
						normal: {
							width: 4,
						}
					},
					itemStyle: {
						normal: {
							borderWidth: 6 //拐点边框大小
						},
						emphasis: {
							color: '#000000' //hover拐点颜色定义
						}
					},

				}]
			};
			date_tablechart.setOption(date_table);
		}, 'json')
	}
	//折线图拐点事件--渲染表格

	date_tablechart.on('click', function(params) {

		var tbdata = $('#date_select').val().match(/\d+/g)[0]+'-'+params.name.split('/')[0]+'-'+params.name.split('/')[1]; //具体日期
        var type = $('.equipmenttype_ul .licolor').text();

		if (type=="监控"){
            videoTable(type, tbdata)
		}
		if (type=="环控"){
			envirTable(type,tbdata);
		}


	});
	
	//监控表格
	function videoTable(type, data) {
	layui.use(['form', 'laydate', 'element', 'table', 'laypage', 'layer'], function() {
			var form = layui.form;
			var laydate = layui.laydate;
			var $ = jQuery;
			var table = layui.table;
			var laypage = layui.laypage;
			//表格
			var table_cols = [
				[{
						field: 'monitorTime',
						title: '时间',
					templet: function(d) {
                        var aaa = d.monitorTime;
                        var ymd = aaa.split('-')
                        var msm = ymd[2].split('T')
                        var smf=msm[1].split('.')
                        var time = ymd[0] + "年" + ymd[1] + "月" + msm[0] + "日"+smf[0]
                        return time
                    }
					}, {
						field: 'monitorIp',
						title: '设备IP',
						width: 216
					},
					{
						field: 'monitorType',
						title: '异常类型',
						width: 320,
					},
					{
						field: 'monitorArea',
						title: '所在区域',
						width: 447,
                        templet: function(d) {
                            return d.monitorGroup+' '+d.monitorArea
                        }
					},
					{
						field: 'monitorLevel',
						title: '风险等级',
						width: 150,
						templet: function(d) {
							if(d.monitorLevel === 'A') {
								return '<span style="text-shadow: 0 0 11px #ff0000 !important;">' + d.monitorLevel + '</span>'
							} else if(d.monitorLevel === 'B') {
								return '<span style="text-shadow: 0 0 11px #00c9ff; !important;">' + d.monitorLevel + '</span>'
							} else if(d.monitorLevel === 'C') {
								return '<span style="text-shadow: 0 0 10px rgb(255, 162, 1) !important;">' + d.monitorLevel + '</span>'
							} else {
								return '<span">无</span>'
							}
						}
					},
					{
						field: 'monitorState',
						title: '状态',
						width: 240,
                        templet: function(d) {
                            if(d.monitorState == '0') {
                                return "未修复"
                            } else {
                            	return "已修复"
							}
                        }
					},
					{
						field: 'history ',
						title: '历史状态',
						width: 178,
						templet: function(d) {

							return '<a href="' + d.href + '" style="font-family: TRENDS;text-decoration: underline;font-size: 14px;font-weight: normal;font-stretch: normal;line-height: 30px;letter-spacing: 0px;color: #00b7ee;">查看详情</a>'

						}
					}
				]
			]

			// 表格渲染
				table.render({
					elem: '#date_content_table', //指定原始表格元素选择器（推荐id选择器）
					height: 484, //容器高度
					url: '/safe/todayBadMonitor',
					where: {type: type, date: data},//
					cols: table_cols,

					page: { //支持传入 laypage 组件的所有参数（某些参数除外，如：jump/elem） - 详见文档
						layout: ['prev', 'page', 'next', 'skip'] //自定义分页布局
							//
							,
						curr: 1 //设定初始在第 5 页
							,
						groups: 2 //只显示 1 个连续页码
							,
						first: false //不显示首页
							,
						last: false //不显示尾页

					},
					response: {
						statusCode: 200 //重新规定成功的状态码为 200，table 组件默认为 0
					},
					//			done: function() {
					//				$('.layui-table tbody tr').eq(0).addClass('active');
					//			},
					parseData: function(res) { //将原始数据解析成 table 组件所规定的数据
						$('#Equipment_num').text(res.data.total);
						return {
							"code": res.status, //解析接口状态
							"msg": res.msg, //解析提示文本
							"count": res.data.total, //解析数据长度
							"data": res.data.data //解析数据列表
						};
					}
				});
	});
}
	//环控表格
    function envirTable(type, data) {
        layui.use(['form', 'laydate', 'element', 'table', 'laypage', 'layer'], function() {
            var form = layui.form;
            var laydate = layui.laydate;
            var $ = jQuery;
            var table = layui.table;
            var laypage = layui.laypage;
            //表格
            var table_cols = [
                [{
                    field: 'envirTime',
                    title: '时间',
                    templet: function(d) {
                        var aaa = d.envirTime;
                        var ymd = aaa.split('-')
                        var msm = ymd[2].split('T')
						var smf=msm[1].split('.')
                        var time = ymd[0] + "年" + ymd[1] + "月" + msm[0] + "日"+smf[0]
                        return time
                    }
                }, {
                    field: 'envirOid',
                    title: '设备OID',
                    width: 216
                },
                    {
                        field: 'envirType',
                        title: '异常类型',
                        width: 320,
                    },
                    {
                        field: 'envirDesc',
                        title: '设备名称',
                        width: 447

                    },
                    {
                        field: 'envirLevel',
                        title: '风险等级',
                        width: 150,
                        templet: function(d) {
                            if(d.envirLevel === 'A') {
                                return '<span style="text-shadow: 0 0 11px #ff0000 !important;">' + d.envirLevel + '</span>'
                            } else if(d.envirLevel === 'B') {
                                return '<span style="text-shadow: 0 0 11px #00c9ff; !important;">' + d.envirLevel + '</span>'
                            } else if(d.envirLevel === 'C') {
                                return '<span style="text-shadow: 0 0 10px rgb(255, 162, 1) !important;">' + d.envirLevel + '</span>'
                            } else {
                                return '<span">无</span>'
                            }
                        }
                    },
                    {
                        field: 'envirStatus',
                        title: '状态',
                        width: 240,
                        templet: function(d) {
                            if(d.envirStatus == '0') {
                                return "未修复"
                            } else {
                                return "已修复"
                            }
                        }
                    },
                    {
                        field: 'history ',
                        title: '历史状态',
                        width: 178,
                        templet: function(d) {

                            return '<a href="' + d.href + '" style="font-family: TRENDS;text-decoration: underline;font-size: 14px;font-weight: normal;font-stretch: normal;line-height: 30px;letter-spacing: 0px;color: #00b7ee;">查看详情</a>'

                        }
                    }
                ]
            ]

            // 表格渲染
            table.render({
                elem: '#date_content_table', //指定原始表格元素选择器（推荐id选择器）
                height: 484, //容器高度
                url: '/safe/todayBadMonitor',
                where: {type: type, date: data},//
                cols: table_cols,

                page: { //支持传入 laypage 组件的所有参数（某些参数除外，如：jump/elem） - 详见文档
                    layout: ['prev', 'page', 'next', 'skip'] //自定义分页布局
                    //
                    ,
                    curr: 1 //设定初始在第 5 页
                    ,
                    groups: 2 //只显示 1 个连续页码
                    ,
                    first: false //不显示首页
                    ,
                    last: false //不显示尾页

                },
                response: {
                    statusCode: 200 //重新规定成功的状态码为 200，table 组件默认为 0
                },
                //			done: function() {
                //				$('.layui-table tbody tr').eq(0).addClass('active');
                //			},
                parseData: function(res) { //将原始数据解析成 table 组件所规定的数据
                    $('#Equipment_num').text(res.data.total);
                    return {
                        "code": res.status, //解析接口状态
                        "msg": res.msg, //解析提示文本
                        "count": res.data.total, //解析数据长度
                        "data": res.data.data //解析数据列表
                    };
                }
            });
        });
    }
})