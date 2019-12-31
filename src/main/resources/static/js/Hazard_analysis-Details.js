$(document).ready(function() {





	/*更多点击弹窗事件*/
	layui.use('form', function() {
		var form = layui.form;
		form.render();
	});
	$(document).on('click', '.quxiao', function() {
		//	alert(6666);
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
            var id = $('#number').text();
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
            var id = $('#number').text();
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
            var id = $('#number').text();
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
            var id = $('#number').text();
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
            var id = $('#number').text();
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

    var id = $('#number').text();
	//头像显示
    $.ajax({
        type: "get",
        url: "/hazard/manPhoto?id="+id,
        async: true,
        dataType: 'json',
        success: function (d) {
            var tableData = d.data;
            // console.log(tableData)
            if(tableData == null) {
                var imgsrc = '../img/photo_img.png'
                $('#photo').attr('src',imgsrc);
            } else {
                var imgsrc = 'data:image/png;base64,' + tableData;
                $('#photo').attr('src',imgsrc);
            }
        }
    });
    // //标签跳转
    $(document).on('click', '#bj', function() {
        var name = $('#name').text();
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

	/*5大标签*/
    /*五个大标签显示*/
    /*人员标签回显事件*/
    $.get("/hazard/detile/manLabelShow", {
        id:id
    }, function(date) {
        if (date.status==200){

            $('#manLabel').text(date.data.title);
        }
    }, 'json')
    fiveLabel(id);
	function fiveLabel(id) {
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
    }

    //小标签显示
    //康复训练
    $(document).on('mouseenter', '.kfxl', function(e) {
        var type = $(".kfxl .men-attr-desc").text();
        var id = $('#number').text();
        var ul = $('.kfxl_sm_lable_ul');
        labadd3(id, type, ul);
        $('.kfxl_sm_lable').css("display", "block");
    })
    $(document).on('mouseleave', '.kfxl', function(e) {
        $('.kfxl_sm_lable_ul li').remove();
        $('.kfxl_sm_lable').css("display", "none");
    })
    //行为表现
    $(document).on('mouseenter', '.xwbx', function(e) {
        var type = $(".xwbx .men-attr-desc").text();
        var id = $('#number').text();
        var ul = $('.xwbx_sm_lable_ul');
        labadd3(id, type, ul);
        $('.xwbx_sm_lable').css("display", "block");
    })
    $(document).on('mouseleave', '.xwbx', function(e) {
        $('.xwbx_sm_lable_ul li').remove();
        $('.xwbx_sm_lable').css("display", "none");
    })
    //心理情绪
    $(document).on('mouseenter', '.xlqx', function(e) {
        var type = $(".xlqx .men-attr-desc").text();
        var id = $('#number').text();
        var ul = $('.xlqx_sm_lable_ul');
        labadd3(id, type, ul);
        $('.xlqx_sm_lable').css("display", "block");
    })
    $(document).on('mouseleave', '.xlqx', function(e) {
        $('.xlqx_sm_lable_ul li').remove();
        $('.xlqx_sm_lable').css("display", "none");
    })

    //档案信息
    $(document).on('mouseenter', '.daxx', function(e) {
        var type = $(".daxx .men-attr-desc").text();
        var id = $('#number').text();
        var ul = $('.daxx_sm_lable_ul');
        labadd3(id, type, ul);
        $('.daxx_sm_lable').css("display", "block");
    })
    $(document).on('mouseleave', '.daxx', function(e) {
        $('.daxx_sm_lable_ul li').remove();
        $('.daxx_sm_lable').css("display", "none");
    })
    //生命体征
    $(document).on('mouseenter', '.smtz', function(e) {
        var type = $(".smtz .men-attr-desc").text();
        var id = $('#number').text();
        var ul = $('.smtz_sm_lable_ul');
        labadd3(id, type, ul);
        $('.smtz_sm_lable').css("display", "block");
    })
    $(document).on('mouseleave', '.smtz', function(e) {
        $('.smtz_sm_lable_ul li').remove();
        $('.smtz_sm_lable').css("display", "none");
    })






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
})
