var d = new Date();
var year=d.getFullYear();
var moth = d.getFullYear() + "-" + d.getMonth();
var today = d.getFullYear() + "-" + (d.getMonth() + 1) + "-" + d.getDate();
//标签展示
var id = $('#number').text();
biglabget(id);
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
//头像展示
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


	/*1*/
	$('.kfxl').mouseover(function() {
		// $(".men-attr-list-left").attr("display":"block");
		// alert($(".men-attr-list-left").value());
		$('.kfxl_sm_lable').css("display", "block");
	})
	$('.kfxl').mouseout(function() {
		// $(".men-attr-list-left").attr("display":"block");
		// alert($(".men-attr-list-left").value());
		$('.kfxl_sm_lable').css("display", "none");
	})
	/*4*/
	$('.daxx').mouseover(function() {
		// $(".men-attr-list-left").attr("display":"block");
		// alert($(".men-attr-list-left").value());
		$('.daxx_sm_lable').css("display", "block");
	})
	$('.daxx').mouseout(function() {
		// $(".men-attr-list-left").attr("display":"block");
		// alert($(".men-attr-list-left").value());
		$('.daxx_sm_lable').css("display", "none");
	})
	/*2*/
	$('.xwbx').mouseover(function() {
		// $(".men-attr-list-left").attr("display":"block");
		// alert($(".men-attr-list-left").value());
		$('.xwbx_sm_lable').css("display", "block");
	})
	$('.xwbx').mouseout(function() {
		// $(".men-attr-list-left").attr("display":"block");
		// alert($(".men-attr-list-left").value());
		$('.xwbx_sm_lable').css("display", "none");
	})
	/*5*/
	$('.xlpc').mouseover(function() {
		// $(".men-attr-list-left").attr("display":"block");
		// alert($(".men-attr-list-left").value());
		$('.xlpc_sm_lable').css("display", "block");
	})
	$('.xlpc').mouseout(function() {
		// $(".men-attr-list-left").attr("display":"block");
		// alert($(".men-attr-list-left").value());
		$('.xlpc_sm_lable').css("display", "none");
	})

	/*3*/
	$('.xlqx').mouseover(function() {
		// $(".men-attr-list-left").attr("display":"block");
		// alert($(".men-attr-list-left").value());
		$('.xlqx_sm_lable').css("display", "block");
	})
	$('.xlqx').mouseout(function() {
		// $(".men-attr-list-left").attr("display":"block");
		// alert($(".men-attr-list-left").value());
		$('.xlqx_sm_lable').css("display", "none");
	})
	$('.smtz').mouseover(function() {
		// $(".men-attr-list-left").attr("display":"block");
		// alert($(".men-attr-list-left").value());
		$('.smtz_sm_lable').css("display", "block");
	})
	$('.smtz').mouseout(function() {
		// $(".men-attr-list-left").attr("display":"block");
		// alert($(".men-attr-list-left").value());
		$('.smtz_sm_lable').css("display", "none");
	})

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
        //标签回显事件
		var id = $('#number').text();
		/*人员标签回显事件*/
		$.get("/hazard/detile/manLabelShow", {
			id: id
		}, function (date) {
			if (date.status == 200) {
				console.log(date.data.number);
				$('#manLabel').text(date.data.title);
                $('#proposalMan').text(date.data.number);
			}
		}, 'json')

	})
