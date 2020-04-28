$(document).ready(function() {
    var d = new Date();
    var date = d.getFullYear() + "-" + (d.getMonth() + 1) + "-" + d.getDate();
	var $ = jQuery;
	var jzfbtchart = echarts.init(document.getElementById('jzfbt'));
	// 戒治人数分布图
	$.get("/abstinence/stageDistribution", {
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

    // //详细档案跳转
    $(document).on("click", '#msgDetils', function(d) {
            var a = $(this).parent().parent().find("p .tr_msg_id").text();
        $.get("/hazardDetils", {
                id: a
            },
            function(date) {
                if(date.status==200){
                    location.href='/hazardDetilShow';
                }
            },
            'json'
        )
    })
	//轮播图
    $.get("/safe/keyManShow", {
        date:new Date()
    }, function(date) {
        if(date.status == 200) {
            var tableData = date.data;
            var l = tableData;
            var x = tableData.length;
            var c  = Math.round(x/2);
            for(var i = 1; i <= c; i++) {
                var container = $("<div id='divctr" + i + "'></div>");
                var ll = 2 * i - 1;
                var xx = 2 * i;
                for(var z = ll; z <= xx; z++) {
                    var userName = l[z - 1].userName;
                    var userId = l[z - 1].userId;
                    var stage=l[z - 1].userHazard;
                    var userLevel = l[z - 1].userLevel;
                    var imgsrc="/photo/"+userId+".jpg";
                    var t = carousel(userName,userId,stage,userLevel,imgsrc)
                    container.append(t)
                    if(z == x) {
                        break
                    }
                }
                $(".manlabbg").append(container);
            }
        } else {
            console.log("数据为空");
        }
    }, 'json')

    layui.use('carousel', function() {
        var carousel = layui.carousel;
        var $ = layui.jquery;
        carousel.render({
            elem: '#keyPersonnel',
            width: '90%',
            anim: "default",
            // interval:1000,
            arrow: "none",
            height: "350px"
            //                ,anim: 'updown' //切换动画方式
        });

    })


	//人员风险趋势走向数据
	var ryfxqschart = echarts.init(document.getElementById('ryfxqs'));
    $.get("/hazard/peopleNum", {
        date:date
    }, function(date) {
        var tableData=date.data;
        if(date.status==200){
            var arr1 = [];
            var arr2 = [];
            for(var i = 0;i<tableData.length;i++){
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
            var jzfbt = {
                textStyle: {
                    color: 'white',
                    fontSize: 11
                },

                color: ['rgba(0,183,238,0.5)'],
                tooltip: {
                    trigger: 'axis',
                    backgroundColor: 'rgba(0,183,238,0.5)',
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
                    max: maxVal
                }],
                series: [{
                    name: '人员风险趋势',
                    type: 'bar',
                    barWidth: 20,
                    center: ['50%', '60%'],
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
            ryfxqschart.setOption(jzfbt);
        }else {
            alert("数据为空");
        }

    }, 'json')




	var sbycchart = echarts.init(document.getElementById('sbyc'), 'custom');
	//指定图表的配置项和数据
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
			var equipment_table_option = {
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
					color: ['#f09865', '#21cdcc', '#29a0fc', '#df5b6a'],
					right: 39,
					textStyle: {
						color: '#ffffff'
					},


					itemGap: 12,
					data: ['监控设备', '门禁设备', '环控设备', '定位设备']
				},
				grid: {
					left: 45,
					bottom: 20,
					right: 39,
					top: 38,
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
						show: false,
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
						symbolSize: 12,
						type: 'line',
		//				symbol: "circle",
		//				itemStyle: {
		//					normal: {
		//						color: "#1c3970", // 会设置点和线的颜色，所以需要下面定制 line
		//						borderColor: "#f09865" // 点边线的颜色
		//					}
		//
		//				},
		//				lineStyle: {
		//					normal: {
		//						color: "#f09865" // 线条颜色
		//					}
		//				},

						data: video
					},
					{
						name: '门禁设备',
						symbolSize: 12,
						type: 'line',
						data: door
					},
					{
						name: '环控设备',
						symbolSize: 12,
						type: 'line',
						data: envir
					},
					{
						name: '定位设备',
						symbolSize: 12,
						type: 'line',
						data: locat
					}
				]
			};
			sbycchart.setOption(equipment_table_option);
	} else {
			alert("数据为空");
		}
	}, 'json')


	var $ = jQuery;
	//人员定位分析 下拉框
	$("#map-select").change(function() {
		//form.on('select(eq-select)', function(data){		    	
		switch($(this).children('option:selected').val()) {
			case "1":
				$("#coi_map").attr("src", "../img/ioc_bg.png");
				break;
			case "2":
				$("#coi_map").attr("src", "../img/ioc_bg.png");
				break;
			case "3":
				$("#coi_map").attr("src", "../img/ioc_bg.png");
				break;
			case "4":
				$("#coi_map").attr("src", "../img/ioc_bg.png");
				break;
			case "5":
				$("#coi_map").attr("src", "../img/ioc_bg.png");
				break;
		}
	});


//默认子下拉框
    var opt = '/safe/videoFour';//改
    aptadd1(opt,1);
    function aptadd1(url,num){  //请求路径,num为1级下拉框发送的请求
        $.get(url, {
            id:num
        }, function(date) {
            if(date.status == 200) {
                var data = date.data;
                var opt;
                $('#eq-select2 option').remove();
                for(var i=0;i<data.length;i++){
                    opt = $('<option value="'+data[i].ip+'" style="background-color: #1f2568;font-size: 16px;">'+data[i].place+'</option>');
                    $('#eq-select2').append(opt);
                }
                vxgplayer('vxg_media_player0').onReadyStateChange(function(onreadyState){
                    vxgplayer('vxg_media_player0').src("rtsp://admin:12345678a@"+data[0].ip+":554/cam/realmonitor?channel=1&subtype=0");
                    console.log(vxgplayer('vxg_media_player0').src());
                    vxgplayer('vxg_media_player0').play();
                });
                vxgplayer('vxg_media_player0').onError(function(onErr){
                    console.log("player ERROR: " + vxgplayer('vxg_media_player0').error());
                });
            } else {
                console.log("数据为空");
            }
        }, 'json')
    }

	//安防监控联动下拉框
    $("#eq-select").change(function() {
        var opt = '/safe/videoFour'
        var optnum = $(this).children('option:selected').val();//1级下拉框的val值,对应12345
        aptadd(opt,optnum)
    });

//子下拉框事件
    $("#eq-select2").change(function() {

    	var options2=$(this).children('option:selected').val();
            vxgplayer('vxg_media_player0').src("rtsp://admin:12345678a@"+options2+":554/cam/realmonitor?channel=1&subtype=0");
            vxgplayer('vxg_media_player0').play();
    });

//子下拉框选项获取
    function aptadd(url,num){  //请求路径,num为1级下拉框发送的请求
        $.get(url, {
            id:num
        }, function(date) {
            if(date.status == 200) {
                var data = date.data;
                var opt;
                $('#eq-select2 option').remove();
                for(var i=0;i<data.length;i++){
                    opt = $('<option value="'+data[i].ip+'" style="background-color: #1f2568;font-size: 16px;">'+data[i].place+'</option>');
                    $('#eq-select2').append(opt);
                }

            } else {
                console.log("数据为空");
            }
        }, 'json')
    }





	/*入所戒治*/
	var rsjzdbchart = echarts.init(document.getElementById('rsjzdb'));
	$.get("/json/rsjz.json", {
		pageNo: 'zt'
	}, function(date) {
		if(date.status == 200) {
			var tableData = date.data;
			var rsjzdb = {
				color: ['#29A0FC', '#F09865'],

				tooltip: {
					show: true,
					trigger: 'item',
					backgroundColor: 'rgba(0,183,238,0.5)',
					formatter: "{d}%"
				},
				legend: {
					icon: 'rect',
					textStyle: {
						color: 'white',
						fontSize: 11
					},
					orient: 'vertical',
					left: 20,
					top: 30,
					itemWidth: 14,
					itemGap: 39,
					data: ['入所数', '戒治数']
				},
				series: [{
					type: 'pie',
					radius: [60, 80],
					center: ['70%', '50%'],
					avoidLabelOverlap: false,
					label: {
						normal: {
							show: false,
                            formatter: '{d}%',
							textStyle: {
								fontSize: '30',
								fontWeight: 'bold'
							},
							position: 'center'
						},
						emphasis: {
							show: true,
                            formatter: '{d}%',
							textStyle: {
								fontSize: '30',
								fontWeight: 'bold',
								color: '#fff'
							}
						}
					},
					labelLine: {
						normal: {
							show: false
						}
					},
					data: [{
							value: tableData.rusuo,
							name: '入所数'
						},
						{
							value: tableData.jiezhi,
							name: '戒治数'
						},
					]
				}]
			};
			// 使用刚指定的配置项和数据显示图表。
			rsjzdbchart.setOption(rsjzdb);
            var index = 0; //默认选中高亮模块索引
            rsjzdbchart.dispatchAction({
                type: 'highlight',
                seriesIndex: 0,
                dataIndex: 0
            }); //设置默认选中高亮部分
            rsjzdbchart.on('mouseover', function(e) {
                if(e.dataIndex != index) {
                    rsjzdbchart.dispatchAction({
                        type: 'downplay',
                        seriesIndex: 0,
                        dataIndex: index
                    });
                }
            });
            rsjzdbchart.on('mouseout', function(e) {
                index = e.dataIndex;
                rsjzdbchart.dispatchAction({
                    type: 'highlight',
                    seriesIndex: 0,
                    dataIndex: e.dataIndex
                });
            });
		} else {
			alert("数据为空");
		}
	}, 'json')

	var rsjzdb_selectchart = echarts.init(document.getElementById('rsjzdb_select'));
	$.get("/json/rsjz.json", {
		pageNo: 'zt'
	}, function(date) {
		if(date.status == 200) {
			var tableData = date.data;
			var rsjzdb_select = {
				color: ['#29A0FC'],
				tooltip: {
					show: true,
					trigger: 'item',
					backgroundColor: 'rgba(0,183,238,0.5)',
					formatter: "{d}%"
				},
				series: [{
					type: 'pie',
					radius: [60, 70],
					center: ['45%', '50%'],
					avoidLabelOverlap: false,
					backgroundColor: 'rgba(0,183,238,0.5)',
					stillShowZeroSum: false,
					silent: true,
					label: {
						normal: {
							show: true,
                            formatter: '{b}人',
							textStyle: {
								fontSize: '30',
								fontWeight: 'bold',
								color: '#fff'
							},
							position: 'center'
						},
						emphasis: {
							show: true,
							textStyle: {
								fontSize: '30',
								fontWeight: 'bold',
								color: '#fff'
							}
						}
					},
					labelLine: {
						normal: {
							show: false
						}
					},
					data: [{
						value: tableData.rusuo,
						name: tableData.rusuo
					}]
				}]
			};
			rsjzdb_selectchart.setOption(rsjzdb_select);
		} else {
			alert("数据为空");
		}
	}, 'json')



	rsjzdbchart.on('mouseover', function(params) {
		var val = params.data.value;
		var name = params.data.name;
		var color = params.color;
		var rsjzdb_select = {
			color: color,
			tooltip: {
				show: false,
				trigger: 'item',
				backgroundColor: 'rgba(0,183,238,0.5)',
				formatter: "{b}: {c}"
			},

			series: [{
				type: 'pie',
				radius: [60, 70],
				center: ['45%', '50%'],
				avoidLabelOverlap: false,
				silent: true,
				label: {
					normal: {

						show: true,
                        formatter: '{b}人',
						position: 'center'
					},
					emphasis: {
						show: false,
						textStyle: {
							fontSize: '30',
							fontWeight: 'bold'
						}
					}
				},
				labelLine: {
					normal: {
						show: false
					},
					emphasis: {
						show: true
					}
				},
				data: [{
					value: val,
					name: val
				}]
			}],
		};
		rsjzdb_selectchart.setOption(rsjzdb_select);
	})
	console.log(rsjzdb_selectchart)
})
function imgerror(img){
    img.src="../img/photo_img.png";
    img.onerror=null;   //控制不要一直跳动
}
function carousel(name,id,stage,level,src){
    var divctr;
    if(level == "A"){
        divctr = $("<div class='keyPersonnel_item'> \
					<div class='keyPersonnel_item_left'>\
					<div class='zdry_img lightboder3'>\
					<img src='"+src+"' onerror='imgerror(this)'/></div>\
					<div class='info lightboder3'>\
					<p>姓名:<span>"+name+"</span></p>\
							<p>编号:<span class='tr_msg_id'>"+id+"</span></p>\
					<p>风险分析：<span>"+stage+"</span></p>\
					<p><a id='msgDetils'>详细信息</a></p></div>\
					<div class='keyPersonnel_class red lightboder3'>\
					<div class='keyPersonnel_class-text'>\
					<p class='score'>"+level+"</p>\
					<p class='v-desc'>风险等级</p>\
					</div></div></div></div>")
    }else if(level == "B"){
        divctr = $("<div class='keyPersonnel_item'> \
					<div class='keyPersonnel_item_left'>\
					<div class='zdry_img lightboder3'>\
					<img src='"+src+"' onerror='imgerror(this)'/></div>\
					<div class='info lightboder3'>\
					<p>姓名:<span>"+name+"</span></p>\
					<p>编号:<span class='tr_msg_id'>"+id+"</span></p>\
					<p>风险分析：<span>"+stage+"</span></p>\
					<p><a id='msgDetils'>详细信息</a></p></div>\
					<div class='keyPersonnel_class yellow lightboder3'>\
					<div class='keyPersonnel_class-text'>\
					<p class='score'>"+level+"</p>\
					<p class='v-desc'>风险等级</p>\
					</div></div></div></div>")
    }else if(level == "C"){
        divctr = $("<div class='keyPersonnel_item'> \
					<div class='keyPersonnel_item_left'>\
					<div class='zdry_img lightboder3'>\
					<img src='"+src+"' onerror='imgerror(this)'/></div>\
					<div class='info lightboder3'>\
					<p>姓名:<span>"+name+"</span></p>\
					<p>编号:<span class='tr_msg_id'>"+id+"</span></p>\
					<p>风险分析：<span>"+stage+"</span></p>\
					<p><a id='msgDetils'>详细信息</a></p></div>\
					<div class='keyPersonnel_class blue lightboder3'>\
					<div class='keyPersonnel_class-text'>\
					<p class='score'>"+level+"</p>\
					<p class='v-desc'>风险等级</p>\
					</div></div></div></div>")
    }
    else if(level == "正常" || level == ''){
        divctr = $("<div class='keyPersonnel_item'> \
					<div class='keyPersonnel_item_left'>\
					<div class='zdry_img lightboder3'>\
					<img src='"+src+"' onerror='imgerror(this)'/></div>\
					<div class='info lightboder3'>\
					<p>姓名:<span>"+name+"</span></p>\
					<p>编号:<span class='tr_msg_id'>"+id+"</span></p>\
					<p>风险分析：<span>"+stage+"</span></p>\
					<p><a id='msgDetils'>详细信息</a></p></div>\
					<div class='keyPersonnel_class green lightboder3'>\
					<div class='keyPersonnel_class-text'>\
					<p class='score middle'>正常</p>\
					<p class='v-desc'>风险等级</p>\
					</div></div></div></div>")
    }
    return divctr
}