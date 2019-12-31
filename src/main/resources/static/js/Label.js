$(document).ready(function() {
    var type=$(".Lables").text();
	//新增标签库标签
    $(document).on('click','.yes',function(){
        var labname = $('#lablename').val();//标签名
        var labsetzs = $('#lablesetzs').val();//自杀
        var labsettt = $('#lablesettt').val();//逃脱
        var labsetxx = $('#lablesetxx').val();//行凶
        var labsetcs = $('#lablesetcs').val();//猝死
        var lablel =  $('#labset_level .activity').text();//等级
		if(labname===""||lablel===""||labsetcs===""||labsettt===""||labsetxx===""||labsetzs===""){
            alert("值不能为空");
		}else {
            $.get("/label/addLib", {
                    labelName:labname,
                    level:lablel,
                    zs:labsetzs,
                    cs:labsetcs,
                    tt:labsettt,
                    xx:labsetxx,
                    type:type
                },function(data) {

                },
                "json"
            );
		}
		location.reload();
        layer.closeAll('page');
    })



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
                content: $('.lablefxxs_iframe') //这里content是一个DOM，这个元素要放在body根节点下
            });
        })
    })
    //风险系数修改事件
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

	$(document).on('click', '.quxiao', function() {
		layer.closeAll('page');
	})

		layui.use('form', function() {
		var $ = jQuery;
		var layer = layui.layer;		
		$(".lableAdd_right").click(function() {
			layer.open({
				type: 1,
				title: false,
				area: ["581px", "414px"],	
				shadeClose: false,
				closeBtn: 0,
				content: $('.lablefadd_iframe') //这里content是一个DOM，这个元素要放在body根节点下
			});
		})
	})
	$(document).on('click', '.no', function() {
		//	alert(6666);
		layer.closeAll('page');
	})

//选取时的样式变化，取值由activity类获取
	$(document).on("click", '.lelA', function(d) {
		$('.lelB').removeClass('activity lelBbg');
		$('.lelC').removeClass('activity lelCbg');
		$('.lelA').addClass('activity lelAbg');		
	})
	$(document).on("click", '.lelB', function(d) {
		$('.lelA').removeClass('activity lelAbg');
		$('.lelC').removeClass('activity lelCbg');
		$('.lelB').addClass('activity lelBbg');		
	})
	$(document).on("click", '.lelC', function(d) {
		$('.lelB').removeClass('activity lelBbg');
		$('.lelA').removeClass('activity lelAbg');
		$('.lelC').addClass('activity lelCbg');		
	})


		// 左边标签的静态添加
		$.get("/label/man", {
				date:new Date()
			},function(data) {
                console.log(data);
					if (data.status==200) {
						var leftjson = data.data;
						console.log(data.data);
						if(leftjson!=null){
                            $("#Lable_num").text(leftjson.length);
                            for (var i = 0; i < leftjson.length; i++) {
                                var elem = lableft(leftjson[i].id,leftjson[i].labelName,leftjson[i].level);
                                $(".Label_already_content ul").append(elem);
                            }
						}
					}
			},
			"json"
		);
//			//右边标签的静态添加
		$.get("/label/lib", {
				type:type,
                date:new Date()
			},function(data) {
					if (data.status==200) {
						var right = data.data;
						for (var i = 0; i < right.length; i++) {
							var elem = labright(right[i].id,right[i].name,right[i].level);
							$(".Label_add_content ul").append(elem);
							
						}
					}
			},		
			"json"
		);

	layui.use(['element', 'form'], function() {
				var BehaviorSelect = []; //行为选中数组==>存标签id
				var Behavior = []; //行为id数组
				var labelSelect = []; //标签选中数组==>存标签id
				var label = []; //标签数组id
				//多选框按钮
				$(document).ready(function () {
					$(document).on('click', '.already_li', function() {
					var type = $(this).attr("data-type");
					console.log(type);
					var isCheckbox = $(this).find("img").attr("data-isCheckbox") == "false" ? false : true;
					var lableId = $(this).find("img").attr("data-id");
					var imgSrc = isCheckbox ? "../img/checkoutbox.png" : "../img/checkoutbox_active.png";
					$(this).find("img").attr("data-isCheckbox", !isCheckbox);
					$(this).find("img").attr("src", imgSrc);
					console.log("isCheckbox:" + isCheckbox + ",imgSrc:" + imgSrc);
					if (type == 1) {
						if (isCheckbox) {
							//之前选中，现在不选中
							for (var i = 0; i < BehaviorSelect.length; i++) {
								var behavior = BehaviorSelect[i];
								if (behavior == lableId) {
									BehaviorSelect.splice(i, 1);
								}
							}
						} else {
							//之前没有选中，现在选中
							BehaviorSelect.push(lableId);
							console.log(lableId);
						}
					} else {
						//选择标签
						if (isCheckbox) {
							//之前选中，现在不选中
							for (var i = 0; i < labelSelect.length; i++) {
								var behavior = labelSelect[i];
								if (behavior == lableId) {
									labelSelect.splice(i, 1);
								}
							}
						} else {
							//之前没有选中，现在选中
							labelSelect.push(lableId);
							console.log(lableId);
						}
					}

				})
})
				
				//删除行为数组
				$(".lableDel_left").click(function() {
					if(BehaviorSelect.length>0){
						var index1 = layer.alert("确认删除？", {
							btn: ['确定', '取消'],
							icon: 6
						}, function() {
							
							for (var i = 0; i < BehaviorSelect.length; i++) {
								var behaviordeleid = BehaviorSelect[i];
								//标签的id
                                $.get("/label/delete", {
                                        id:behaviordeleid
                                    },function(data) {

                                    },
                                    "json"
                                );
							}
                            alert("删除成功");
							location.reload(true);
							layer.close(index1);
						});
					}else{
						alert("您未选择");
					}
				})
//				//删除标签数组
				$(".lableDel_right").click(function() {
					var index2 = layer.alert("确认删除？", {
						btn: ['确定', '取消'],
						icon: 6
					}, function() {
						//这边ajax 删除===》 删除成功直接 直接刷新页面
						for (var i = 0; i < labelSelect.length; i++) {
							var labelSelectid = labelSelect[i];
                            $.get("/label/deleteLib", {
                                    id:labelSelectid
                                },function(data) {
                                },
                                "json"
                            );

						}
						location.reload(true);
						layer.close(index2);
					});
				})
				//人员标签添加
				$('.add').click(function() {
					var index3 = layer.alert("确认添加已选标签？", {
						btn: ['确定', '取消'],
						icon: 6
					}, function() {
						var back=1;
						for (var i = 0; i < labelSelect.length; i++) {
							var addlabelid = parseInt(labelSelect[i]);//发送addlabelid-为左边添加右边对应标签id数据
                            $.get("/label/add", {
                                    id:addlabelid
                                },function(data) {
                                    if (data.status==200) {
                                       back=1;
                                    }
                                    if(data.status==300){
                                    	back=0;
									}
                                },
                                "json"
                            );
						}
						if(back==1){
							alert("添加成功");
                            location.reload(true);
                            layer.close(index3);
						}
                        if(back==0){
                            alert("有标签添加重复");
                            location.reload(true);
                            layer.close(index3);
                        }
					});
				});
				//添加
				$("#addLabel").click(function() {
					layer.open({
						type: 2,
						content: 'label-from.html',
						area: ['600px', '370px'],
						maxmin: true,
						shadeClose: true
					});
				})
//				
			})
			
		function lableft(id,name,lel){
			if(lel == "A"){
				var elem = $(
								'<li class="already_li" data-type="1" id="label1' + id +
								'"> \
								<img class="checkbox" data-isCheckbox=false data-id=' +id +
								' src="../img/checkoutbox.png" /> \
								<div class="lab lelAbg lelAt"> \
									<span id="lab_level">' +lel + '</span>\
									<span id="lab_name" title="' +name + '">' +
								name + '</span> \
								</div></li>');
			}else if(lel == "B"){
				var elem = $(
								'<li class="already_li" data-type="1" id="label1' + id +
								'"> \
								<img class="checkbox" data-isCheckbox=false data-id=' +id +
								' src="../img/checkoutbox.png" /> \
								<div class="lab lelBbg lelBt"> \
									<span id="lab_level">' +lel + '</span>\
									<span id="lab_name" title="' +name + '">' +
								name + '</span> \
								</div></li>');
			}else if(lel == "C"){
				var elem = $(
								'<li class="already_li" data-type="1" id="label1' + id +
								'"> \
								<img class="checkbox" data-isCheckbox=false data-id=' +id +
								' src="../img/checkoutbox.png" /> \
								<div class="lab lelCbg lelCt"> \
									<span id="lab_level">' +lel + '</span>\
									<span id="lab_name" title="' +name + '">' +
								name + '</span> \
								</div></li>');
			}
			return elem
		}
		function labright(id,name,lel){
			if(lel == "A"){
				var elem = $(
								'<li class="already_li" data-type="2" id="label2' + id +
								'"> \
								<img class="checkbox" data-isCheckbox=false data-id=' +id +
								' src="../img/checkoutbox.png" /> \
								<div class="lab lelAbg lelAt"> \
									<span id="lab_level">' +lel + '</span>\
									<span id="lab_name" title="' +name + '">' +
								name + '</span> \
								</div></li>');
			}else if(lel == "B"){
				var elem = $(
								'<li class="already_li" data-type="2" id="label2' + id +
								'"> \
								<img class="checkbox" data-isCheckbox=false data-id=' +id +
								' src="../img/checkoutbox.png" /> \
								<div class="lab lelBbg lelBt"> \
									<span id="lab_level">' +lel + '</span>\
									<span id="lab_name" title="' +name + '">' +
								name + '</span> \
								</div></li>');
			}else if(lel == "C"){
				var elem = $(
								'<li class="already_li" data-type="2" id="label2' + id +
								'"> \
								<img class="checkbox" data-isCheckbox=false data-id=' +id +
								' src="../img/checkoutbox.png" /> \
								<div class="lab lelCbg lelCt"> \
									<span id="lab_level">' +lel + '</span>\
									<span id="lab_name" title="' +name + '">' +
								name + '</span> \
								</div></li>');
			}
			return elem
		}
		
})