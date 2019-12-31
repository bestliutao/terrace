$(document).ready(function() {
    /*人物标签悬浮移除事件*/
    //康复训练
    $(document).on('mouseenter', '.kfxl', function (e) {
        var type = $(".kfxl .men-attr-desc").text();
        var id = "000";
        if ($('#wxxjdtable .lightboder2')[0]) {
            id = $('#wxxjdtable .lightboder2')[0].id;
        }

        var ul = $('.kfxl_sm_lable_ul');
        labadd3(id, type, ul);
        $('.kfxl_sm_lable').css("display", "block");
    })
    $(document).on('mouseleave', '.kfxl', function (e) {
        $('.kfxl_sm_lable_ul li').remove();
        $('.kfxl_sm_lable').css("display", "none");
    })
    //行为表现
    $(document).on('mouseenter', '.xwbx', function (e) {
        var type = $(".xwbx .men-attr-desc").text();
        var id = "000";
        if ($('#wxxjdtable .lightboder2')[0]) {
            id = $('#wxxjdtable .lightboder2')[0].id;
        }
        var ul = $('.xwbx_sm_lable_ul');
        labadd3(id, type, ul);
        $('.xwbx_sm_lable').css("display", "block");
    })
    $(document).on('mouseleave', '.xwbx', function (e) {
        $('.xwbx_sm_lable_ul li').remove();
        $('.xwbx_sm_lable').css("display", "none");
    })
    //心理情绪
    $(document).on('mouseenter', '.xlqx', function (e) {
        var type = $(".xlqx .men-attr-desc").text();
        var id = "000";
        if ($('#wxxjdtable .lightboder2')[0]) {
            id = $('#wxxjdtable .lightboder2')[0].id;
        }
        var ul = $('.xlqx_sm_lable_ul');

        labadd3(id, type, ul);
        $('.xlqx_sm_lable').css("display", "block");
    })
    $(document).on('mouseleave', '.xlqx', function (e) {
        $('.xlqx_sm_lable_ul li').remove();
        $('.xlqx_sm_lable').css("display", "none");
    })

    //档案信息
    $(document).on('mouseenter', '.daxx', function (e) {
        var type = $(".daxx .men-attr-desc").text();
        var id = "000";
        if ($('#wxxjdtable .lightboder2')[0]) {
            id = $('#wxxjdtable .lightboder2')[0].id;
        }
        var ul = $('.daxx_sm_lable_ul');

        labadd3(id, type, ul);
        $('.daxx_sm_lable').css("display", "block");
    })
    $(document).on('mouseleave', '.daxx', function (e) {
        $('.daxx_sm_lable_ul li').remove();
        $('.daxx_sm_lable').css("display", "none");
    })
    //生命体征
    $(document).on('mouseenter', '.smtz', function (e) {
        var type = $(".smtz .men-attr-desc").text();
        var id = "000";
        if ($('#wxxjdtable .lightboder2')[0]) {
            id = $('#wxxjdtable .lightboder2')[0].id;
        }
        var ul = $('.smtz_sm_lable_ul');
        labadd3(id, type, ul);
        $('.smtz_sm_lable').css("display", "block");
    })
    $(document).on('mouseleave', '.smtz', function (e) {
        $('.smtz_sm_lable_ul li').remove();
        $('.smtz_sm_lable').css("display", "none");
    })
})
    var d = new Date();
    var year=d.getFullYear();
    var moth = d.getFullYear() + "-" + d.getMonth();
    var date = d.getFullYear() + "-" + (d.getMonth() + 1) + "-" + d.getDate();

    //风险系数
    layui.use('form', function() {
        var $ = jQuery;
        var layer = layui.layer;

        $(document).on('click', '.fxxs', function() {
            $.get('/hazard/modulus', {
                    date:new Date()
                }, function(date) {
                    var data = date.data;
                    $('#setzs').val(data.idioctonia);
                    $('#settt').val(data.getaway);
                    $('#setxx').val(data.commitmurder);
                    $('#setcs').val(data.suddendeath);
                },
                'json')
            layer.open({
                type: 1,
                title: false,
                area: ["581px", "360px"],
                shadeClose: false,
                closeBtn: 0,
                content: $('.lable_iframe1') //这里content是一个DOM，这个元素要放在body根节点下
            });
        })
    })
    //事件
    $(document).on('click', '.Submit', function() {
        var setzs = $('#setzs').val();//自杀
        var settt = $('#settt').val();//逃脱
        var setxx = $('#setxx').val();//行凶
        var setcs = $('#setcs').val();//猝死
        if(setzs == ''||settt == ''||setxx == ''||setcs == ''){
            alert('输入值不能为空')
        }else{
            $.get('/hazard/updateModulus', {
                    zs:setzs,
                    tt:settt,
                    xx:setxx,
                    cs:setcs
                }, function(date) {
                    if(date.status==200){
                        alert("修改成功");
                        location.reload();
                        layer.closeAll('page');
                    }

                },
                'json')
        }
})

    // //标签跳转
    $(document).on('click', '#labelBj', function() {
        var id = $('#wxxjdtable .lightboder2')[0].id;
        var name = $('#wxxjdtable .lightboder2 .tr_msg_name').text();
        var type=$(".lable_iframe .title_iframe").text();
        $.get("/label", {
            userId:id,
            userName:name,
            type:type
        }, function(date) {
            if(date.status==200){
                location.href="/labelSuccess";
            }
        }, 'json')
    })



	//戒毒学员危险性分析
	var xywxfxchart = echarts.init(document.getElementById('xywxfx'));
	// 指定图表的配置项和数据
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
                    name: '危险性分析',
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
            xywxfxchart.setOption(xywxfx);
		}else {
    		alert("数据为空");
		}

    }, 'json')




	/*戒毒人员探视数据分布*/
	var sytssjfbchart = echarts.init(document.getElementById('sytssjfb'));
	// 指定图表的配置项和数据
    $.get("/hazard/visitNumber", {

    }, function(date) {
        var tableData=date.data;
        if(date.status==200){
            var sytssjfb = {
                color: ['#f09865', '#21cdcc', '#29a0fc', '#df5b6a'],
                tooltip: {
                    backgroundColor: 'rgba(0,183,238,0.5)',
                    trigger: 'item',
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
                    left: 82,

                    itemGap: 20,
                    data: ['20次以上探视', '20次以下探视', '10次以下探视', '5次以下探视']
                },
                grid: {

                    left: 45,
                    right: 85,
                    top: 20,
                    bottom: 21,
                    containLabel: true,
                    //                  backgroundColor: "#194f73"
                },
                series: [{

                    type: 'pie',
                    radius: [40, 70],
                    center: [326, '45%'],
                    avoidLabelOverlap: false,
                    label: {
                        normal: {
                            show: false,
                        },
                        emphasis: {
                            show: false,

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
                        value: tableData.gressThanTwenty,
                        name: '20次以上探视'
                    },
                    {
                        value: tableData.lessThanTwenty,
                        name: '20次以下探视'
                    },
                    {
                        value: tableData.lessThanTen,
                        name: '10次以下探视'
                    },
                    {
                        value: tableData.lessThanFive,
                        name: '5次以下探视'
                    }
                    ]
                }]
            };
            // 使用刚指定的配置项和数据显示图表。
            sytssjfbchart.setOption(sytssjfb);
        }else {
            alert("数据为空");
        }

    }, 'json')


	/*学员外出申请数据统计*/
	var xywcsqtjchart = echarts.init(document.getElementById('xywcsqtj'));
    $.get("/hazard/outTypeNum", {
        date:moth
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
            // 指定图表的配置项和数据
            var xywcsqtj = {
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
                    left: '1%',
                    right: '2%',
                    bottom: '5%',
                    top: '8%',
                    containLabel: true
                },
                xAxis: [{
                    type: 'category',
                    data: arr1,
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
                        rotate: 35, //度角倾斜显示
                        //                    formatter:function(value){//只显示五个字 其余省略号
                        //                        return value.length > 5?value.substring(0,5)+'...':value;
                        //                   }
                        margin: 20,
                        fontSize: 12,
                    }
                }],
                yAxis: [{
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
                }],
                series: [{
                    name: '人员风险趋势',
                    type: 'bar',
                    barWidth: '30',
                    center: ['40%', '50%'],
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
            xywcsqtjchart.setOption(xywcsqtj);
        }else {
            alert("数据为空");
        }

    }, 'json')

	/*学员消费数据统计*/
	var xyxfsjtjchart = echarts.init(document.getElementById('xyxfsjtj'));
    $.get("/hazard/moneyNum", {
        date:moth
    }, function(date) {
        var tableData=date.data;
        if(date.status==200){
            var arr1 = [];
            var arr2 = [];
            for(var i = 0;i<tableData.length;i++){
                arr1.push(tableData[i].title);
                arr2.push(tableData[i].number);
            }
            // console.log(arr2)
            var max=arr2[0];
            for(i=0;i<arr2.length;i++){
                if(parseInt(arr2[i])>parseInt(max)){
                    max=arr2[i];
                }
            }
            var maxVal=parseInt(max)+parseInt(5)
            var xyxfsjtj = {
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
                    left: 45,
                    bottom: 16,
                    right: 35,
                    top: 32,
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
                        rotate: 35,
                        margin: 20,
                        fontSize: 12, //度角倾斜显示
                    },
                    data: arr1
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
                    data: arr2,
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
            xyxfsjtjchart.setOption(xyxfsjtj);
            xywcsqtjchart.setOption(xywcsqtj);
        }else {
            alert("数据为空");
        }

    }, 'json')



	/*更多点击弹窗事件*/
	layui.use('form', function() {
		var form = layui.form;
		form.render();
	});
	$(document).on('click', '.quxiao', function() {
		layer.closeAll('page');
	})
	layui.use('form', function() {
		var $ = jQuery;
		var layer = layui.layer;
		var formtitle_kfxk = $(".kfxl .men-attr-desc").text();
		var formtitle_xwbx = $(".xwbx .men-attr-desc").text();
		var formtitle_daxx = $(".daxx .men-attr-desc").text();
		var formtitle_smtz = $(".smtz .men-attr-desc").text();
		var formtitle_xlqx = $(".xlqx .men-attr-desc").text();

		$(".kfxl_more").click(function() {
            $(".lables li").remove();
            var id = $('#wxxjdtable .lightboder2')[0].id;
            var type = $(".kfxl .men-attr-desc").text();
            $(".lable_iframe .title_iframe").text(formtitle_kfxk); //弹窗标题
            smlabadd(id, type);
            layer.open({
				type: 1,
				title: false,
				area: ["581px", "360px"],
				shadeClose: false,
				closeBtn: 0,
				content: $('.lable_iframe') //这里content是一个DOM，这个元素要放在body根节点下
			});
		})
		$(".xwbx_more").click(function() {
            $(".lables li").remove();
            var id = $('#wxxjdtable .lightboder2')[0].id;
            var type = $(".xwbx .men-attr-desc").text();
            $(".lable_iframe .title_iframe").text(formtitle_xwbx); //弹窗标题
            smlabadd(id, type);
			layer.open({
				type: 1,
				title: false,
				area: ["581px", "360px"],
				shadeClose: false,
				closeBtn: 0,
				content: $('.lable_iframe') //这里content是一个DOM，这个元素要放在body根节点下
			});
		})
		$(".daxx_more").click(function() {
            $(".lables li").remove();
            var id = $('#wxxjdtable .lightboder2')[0].id;
            var type = $(".daxx .men-attr-desc").text();
            $(".lable_iframe .title_iframe").text(formtitle_daxx); //弹窗标题
            smlabadd(id, type);
			layer.open({
				type: 1,
				title: false,
				area: ["581px", "360px"],
				shadeClose: false,
				closeBtn: 0,
				content: $('.lable_iframe') //这里content是一个DOM，这个元素要放在body根节点下
			});
		})
		$(".smtz_more").click(function() {
            $(".lables li").remove();
            var id = $('#wxxjdtable .lightboder2')[0].id;
            var type = $(".smtz .men-attr-desc").text();
            $(".lable_iframe .title_iframe").text(formtitle_smtz); //弹窗标题
            smlabadd(id, type);
			layer.open({
				type: 1,
				title: false,
				area: ["581px", "360px"],
				shadeClose: false,
				closeBtn: 0,
				content: $('.lable_iframe') //这里content是一个DOM，这个元素要放在body根节点下
			});
		})
		$(".xlqx_more").click(function() {
            $(".lables li").remove();
            var id = $('#wxxjdtable .lightboder2')[0].id;
            var type = $(".xlqx .men-attr-desc").text();
            $(".lable_iframe .title_iframe").text(formtitle_xlqx); //弹窗标题
            smlabadd(id, type);
			layer.open({
				type: 1,
				title: false,
				area: ["581px", "360px"],
				shadeClose: false,
				closeBtn: 0,
				content: $('.lable_iframe') //这里content是一个DOM，这个元素要放在body根节点下
			});
		})
	})



    /*人员搜索*/
	var total = 0;
	var last = 0;
    $('.search_input').on('input', function() {
        var inputContent = $('.search_input').val();
        console.log("实时获取输入的内容-----" + inputContent);
        if($.trim(inputContent) == null||$.trim(inputContent) == '') {
            showReocrd(1,3);
        } else {
            showReocrd1(1,3,$.trim(inputContent));
        };
    });


    showReocrd(1,3);
    function showReocrd(pageNo, pageSize) {
        $.get("/hazard/studentShow", {
                pageNo: pageNo,
                pageSize: pageSize
            },
            function(date) {
                if(date.status == 200) {
                    $('tbody').empty();
                    //加载后台返回的List集合数据
                    var tableData = date.data;
                    total = tableData.total;
                    last = tableData.last;
                    data = tableData.data;
                    for(var i = 0; i < data.length; i++) {
                        var tr;
                        var userDangerous=0;
                        var id = data[i].traineecode;
                        var traineename=data[i].traineename;
                        var userLevel=data[i].userLevel;
                        var user=[data[i].userIdioctonia,data[i].userWound,data[i].userSuddendeath,data[i].userGetaway];
                        for(var z=0;z<user.length;z++){
                        	if (user[z]==null){
                                user[z]=-1;
							}
                        	if(user[z]>userDangerous){
                        		userDangerous=user[z];
							}
						}
                        switch(userDangerous) {
                            case user[0]:
                                userDangerous="自杀";
                                break;
                            case user[2]:
                                userDangerous="猝死";
                                break;
                            case user[3]:
                                userDangerous="逃脱";
                                break;
                            case user[1]:
                                userDangerous="行凶";
                                break;
                            default:
                                userDangerous="无";
                        }
                        var imgsrc;
                        $.ajax({
                            type: "get",
                            url: "/hazard/manPhoto?id="+id,
                            async: false,
                            dataType: 'json',
                            success: function (d) {
                                var tableData = d.data;
                                // console.log(tableData)
                                if(tableData == null) {
                                    imgsrc = '../img/photo_img.png'
                                } else {
                                    imgsrc = 'data:image/png;base64,' + tableData;
                                }
                                var td = cretable(traineename,id,userDangerous,userLevel,imgsrc);
                                if(i==0){
                                    tr = $("<tr class='lightboder2' style='width:423px;height:134px;' id='" + data[i].traineecode + "' ></tr>").append(td);
                                }else{
                                    tr = $("<tr class='' style='width:423px;height:134px;' id='" + data[i].traineecode + "'></tr>").append(td);
                                }
                                $('tbody').append(tr);
                            }
                        });

                    }
                    tableOne();

                } else {
                    alert("数据出错");
                }
            },
            "json"
        );
    }
    function showReocrdNext(pageNo, pageSize) {
        $.get("/hazard/studentShow", {
                pageNo: pageNo,
                pageSize: pageSize
            },
            function(date) {
                if(date.status == 200) {
                    $('tbody').empty();
                    //加载后台返回的List集合数据
                    var tableData = date.data;
                    total = tableData.total;
                    last = tableData.last;
                    data = tableData.data;
                    for(var i = 0; i < data.length; i++) {
                        var tr;
                        var userDangerous=0;
                        var id = data[i].traineecode;
                        var traineename=data[i].traineename;
                        var userLevel=data[i].userLevel;
                        var user=[data[i].userIdioctonia,data[i].userWound,data[i].userSuddendeath,data[i].userGetaway];
                        for(var z=0;z<user.length;z++){
                            if (user[z]==null){
                                user[z]=-1;
                            }
                            if(user[z]>userDangerous){
                                userDangerous=user[z];
                            }
                        }
                        switch(userDangerous) {
                            case user[0]:
                                userDangerous="自杀";
                                break;
                            case user[2]:
                                userDangerous="猝死";
                                break;
                            case user[3]:
                                userDangerous="逃脱";
                                break;
                            case user[1]:
                                userDangerous="行凶";
                                break;
                            default:
                                userDangerous="无";
                        }
                        var imgsrc;
                        $.ajax({
                            type: "get",
                            url: "/hazard/manPhoto?id="+id,
                            async: false,
                            dataType: 'json',
                            success: function (d) {
                                var tableData = d.data;
                                // console.log(tableData)
                                if(tableData == null) {
                                    imgsrc = '../img/photo_img.png'
                                } else {
                                    imgsrc = 'data:image/png;base64,' + tableData;
                                }
                                var td = cretable(traineename,id,userDangerous,userLevel,imgsrc);
                                if(i==0){
                                    tr = $("<tr class='lightboder2' style='width:423px;height:134px;' id='" + data[i].traineecode + "' ></tr>").append(td);
                                }else{
                                    tr = $("<tr class='' style='width:423px;height:134px;' id='" + data[i].traineecode + "'></tr>").append(td);
                                }
                                $('tbody').append(tr);
                            }
                        });

                    }

                } else {
                    alert("数据出错");
                }
            },
            "json"
        );
    }
    function showReocrd1(pageNo, pageSize,inputValue) {
        $.get("/hazard/allStudentShow", {
                pageNo: pageNo,
                pageSize: pageSize,
                value:inputValue
            },
            function(date) {
                if(date.status == 200) {
                    $('tbody').empty();
                    //加载后台返回的List集合数据
                    var tableData = date.data;
                    total = tableData.total;
                    last = tableData.last;
                    data = tableData.data;
                    for(var i = 0; i < data.length; i++) {
                        var tr;
                        var userDangerous=0;
                        var id = data[i].traineecode;
                        var traineename=data[i].traineename;
                        var userLevel=data[i].userLevel;
                        var user=[data[i].userIdioctonia,data[i].userWound,data[i].userSuddendeath,data[i].userGetaway];
                        for(var z=0;z<user.length;z++){
                            if (user[z]==null){
                                user[z]=-1;
                            }
                            if(user[z]>userDangerous){
                                userDangerous=user[z];
                            }
                        }
                        switch(userDangerous) {
                            case user[0]:
                                userDangerous="自杀";
                                break;
                            case user[2]:
                                userDangerous="猝死";
                                break;
                            case user[3]:
                                userDangerous="逃脱";
                                break;
                            case user[1]:
                                userDangerous="行凶";
                                break;
                            default:
                                userDangerous="无";
                        }
                        var imgsrc;
                        $.ajax({
                            type: "get",
                            url: "/hazard/manPhoto?id="+id,
                            async: false,
                            dataType: 'json',
                            success: function (d) {
                                var tableData = d.data;
                                // console.log(tableData)
                                if(tableData == null) {
                                    imgsrc = '../img/photo_img.png'
                                } else {
                                    imgsrc = 'data:image/png;base64,' + tableData;
                                }
                                var td = cretable(traineename,id,userDangerous,userLevel,imgsrc);
                                if(i==0){
                                    tr = $("<tr class='lightboder2' style='width:423px;height:134px;' id='" + data[i].traineecode + "' ></tr>").append(td);
                                }else{
                                    tr = $("<tr class='' style='width:423px;height:134px;' id='" + data[i].traineecode + "'></tr>").append(td);
                                }
                                $('tbody').append(tr);
                            }
                        });

                    }
                    tableTwo(inputValue);
                } else {
                    alert("数据出错");
                }

            },
            "json"
        );
    }
    function showReocrd1Next(pageNo, pageSize,inputValue) {
        $.get("/hazard/allStudentShow", {
                pageNo: pageNo,
                pageSize: pageSize,
                value:inputValue
            },
            function(date) {
                if(date.status == 200) {
                    $('tbody').empty();
                    //加载后台返回的List集合数据
                    var tableData = date.data;
                    total = tableData.total;
                    last = tableData.last;
                    data = tableData.data;
                    for(var i = 0; i < data.length; i++) {
                        var tr;
                        var userDangerous=0;
                        var id = data[i].traineecode;
                        var traineename=data[i].traineename;
                        var userLevel=data[i].userLevel;
                        var user=[data[i].userIdioctonia,data[i].userWound,data[i].userSuddendeath,data[i].userGetaway];
                        for(var z=0;z<user.length;z++){
                            if (user[z]==null){
                                user[z]=-1;
                            }
                            if(user[z]>userDangerous){
                                userDangerous=user[z];
                            }
                        }
                        switch(userDangerous) {
                            case user[0]:
                                userDangerous="自杀";
                                break;
                            case user[2]:
                                userDangerous="猝死";
                                break;
                            case user[3]:
                                userDangerous="逃脱";
                                break;
                            case user[1]:
                                userDangerous="行凶";
                                break;
                            default:
                                userDangerous="无";
                        }
                        var imgsrc;
                        $.ajax({
                            type: "get",
                            url: "/hazard/manPhoto?id="+id,
                            async: false,
                            dataType: 'json',
                            success: function (d) {
                                var tableData = d.data;
                                // console.log(tableData)
                                if(tableData == null) {
                                    imgsrc = '../img/photo_img.png'
                                } else {
                                    imgsrc = 'data:image/png;base64,' + tableData;
                                }
                                var td = cretable(traineename,id,userDangerous,userLevel,imgsrc);
                                if(i==0){
                                    tr = $("<tr class='lightboder2' style='width:423px;height:134px;' id='" + data[i].traineecode + "' ></tr>").append(td);
                                }else{
                                    tr = $("<tr class='' style='width:423px;height:134px;' id='" + data[i].traineecode + "'></tr>").append(td);
                                }
                                $('tbody').append(tr);
                            }
                        });

                    }
                } else {
                    alert("数据出错");
                }

            },
            "json"
        );
    }

    function tableOne(){
        layui.use(['laypage', 'table', 'jquery'], function() {
            var laypage = layui.laypage;
            $(".page").each(function (i, the) {
                laypage.render({
                    elem: the, //注意，这里的 test1 是 ID，不用加 # 号
                    count: total,//数据总数，从服务端得到
                    limit: 3, //每页显示条数
                    curr: 1, //起始页
                    groups: 4, //连续页码个数
                    prev: '<em>' + '<' + '</em>',
                    next: '<em>' + '>' + '</em>',
                    //下一页文本
                    first: 1, //首页文本
                    last: last, //尾页文本
                    layout: ['prev', 'page', 'next'],
                    jump: function (obj, first) { //obj为当前页的属性和方法，第一次加载first为true
                        showReocrdNext(obj.curr, obj.limit);
                    }
                });
            })
        })
    }
    function tableTwo(value){
        layui.use(['laypage', 'table', 'jquery'], function() {
            var laypage = layui.laypage;
            /*人员搜索*/
            $ = layui.$;
            $(".page").each(function (i, the) {
                laypage.render({
                    elem: the, //注意，这里的 test1 是 ID，不用加 # 号
                    count: total,//数据总数，从服务端得到
                    limit: 3, //每页显示条数
                    curr: 1, //起始页
                    groups: 4, //连续页码个数
                    prev: '<em>' + '<' + '</em>',
                    next: '<em>' + '>' + '</em>',
                    //下一页文本
                    first: 1, //首页文本
                    last: last, //尾页文本
                    layout: ['prev', 'page', 'next'],
                    jump: function (obj, first) { //obj为当前页的属性和方法，第一次加载first为true
                        //调用加载函数加载数据
                        showReocrd1Next(obj.curr, obj.limit,value);
                    }
                });
            })
        })
    }



	$('.qing').on('click', function() {
		$('.search_input').val('');
        showReocrd(1,3);
        $.get("/hazard/studentShow", {
                pageNo: 1,
                pageSize: 3
            },
            function(date) {
                if(date.status == 200) {
                    var id=date.data.total
                    if(id==null||id==""){
                        id="00000";
                    }else {
                        id=date.data.data[0].traineecode;
                    }
                    $.get("/label/fiveLabel", {
                            id: id
                        },
                        function(date) {
                            var lableData = date.data;
                            //解析后的数据
                            biglabadd(lableData)
                        },
                        'json'
                    )
                } else {
                    alert("数据出错");
                }
            },
            "json"
        );
	});

    //5类标签默认事件
    $.get("/hazard/studentShow", {
            pageNo: 1,
            pageSize: 3
        },
        function(date) {
            if(date.status == 200) {
                var id=date.data.total
                if(id==null||id==""){
                    id="00000";
                }else {
                    id=date.data.data[0].traineecode;
                }
                $.get("/label/fiveLabel", {
                        id: id
                    },
                    function(date) {
                        var lableData = date.data;
                        //解析后的数据
                        biglabadd(lableData)
                    },
                    'json'
                )
            } else {
                alert("数据出错");
            }
        },
        "json"
    );
    $(document).on("click", '#wxxjdtable tr', function(d) {
            $('#wxxjdtable tr').removeClass('lightboder2');
            $(this).addClass('lightboder2');
            var msg_id = $(this)[0].id;
            $.get("/label/fiveLabel", {
                    id: msg_id
                },
                function(date) {
                    var lableData = date.data;
                    //解析后的数据
                    biglabadd(lableData)
                },
                'json'
            )
    })

    //详细档案跳转
    $(document).on("click", '#msgDetils', function(d) {
        var id=$(this).parent().find("div .tr_msg_id").text();
        $.get("/hazardDetils", {
                id: id
            },
            function(date) {
                if(date.status==200){
                    location.href='/hazardDetilShow';
                }
            },
            'json'
        )
    })


    /*表格生成前，样式提前填充*/
    function cretable(name, id, type, level,src) {
            var td;
            if(level === 'A') {
                td = $("<td class='' style='width:100%;height:134px;'>\
                        <div class='tabtrdiv '>\
                        <div class='tr_ph '>\
                        <img src='" + src + "'></div><div class='tr_msg '>\
                        <div>姓名：<span class='tr_msg_name'>" + name + "</span></div>\
                        <div>编号：<span class='tr_msg_id'>" + id + "</span></div>\
                        <div>风险分析：<span class='tr_msg_fx'>" + type + "</span></div>\
                        <a id='msgDetils'>详细信息</a></div>\
                        <div class='tr_level  wxxfclevelA'><p class='tr_level_sc' id='lel" + id + "'>" + level + "</p>\
                    <p class='trlevel_title'>风险等级</p></div></div></td>");
            } else if(level === 'B') {
                td = $("<td class='' style='width:100%;height:134px;'>\
                        <div class='tabtrdiv '>\
                        <div class='tr_ph '>\
                        <img src='" + src + "'></div><div class='tr_msg '>\
                        <div>姓名：<span class='tr_msg_name'>" + name + "</span></div>\
                        <div>编号：<span class='tr_msg_id'>" + id + "</span></div>\
                        <div>风险分析：<span class='tr_msg_fx'>" + type + "</span></div>\
                        <a id='msgDetils'>详细信息</a></div>\
                        <div class='tr_level  wxxfclevelB'><p class='tr_level_sc' id='lel" + id + "'>" + level + "</p>\
                    <p class='trlevel_title'>风险等级</p></div></div></td>");
            } else if(level === 'C') {
                td = $("<td class='' style='width:100%;height:134px;'>\
                        <div class='tabtrdiv '>\
                        <div class='tr_ph '>\
                        <img src='" + src + "'></div><div class='tr_msg '>\
                        <div>姓名：<span class='tr_msg_name'>" + name + "</span></div>\
                        <div>编号：<span class='tr_msg_id'>" + id + "</span></div>\
                        <div>风险分析：<span class='tr_msg_fx'>" + type + "</span></div>\
                        <a id='msgDetils'>详细信息</a></div>\
                        <div class='tr_level  wxxfclevelC'><p class='tr_level_sc' id='lel" + id + "'>" + level + "</p>\
                    <p class='trlevel_title'>风险等级</p></div></div></td>");
            } else if(level==null||level === '正常') {
                td = $("<td class='' style='width:100%;height:134px;'>\
                        <div class='tabtrdiv '>\
                        <div class='tr_ph lightboder'>\
                        <img src='" + src + "'></div><div class='tr_msg '>\
                        <div>姓名：<span class='tr_msg_name'>" + name + "</span></div>\
                        <div>编号：<span class='tr_msg_id'>" + id + "</span></div>\
                        <div>风险分析：<span class='tr_msg_fx'>" + type + "</span></div>\
                        <a id='msgDetils'>详细信息</a></div>\
                        <div class='tr_level  wxxfclevelgreen'><p class='tr_level_sc middle' id='lel" + id + "'>" + "正常" + "</p>\
                    <p class='trlevel_title'>风险等级</p></div></div></td>");
            }
            return td
        }

    function biglabadd(redate) {
        //  alert(redate)
        for(var i = 0; i < 5; i++) { //获取的长度
            //对象获取
            var kfxllel = $('.men-model .kfxl .men-attr-head');
            var xwbxlel = $('.men-model .xwbx .men-attr-head');
            var xlqxlel = $('.men-model .xlqx .men-attr-head');
            var daxxlel = $('.men-model .daxx .men-attr-head');
            var smtzlel = $('.men-model .smtz .men-attr-head');
            var kfxlcss = $('.men-model .kfxl');
            var xwbxcss = $('.men-model .xwbx');
            var xlqxcss = $('.men-model .xlqx');
            var daxxcss = $('.men-model .daxx');
            var smtzcss = $('.men-model .smtz');
            var lel_texts = redate[i].level; //改
            var lels = [kfxllel, xwbxlel, xlqxlel, daxxlel, smtzlel];
            var csss = [kfxlcss, xwbxcss, xlqxcss, daxxcss, smtzcss];
            if(redate[i].type == i) {
                if(lel_texts === 'A') {
                    csss[i].removeClass('blue green yellow');
                    lels[i].removeClass('middle');
                    csss[i].addClass('red');
                    lels[i].text('A');
                } else if(lel_texts === 'B') {
                    csss[i].removeClass('red green yellow');
                    lels[i].removeClass('middle');
                    csss[i].addClass('yellow');
                    lels[i].text('B');
                } else if(lel_texts === 'C') {
                    csss[i].removeClass('blue green red');
                    lels[i].removeClass('middle');
                    csss[i].addClass('blue');
                    lels[i].text('C');
                } else if(lel_texts === 'D') {
                    csss[i].removeClass('blue red yellow');
                    lels[i].removeClass('middle');
                    csss[i].addClass('green');
                    lels[i].addClass('middle');
                    lels[i].text('正常');
                }
            }
        }
    }

    function smlabadd(id, type) {

        var $ = jQuery;
        $.get('/label/manMore', {
            id:id,
            type:type
        }, function(date) {

            if(date.status == '200') {
                var data = date.data;
                for(var i=0;i<data.length;i++){
                    var li = smlabli(data[i].labelName,data[i].level);
                    $('.lables ul').append(li);
                }
            }else{
                alert('数据为空')
            }
        }, 'json')
    }

    function smlabli(type,level){
        var li;
        if(level == 'A'){
            li = $('<li class="smlable_red" title='+type+'>'+type+'<span class="men-attr-list-index">'+level+'</span></li>');
        }else if(level == 'B'){
            li = $('<li class="smlable_yellow" title='+type+'>'+type+'<span class="men-attr-list-index">'+level+'</span></li>');
        }else if(level == 'C'){
            li = $('<li class="smlable_blue" title='+type+'>'+type+'<span class="men-attr-list-index">'+level+'</span></li>');
        }else if(level == '正常'|| level == ''){
            li = $('<li class="smlable_green" title='+type+'>'+type+'<span class="men-attr-list-index">'+level+'</span></li>');
        }
        return li
    }

    //子标签
    function labadd3(id, type, ul) {
        var $ = jQuery;
        $.get('/label/threeLabel', {
           userId:id,
            type:type
        }, function(date) {
            if(date.status == 200) {
                var data = date.data;
                if(data.length>=3){
                    for(var i = 0; i < 3; i++) {
                        var li = labli3(data[i].labelName, data[i].level);
                        ul.append(li);
                    }
                }else {
                    for(var i = 0; i < data.length; i++) {
                        var li = labli3(data[i].labelName, data[i].level);
                        ul.append(li);
                    }
                }

            } else {
                alert('数据为空')
            }
        }, 'json')
    }

    function labli3(type, level) {
        var li;
        if(level == 'A') {
            li = $('<li class="smlable_red" title=' + type + '>' + type + '<span class="men-attr-list-index">' + level + '</span></li>');
        } else if(level == 'B') {
            li = $('<li class="smlable_yellow" title=' + type + '>' + type + '<span class="men-attr-list-index">' + level + '</span></li>');
        } else if(level == 'C') {
            li = $('<li class="smlable_blue" title=' + type + '>' + type + '<span class="men-attr-list-index">' + level + '</span></li>');
        } else if(level == '正常' || level == '') {
            li = $('<li class="smlable_green" title=' + type + '>' + type + '<span class="men-attr-list-index">' + level + '</span></li>');
        }
        return li
    }
