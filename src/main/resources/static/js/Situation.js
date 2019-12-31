$(document).ready(function() {

	//分页点击效果动态添加移除
	$(document).on("click", '.Brigade_Type_ul li', function(d) {
		$('.Brigade_Type_ul li').removeClass('licolor');
		$(this).addClass('licolor');
		var msg_id = $(this);
		console.log(msg_id);
	})

	//条件筛选点击事件
	$(document).on("click", '.Brigade1', function(d) {
        var oneurl = "/police/groupDetils";
        var type=   $(".Brigade_Type_ul .licolor").text();
        showReocrd(oneurl,type,1,20);
	})
	$(document).on("click", '.Brigade2', function(d) {
        var oneurl = "/police/groupDetils";
        var type=   $(".Brigade_Type_ul .licolor").text();
        showReocrd(oneurl,type,1,20);

	})
	$(document).on("click", '.Brigade3', function(d) {
        var oneurl = "/police/groupDetils";
        var type=   $(".Brigade_Type_ul .licolor").text();
        showReocrd(oneurl,type,1,20);

	})
	$(document).on("click", '.Brigade4', function(d) {
        var oneurl = "/police/groupDetils";
        var type=   $(".Brigade_Type_ul .licolor").text();
        showReocrd(oneurl,type,1,20);

	})
	$(document).on("click", '.Brigade5', function(d) {
        var oneurl = "/police/groupDetils";
        var type=   $(".Brigade_Type_ul .licolor").text();
        showReocrd(oneurl,type,1,20);
	})
	
	//分页传参函数
	var total = 0;
    var last = 0;

	function showReocrd(pageUrl,pageName, pageNo, pageSize) {
		$.get(pageUrl, {
				pageNo: pageNo,
				pageSize: pageSize,
                pageName:pageName
			},
			function(date) {
				if(date.status == 200) {
					//加载后台返回的List集合数据
					var tableData = date.data;
					console.log(tableData)
					total = tableData.total;
					last = tableData.last;
					data = tableData.data;
					//左上角
					$("#Brigade_num").text(total);
					for(var i = 0; i < data.length; i++) {
						var content=data[i].alarmGroup+data[i].alarmArea+data[i].alarmTitle;
                        var aaa = data[i].alarmTime
                        var ymd = aaa.split('T')[0].split('-')
                        var msm = aaa.split('T')[1].split('.')[0].split(':')
                        var time = ymd[0]+"年"+ymd[1]+"月"+ymd[2]+"日"+msm[0]+"点"+msm[1]+"分"
						var li = cretable(time,content, data[i].alarmLevel);
						$('.Brigade_Type_content ul').append(li);
					}

				} else {
					alert("数据出错");
				}
                dateadd(pageUrl,pageName);
			},
			"json"
		);
	}
    function showReocrd1(pageUrl,pageName, pageNo, pageSize) {
        $.get(pageUrl, {
                pageNo: pageNo,
                pageSize: pageSize,
                pageName:pageName
            },
            function(date) {
                if(date.status == 200) {
                    //加载后台返回的List集合数据
                    var tableData = date.data;
                    console.log(tableData)
                    total = tableData.total;
                    last = tableData.last;
                    data = tableData.data;
                    //左上角
                    $("#Brigade_num").text(total);
                    for(var i = 0; i < data.length; i++) {
                        var content=data[i].alarmGroup+data[i].alarmArea+data[i].alarmTitle;
                        var aaa = data[i].alarmTime
                        var ymd = aaa.split('T')[0].split('-')
                        var msm = aaa.split('T')[1].split('.')[0].split(':')
                        var time = ymd[0]+"年"+ymd[1]+"月"+ymd[2]+"日"+msm[0]+"点"+msm[1]+"分"
                        var li = cretable(time,content, data[i].alarmLevel);
                        $('.Brigade_Type_content ul').append(li);
                    }

                } else {
                    alert("数据出错");
                }
            },
            "json"
        );
    }

	//初始页显示数据，默认选中第一个效果
	var oneurl = "/police/groupDetils";
	var type=   $(".Brigade_Type_ul .licolor").text();
    showReocrd(oneurl,type,1,20);
	//分页器渲染
	function dateadd(pageurl,pageName) {
		layui.use(['laypage', 'jquery'], function() {
			var laypage = layui.laypage,
				$ = layui.$;
			$(".Brigade_Type_page").each(function(i, the) {
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
						$('.Brigade_Type_content ul').empty();
						showReocrd1(pageurl,pageName, obj.curr, obj.limit);
					}
				});
			})
		})
	}

	//初始化数据获取

	/*数据判断，在获取到时样式添加填充*/
	function cretable(time, content, level) {
		var li;
		if(level === 'A') {
			li = $("<li><div class='keyPersonnel_item'>\
		<div class='keyPersonnel_item_left'>\
		<div class='li_content lightboder2'>\
		<div style='margin-top: 20px;margin-left: 24px;'>时间：<span class='tr_msg_time'>" + time + "</span></div>\
		<div style='margin-top: 21px;margin-left: 23px;'><span class='tr_msg_content' title='" + content + "'>" + content + "</span></div>\
		<a href=''>详细信息</a></div>\
		<div class='keyPersonnel_class red lightboder3'>\
		<div class='keyPersonnel_class-text'>\
		<p class='score'>" + level + "</p>\
		<p class='v-desc'>风险等级</p></div></div></div></div></li>");
		} else if(level === 'B') {
		li = $("<li><div class='keyPersonnel_item'>\
		<div class='keyPersonnel_item_left'>\
		<div class='li_content lightboder2'>\
		<div style='margin-top: 20px;margin-left: 24px;'>时间：<span class='tr_msg_time'>" + time + "</span></div>\
		<div style='margin-top: 21px;margin-left: 23px;'><span class='tr_msg_content' title='" + content + "'>" + content + "</span></div>\
		<a href=''>详细信息</a></div>\
		<div class='keyPersonnel_class yellow lightboder3'>\
		<div class='keyPersonnel_class-text'>\
		<p class='score'>" + level + "</p>\
		<p class='v-desc'>风险等级</p></div></div></div></div></li>");
		} else if(level === 'C') {
			li = $("<li><div class='keyPersonnel_item'>\
		<div class='keyPersonnel_item_left'>\
		<div class='li_content lightboder2'>\
		<div style='margin-top: 20px;margin-left: 24px;'>时间：<span class='tr_msg_time'>" + time + "</span></div>\
		<div style='margin-top: 21px;margin-left: 23px;'><span class='tr_msg_content' title='" + content + "'>" + content + "</span></div>\
		<a href=''>详细信息</a></div>\
		<div class='keyPersonnel_class blue lightboder3'>\
		<div class='keyPersonnel_class-text'>\
		<p class='score'>" + level + "</p>\
		<p class='v-desc'>风险等级</p></div></div></div></div></li>");
		} else if(level === '正常') {
		li = $("<li><div class='keyPersonnel_item'>\
		<div class='keyPersonnel_item_left'>\
		<div class='li_content lightboder2'>\
		<div style='margin-top: 20px;margin-left: 24px;'>时间：<span class='tr_msg_time'>" + time + "</span></div>\
		<div style='margin-top: 21px;margin-left: 23px;'><span class='tr_msg_content' title='" + content + "'>" + content + "</span></div>\
		<a href=''>详细信息</a></div>\
		<div class='keyPersonnel_class green lightboder3'>\
		<div class='keyPersonnel_class-text'>\
		<p class='score middle'>" + level + "</p>\
		<p class='v-desc'>风险等级</p></div></div></div></div></li>");
		}
		return li
	}

})