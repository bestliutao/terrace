$(document).ready(function () {

    $.get("/user/out", {
            date:new Date()
        }, function(date) {
          if(date.status==200){
          	console.log(111)
		  }
        }
        ,'json')
})

	$(document).on("click", '.but', function(d) {
		var name = $('.login_name').val();
		var pwd = $('.login_pwd').val();
		if(name == '' || pwd == '') {
			alert("账号密码不能为空！")
		}else {
            $.get("/user/login", {
                    username:name,
                    password:pwd
            }, function(date) {
            		if(date.status==200){
            			location.href='/hazard';
					}else {
            			alert("账号或密码错误");
					}
				}
            ,'json')
		}
	})
