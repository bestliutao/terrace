/*全省学员危险性分析*/
var xywxfxchart = echarts.init(document.getElementById('xywxfx'));
// 指定图表的配置项和数据
var xywxfx = {
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
		left: 30,
		right: 50,
		top: 30,
		bottom: 5,
		containLabel: true,
	},
	xAxis: [{
		type: 'category',
		data: ['猝死', '自杀', '行凶', '逃脱', '其他'],
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
		max: '80'
	}],
	series: [{
		name: '危险性分析',
		type: 'bar',
		barWidth: 20,
		center: ['50%', '60%'],
		itemStyle: {
			barBorderRadius: [10, 10, 0, 0],
		},
		data: [8, 27, 64, 16, 70]
	}],
	label: {
		show: true,
		position: 'top',
		distance: 5
	}
};
// 使用刚指定的配置项和数据显示图表。
xywxfxchart.setOption(xywxfx);

/*设备状态*/
	var jksbchart = echarts.init(document.getElementById('jksb'));
	var mjsbchart = echarts.init(document.getElementById('mjsb'));
	var xfsbchart = echarts.init(document.getElementById('xfsb'));
	var dwsbchart = echarts.init(document.getElementById('dwsb'));
	$.get("/provincial/equip", {
		data: new Date()
	}, function(date) {
		var zt = ['jksb', 'mjsb', 'xfsb', 'dwsb'];
		var ztch = [jksbchart, mjsbchart, xfsbchart, dwsbchart];
		if(date.status == 200) {
			var tableData = date.data;
			var col;
			var jkzt = 0;
			var mjzt = 0;
			var xfzt = 0;
			var dwzt = 0;
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
							fontSize: 40,
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



	/*戒治阶段分布*/
	var jzfbtchart = echarts.init(document.getElementById('jzfbt'));
	// 指定图表的配置项和数据
	$.get("/provincial/stageDistribution", {
		date:new Date()
	}, function(date) {
		if(date.status == 200) {
            var tableData = date.data;
            var arr1 = [];
            var arr2 = [];

            for(var i = 0;i<tableData.length;i++){
                arr1.push(tableData[i].title);
                arr2.push(tableData[i].number);
            }
			var jzfbt = {
				color: ['#f09865', '#21cdcc', '#29a0fc', '#df5b6a'],
				tooltip: {
					trigger: 'item',
					backgroundColor: 'rgba(0,183,238,0.5)',
					formatter: "{c}人-{d}%"
				},
				legend: {
					icon: 'rect',
					itemWidth: 16,
					textStyle: {
						padding: [0, 0, 0, 15],
						color: 'white',
						fontSize: 11
					},
					orient: 'vertical',
					top: 28,
					left: 72,

					itemGap: 20,
					data: ['生理脱毒期', '教育适应期', '康复巩固期', '回归指导期']
				},
				grid: {
					left: 35,

					top: 20,
					bottom: 21,
					containLabel: true,
				},
				series: [{
					type: 'pie',
					radius: [40, 70],
					center: [328, '45%'],
					avoidLabelOverlap: false,
					label: {
						normal: {
							show: false,
						},
						emphasis: {
							show: true,

						}
					},
					lableLine: {
						normal: {
							show: false
						},
						emphasis: {
							show: true
						}
					},
					data: [{
							value: arr2[3],
							name: '生理脱毒期'
						},
						{
							value: arr2[2],
							name: '教育适应期'
						},
						{
							value: arr2[1],
							name: '康复巩固期'
						},
						{
							value: arr2[0],
							name: '回归指导期'
						}
					]
				}]
			};

			// 使用刚指定的配置项和数据显示图表。
			jzfbtchart.setOption(jzfbt);
		} else {
			alert("数据为空");
		}
	}, 'json')
	


	/*戒治效能统计*/
	var jzxntjchart = echarts.init(document.getElementById('jzxntj'));
	$.get('/json/effi.json', {

	}, function(date) {
		var arr1 = [];
		var arr2 = [];
		var arr3 = [];
		var chart = date.data;
		for(var i = 0; i < chart.length; i++) {
			//			console.log(chart[i].number.length)
			//			console.log(chart[i].number)

			if(chart[i].number.length == 0) {
				arr1[i] = '0';
				arr2[i] = '0';
				arr3[i] = '0';
			} else {
				//console.log(chart[i].number.length)
				for(var z = 0; z < chart[i].number.length; z++) {
					//console.log(chart[i].number[z].number)
					switch(chart[i].number[z].title) {
						case '一年期':
							arr1[i] = chart[i].number[z].number;

							break;
						case '期满':

							arr2[i] = chart[i].number[z].number;

							break;
						case '生理脱毒期':
							arr3[i] = chart[i].number[z].number;
							break;

					}
				}
			}
		}

		//		console.log(arr1)
		//		console.log(arr2)
		//		console.log(arr3)
		var jzxntj = {
			textStyle: {
				color: 'white'
			},
			color: ['#f09865', '#21cdcc', '#29a0fc'],
			tooltip: {
				backgroundColor: 'rgba(0,183,238,0.5)',
				trigger: 'item',
				axisPointer: {
					type: 'shadow'
				}
			},
			legend: {

				right: 35,
				icon: 'rect',
				itemHeight: 15,
				itemGap: 40,
				itemWidth: 15,
				textStyle: {
					padding: [0, 0, 0, 13],
					color: 'white'
				},
				data: ['生理脱毒期', '一年期', '期满']
			},
			grid: {
				show: true,
				left: 45,
				right: 35,
				top: 50,
				bottom: 21,
				containLabel: true,
				//                  backgroundColor: "#194f73"
			},
			xAxis: [{
				boundaryGap: 12,
				type: 'category',
				data: ['60分以下', '60-70', '70-80', '80-90', '90-100'],
				nameLocation: 'middle',
				nameTextStyle: {

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
					margin: 12,
					fontSize: 12,
				}
			}],
			yAxis: [{

				splitNumber: "5",
				minInterval: "1",
				//                  name: '人数',
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
					name: '生理脱毒期',

					type: 'bar',
					barWidth: 8,

					data: arr1
				},
				{
					name: '一年期',
					type: 'bar',
					barWidth: 8,

					data: arr2
				},
				{
					name: '期满',
					type: 'bar',
					barWidth: 8,
					barGap: 0,
					data: arr3
				}
			]
		};

		jzxntjchart.setOption(jzxntj);
	}, 'json')
	
	
	/*戒治效能走势*/
	var jzxnzschart = echarts.init(document.getElementById('jzxnzs'), 'custom');
	var jzxnzs;
		var neweDate = (new Date().getMonth() + 1);
		$.get('/json/jzzs.json', {
			data:neweDate
		}, function(date) {
			var chartdata = date.data;
				var all = [];//全部
				var sltd = [];//生理脱毒期
				var ynq = [];//一年期
				var qm = [];//期满
				var month = [];	//月份	
				var type = [];
			for(var i = 0; i < chartdata.length; i++) {
				type.push(chartdata[i].type)
				if(chartdata[i].type == '全部'){
					for(var z=0;z<chartdata[i].number.length;z++){
						all.push(Math.round(chartdata[i].number[z].number));
						month[z] = (chartdata[i].number[z].title)
					}
					//console.log(all)
				}else 
				if(chartdata[i].type == '一年期'){
					for(var z=0;z<chartdata[i].number.length;z++){
						ynq.push(Math.round(chartdata[i].number[z].number));
						month[z] = (chartdata[i].number[z].title)
					}
					//console.log(ynq)
				}else 
				if(chartdata[i].type == '生理脱毒期'){
					for(var z=0;z<chartdata[i].number.length;z++){
						sltd.push(Math.round(chartdata[i].number[z].number));
						month[z] = (chartdata[i].number[z].title)
					}
					//console.log(sltd)
				}else if(chartdata[i].type == '期满'){
					for(var z=0;z<chartdata[i].number.length;z++){
						qm.push(Math.round(chartdata[i].number[z].number));
						month[z] = (chartdata[i].number[z].title)
					}
					//console.log(qm)
				}
			}
			
		jzxnzs = {

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

			right: 34,
			textStyle: {
				color: '#ffffff',
				fontSize: 12,
			},

			itemGap: 21,
			data: type
		},
		grid: {
			left: 41,
			bottom: 0,
			right: 39,
			top: 41,
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
			max: '100',
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
				name: '全部',
				type: 'line',
				symbolSize: 12,
				data: all
			},
			{
				name: '生理脱毒期',
				type: 'line',
				symbolSize: 12,
				data: sltd
			},
			{
				name: '一年期',
				type: 'line',
				symbolSize: 12,
				data: ynq
			},
			{
				name: '期满',
				symbolSize: 12,
				type: 'line',
				data: qm
			}
		]
	};
	jzxnzschart.setOption(jzxnzs);
			
	},'json')
		
	/*学员数*/
	$.get('/provincial/people', {
			data:new Date()
		}, function(date) {
			if(date.status==200){
                var numdata = date.data;
                console.log(numdata)
                var all = $('.dqzrs').text(numdata);
                var yesterday = $('.zrlss').text(0);
                var today = $('.jrrss').text(0);
			}
	},'json')
	

		/*map点击*/	
	$(document).on('click','#guangzhou',function(){
		$("#GDmap").attr("src","../img/guangzhou.png")
		var peace = ['松洲所','潭岗所','女子所','岑村所','同和所'];
		$('.addmapli').empty();
		for(var i = 0;i<peace.length;i++){
			var li = '<li><a href="javascript:;" class="lightboder2" id="place">'+peace[i]+'</a></li>';
			$('.addmapli').append(li);
		}
	})
	/*戒毒所点击*/
	$(document).on('click','#place',function(){
        $.get('/provincial/enterSubsystem', {
            place:$(this).text()
        }, function(date) {
        	if (date.status==200){
        		location.href='/hazard';
			}
        },'json')
	});
	var abc = '336,215,354,211,374,189,390,191,415,167,437,164,435,177,415,192,433,217,421,227,421,255,420,245,392,245,384,275,396,300,362,273,362,262,355,252,353,236,350,230,339,232,336,215'
	$('#guangzhou').attr('coords',abc)