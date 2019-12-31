$(document).ready(function() {
    var d = new Date();
    var date = d.getFullYear() + "-" + (d.getMonth() + 1) + "-" + d.getDate();
	var jksbchart = echarts.init(document.getElementById('jksb'));
	var mjsbchart = echarts.init(document.getElementById('mjsb'));
	var xfsbchart = echarts.init(document.getElementById('xfsb'));
	var dwsbchart = echarts.init(document.getElementById('dwsb'));

    //下拉框事件
    $("#sxt-select").change(function() {
        var num = $(this).children('option:selected').val()
        video(num)
    });
//监控模块默认值获取
    video(1);
    function video(num) {
        $.get('/safe/videoFour',{
                id:num
            },function(date){
                if(date.status==200){
                    var data = date.data;
                    //四个切换块的标题
					var sxt1t = $('#sxt1_t').text(data[0].place)
					var sxt2t = $('#sxt2_t').text(data[1].place)
					var sxt3t = $('#sxt3_t').text(data[2].place)
					var sxt4t = $('#sxt4_t').text(data[3].place)
							//将ip赋值为小块的value值
					$('#sxt1').attr('value',"rtsp://admin:12345678a@"+data[0].ip+":554/cam/realmonitor?channel=1&subtype=0")
					$('#sxt2').attr('value',"rtsp://admin:12345678a@"+data[1].ip+":554/cam/realmonitor?channel=1&subtype=0")
					$('#sxt3').attr('value',"rtsp://admin:12345678a@"+data[2].ip+":554/cam/realmonitor?channel=1&subtype=0")
					$('#sxt4').attr('value',"rtsp://admin:12345678a@"+data[3].ip+":554/cam/realmonitor?channel=1&subtype=0")
                    //修改big图像的路径
                    vxgplayer('vxg_media_player0').onReadyStateChange(function(onreadyState){
                        vxgplayer('vxg_media_player0').src($('#sxt1').attr('value'));
                        // vxgplayer('vxg_media_player0').src("rtsp://admin:12345678a@"+"192.168.52.70"+":554/cam/realmonitor?channel=1&subtype=0");
                        console.log(vxgplayer('vxg_media_player0').src());
                        vxgplayer('vxg_media_player0').play();
                    });
                    vxgplayer('vxg_media_player0').onError(function(onErr){
                        console.log("player ERROR: " + vxgplayer('vxg_media_player0').error());
                    });
                    //
                }
            }
            ,'json')
    }


    //监控点击样式切换及事件
    $(document).on('click', '#sxt1', function() {
        //样式去除添加
        $('#sxt2 .fboder').removeClass('rect2').addClass('rect1')
        $('#sxt3 .fboder').removeClass('rect2').addClass('rect1')
        $('#sxt4 .fboder').removeClass('rect2').addClass('rect1')
        $('#sxt1 .fboder').addClass('rect2')
        var s1 = $('#sxt1').attr('value');//获取到被点击的第一个小块的val
        //赋值到监控显示模块的对应IP设置内
        vxgplayer('vxg_media_player0').src(s1);
        console.log(vxgplayer('vxg_media_player0').src());
        vxgplayer('vxg_media_player0').play();
//		$('#sxtbig').attr(找到对象设置对应位置属性);
    })
    $(document).on('click', '#sxt2', function() {
        //样式去除添加
        $('#sxt1 .fboder').removeClass('rect2').addClass('rect1')
        $('#sxt3 .fboder').removeClass('rect2').addClass('rect1')
        $('#sxt4 .fboder').removeClass('rect2').addClass('rect1')
        $('#sxt2 .fboder').addClass('rect2')
        var s2 = $('#sxt2').attr('value');//获取到被点击的第一个小块的val
        //赋值到监控显示模块的对应IP设置内
        vxgplayer('vxg_media_player0').src(s2);
        console.log(vxgplayer('vxg_media_player0').src());
        vxgplayer('vxg_media_player0').play();
//		$('#sxtbig').attr(找到对象设置对应位置属性);
    })
    $(document).on('click', '#sxt3', function() {
        //样式去除添加
        $('#sxt1 .fboder').removeClass('rect2').addClass('rect1')
        $('#sxt2 .fboder').removeClass('rect2').addClass('rect1')
        $('#sxt4 .fboder').removeClass('rect2').addClass('rect1')
        $('#sxt3 .fboder').addClass('rect2')
        var s3 = $('#sxt3').attr('value');//获取到被点击的第一个小块的val
        //赋值到监控显示模块的对应IP设置内
        vxgplayer('vxg_media_player0').src(s3);
        console.log(vxgplayer('vxg_media_player0').src());
        vxgplayer('vxg_media_player0').play();
//		$('#sxtbig').attr(找到对象设置对应位置属性);
    })
    $(document).on('click', '#sxt4', function() {
        //样式去除添加
        $('#sxt1 .fboder').removeClass('rect2').addClass('rect1')
        $('#sxt2 .fboder').removeClass('rect2').addClass('rect1')
        $('#sxt3 .fboder').removeClass('rect2').addClass('rect1')
        $('#sxt4 .fboder').addClass('rect2')
        var s4 = $('#sxt4').attr('value');//获取到被点击的第一个小块的val
        //赋值到监控显示模块的对应IP设置内
        vxgplayer('vxg_media_player0').src(s4);
        console.log(vxgplayer('vxg_media_player0').src());
        vxgplayer('vxg_media_player0').play();
//		$('#sxtbig').attr(找到对象设置对应位置属性);
    })




//当前设备状态 (异常设备个数)
    $.get("/safe/todayBadMonitorNum", {
		date:date
	}, function(date) {
		var zt = ['jksb', 'mjsb', 'xfsb', 'dwsb'];
		var ztch = [jksbchart, mjsbchart, xfsbchart, dwsbchart];
		if(date.status == 200) {
			var tableData = date.data;
			var col;
			var jkzt = tableData.monitor;
			var mjzt = tableData.door;
			var xfzt = tableData.environmen;
			var dwzt = tableData.location;
			var ztre = [jkzt, mjzt, xfzt, dwzt];

			for(var i = 0; i < 4; i++) {
				var num = ztre[i];
				if(num > 0) {
					col = '#df5b6a'
				} else if(num == 0) {

					col = '#21cdcc'
				}
				zt[i] = {
					color: col,
					tooltip: {
						show: false,
						backgroundColor: 'rgba(0,183,238,0.5)',
						trigger: 'item',
						formatter: "{c}"
					},
					graphic: [{
						type: 'text',
						left: 'center',
						top: '37%',
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
								position: 'center',
								formatter: num,
								textStyle: {
									fontSize: 48,
									color: "#fff"
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
				ztch[i].setOption(zt[i]);
			}
			// 使用刚指定的配置项和数据显示图表。

		} else {
			alert("数据为空");
		}
	}, 'json')

	layui.use(['form', 'laydate', 'element', 'table', 'laypage', 'layer'], function() {
		var form = layui.form;
		var laydate = layui.laydate;
		var $ = layui.$;
		var table = layui.table;
		var laypage = layui.laypage;
		//环控设备表格
		var table_cols1 = [
			[{
					field: 'envirOid',
					title: '设备ip',
					width: 146
				}, {
					field: 'envirStatus',
					title: '状态',
					width: 144,
                	templet: function(d) {
						if(d.envirStatus == '0') {
							return "未修复"
						} else {
							return "已修复"
						}
               		 }
				},
				{
					field: 'envirLevel',
					title: '风险等级',
					width: 144,
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
				}
			]
		]
		// 环控表格渲染
		table.render({
			elem: '#cont-equi', //指定原始表格元素选择器（推荐id选择器）
			height: 285, //容器高度
			url: '/safe/todayEnvirStatus?date='+date,
			cols: table_cols1,

			page: { //支持传入 laypage 组件的所有参数（某些参数除外，如：jump/elem） - 详见文档
				layout: [  'prev', 'page', 'next', 'skip'] //自定义分页布局
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
				return {
					"code": res.status, //解析接口状态
					"msg": res.msg, //解析提示文本
					"count": res.data.total, //解析数据长度
					"data": res.data.data //解析数据列表
				};
			}
		});


		var table_cols = [
			[{
					field: 'monitorIp',
					title: '设备ip',
					width: 146
				}, {
					field: 'monitorState',
					title: '状态',
					width: 144,
					templet: function(d) {
						if(d.monitorState == '0') {
							return "未修复"
						} else {
							return "已修复"
						}
					}
				},
				{
					field: 'monitorLevel',
					title: '风险等级',
					width: 146,
					templet: function(d) {
						if(d.monitorLevel == 'A') {
							return '<span style="text-shadow: 0 0 11px #ff0000 !important;">' + d.monitorLevel + '</span>'
						} else if(d.levels == 'B') {
							return '<span style="text-shadow: 0 0 11px #00c9ff; !important;">' + d.monitorLevel + '</span>'
						} else if(d.levels == 'C') {
							return '<span style="text-shadow: 0 0 10px rgb(255, 162, 1) !important;">' + d.monitorLevel + '</span>'
						} else {
							return '<span">无</span>'
						}
					}
				}
			]
		]
		// video表格渲染
		table.render({
			elem: '#video-equi', //指定原始表格元素选择器（推荐id选择器）
			height: 285, //容器高度
			url: '/safe/todatBadMsg?date='+date+'&&group=一大队',
			cols: table_cols,
			done: function() {
				var fristmsg = $('.layui-table tbody tr').eq(0);
				fristmsg.addClass('lightboder3');
			},
			page: { //支持传入 laypage 组件的所有参数（某些参数除外，如：jump/elem） - 详见文档
				layout: [  'prev', 'page', 'next', 'skip'] //自定义分页布局
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
			parseData: function(res) { //将原始数据解析成 table 组件所规定的数据
				return {
					"code": res.status, //解析接口状态
					"msg": res.msg, //解析提示文本
					"count": res.data.total, //解析数据长度
					"data": res.data.data //解析数据列表
				};
			}
		});


		var table_cols2 = [
			[{
					field: 'sbIp',
					title: '设备ip',
					width: 146
				}, {
					field: 'statu',
					title: '状态',
					width: 144,
					//					templet: function(d) {
					//						if(d.statu === '异常') {
					//							return '<span style="text-shadow: 0 0 11px #ff0000 !important;">' + d.statu + '</span>'
					//						} else {
					//							return d.statu
					//						}
					//					}
				},
				{
					field: 'levels',
					title: '风险等级',
					width: 144,
					templet: function(d) {
						if(d.levels === 'A') {
							return '<span style="text-shadow: 0 0 11px #ff0000 !important;">' + d.levels + '</span>'
						} else if(d.levels === 'B') {
							return '<span style="text-shadow: 0 0 11px #00c9ff; !important;">' + d.levels + '</span>'
						} else if(d.levels === 'C') {
							return '<span style="text-shadow: 0 0 10px rgb(255, 162, 1) !important;">' + d.levels + '</span>'
						} else {
							return '<span">无</span>'
						}
					}
				}
			]
		]
		// door表格渲染
		table.render({
			elem: '#door-equi', //指定原始表格元素选择器（推荐id选择器）
			height: 285, //容器高度
			url: '',
			cols: table_cols2,
			page: { //支持传入 laypage 组件的所有参数（某些参数除外，如：jump/elem） - 详见文档
				layout: [ 'prev', 'page', 'next', 'skip'] //自定义分页布局
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
			parseData: function(res) { //将原始数据解析成 table 组件所规定的数据
				return {
					"code": res.status, //解析接口状态
					"msg": res.message, //解析提示文本
					"count": res.total, //解析数据长度
					"data": res.data //解析数据列表
				};
			}

		});
		var table_cols3 = [
			[{
					field: 'ip',
					title: '设备ip',
					width: 146
				}, {
					field: 'statu',
					title: '状态',
					width: 144,
					//					templet: function(d) {
					//						if(d.statu === '异常') {
					//							return '<span style="text-shadow: 0 0 11px #ff0000 !important;">' + d.statu + '</span>'
					//						} else {
					//							return d.statu
					//						}
					//					}
				},
				{
					field: 'levels',
					title: '风险等级',
					width: 144,
					templet: function(d) {
						if(d.levels === 'A') {
							return '<span style="text-shadow: 0 0 11px #ff0000 !important;">' + d.levels + '</span>'
						} else if(d.levels === 'B') {
							return '<span style="text-shadow: 0 0 11px #00c9ff; !important;">' + d.levels + '</span>'
						} else if(d.levels === 'C') {
							return '<span style="text-shadow: 0 0 10px rgb(255, 162, 1) !important;">' + d.levels + '</span>'
						} else {
							return '<span">无</span>'
						}
					}
				}
			]
		]
		// 定位表格渲染
		table.render({
			elem: '#positioning-equi', //指定原始表格元素选择器（推荐id选择器）
			height: 285, //容器高度
			url: '',
			cols: table_cols2,
			page: { //支持传入 laypage 组件的所有参数（某些参数除外，如：jump/elem） - 详见文档
				layout: [ 'prev', 'page', 'next', 'skip'] //自定义分页布局
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
			parseData: function(res) { //将原始数据解析成 table 组件所规定的数据
				return {
					"code": res.status, //解析接口状态
					"msg": res.message, //解析提示文本
					"count": res.total, //解析数据长度
					"data": res.data //解析数据列表
				};
			}

		});


		//监听行单击事件（单击事件为：rowDouble）
		table.on('row(cont-equi)', function(obj) {
			$('.layui-table tbody tr').removeClass('lightboder3');
			$(obj.tr).addClass('lightboder3');
			var data = obj.data;
			if (data!=null){
                var ne = $('.layui-tab-card>.layui-tab-title .layui-this').text();
                $('.szqy .szqy_n').text('第一大队');
                $('.yclx .yclx_n').text(ne);
                $('.yclx .yclx_n').text(data.envirOid);
                $('.fxdj .sb_level').text(data.envirLevel);
                if (data.envirStatus==0){
                    $('.zt .zt_co').text("未修复");
				}else {
                    $('.zt .zt_co').text("已修复");
				}

                var lel = data.envirLevel;
                lelcolor(lel);
			}

	
		});
		table.on('row(video-equi)', function(obj) {
			$('.layui-table tbody tr').removeClass('lightboder3');
			$(obj.tr).addClass('lightboder3');
			var data = obj.data;
			if (data!=null){
                var ne = $('.layui-tab-card>.layui-tab-title .layui-this').text();
                $('.szqy .szqy_n').text('第一大队');
                $('.yclx .yclx_n').text(ne);
                $('.yclx .yclx_n').text(data.monitorIp);
                $('.fxdj .sb_level').text(data.monitorLevel);
                if(data.monitorState==0){
                    $('.zt .zt_co').text("未修复");
                }else {
                    $('.zt .zt_co').text("已修复");
                }

                var lel = data.monitorLevel;
                lelcolor(lel);
			}


		});
		table.on('row(positioning-equi)', function(obj) {
			$('.layui-table tbody tr').removeClass('lightboder3');
			$(obj.tr).addClass('lightboder3');
			var data = obj.data;
			if (data!=null){
                var ne = $('.layui-tab-card>.layui-tab-title .layui-this').text();
                $('.szqy .szqy_n').text('第一大队');
                $('.yclx .yclx_n').text(ne);
                $('.yclx .yclx_n').text(data.sbId);
                $('.fxdj .sb_level').text(data.levels);
                $('.zt .zt_co').text(data.statu);
                var lel = data.levels;
                lelcolor(lel);
			}


		});
		table.on('row(door-equi)', function(obj) {
			$('.layui-table tbody tr').removeClass('lightboder3');
			$(obj.tr).addClass('lightboder3');
			var data = obj.data;
			if (data!=null){
                var ne = $('.layui-tab-card>.layui-tab-title .layui-this').text();
                $('.szqy .szqy_n').text('第一大队');
                $('.yclx .yclx_n').text(ne);
                $('.yclx .yclx_n').text(data.sbId);
                $('.fxdj .sb_level').text(data.levels);
                $('.zt .zt_co').text(data.statu);
                var lel = data.levels;
                lelcolor(lel);

            }

		});
	})
	/*默认显示*/
	$(document).ready(function() {
		$.get('/safe/todatBadMsg',{
			date:date,
			group:"一大队",
			page:1,
			limit:5
		}, function(res) {
			var data = res.data;
			console.log(data)
			if (data.data!=null&&data.data!=""){
                var ne = $('.layui-tab-card>.layui-tab-title .layui-this').text();
                $('.szqy .szqy_n').text('第一大队');
                $('.yclx .yclx_n').text(ne);
                $('.yclx .yclx_n').text(data.data[0].monitorIp);
                $('.fxdj .sb_level').text(data.data[0].monitorLevel);
                console.log(data.data[0].monitorLevel)
                if(data.data[0].monitorState==0){
                    $('.zt .zt_co').text("未修复");
                }else {
                    $('.zt .zt_co').text("已修复");
                }
                var lel = data.data[0].monitorLevel;
                lelcolor(lel);
			}
		})
	})

	function lelcolor(lel) {
		if(lel === 'A') {
			$('.fxdj .sb_level').removeClass('fxdjB').removeClass('fxdjC').removeClass('fxdjgreen');
			$('.fxdj .sb_level').addClass('fxdjA');

		} else if(lel === 'B') {
			$('.fxdj .sb_level').removeClass('fxdjA').removeClass('fxdjC').removeClass('fxdjgreen');
			$('.fxdj .sb_level').addClass('fxdjB');

		} else if(lel === 'C') {
			$('.fxdj .sb_level').removeClass('fxdjB').removeClass('fxdjA').removeClass('fxdjgreen');
			$('.fxdj .sb_level').addClass('fxdjC');

		} else {
			$('.fxdj .sb_level').removeClass('fxdjB').removeClass('fxdjC').removeClass('fxdjA');
			$('.fxdj .sb_level').addClass('fxdjgreen');
		}
	}

	var sbycsjchart = echarts.init(document.getElementById('sbycsj'), 'custom');
	//近7天异常设备数量
	$.get("/safe/safeRiskMonitorNum", {
        date:date
    }, function(date) {
        if(date.status == 200) {
            var chartdata = date.data;
            var envir = [];//环控
            var video = [];//监控
            var locat = [];//定位
            var door = [];//门禁
            var month = [];	//月份
            var type = [];
            for(var i = 0; i < chartdata.length; i++) {
                type.push(chartdata[i].type)
                if(chartdata[i].type == '监控设备'){
                    for(var z=0;z<chartdata[i].number.length;z++){
                        video.push(Math.round(chartdata[i].number[z].number));
                        month[z] = (chartdata[i].number[z].title)
                    }
                }else
                if(chartdata[i].type == '环控设备'){
                    for(var z=0;z<chartdata[i].number.length;z++){
                        envir.push(Math.round(chartdata[i].number[z].number));
                        month[z] = (chartdata[i].number[z].title)
                    }
                }else
                if(chartdata[i].type == '定位设备'){
                    for(var z=0;z<chartdata[i].number.length;z++){
                        locat.push(Math.round(chartdata[i].number[z].number));
                        month[z] = (chartdata[i].number[z].title)
                    }
                }else if(chartdata[i].type == '门禁设备'){
                    for(var z=0;z<chartdata[i].number.length;z++){
                        door.push(Math.round(chartdata[i].number[z].number));
                        month[z] = (chartdata[i].number[z].title)
                    }
                }
            }
            var sbycsj = {

                color: ['#f09865', '#21cdcc', '#29a0fc', '#df5b6a'],
                textStyle: {
                    color: 'white'
                },
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
                legend: {

                    textStyle: {
                        color: '#ffffff',
                        fontSize: 12,
                    },

                    itemGap: 15,
                    data: ['监控设备', '环控设备', '定位设备', '门禁设备']
                },
                grid: {
                    left: 0,
                    bottom: 0,
                    right: 15,
                    top: 35,
                    borderColor: "#000",
                    containLabel: true
                },
                xAxis: {
                    type: 'category',
                    boundaryGap: 29,

                    data: month,
                    axisLine: {
                        show: true,
                        lineStyle: {
                            color: "#777777",

                        }
                    },
                    axisLabel: {
                        interval: 0, //横轴信息全部显示
                        margin: 20,
                        fontSize: 12, //度角倾斜显示
                    },
                    splitLine: {
                        show: true,
                        lineStyle: {
                            color: ["#102d51"]
                        }
                    },
                },
                yAxis: [{
                    splitNumber: "5",
                    minInterval: "1",
                    //		name: '数量',
                    boundaryGap: [0.2, 0.2],
                    min: '0',
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
                    splitArea: {
                        "show": false,
                        "areaStyle": {
                            "color": [
                                "#194f73"
                            ]
                        }
                    },
                    axisTick: {
                        show: false
                    }
                }],
                series: [{
                    name: '监控设备',
                    type: 'line',
                    symbolSize: 12,
                    data: video
				},
                    {
                        name: '环控设备',
                        type: 'line',
                        symbolSize: 12,
                        data: envir
                    },
                    {
                        name: '定位设备',
                        symbolSize: 12,
                        type: 'line',
                        data: locat
                    },
                    {
                        name: '门禁设备',
                        symbolSize: 12,
                        type: 'line',
                        data: door
                    }
                ]
            };
            sbycsjchart.setOption(sbycsj);
        }

        },'json')
})