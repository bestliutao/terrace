//分页点击效果动态添加移除
$(document).on("click", '.risktype_ul li', function(d) {
	$('.risktype_ul li').removeClass('licolor');
	$(this).addClass('licolor');
	var msg_id = $(this);
	//console.log(msg_id);
})

//条件筛选点击事件
//监控
$(document).on("click", '.jk', function(d) {
	var url = "provincial_sb.json";
	var li_text = $(".jk").text();
	$("#Risk_type").text(li_text);
	dateadd(url);
})
//门禁
$(document).on("click", '.mj', function(d) {
	var li_text = $(".mj").text();
	$("#Risk_type").text(li_text);
	var url = "provincial_sb.json";
	dateadd(url);
})
//消防
$(document).on("click", '.xf', function(d) {
	var li_text = $(".xf").text();
	$("#Risk_type").text(li_text);
	var url = "provincial_sb.json";
	dateadd(url);
})
//定位
$(document).on("click", '.dw', function(d) {
	var li_text = $(".dw").text();
	$("#Risk_type").text(li_text);
	var url = "provincial_sb.json";
	dateadd(url);
})
//其他
$(document).on("click", '.qt', function(d) {
	var li_text = $(".qt").text();
	$("#Risk_type").text(li_text);
	var url = "provincial_sb.json";
	dateadd(url);
})

//分页传参函数
var total = 0;
var last = 0;
//	function showReocrd(pageUrl,pageType, pageNo, pageSize) {
function showReocrd(pageUrl, pageNo, pageSize) {
	$.get(pageUrl, {
			//				pageType:pageType,
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
				var pagenum = tableData.length;
				//左上角
				$("#Risk_num").text(pagenum);
				console.log(tableData.length)
				for(var i = 0; i < tableData.length; i++) {
					//alert(data[i].userName+"  "+data[i].userPassword);									
					var li = cretable(tableData[i].title, tableData[i].jk);
					$('.trendtype_content ul').append(li);

				}
			} else {
				alert("数据出错");
			}

		},
		"json"
	);
}
//初始页显示数据，默认选中第一个效果
var oneurl = "provincial_sb.json";
dateadd(oneurl);
//分页器渲染
//	function dateadd(pageurl,pagetype) {
function dateadd(pageurl) {
	layui.use(['laypage', 'jquery'], function() {
		var laypage = layui.laypage,
			$ = layui.$;
		$(".trendtype_page").each(function(i, the) {
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
					//非首次加载 do something
					//						if(!first) {
					//清空以前加载的数据
					$('.trendtype_content ul').empty();
					//调用加载函数加载数据
					//							showReocrd(pageurl,pagetype,obj.curr, obj.limit);
					showReocrd(pageurl, obj.curr, obj.limit);
					//						}else{
					//						
					//							showReocrd(pageurl,obj.curr, obj.limit);
					//						}
				}
			});
		})
	})
}

//初始化数据获取

/*数据判断，在获取到时样式添加填充*/
function cretable(title, num) {
	var li;
	if(num > 0) {			
		li = $("<li><div class='keyPersonnel_item'>\
		<div class='keyPersonnel_item_left'>\
		<div class='info lightboder3'>\
		<span class='infomsg_content' title='" + title + "'>" + title + "</span>\
		<p><a href='Equipment_exception.html'>查看详情</a></p></div>\
		<div class='keyPersonnel_class red lightboder3'>\
		<div class='keyPersonnel_class-text'>\
		<p class='score'>" + num + "</p>\
		<p class='v-desc'>异常数量</p></div></div></div></li>");
	}else if(num == 0) {
			li = $("<li><div class='keyPersonnel_item'>\
		<div class='keyPersonnel_item_left'>\
		<div class='info lightboder3'>\
		<span class='infomsg_content' title='" + title + "'>" + title + "</span>\
		<p><a href='Equipment_exception.html'>查看详情</a></p></div>\
		<div class='keyPersonnel_class green lightboder3'>\
		<div class='keyPersonnel_class-text'>\
		<p class='score'>" + num + "</p>\
		<p class='v-desc'>异常数量</p></div></div></div></li>");
	}
		return li
}