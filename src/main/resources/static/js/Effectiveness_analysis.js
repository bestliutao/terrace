$(document).ready(function() {
    var d = new Date();
    var year=d.getFullYear();
    var moth = d.getFullYear() + "-" + d.getMonth();
    var today = d.getFullYear() + "-" + (d.getMonth() + 1) + "-" + d.getDate();
	$ = jQuery;
	var jcqksjchart = echarts.init(document.getElementById('jcqksj'));
	//戒毒学员奖惩情况（人数）
    $.get("/abstinence/performenceNum", {
        date:"2019-11"
    }, function(date) {
        if(date.status == 200) {
            var tableData = date.data;
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
			var maxVal=parseInt(max)+parseInt(5);
            // 指定图表的配置项和数据
            var jcqksj = {
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
                    barWidth: '30%',
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
            jcqksjchart.setOption(jcqksj);
        } else {
            alert("数据为空");
        }
    }, 'json')


    // 戒治阶段分布（人数）
    var jzjdfbchart = echarts.init(document.getElementById('jzjdfb'));
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
            var jzjdfb = {
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
                    left: 72,
                    itemGap: 20,
                    data: ['生理脱毒期', '教育适应期', '康复巩固期', '回归指导期']
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
                        //			emphasis: {
                        //				show: false,
                        //				textStyle: {
                        //					fontSize: '30',
                        //					fontWeight: 'bold'
                        //				}
                        //			}
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
            jzjdfbchart.setOption(jzjdfb);
        } else {
            alert("数据为空");
        }
    }, 'json')





	/*戒治效能统计*/
    var jzxntjchart = echarts.init(document.getElementById('jzxntj'));
    $.get('/grade/gradeShow', {
    	date:moth
    }, function(date) {
        var arr1 = [];
        var arr2 = [];
        var arr3 = [];
        var chart = date.data;
        for(var i = 0; i < chart.length; i++) {
            if(chart[i].number.length == 0) {
                arr1[i] = '0';
                arr2[i] = '0';
                arr3[i] = '0';
            } else {
                for(var z = 0; z < chart[i].number.length; z++) {
                    switch(chart[i].number[z].title){
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
        var max=arr1[0];
        for (var i=0;i<arr1.length;i++){
        	if(max<arr1[i]){
        		max=arr1[i];
			}
		}
        for (var i=0;i<arr2.length;i++){
            if(max<arr2[i]){
                max=arr2[i];
            }
        }
        for (var i=0;i<arr3.length;i++){
            if(max<arr3[i]){
                max=arr3[i];
            }
        }
        var maxVal=parseInt(max)+parseInt(5);
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
                max: maxVal,
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




	//戒治效能走势（平均分）
    var jzxnzschart = echarts.init(document.getElementById('jzxnzs'), 'custom');
    $.get('/grade/sixMonthGrade', {
        date:moth
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
                console.log(all)
            }else
            if(chartdata[i].type == '一年期'){
                for(var z=0;z<chartdata[i].number.length;z++){
                    ynq.push(Math.round(chartdata[i].number[z].number));
                    month[z] = (chartdata[i].number[z].title)
                }
                console.log(ynq)
            }else
            if(chartdata[i].type == '生理脱毒期'){
                for(var z=0;z<chartdata[i].number.length;z++){
                    sltd.push(Math.round(chartdata[i].number[z].number));
                    month[z] = (chartdata[i].number[z].title)
                }
                console.log(sltd)
            }else if(chartdata[i].type == '期满'){
                for(var z=0;z<chartdata[i].number.length;z++){
                    qm.push(Math.round(chartdata[i].number[z].number));
                    month[z] = (chartdata[i].number[z].title)
                }
                console.log(qm)
            }
        }
        var max=all[0];
        for(var i=0;i<all.length;i++){
            if(max<all[i]){
                max=all[i];
            }
        }
        for(var i=0;i<sltd.length;i++){
            if(max<sltd[i]){
                max=sltd[i];
            }
        }
        for(var i=0;i<ynq.length;i++){
            if(max<ynq[i]){
                max=ynq[i];
            }
        }
        for(var i=0;i<all.length;i++){
            if(max<qm[i]){
                max=qm[i];
            }
        }

        var maxVal=parseInt(max)+parseInt(5);

        var jzxnzs = {
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
                max: Math.round(maxVal),
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
        $.get("/abstinence/keyStudentShow", {
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
                    // console.log(data);
                    var imageSrc;
                    for(var i = 0; i < data.length; i++) {
                        var id=data[i].traineecode;
                        var name=data[i].traineename;
                        var stage=data[i].manageperiod.split('[')[0];
                        var grade=data[i].userGrade;
                        $.ajax({
                            type: "get",
                            url: "/hazard/manPhoto?id="+id,
                            async: false,
                            dataType: 'json',
                            success: function (d) {
                                var tableData = d.data;
                                // console.log(tableData)
                                if(tableData == null) {
                                    imageSrc = '../img/photo_img.png'
                                } else {
                                    imageSrc = 'data:image/png;base64,' + tableData;
                                }
                                var td = cretable(name,id ,stage ,grade ,imageSrc);
                                if (i == 0) {
                                    tr = $("<tr class='lightboder2' style='width:423px;height:134px;' id='" + data[i].traineecode + "'></tr>").append(td);
                                } else {
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
        $.get("/abstinence/keyStudentShow", {
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
                    var imageSrc;
                    for(var i = 0; i < data.length; i++) {
                        var id=data[i].traineecode;
                        var name=data[i].traineename;
                        var stage=data[i].manageperiod.split('[')[0];
                        var grade=data[i].userGrade;
                        $.ajax({
                            type: "get",
                            url: "/hazard/manPhoto?id="+id,
                            async: false,
                            dataType: 'json',
                            success: function (d) {
                                var tableData = d.data;
                                // console.log(tableData)
                                if(tableData == null) {
                                    imageSrc = '../img/photo_img.png'
                                } else {
                                    imageSrc = 'data:image/png;base64,' + tableData;
                                }
                                var td = cretable(name,id ,stage ,grade ,imageSrc);
                                if (i == 0) {
                                    tr = $("<tr class='lightboder2' style='width:423px;height:134px;' id='" + data[i].traineecode + "'></tr>").append(td);
                                } else {
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
                    var imageSrc;
                    for(var i = 0; i < data.length; i++) {
                        var id=data[i].traineecode;
                        var name=data[i].traineename;
                        var stage=data[i].manageperiod.split('[')[0];
                        var grade=data[i].userGrade;
                        $.ajax({
                            type: "get",
                            url: "/hazard/manPhoto?id="+id,
                            async: false,
                            dataType: 'json',
                            success: function (d) {
                                var tableData = d.data;
                                // console.log(tableData)
                                if(tableData == null) {
                                    imageSrc = '../img/photo_img.png'
                                } else {
                                    imageSrc = 'data:image/png;base64,' + tableData;
                                }
                                var td = cretable(name,id ,stage ,grade ,imageSrc);
                                if (i == 0) {
                                    tr = $("<tr class='lightboder2' style='width:423px;height:134px;' id='" + data[i].traineecode + "'></tr>").append(td);
                                } else {
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
                    var imageSrc;
                    for(var i = 0; i < data.length; i++) {
                        var id=data[i].traineecode;
                        var name=data[i].traineename;
                        var stage=data[i].manageperiod.split('[')[0];
                        var grade=data[i].userGrade;
                        $.ajax({
                            type: "get",
                            url: "/hazard/manPhoto?id="+id,
                            async: false,
                            dataType: 'json',
                            success: function (d) {
                                var tableData = d.data;
                                // console.log(tableData)
                                if(tableData == null) {
                                    imageSrc = '../img/photo_img.png'
                                } else {
                                    imageSrc = 'data:image/png;base64,' + tableData;
                                }
                                var td = cretable(name,id ,stage ,grade ,imageSrc);
                                if (i == 0) {
                                    tr = $("<tr class='lightboder2' style='width:423px;height:134px;' id='" + data[i].traineecode + "'></tr>").append(td);
                                } else {
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
    });

    //详细档案跳转
    $(document).on("click", '#msgDetils', function(d) {
        var id=$(this).parent().find("div .tr_msg_id").text();
        $.get("/absDetils", {
                id: id
            },
            function(date) {
                if(date.status==200){
                    location.href='/effectivenessDetails';
                }
            },
            'json'
        )
    })

    //表格点击事件
    $(document).on("click", '#zdjzdxtable tr', function(d) {
        $('#zdjzdxtable tr').removeClass('lightboder2');
        $(this).addClass('lightboder2');
        var msg_id = $(this)[0].id;
        biglabget(msg_id)
    })

    $.get("/abstinence/keyStudentShow", {
            pageNo: 1,
            pageSize: 3
        },
        function(date) {
            if(date.status == 200) {
                var id=date.data[0]
                if(id==null||id==""){
                    id="00000";
                }else {
                    id=id.data[0].traineecode;
                }
                biglabget(id);
            } else {
                alert("数据出错");
            }
        },
        "json"
    );
    function biglabget(msg_id){
        $.get("/grade/sixManMonthShow", {
                id:msg_id,
                date:moth
            },
            function(date) {
                if(date.status == 200) {
                    //加载后台返回的List集合数据
                    var labData = date.data;

                    var zsjllel = $('.men-model .zsjl .men-attr-head');//遵守纪律-1
                    var jdkflel = $('.men-model .jdkf .men-attr-head');//戒毒康复-2
                    var jyxxlel = $('.men-model .jyxx .men-attr-head');//教育学习-3
                    var shwslel = $('.men-model .shws .men-attr-head');//生活卫生-4
                    var xyldlel = $('.men-model .xyld .men-attr-head');//习艺劳动-5
                    var tbjclel = $('.men-model .tbjc .men-attr-head');//特别奖惩-6
                    //样式赋值
                    var zsjlcss = $('.men-model .zsjl');
                    var jdkfcss = $('.men-model .jdkf');
                    var jyxxcss = $('.men-model .jyxx');
                    var shwscss = $('.men-model .shws');
                    var xyldcss = $('.men-model .xyld');
                    var tbjccss = $('.men-model .tbjc');
                    var grade;
                    if(labData==''){
                        grade = [null,null,null,null,null,null];//123456
                    }else {
                        grade = [labData[0].zsjlGrade,labData[0].jdkfGrade,labData[0].jyxx,labData[0].shws,labData[0].tbjc,labData[0].tbjc];//123456
                    }
                    var lels = [zsjllel, jdkflel, jyxxlel, shwslel, xyldlel,tbjclel];//12346
                    var csss = [zsjlcss, jdkfcss, jyxxcss, shwscss, xyldcss,tbjccss];//12346
                    for(var i=0;i<grade.length;i++){
                        labadd(grade[i], csss[i], lels[i]);
                    }

                } else {
                    alert("数据出错");
                }

            },
            "json"
        );
    }
    //6个等级类判断显示
    function labadd(lel, csss, lels) {
        if(parseInt(lel) < 60) {
            csss.removeClass('blue green yellow');
            lels.removeClass('middle');
            csss.addClass('red');
            lels.text('A');
        } else if((parseInt(lel) >= 60) &&(parseInt(lel) <70)) {
            csss.removeClass('red green yellow');
            lels.removeClass('middle');
            csss.addClass('yellow');
            lels.text('B');
        } else if((parseInt(lel) >= 70) &&(parseInt(lel) <80)) {
            csss.removeClass('blue green red');
            lels.removeClass('middle');
            csss.addClass('blue');
            lels.text('C');
        } else{
            csss.removeClass('blue red yellow');
            lels.removeClass('middle');
            csss.addClass('green');
            lels.addClass('middle');
            lels.text('正常');
        }
    }



	function cretable(name, id, type, grade,src) {
    	if(grade==null){
    		grade = parseInt(80);
		}
		grade = parseInt(grade);
		var td;
		if(grade < 60) {
			td = $("<td class='' style='width:100%;height:134px;'>\
					<div class='tabtrdiv '>\
					<div class='tr_ph '>\
					<img src='" + src + "'></div><div class='tr_msg '>\
					<div>姓名：<span class='tr_msg_name'>" + name + "</span></div>\
					<div>编号：<span class='tr_msg_id'>" + id + "</span></div>\
					<div>戒治阶段：<span class='tr_msg_name'>" + type + "</span></div>\
					<a id='msgDetils'>详细信息</a></div>\
					<div class='tr_level  wxxfclevelA'><p class='tr_level_sc'>" + grade + "<span style='width: 13px;height: 13px;font-family: PingFang-SC-Heavy;\
	font-size: 13px;font-weight: normal;font-stretch: normal;line-height: 16px;letter-spacing: 0px;color: #ffffff;'>分</span></p>\
				</div></div></td>");
		} else if((grade >= 60) && (grade < 70)) {
			td = $("<td class='' style='width:100%;height:134px;'>\
					<div class='tabtrdiv '>\
					<div class='tr_ph '>\
					<img src='" + src + "'></div><div class='tr_msg '>\
					<div>姓名：<span class='tr_msg_name'>" + name + "</span></div>\
					<div>编号：<span class='tr_msg_id'>" + id + "</span></div>\
					<div>戒治阶段：<span class='tr_msg_name'>" + type + "</span></div>\
					<a id='msgDetils'>详细信息</a></div>\
					<div class='tr_level  wxxfclevelB'><p class='tr_level_sc'>" + grade + "<span style='width: 13px;height: 13px;font-family: PingFang-SC-Heavy;\
	font-size: 13px;font-weight: normal;font-stretch: normal;line-height: 16px;letter-spacing: 0px;color: #ffffff;'>分</span></p>\
				</div></div></td>");
		} else if((grade >= 70) && (grade < 80)) {
			td = $("<td class='' style='width:100%;height:134px;'>\
					<div class='tabtrdiv '>\
					<div class='tr_ph '>\
					<img src='" + src + "'></div><div class='tr_msg '>\
					<div>姓名：<span class='tr_msg_name'>" + name + "</span></div>\
					<div>编号：<span class='tr_msg_id'>" + id + "</span></div>\
					<div>戒治阶段：<span class='tr_msg_name'>" + type + "</span></div>\
					<a id='msgDetils'>详细信息</a></div>\
					<div class='tr_level  wxxfclevelC'><p class='tr_level_sc'>" + grade + "<span style='width: 13px;height: 13px;font-family: PingFang-SC-Heavy;\
	font-size: 13px;font-weight: normal;font-stretch: normal;line-height: 16px;letter-spacing: 0px;color: #ffffff;'>分</span></p>\
				</div></div></td>");
		} else if(grade >= 80) {
			td = $("<td class='' style='width:100%;height:134px;'>\
					<div class='tabtrdiv '>\
					<div class='tr_ph '>\
					<img src='" + src + "'></div><div class='tr_msg'>\
					<div>姓名：<span class='tr_msg_name'>" + name + "</span></div>\
					<div>编号：<span class='tr_msg_id'>" + id + "</span></div>\
					<div>戒治阶段：<span class='tr_msg_name'>" + type + "</span></div>\
					<a id='msgDetils'>详细信息</a></div>\
					<div class='tr_level  wxxfclevelgreen'><p class='tr_level_sc'>" + grade + "<span style='width: 13px;height: 13px;font-family: PingFang-SC-Heavy;\
	font-size: 13px;font-weight: normal;font-stretch: normal;line-height: 16px;letter-spacing: 0px;color: #ffffff;'>分</span></p>\
				</div></div></td>");
		}
		return td
	}


})