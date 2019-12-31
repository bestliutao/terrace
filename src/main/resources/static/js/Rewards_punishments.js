$(document).ready(function() {

    //详细档案跳转
    $(document).on("click", '#msgDetils', function(d) {
        var a = $(this).parent().parent().find("p #tr_msg_id").text();

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
	//分页点击效果动态添加移除
	$(document).on("click", '.rap_Type_ul li', function(d) {
		$('.rap_Type_ul li').removeClass('licolor');
		$(this).addClass('licolor');
		var msg_id = $(this);
		console.log(msg_id);
	})

	//条件筛选点击事件
	$(document).on("click", '.rap_Praise', function(d) {
        var oneurl = "/abstinence/performenceDetil";
        var type = $(".rap_Praise").text();
        $("#rap_Type").text(type);
        showReocrd(oneurl,type,1,20);
	})
	$(document).on("click", '.rap_commend', function(d) {
        var oneurl = "/abstinence/performenceDetil";
        var type = $(".rap_commend").text();
        $("#rap_Type").text(type);
        showReocrd(oneurl,type,1,20);
	})
	$(document).on("click", '.rap_achievement', function(d) {
        var oneurl = "/abstinence/performenceDetil";
        var type = $(".rap_achievement").text();
        $("#rap_Type").text(type);
        showReocrd(oneurl,type,1,20);
	})
	$(document).on("click", '.rap_Timelimit', function(d) {
        var oneurl = "/abstinence/performenceDetil";
        var type = $(".rap_Timelimit").text();
        $("#rap_Type").text(type);
        showReocrd(oneurl,type,1,20);
	})
	$(document).on("click", '.rap_Warning', function(d) {
        var oneurl = "/abstinence/performenceDetil";
        var type = $(".rap_Warning").text();
        $("#rap_Type").text(type);
        showReocrd(oneurl,type,1,20);
	})
	$(document).on("click", '.rap_Swarning', function(d) {
        var oneurl = "/abstinence/performenceDetil";
        var type = $(".rap_Swarning").text();
        $("#rap_Type").text(type);
        showReocrd(oneurl,type,1,20);
	})
	$(document).on("click", '.rap_gig', function(d) {
        var oneurl = "/abstinence/performenceDetil";
        var type = $(".rap_gig").text();
        $("#rap_Type").text(type);
        showReocrd(oneurl,type,1,20);
	})
	$(document).on("click", '.rap_ext_maturity', function(d) {
        var oneurl = "/abstinence/performenceDetil";
        var type = $(".rap_ext_maturity").text();
        $("#rap_Type").text(type);
        showReocrd(oneurl,type,1,20);
	})
	//分页传参函数
	var total = 0;
	var last = 0;
	function showReocrd(pageUrl,pageType, pageNo, pageSize) {
		$.get(pageUrl, {
				pageNo: pageNo,
				pageSize: pageSize,
				pageType:pageType
			},
			function(date) {
				if(date.status == 200) {
					//加载后台返回的List集合数据
					var tableData = date.data;
					total = tableData.total;
					last = tableData.last;
					data = tableData.data;
					//左上角
					$("#rap_num").text(total);
					for(var i = 0; i < data.length; i++) {
                        var aaa = data[i].performanceTime;
                        var ymd = aaa.split('T')[0].split('-')
                        var msm = aaa.split('T')[1].split('.')[0].split(':')
                        var time = ymd[0]+"年"+ymd[1]+"月"+ymd[2]+"日";
						var li = cretable(data[i].userName, data[i].userId, time, data[i].performanceLevel);
						$('.rap_Type_content ul').append(li);
					}
                    dateadd(pageUrl,pageType);
				} else {
					alert("数据出错");
				}
			},
			"json"
		);
	}
    function showReocrd1(pageUrl,pageType, pageNo, pageSize) {
        $.get(pageUrl, {
                pageNo: pageNo,
                pageSize: pageSize,
                pageType:pageType
            },
            function(date) {
                if(date.status == 200) {
                    //加载后台返回的List集合数据
                    var tableData = date.data;
                    total = tableData.total;
                    last = tableData.last;
                    data = tableData.data;
                    //左上角
                    $("#rap_num").text(total);
                    for(var i = 0; i < data.length; i++) {
                        var aaa = data[i].performanceTime;
                        var ymd = aaa.split('T')[0].split('-')
                        var msm = aaa.split('T')[1].split('.')[0].split(':')
                        var time = ymd[0]+"年"+ymd[1]+"月"+ymd[2]+"日";
                        var li = cretable(data[i].userName, data[i].userId, time, data[i].performanceLevel);
                        $('.rap_Type_content ul').append(li);
                    }
                } else {
                    alert("数据出错");
                }
            },
            "json"
        );
    }
	//初始页显示数据，默认选中第一个效果
	var oneurl = "/abstinence/performenceDetil";
    var type = $(".rap_Praise").text();
    $("#rap_Type").text(type);
    showReocrd(oneurl,type,1,20);
	//分页器渲染
	function dateadd(pageurl,pageType) {
		layui.use(['laypage', 'jquery'], function() {
			var laypage = layui.laypage,
				$ = layui.$;
			$(".rap_Type_page").each(function(i, the) {
				laypage.render({
					elem: the //注意，这里的 test1 是 ID，不用加 # 号
						,
					count: total //数据总数，从服务端得到
						,
					limit: 20 //每页显示条数
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
						$('.rap_Type_content ul').empty();
						showReocrd1(pageurl,pageType, obj.curr, obj.limit);
					}
				});
			})
		})
	}


	/*数据判断，在获取到时样式添加填充*/
	function cretable(name, id, type, level) {
		var li;
		if(level === 'A') {
			li = $("<li><div class='keyPersonnel_item'>\
							<div class='keyPersonnel_item_left'>\
								<div class='zdry_img lightboder3'>\
									<img src='../img/photo_img.png' />\
								</div>\
								<div class='info lightboder3'>\
									<p>姓名:<span>" + name + "</span></p>\
									<p>编号:<span id='manid'>" + id + "</span></p>\
									<p>日期：<span>" + type + "</span></p>\
									<p><a id='msgDetils'>详细档案</a>\
									</p></div>\
								<div class='keyPersonnel_class red lightboder3'>\
									<div class='keyPersonnel_class-text'>\
										<p class='score'>" + level + "</p>\
										<p class='v-desc'>风险等级</p>\
									</div></div></div></div></li>");
		} else if(level === 'B') {
			li = $("<li><div class='keyPersonnel_item'>\
							<div class='keyPersonnel_item_left'>\
								<div class='zdry_img lightboder3'>\
									<img src='../img/photo_img.png' />\
								</div>\
								<div class='info lightboder3'>\
									<p>姓名:<span>" + name + "</span></p>\
									<p>编号:<span id='manid'>" + id + "</span></p>\
									<p>日期：<span>" + type + "</span></p>\
									<p><a id='msgDetils'>详细档案</a>\
									</p></div>\
								<div class='keyPersonnel_class yellow lightboder3'>\
									<div class='keyPersonnel_class-text'>\
										<p class='score'>" + level + "</p>\
										<p class='v-desc'>风险等级</p>\
									</div></div></div></div></li>");
		} else if(level === 'C') {
			li = $("<li><div class='keyPersonnel_item'>\
							<div class='keyPersonnel_item_left'>\
								<div class='zdry_img lightboder3'>\
									<img src='../img/photo_img.png' />\
								</div>\
								<div class='info lightboder3'>\
									<p>姓名:<span>" + name + "</span></p>\
									<p>编号:<span id='manid'>" + id + "</span></p>\
									<p>日期：<span>" + type + "</span></p>\
									<p><a id='msgDetils'> 详细档案</a>\
									</p></div>\
								<div class='keyPersonnel_class blue lightboder3'>\
									<div class='keyPersonnel_class-text'>\
										<p class='score'>" + level + "</p>\
										<p class='v-desc'>风险等级</p>\
									</div></div></div></div></li>");
		} else if(level === '正常') {
			li = $("<li><div class='keyPersonnel_item'>\
							<div class='keyPersonnel_item_left'>\
								<div class='zdry_img lightboder3'>\
									<img src='../img/photo_img.png' />\
								</div>\
								<div class='info lightboder3'>\
									<p>姓名:<span>" + name + "</span></p>\
									<p>编号:<span id='manid'>" + id + "</span></p>\
									<p>日期：<span>" + type + "</span></p>\
									<p><a id='msgDetils'>详细档案</a>\
									</p></div>\
								<div class='keyPersonnel_class green lightboder3'>\
									<div class='keyPersonnel_class-text'>\
										<p class='score middle'>" + level + "</p>\
										<p class='v-desc'>风险等级</p>\
									</div></div></div></div></li>");
		}
		return li
	}

})