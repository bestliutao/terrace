$(document).ready(function() {
	var grdrangeDate = new Date().getFullYear();//全局默认年份
    var d = new Date();
    var moth = d.getFullYear() + "-" + d.getMonth();

    //详细档案跳转
    $(document).on("click", '#msgDetils', function(d) {
        var a = $(this).parent().find("div #manId").text();
        $.get("/absDetils", {
                id: a
            },
            function(date) {
                if(date.status==200){
                    location.href='/effectivenessDetails';
                }
            },
            'json'
        )
    })
	
	var grdrangemonth;
	//分页点击效果动态添加移除------------
	//时期类型
	$(document).on("click", '.efficacytype_ul li', function(d) {
		$('.efficacytype_ul li').removeClass('licolor');
		$(this).addClass('licolor');
		var msg_id = $(this);
		//		console.log(msg_id);
	})
	//分数段
	$(document).on("click", '.gradetype_ul li', function(c) {
		$('.gradetype_ul li').removeClass('licolor');
		$(this).addClass('licolor');
		var msg_id = $(this);

	})



	//分页点击效果动态添加移除------------
	//排序事件
	$(document).on("click", '#many', function(c) {
        var type = $(".efficacytype_ul .licolor").text(); //时期类型
        var grdrange = $(".gradetype_ul .licolor").text(); //范围类型
		$('#less').removeClass('ordered');
		$(this).addClass('ordered');
		var pageurl="/grade/detils/bonusPoints";
        showReocrd(pageurl,moth,type,grdrange ,1,12);
	})
	$(document).on("click", '#less', function(c) {
        var type = $(".efficacytype_ul .licolor").text(); //时期类型
        var grdrange = $(".gradetype_ul .licolor").text(); //范围类型
		$('#many').removeClass('ordered');
		$(this).addClass('ordered');
        var pageurl="/grade/detils/deductPoints";
        showReocrd(pageurl,moth,type,grdrange ,1,12);
	})





	//条件筛选--期限点击事件-------------------发送类型以及年份
	//全部
	$(document).on("click", '.all', function(d) {
		lineChartgeneration()
	})
	//生理脱毒期
	$(document).on("click", '.td', function(d) {
		lineChartgeneration()
	})
	//一年期
	$(document).on("click", '.oy', function(d) {
		lineChartgeneration()
	})
	//期满
	$(document).on("click", '.expire', function(d) {
		lineChartgeneration()
	})
	//上下表格单期限条件筛选
	function lineChartgeneration() {
		$('.oederdiv a').removeClass('ordered'); //移除排序点击后的选中样式
		//		$('.efficacytype_ul li').removeClass('licolor');
		//		$('.efficacytype_ul li').eq(0).addClass('licolor')
		$('.gradetype_ul li').removeClass('licolor');//移除列表选中状态
		$('.gradetype_ul li').eq(0).addClass('licolor');//列表默认为全部类型
		var datas = $('#efficacydate_select').val().split(' ');
		var type = $(".efficacytype_ul .licolor").text(); //时期类型
		var grdrange = '全部'; //范围类型---期限选择后列表默认为全部
		//		alert(datas) //时间选择器val值切割
		var data = datas[0]; //年
		// console.log(type + '-' + data);
		// console.log(type + '-' + grdrange + '-' + data);
		var lineurl;
		var pageurl;
		//由类型判断接口
		if(type == '全部') {
			lineurl = '/grade/allAvg';
			pageurl = "/grade/detils/allStudentGrade";
		} else if(type == '生理脱毒期') {
			lineurl = '/grade/allAvg';
			pageurl = "/grade/detils/allStudentGrade";
		} else if(type == '一年期') {
			lineurl = '/grade/allAvg';
			pageurl = "/grade/detils/allStudentGrade";
		} else if(type == '期满') {
			lineurl = '/grade/allAvg';
			pageurl = "/grade/detils/allStudentGrade";
		}
		linechart(lineurl, type, data);
        showReocrd(pageurl,moth,type,grdrange ,1,12);
	}
	//条件筛选--范围点击事件-------------------发送类型、范围、年份月份-YYY-MM
	$(document).on("click", '.gradeall', function(d) {
		ulChartgeneration(moth)
	})
	$(document).on("click", '.grade6', function(d) {
		ulChartgeneration(moth)
	})
	$(document).on("click", '.grade67', function(d) {
		ulChartgeneration(moth)
	})
	$(document).on("click", '.grade78', function(d) {
		ulChartgeneration(moth)
	})
	$(document).on("click", '.grade89', function(d) {
		ulChartgeneration(moth)
	})
	$(document).on("click", '.grade91', function(d) {
		ulChartgeneration(moth)
	})
	//列表生成
	function ulChartgeneration(grdrangeDate) {
		$('.oederdiv a').removeClass('ordered'); //移除排序点击后的选中样式
		var type = $(".efficacytype_ul .licolor").text(); //时期类型
		var grdrange = $(".gradetype_ul .licolor").text(); //范围类型
		var pageurl;

		//由类型判断接口
		if(type == '全部') {
			pageurl = "/grade/detils/allStudentGrade";
		} else if(type == '生理脱毒期') {
			pageurl = "/grade/detils/allStudentGrade";
		} else if(type == '一年期') {
			pageurl = "/grade/detils/allStudentGrade";
		} else if(type == '期满') {
			pageurl = "/grade/detils/allStudentGrade";
		}

        showReocrd(pageurl,grdrangeDate,type,grdrange ,1,12);
	}
	//时间选择器事件
	layui.use('laydate', function() {
		var laydate = layui.laydate;
		var d = new Date();
		var dd = d.getFullYear() + " 年 ";
		//执行一个laydate实例
		laydate.render({
			elem: '#efficacydate_select', //指定元素
			type: 'year',
			format: 'yyyy 年',
			isInitValue: true,
			value: dd,
			theme: '#3dd7fd',
			//改变月份时的回调
			change: function(value, date, endDate) {
				
				$('.oederdiv a').removeClass('ordered'); //移除排序点击后的选中样式
				$('.efficacytype_ul li').removeClass('licolor');
				$('.efficacytype_ul li').eq(0).addClass('licolor')
				$('.gradetype_ul li').removeClass('licolor');
				$('.gradetype_ul li').eq(0).addClass('licolor')
				//console.log(value); //得到日期生成的值，如：2017-08-18
				var data = date.year; //得到日期时间对象：{year: 2017, month: 8, date: 18, hours: 0, minutes: 0, seconds: 0}
				var type = $(".efficacytype_ul .licolor").text(); //时期类型 //时期类型
				var grdrange = '全部'; //范围类型
				console.log(grdrange + '-' + type + '-' + data)
				var lineurl;
				var pageurl;
				//由类型判断接口
				if(type == '全部') {
					lineurl = '/grade/allAvg';
					pageurl = "/grade/detils/allStudentGrade";
				} else if(type == '生理脱毒期') {
					lineurl = '/grade/allAvg';
					pageurl = "/grade/detils/allStudentGrade";
				} else if(type == '一年期') {
					lineurl = '/grade/allAvg';
					pageurl = "/grade/detils/allStudentGrade";
				} else if(type == '期满') {
					lineurl = '/grade/allAvg';
					pageurl = "/grade/detils/allStudentGrade";
				}
                var d = new Date();
				linechart(lineurl, type, data); //传值为接口、类型、年
                showReocrd(pageurl, data+"-"+d.getMonth(), "全部", "全部",1,12); //传值为接口、年月、类型、范围

				moth=data+"-"+d.getMonth();
			}
		});
	});
	//默认
	var lineurl = '/grade/allAvg';
	var ulurl = "/grade/detils/allStudentGrade";
	linechart(lineurl, "全部", grdrangeDate);//传值为接口、类型、年
    showReocrd(ulurl, moth, "全部", "全部",1,12);//传值为接口、年、类型、范围
	//折线图生成函数
	var date_tablechart = echarts.init(document.getElementById('efficacydate_table'));
	//	var $ = jQuery;

	function linechart(url, type, data) {
		var date_table;
		$.get(url, {
			type:type,
			year:data
		}, function(date) {
			var tableData = date.data;

			var arr = [];
			for(var i = 0; i < tableData.length; i++) {
				arr.push(Math.round(tableData[i].number));
			}
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
					data: ['1月', '2月', '3月', '4月', '5月', '6月', '7月', '8月', '9月', '10月', '11月', '12月']
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
					max: '100'
				},
				series: [{
					data: arr,
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
	//折线图拐点点击事件
	date_tablechart.on('click', function(params) {
		var data = $('#efficacydate_select').val().match(/\d+/g)[0] + '-' + params.name.match(/\d+/g); //年月
		var type = $('.efficacytype_ul .licolor').text(); //期限类型
		var grdrange = '全部'; //范围类型
		$('.oederdiv a').removeClass('ordered'); //移除排序点击后的选中样式
		$('.gradetype_ul li').removeClass('licolor');
		$('.gradetype_ul li').eq(0).addClass('licolor')
		var lineurl;
		var pageurl;
		//由类型判断接口
		if(type == '全部') {
			pageurl = "/grade/detils/allStudentGrade";
		} else if(type == '生理脱毒期') {
			pageurl = "/grade/detils/allStudentGrade";
		} else if(type == '一年期') {
			pageurl = "/grade/detils/allStudentGrade";
		} else if(type == '期满') {
			pageurl = "/grade/detils/allStudentGrade";
		}
		moth = data;//拐点点击获取年月赋值到全局变量供范围筛选时使用
        showReocrd(pageurl, moth, type, grdrange,1,12);
	});

	//分页传参函数
	var total = 0;
	var last = 0;

	function showReocrd(pageUrl, time, type, grdrange, pageNo, pageSize) {
		$.get(pageUrl, {
				type: grdrange,
				statge: type,
                time: time,
				pageNo: pageNo,
				pageSize: pageSize
			},
			function(date) {
				if(date.status == 200) {
					//加载后台返回的List集合数据
					var tableData = date.data;
					total = tableData.total;
					last = tableData.last;
                    data = tableData.data;
					for(var i = 0; i < data.length; i++) {
						//alert(data[i].userName+"  "+data[i].userPassword);	

						var li = cretable(data[i].userName, data[i].userId, data[i].statge, data[i].userGrade,data[i].gradePoor,"/photo/"+data[i].userId+".jpg");
						$('#gradedate_table ul').append(li);

					}
                    dateadd(pageUrl, time, type, grdrange);
				} else {
					alert("数据出错");
				}

			},
			"json"
		);
	}
    function showReocrd1(pageUrl, time, type, grdrange, pageNo, pageSize) {
        $.get(pageUrl, {
                //				pageType:pageType,

                type: grdrange,
                statge: type,
                time: time,
                pageNo: pageNo,
                pageSize: pageSize
            },
            function(date) {
                if(date.status == 200) {
                    //加载后台返回的List集合数据
                    var tableData = date.data;

                    total = tableData.total;
                    last = tableData.last;
                    data = tableData.data;
                    for(var i = 0; i < data.length; i++) {
                        var li = cretable(data[i].userName, data[i].userId, data[i].statge, data[i].userGrade,data[i].gradePoor);
                        $('#gradedate_table ul').append(li);

                    }
                } else {
                    alert("数据出错");
                }

            },
            "json"
        );
    }
	//初始页显示数据，默认选中第一个效果
	function dateadd(pageurl, data, type, grdrange) { //接口、年月、期限类型、分数范围

		layui.use(['laypage', 'jquery'], function() {
			var laypage = layui.laypage,
				$ = layui.$;
			$(".efficacytype_page").each(function(i, the) {
				laypage.render({
					elem: the //注意，这里的 test1 是 ID，不用加 # 号
						,
					count: total //数据总数，从服务端得到
						,
					limit: 12 //每页显示条数
						,
					curr: 1 //起始页
						,
					groups: 5 //连续页码个数
						,
					prev: '<em>' + '<' + '</em>',
					next: '<em>' + '>' + '</em>'
						//下一页文本
						,
					first: 1 //首页文本
						,
					last: last //尾页文本
						,
					layout: ['prev', 'page', 'next', 'refresh', 'skip']
						//跳转页码时调用
						,
					jump: function(obj, first) { //obj为当前页的属性和方法，第一次加载first为true
						//非首次加载 do something
						//						if(!first) {
						//清空以前加载的数据
						$('#gradedate_table ul').empty();
						//调用加载函数加载数据
						showReocrd1(pageurl, data, type, grdrange, obj.curr, obj.limit);
					}
				});
			})
		})
	}

	//初始化数据获取



})
function imgerror(img){
    img.src="../img/photo_img.png";
    img.onerror=null;   //控制不要一直跳动
}
/*数据判断，在获取到时样式添加填充*/
function cretable(name, id, type, grade,gradePoor,src) {
    grade = parseInt(grade);
    var li;
    var poor;
    if(gradePoor<0){
        src="../img/fall_icon.png"
        poor = gradePoor.match(/\d+/g)[0]+"分";
    }else if(gradePoor>0){
        src="../img/rise_icon.png"
        poor = gradePoor.match(/\d+/g)[0]+"分";
    }else{
        src=""
        poor = "";
    }
    if(grade < 60) {
        li = $("<li><div class='lightboder3' style='width:100%;height:134px;'>\
					<div class='tabtrdiv '>\
					<div class='tr_ph lightboder3'>\
					<img src='" + src + "' onerror='imgerror(this)'></div><div class='tr_msg lightboder3'>\
					<div style='position: relative;'>姓名：<span class='tr_msg_name'>" + name + "</span><span class='Lift'><img src='"+src+"'/>"+poor+"</span></div>\
					<div>编号：<span class='tr_msg_name' id='manId'>" + id + "</span></div>\
					<div>戒治阶段：<span class='tr_msg_name'>" + type + "</span></div>\
					<a id='msgDetils'>详细信息</a></div>\
					<div class='tr_level  wxxfclevelA lightboder3'><p class='tr_level_sc'>" + grade + "<span style='width: 13px;height: 13px;font-family: PingFang-SC-Heavy;\
	font-size: 13px;font-weight: normal;font-stretch: normal;line-height: 16px;letter-spacing: 0px;color: #ffffff;'>分</span></p>\
				</div></div></div></li>");
    } else if((grade >= 60) && (grade < 70)) {
        li = $("<li><div class='lightboder3' style='width:100%;height:134px;'>\
					<div class='tabtrdiv '>\
					<div class='tr_ph lightboder3'>\
					<img src='" + src + "' onerror='imgerror(this)'></div><div class='tr_msg lightboder3'>\
					<div style='position: relative;'>姓名：<span class='tr_msg_name'>" + name + "</span><span class='Lift'><img src='"+src+"'/>"+poor+"</span></div>\
					<div>编号：<span class='tr_msg_name' id='manId'>" + id + "</span></div>\
					<div>戒治阶段：<span class='tr_msg_name'>" + type + "</span></div>\
					<a id='msgDetils'>详细信息</a></div>\
					<div class='tr_level  wxxfclevelB lightboder3'><p class='tr_level_sc'>" + grade + "<span style='width: 13px;height: 13px;font-family: PingFang-SC-Heavy;\
	font-size: 13px;font-weight: normal;font-stretch: normal;line-height: 16px;letter-spacing: 0px;color: #ffffff;'>分</span></p>\
				</div></div></div></li>");
    } else if((grade >= 70) && (grade < 80)) {
        li = $("<li><div class='lightboder3' style='width:100%;height:134px;'>\
					<div class='tabtrdiv '>\
					<div class='tr_ph lightboder3'>\
					<img src='" + src + "' onerror='imgerror(this)'></div><div class='tr_msg lightboder3'>\
					<div style='position: relative;'>姓名：<span class='tr_msg_name'>" + name + "</span><span class='Lift'><img src='"+src+"'/>"+poor+"</span></div>\
					<div>编号：<span class='tr_msg_name' id='manId'>" + id + "</span></div>\
					<div>戒治阶段：<span class='tr_msg_name'>" + type + "</span></div>\
					<a id='msgDetils'>详细信息</a></div>\
					<div class='tr_level  wxxfclevelC lightboder3'><p class='tr_level_sc'>" + grade + "<span style='width: 13px;height: 13px;font-family: PingFang-SC-Heavy;\
	font-size: 13px;font-weight: normal;font-stretch: normal;line-height: 16px;letter-spacing: 0px;color: #ffffff;'>分</span></p>\
				</div></div></div></li>");
    } else if(grade >= 80) {
        li = $("<li><div class='lightboder3' style='width:100%;height:134px;'>\
					<div class='tabtrdiv '>\
					<div class='tr_ph lightboder3'>\
					<img src='" + src + "' onerror='imgerror(this)'></div><div class='tr_msg lightboder3'>\
					<div style='position: relative;'>姓名：<span class='tr_msg_name'>" + name + "</span><span class='Lift'><img src='"+src+"'/>"+poor+"</span></div>\
					<div>编号：<span class='tr_msg_name' id='manId'>" + id + "</span></div>\
					<div>戒治阶段：<span class='tr_msg_name'>" + type + "</span></div>\
					<a id='msgDetils'>详细信息</a></div>\
					<div class='tr_level  wxxfclevelgreen lightboder3'><p class='tr_level_sc'>" + grade + "<span style='width: 13px;height: 13px;font-family: PingFang-SC-Heavy;\
	font-size: 13px;font-weight: normal;font-stretch: normal;line-height: 16px;letter-spacing: 0px;color: #ffffff;'>分</span></p>\
				</div></div></div></li>");
    }
    return li
}