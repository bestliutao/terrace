$(document).ready(function() {

	//分页点击效果动态添加移除
	$(document).on("click", '.risktype_ul li', function(d) {
		$('.risktype_ul li').removeClass('licolor');
		$(this).addClass('licolor');
		var msg_id = $(this);
		console.log(msg_id);
	})

	//条件筛选点击事件
	$(document).on("click", '.cs', function(d) {
        var oneurl = "/hazard/detilsMan";
        var type = $(".cs").text();
        $("#Risk_type").text(type);
        showReocrd(oneurl,type,1,20);
	})
	$(document).on("click", '.zs', function(d) {
        var oneurl = "/hazard/detilsMan";
        var type = $(".zs").text();
        $("#Risk_type").text(type);
        showReocrd(oneurl,type,1,20);
	})
    $(document).on("click", '.xx', function(d) {
        var oneurl = "/hazard/detilsMan";
        var type = $(".xx").text();
        $("#Risk_type").text(type);
        showReocrd(oneurl,type,1,20);
    })

    $(document).on("click", '.tt', function(d) {
        var oneurl = "/hazard/detilsMan";
        var type = $(".tt").text();
        $("#Risk_type").text(type);
        showReocrd(oneurl,type,1,20);
        })
    $(document).on("click", '.qt', function(d) {
        var oneurl = "/hazard/detilsMan";
        var type = $(".qt").text();
        $("#Risk_type").text(type);
        showReocrd(oneurl,type,1,20);
        })

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

	//分页传参函数
	var total = 0;
	var last = 0;
	function showReocrd(pageUrl,pageType, pageNo, pageSize) {
		$.get(pageUrl, {
				pageNo: pageNo,
				pageSize: pageSize,
				type:pageType
			},
			function(date) {
				if(date.status == 200) {
					//加载后台返回的List集合数据
					var tableData = date.data;
					total = tableData.total;
					last = tableData.last;
					data = tableData.data;
					var pagenum = data.length;
					//左上角
					$("#Risk_num").text(total);
					for(var i = 0; i < data.length; i++) {
						//alert(data[i].userName+"  "+data[i].userPassword);
                        var userDangerous=0;
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
						var li = cretable(data[i].traineename, data[i].traineecode,userDangerous , data[i].userLevel);
						$('.trendtype_content ul').append(li);
					}
                    dateadd(oneurl,pageType);
				} else {
					alert("数据出错");
				}

			},
			"json"
		);
	}
    function showReocrd1(pageUrl,pageType, pageNo, pageSize) {
        $.get(pageUrl, {
                //				pageType:pageType,
                pageNo: pageNo,
                pageSize: pageSize,
				type:pageType
            },
            function(date) {
                if(date.status == 200) {
                    //加载后台返回的List集合数据
                    var tableData = date.data;
                    total = tableData.total;
                    last = tableData.last;
                    data = tableData.data;
                    var pagenum = data.length;
                    //左上角
                    $("#Risk_num").text(total);
                    for(var i = 0; i < data.length; i++) {
                        var userDangerous=0;
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
                        var li = cretable(data[i].traineename, data[i].traineecode,userDangerous , data[i].userLevel);
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
	var oneurl = "/hazard/detilsMan";
	var type = $(".cs").text();
    $("#Risk_type").text(type);
    showReocrd(oneurl,type,1,20);

	//分页器渲染
	//	function dateadd(pageurl,pagetype) {
	function dateadd(pageurl,pageType) {
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
						$('.trendtype_content ul').empty();
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
									<p>编号:<span id='tr_msg_id'>" + id + "</span></p>\
									<p>风险分析：<span>" + type + "</span></p>\
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
									<p>编号:<span id='tr_msg_id'>" + id + "</span></p>\
									<p>风险分析：<span>" + type + "</span></p>\
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
									<p>编号:<span id='tr_msg_id'>" + id + "</span></p>\
									<p>风险分析：<span>" + type + "</span></p>\
									<p><a id='msgDetils'>详细档案</a>\
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
									<p>编号:<span id='tr_msg_id'>" + id + "</span></p>\
									<p>风险分析：<span>" + type + "</span></p>\
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