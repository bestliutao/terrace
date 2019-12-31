$(document).ready(function() {
	/*改定时在页面DOM元素加载完运行，避开异常图表每次滞后一次才刷新造成的显示错误*/
	var intervallab = setInterval(sbty, 1000 * 5); //页面加载完执行的异常数获取
	var intervalzt = setInterval(fwqstate, 1000 * 5); //服务器状态的定时更新获取
	fwqstate();
	
})

//标题时间
$(function() {
	displayTime();
});
//时间实时显示
function displayTime() {
	var date = new Date();
	this.year = date.getFullYear();
	this.month = date.getMonth() + 1; //月份由0-11
	this.date = date.getDate();
	//getday返回值是 0（周日） 到 6（周六） 之间的一个整数。
	switch(date.getDay()) {
		case 0:
			this.day = "星期日";
			break;
		case 1:
			this.day = "星期一";
			break;
		case 2:
			this.day = "星期二";
			break;
		case 3:
			this.day = "星期三";
			break;
		case 4:
			this.day = "星期四";
			break;
		case 5:
			this.day = "星期五";
			break;
		case 6:
			this.day = "星期六";
			break;
	}
	//时间个位数0X形式处理
	if(date.getHours() < 10) {
		this.hour = "0" + date.getHours();
	} else {
		this.hour = date.getHours();
	}
	if(date.getMinutes() < 10) {
		this.minute = "0" + date.getMinutes();
	} else {
		this.minute = date.getMinutes();
	}
	if(date.getSeconds() < 10) {
		this.second = "0" + date.getSeconds();
	} else {
		this.second = date.getSeconds();
	}
	//				自定义时间显示格式
	var currentTime = this.year + "年" + this.month + "月" + this.date + "日 " + " " + this.hour + "点";
	var elt = $('.clock');
	//		elt.innerHTML = currentTime;
	elt.text(currentTime);
	//console.log(currentTime)
	setTimeout(displayTime, 1000); //1秒后回调本函数执行
}
//数据表对象赋值获取
var cpuchart = echarts.init(document.getElementById('cpu_table'));
var ncchart = echarts.init(document.getElementById('nc_table'));
var ypchart = echarts.init(document.getElementById('yp_table'));
var speedchart = echarts.init(document.getElementById('speed_table'));
var ztchart = echarts.init(document.getElementById('zt'));
var ycchart = echarts.init(document.getElementById('yc'));
//4个表x轴时间数组初始化
var x = [0],
	x2 = [0],
	x3 = [0],
	x4 = [0];
//	x5 = [0];
//设置横坐标时间的初始值
var date = new Date();
var nowtime = date.getDate();
var h = date.getHours();
var m = date.getMinutes();
var ce = date.getSeconds();
var frtimeis = m + ':' + ce;
x[0] = x2[0] = x3[0] = x4[0]  = frtimeis;//页面加载的当前时间
/*图表对象*/
var cpu, nc, yp, speed, jryj, yc;

var a1 = [0],//cpuY轴数据
	a2 = [0],//内存Y轴数据
	a3 = [0],//硬盘Y轴数据
	a4 = [0],//网速流入Y轴数据
	a5 = [0];//网速流出Y轴数据
var j1 = j2 = j3 = j4 = j5 = 1;
var i1 = i2 = i3 = i4 = i5 = 1;
/*获取4个表的第一次参数放置下标0*/
//CPU默认表
$.ajax({
	type: "get",
	url: "/server/getCpu",
	data:{"date":new Date(),"token":""},
	async: false,
	success: function(d) {
		if(d.status == 200) {
			var tableData = d.data;
			if(tableData != null&&tableData!="0") {
				a1[0] = tableData.toFixed(2);
				$('.nc_lab').removeClass('red green').addClass('green');
				$('.nc_lab .men-attr-head').text('正常');
			} else {
				a1[0] = '';
				$('.nc_lab').removeClass('red green').addClass('red');
				$('.nc_lab .men-attr-head').text('异常');

			}

			//l1cpu(tableData.cpudt);
			cpu = {
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
						let text = `<p style="padding:0 5px;">` + params.name + ` CPU:` + params.data + `%</p>`
						return text;
					}
				},
				grid: {
					left: 0,
					bottom: 0,
					right: 0,
					top: 10,
					borderColor: "#000",
					containLabel: true
				},
				xAxis: {
					type: 'category',
					show: true,
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
						//rotate: 45,
						margin: 20,
						fontSize: 12, //度角倾斜显示
					},
					data: x
				},
				yAxis: {
					type: 'value',
					axisLabel: {
						formatter: '{value} %'
					},
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
					max: '100'
				},
				series: [{
					data: a1,
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
			cpuchart.setOption(cpu);
		} else {
			alert("数据为空");
		}
	}
});
//内存默认表
$.ajax({
	type: "get",
    url: "/server/getMemory",
    data:{"date":new Date(),"token":""},
	async: true,
	success: function(d) {
		if(d.status == 200) {
			var tableData = d.data;
			if(tableData != null&&tableData!="0") {
				a2[0] = tableData.toFixed(2);
				$('.CPU_lab').removeClass('red green').addClass('green');
				$('.CPU_lab .men-attr-head').text('正常');
			} else {
				a2[0] = '';
				$('.CPU_lab').removeClass('red green').addClass('red');
				$('.CPU_lab .men-attr-head').text('异常');

			}
			nc = {
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
						let text = `<p style="padding:0 5px;">` + params.name + ` 内存:` + params.data + `%</p>`
						return text;
					}
				},
				grid: {
					left: 0,
					bottom: 0,
					right: 0,
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
						//rotate: 35,
						margin: 20,
						fontSize: 12, //度角倾斜显示
					},
					data: x
				},
				yAxis: {
					type: 'value',
					axisLabel: {
						formatter: '{value} %'
					},
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
					max: '100'
				},
				series: [{
					data: a2,
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
			ncchart.setOption(nc);
		} else {
			alert("数据为空");
		}
	}
});
/*硬盘数据表*/
$.ajax({
	type: "get",
    url: "/server/getDisk",
    data:{"date":new Date(),"token":""},
    async: true,
	success: function(d) {
		if(d.status == 200) {
			var tableData = d.data;
			if(tableData != null&&tableData!="0") {
				a3[0] = tableData.toFixed(2);
				$('.yp_lab').removeClass('red green').addClass('green');
				$('.yp_lab .men-attr-head').text('正常');
			} else {
				a3[0] = '';
				$('.yp_lab').removeClass('red green').addClass('red');
				console.log('异常')
				$('.yp_lab .men-attr-head').text('异常');
			}
			yp = {
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
						let text = `<p style="padding:0 5px;">` + params.name + ` 硬盘:` + params.data + `%</p>`
						return text;
					}
				},
				grid: {
					left: 0,
					bottom: 0,
					right: 0,
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
						//rotate: 35,
						margin: 20,
						fontSize: 12, //度角倾斜显示
					},
					data: x
				},
				yAxis: {
					type: 'value',
					axisLabel: {
						formatter: '{value} %'
					},
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
					max: '100'
				},
				series: [{
					data: a3,
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
			ypchart.setOption(yp);
		} else {
			alert("数据为空");
		}
	}
});
/*网速流表*/
$.ajax({
	type: "get",
    url: "/server/getIntent",
    data:{"date":new Date(),"token":""},
    async: true,
	success: function(d) {
		if(d.status == 200) {
			var tableData = d.data;
			if(tableData != null) {
				var tt = tableData.split('+');
				a5[0] = (tt[0] / 1024).toFixed(2);
				a4[0] = (tt[1] / 1024).toFixed(2);
				$('.wl_lab').removeClass('red green').addClass('green');
				$('.wl_lab .men-attr-head').text('正常');

			} else {
				a4[0] = '';
				a5[0] = '';
				$('.wl_lab').removeClass('red green').addClass('red');
				$('.wl_lab .men-attr-head').text('异常');

			}

			var maxval;
			if(a4[0] > a5[0]) {
				maxval = Math.round(a4[0]) + 5
			} else if(a4[0] < a5[0]) {
				maxval = Math.round(a5[0]) + 5
			} else if(a4[0] = a5[0]) {
				maxval = Math.round(a5[0]) + 5
			}
			speed = {

				color: ['#df5b6a', '#29a0fc'],
				textStyle: {
					color: 'white'
				},
				tooltip: {
					trigger: 'axis',
					position: 'top',
					backgroundColor: 'rgba(0,183,238,0.5)',
					axisPointer: {
						type: 'line'
					},
					/*ie中下列样式会不兼容*/
					formatter: function(params) {
						let text;
						/*判断xy轴是否有值再显示tip，否则会出现显示数据内容为undefined*/
						if(params[1].data == undefined && params[0].data == undefined) {
							text = `<p style="padding:0 5px;display:none">` + params[0].name + `</br>` + '流出：' + params[1].data + ' k  流入：' + params[0].data + ` k</p>`
						} else {
							text = `<p style="padding:0 5px;">` + params[0].name + `</br>` + '流出：' + params[1].data + ' k  流入：' + params[0].data + ` k</p>`
						}
						return text;
					}
				},
				legend: {
					orient: 'horizontal', // 'vertical'
					x: 'center', // 'center' | 'left' | {number},
					y: 'bottom', //| {number}'top', // 'center' | 

					itemWidth: 15,
					icon: 'rect',
					right: 15,
					textStyle: {
						color: '#ffffff',
						padding: [0, 0, 0, 10],
						fontSize: 12,
					},

					itemGap: 60,
					data: ['流出速率', '流入速率']
				},
				grid: {
					left: 0,
					bottom: 40,
					right: 0,
					top: 10,
					borderColor: "#000",
					containLabel: true
				},
				xAxis: {
					type: 'category',
					boundaryGap: 29,

					data: x,
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

					type: 'value',
					axisLabel: {
						formatter: '{value} k'
					},
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
						name: '流出速率',
						type: 'line',
						//				symbolSize: 12,
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
						data: a4
					},
					{
						name: '流入速率',
						type: 'line',
						//				symbolSize: 12,
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
						data: a5
					}
				]
			};
			speedchart.setOption(speed);
		} else {
			alert("数据为空");
		}
	}
});

//	//CPC动态数据定时获取---周期修改
//	$(document).on('click', '#cpu24', function() {
//		$('#cpu60').removeClass('lightboder lightboder2').addClass('lightboder');
//		$(this).removeClass('lightboder lightboder2').addClass('lightboder2');
//		clearInterval(intervalcpu);
//		intervalcpu = setInterval(crecputab, 1000 * 1); //24小时
//	})
//	$(document).on('click', '#cpu60', function() {
//		$('#cpu24').removeClass('lightboder lightboder2').addClass('lightboder');
//		$(this).removeClass('lightboder lightboder2').addClass('lightboder2');
//		clearInterval(intervalcpu);
//		intervalcpu = setInterval(crecputab, 1000 * 2); //60分钟
//	})
//	//内存动态数据定时获取---周期修改
//	$(document).on('click', '#nc24', function() {
//		$('#nc60').removeClass('lightboder lightboder2').addClass('lightboder');
//		$(this).removeClass('lightboder lightboder2').addClass('lightboder2');
//		clearInterval(intervalnc);
//		intervalnc = setInterval(crenctab, 1000 * 1);
//	})
//	$(document).on('click', '#nc60', function() {
//		$('#nc24').removeClass('lightboder lightboder2').addClass('lightboder');
//		$(this).removeClass('lightboder lightboder2').addClass('lightboder2');
//		clearInterval(intervalnc);
//		intervalnc = setInterval(crenctab, 1000 * 2);
//	})
//	//硬盘动态数据定时获取---周期修改
//	$(document).on('click', '#yp24', function() {
//		$('#yp60').removeClass('lightboder lightboder2').addClass('lightboder');
//		$(this).removeClass('lightboder lightboder2').addClass('lightboder2');
//		clearInterval(intervalyp);
//		intervalyp = setInterval(creyptab, 1000 * 1);
//	})
//	$(document).on('click', '#yp60', function() {
//		$('#yp24').removeClass('lightboder lightboder2').addClass('lightboder');
//		$(this).removeClass('lightboder lightboder2').addClass('lightboder2');
//		clearInterval(intervalyp);
//		intervalyp = setInterval(creyptab, 1000 * 2);
//	})
//	//网络动态数据定时获取---周期修改
//	$(document).on('click', '#wl24', function() {
//		$('#wl60').removeClass('lightboder lightboder2').addClass('lightboder');
//		$(this).removeClass('lightboder lightboder2').addClass('lightboder2');
//		clearInterval(intervalwl);
//		intervalwl = setInterval(crewltab, 1000 * 1);
//	})
//	$(document).on('click', '#wl60', function() {
//		$('#wl24').removeClass('lightboder lightboder2').addClass('lightboder');
//		$(this).removeClass('lightboder lightboder2').addClass('lightboder2');
//		clearInterval(intervalwl);
//		intervalwl = setInterval(crewltab, 1000 * 2);
//	})
 
/*4个表数据的定时获取*/
var intervalcpu = setInterval(crecputab, 1000 * 5); //CPU定时
var intervalnc = setInterval(crenctab, 1000 * 5); //内存定时
var intervalyp = setInterval(creyptab, 1000 * 5); //硬盘定时
var intervalwl = setInterval(crewltab, 1000 * 5); //网速流定时
/*CPU数据获取处理---标签赋值、y轴数据赋值*/
function crecputab() {
	//sbyclab();
	var date = new Date();
	var nowtime = date.getDate();
	var h = date.getHours();
	var m = date.getMinutes();
	var ce = date.getSeconds();
	var timeis = m + ':' + ce;
	var xtime = timeis;
	var aa1;
	$.ajax({
        url: "/server/getCpu",
        data:{"date":new Date(),"token":""},
        async: true,
		success: function(d) {
			if(d.status == 200) {
				var tableData = d.data;
				if(tableData != null&&tableData!="0") {
					aa1 = tableData.toFixed(2); //小数点后两位数
					$('.CPU_lab').removeClass('red green').addClass('green');
					$('.CPU_lab .men-attr-head').text('正常');
				} else {
					aa1 = ''; //小数点后两位数
					$('.CPU_lab').removeClass('red green').addClass('red');
					$('.CPU_lab .men-attr-head').text('异常');

				}

				a1.length = 8;
				if(i1 == (a1.length)) {
					a1.shift();
					a1.push(aa1);

				}
				if(i1 < a1.length) {
					if(i1 != (a1.length)) {
						a1[i1] = aa1;

						i1 = i1 + 1;
					}
				}
				/*x轴时间*/
				x.length = 8;
				if(j1 == (x.length)) {
					x.shift();
					x.push(xtime);

				}
				if(j1 < x.length) {
					if(j1 != (x.length)) {
						x[j1] = xtime;
						var c = j1 + 1;
						for(c; c < x.length; c++) {
							x[c] = 0;
						}

						j1 = j1 + 1;
					}
				}
				cpuchart.setOption({
					xAxis: {
						data: x
					},
					series: [{
						data: a1
					}]
				})
			} else {
				alert("数据为空");
			}
		}
	});
}
/*内存数据处理---标签赋值、y轴数据赋值*/
function crenctab() {
	var date = new Date();
	var nowtime = date.getDate();
	var h = date.getHours();
	var m = date.getMinutes();
	var ce = date.getSeconds();
	var timeis = m + ':' + ce;
	var xtime = timeis;
	var aa2;
	$.ajax({
        url: "/server/getMemory",
        data:{"date":new Date(),"token":""},
        async: true,
		success: function(d) {
			if(d.status == 200) {
				var tableData = d.data;
				if(tableData != null&&tableData!="0") {
					aa2 = tableData.toFixed(2);
					$('.nc_lab').removeClass('red green').addClass('green');
					$('.nc_lab .men-attr-head').text('正常');
				} else {
					aa2 = '';
					$('.nc_lab').removeClass('red green').addClass('red');
					$('.nc_lab .men-attr-head').text('异常');

				}
				a2.length = 8;
				/*内存表*/
				if(i2 == (a2.length)) {
					a2.shift();
					a2.push(aa2);

				}
				if(i2 < a2.length) {
					if(i2 != (a2.length)) {
						a2[i2] = aa2;

						i2 = i2 + 1;
					}
				}
				/*x轴时间*/
				x2.length = 8;
				if(j2 == (x2.length)) {
					x2.shift();
					x2.push(xtime);

				}
				if(j2 < x2.length) {
					if(j2 != (x2.length)) {
						x2[j2] = xtime;
						var c = j2 + 1;
						for(c; c < x2.length; c++) {
							x2[c] = 0;
						}

						j2 = j2 + 1;
					}
				}
				ncchart.setOption({
					xAxis: {
						data: x2
					},
					series: [{
						data: a2
					}]
				})
			} else {
				alert("数据为空");
			}
		}
	});
}
/*硬盘数据处理---标签赋值、y轴数据赋值*/
function creyptab() {

	var date = new Date();
	var nowtime = date.getDate();
	var h = date.getHours();
	var m = date.getMinutes();
	var ce = date.getSeconds();
	var timeis = m + ':' + ce;
	var xtime = timeis;
	var aa3;
	$.ajax({
		type: "get",
        url: "/server/getDisk",
        data:{"date":new Date(),"token":""},
        async: true,
		success: function(d) {
			if(d.status == 200) {
				var tableData = d.data;
				if(tableData != null&&tableData!="0") {

					aa3 = tableData.toFixed(2);
					$('.yp_lab').removeClass('red green').addClass('green');
					$('.yp_lab .men-attr-head').text('正常');
				} else {
					aa3 = '';
					$('.yp_lab').removeClass('red green').addClass('red');
					$('.yp_lab .men-attr-head').text('异常');

				}
				a3.length = 8;
				/*内存表*/
				if(i3 == (a3.length)) {
					a3.shift();
					a3.push(aa3);

				}
				if(i3 < a3.length) {
					if(i3 != (a3.length)) {
						a3[i3] = aa3;

						i3 = i3 + 1;
					}
				}
				/*x轴时间*/
				x3.length = 8;
				if(j3 == (x3.length)) {
					x3.shift();
					x3.push(xtime);

				}
				if(j3 < x3.length) {
					if(j3 != (x3.length)) {
						x3[j3] = xtime;
						var c = j3 + 1;
						for(c; c < x3.length; c++) {
							x3[c] = 0;
						}

						j3 = j3 + 1;
					}
				}
				ypchart.setOption({
					xAxis: {
						data: x3
					},
					series: [{
						data: a3
					}]
				})
			} else {
				alert("数据为空");
			}
		}
	});
}
/*网速数据处理---标签赋值、y轴数据赋值*/
function crewltab() {

	var date = new Date();
	var nowtime = date.getDate();
	var h = date.getHours();
	var m = date.getMinutes();
	var ce = date.getSeconds();
	var timeis = m + ':' + ce;
	var xtime = timeis;
	var aa4;
	var aa5;
	$.ajax({
		type: "get",
        url: "/server/getIntent",
        data:{"date":new Date(),"token":""},
        async: true,
		success: function(d) {
			if(d.status == 200) {
				var tableData = d.data;
				var dt;
				console.log(tableData)
				if(tableData != null) {
					dt = tableData.split('+');
					aa5 = (dt[0] / 1024).toFixed(2);
					aa4 = (dt[1] / 1024).toFixed(2);

					$('.wl_lab').removeClass('red green').addClass('green');
					$('.wl_lab .men-attr-head').text('正常');
				} else {
					aa4 = '';
					aa5 = '';
					$('.wl_lab').removeClass('red green').addClass('red');
					$('.wl_lab .men-attr-head').text('异常');

				}

				var maxval;
				if(aa4 > aa5) {
					maxval = Math.round(aa4) + 5
				} else if(aa4 < aa5) {
					maxval = Math.round(aa5) + 5
				} else if(aa4 = aa5) {
					maxval = Math.round(aa5) + 5
				}
				a4.length = a5.length = 8;
				/*网速表*/
				if(i4 == (a4.length)) {
					a4.shift();
					a4.push(aa4);

				}
				if(i4 < a4.length) {
					if(i4 != (a4.length)) {
						a4[i4] = aa4;

						i4 = i4 + 1;
					}
				}
				if(i5 == (a5.length)) {
					a5.shift();
					a5.push(aa5);

				}
				if(i5 < a5.length) {
					if(i5 != (a5.length)) {
						a5[i5] = aa5;

						i5 = i5 + 1;
					}
				}
				/*x轴时间*/
				x4.length = 8;
				if(j4 == (x4.length)) {
					x4.shift();
					x4.push(xtime);

				}
				if(j4 < x4.length) {
					if(j4 != (x4.length)) {
						x4[j4] = xtime;
						var c = j4 + 1;
						for(c; c < x4.length; c++) {
							x4[c] = 0;
						}

						j4 = j4 + 1;
					}
				}
				speedchart.setOption({
					xAxis: {
						data: x4
					},
					series: [{
						data: a4
					}, {
						data: a5
					}],
					//						yAxis: [{
					//							min: '0',
					//							max: maxval,
					//
					//						}]
				})
			} else {
				alert("数据为空");
			}
		}
	});
}
/*停止按钮*/
$(document).on('click', '#stop', function() {
    $.ajax({
        type: "get",
        url: "/server/serviceStop",
        async: true,
        success: function(d) {
            if(d.status == 200) {
                var tableData = d.data;
                var col;
                if (tableData==0){
                	alert("关闭失败");
				}else {
                    alert("关闭成功");
                    $("#start").attr("disabled",false).removeClass('lightboder4').addClass('lightboder2').css('cursor','pointer');
                    $("#stop").attr("disabled",true).removeClass('lightboder2').addClass('lightboder4').css('cursor','not-allowed');
				}
                location.reload();
            } else {
                alert("数据为空");
            }
        }
    });
})
/*开启按钮*/
layui.use('form', function() {
    var $ = jQuery;
    var layer = layui.layer;
    function showLoad() {
        return layer.msg('服务开启中...', {
            icon: 16,
            shade: [0.6, '#f5f5f5'],
            scrollbar: false,
            offset: 'auto',
            time: 1000 * 10
        }, function(){
           location.reload();
        });
    }

    $(document).on('click', '#start', function() {
        $.ajax({
            type: "get",
            url: "/server/serviceStart",
            async: true,
            success: function(d) {
            }
        });
        showLoad();
    })
});

/*刷新*/
$(document).on('click', '#refresh', function() {
	location.reload();
})

//服务器状态图生成
function fwqstate() {
	$.ajax({
		type: "get",
		url: "/server/getStatus",
		async: true,
		data:{"date":new Date(),"token":""},
		success: function(d) {
			if(d.status == 200) {
				var tableData = d.data;
				var col;
				if(tableData == 1) {
					col = '#21cdcc'
					te = '运行中...'
                    $("#stop").attr("disabled",false).removeClass('lightboder4').addClass('lightboder2').css('cursor','pointer');
                    $("#start").attr("disabled",true).removeClass('lightboder2').addClass('lightboder4').css('cursor','not-allowed');
				} else if(tableData == 0) {
					col = '#df5b6a'
					te = '未开启...'
                    $("#start").attr("disabled",false).removeClass('lightboder4').addClass('lightboder2').css('cursor','pointer');
                    $("#stop").attr("disabled",true).removeClass('lightboder2').addClass('lightboder4').css('cursor','not-allowed');
				} else {

					alert('设备状态数据异常');
				}
				
				zttable(tableData, col, te);
			} else {
				alert("数据为空");
			}
		}
	});
}
function zttable(num, col, te) {
	console.log(te)
	zt = {
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
			top: 'center',
			style: {
				text: te,
				textAlign: 'center',
				fill: '#fff',
				//                      width: 30,
				//                      height: 30,
				fontSize: 16,
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
	ztchart.setOption(zt);
}


/*异常数遍历--dom加载完执行*/
function sbty() {
	var ty = [$('.CPU_lab .men-attr-head'), $('.nc_lab .men-attr-head'), $('.yp_lab .men-attr-head'), $('.wl_lab .men-attr-head')];

	//console.log(ty.length);
	var ycdata = 0;
	for(var i = 0; i < ty.length; i++) { //获取的长度
		if(ty[i].text() == '异常') {
			/*顺便计算异常个数并赋值*/
			ycdata = ycdata + 1;
		}
	}
	//console.log(ycdata)
	//同步调用生成设备异常数图表函数
	yctablecre(ycdata);
}

/*异常数图表生成*/
function yctablecre(num) {
	if(num > 0) {
		col = '#df5b6a'
	} else if(num == 0) {
		col = '#21cdcc'
	}
	te = num
	yc = {
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
			top: 'center',
			style: {
				text: te,
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
	ycchart.setOption(yc);
	
}
	var ycnum = 0;
//	设置异常数量初始值并运行获取默认的第一次数据
	ycdatamr();	
	function ycdatamr(){	
//	以下第一次数据获取获取取消ajax的异步加载，以便在ajax外拿到默认的第一次数据异常的个数
//注：ajax使用异步加载时，ajax外部获取不到数据 可取消异步加载或将数据赋值到dom的value之类在获取，但繁杂麻烦。。真的
		/*CPU*/
		$.ajax({
			type: "get",
			url: "cpuzyl.json", //+state
			async: false,
			dataType: 'json',
			success: function(d) {
				if(d.status == 200) {
					var tableData = d.data;
					if(tableData == null){
						ycnum = ycnum +1;
					}
				} else {
					alert("数据为空");
				}
			}
		});
		/*内存*/
		$.ajax({
			type: "get",
			url: "cpuzyl.json", //+state
			async: false,
			dataType: 'json',
			success: function(d) {
				if(d.status == 200) {
					var tableData = d.data;
					if(tableData == null){
						ycnum = ycnum +1;
					}
				} else {
					alert("数据为空");
				}
			}
		});
		/*硬盘*/
		$.ajax({
			type: "get",
			url: "cpuzyl.json", //+state
			async: false,
			dataType: 'json',
			success: function(d) {
				if(d.status == 200) {
					var tableData = d.data;
					if(tableData == null){
						ycnum = ycnum +1;
					}
				} else {
					alert("数据为空");
				}
			}
		});
		/*网流速*/
		$.ajax({
			type: "get",
			url: "speed.json", //+state
			async: false,
			dataType: 'json',
			success: function(d) {
				if(d.status == 200) {
					var tableData = d.data;
					if(tableData == null){
						ycnum = ycnum +1;
					}
				} else {
					alert("数据为空");
				}
			}
		});	
		yctablecre(ycnum)
	}