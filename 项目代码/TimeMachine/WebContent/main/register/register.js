/*注册*/
$(function(){
	$("#username").change(function(){
		check();
	});
	
});

/** 注册 **/
function register(){
	
}

/** 验证姓名唯一，且不含特殊符号 **/
function check(){
	var $username = $("#username");
	var username = $username.val().trim();
	var uPattern = /^[a-zA-Z0-9\u4E00-\u9FA5]{2,6}$/;
	var result = uPattern.test(username);
	$username.parent().find(".help-block").html("");
	if(!result){
		$username.parent().removeClass("has-success has-feedback");
		$username.parent().addClass("has-warning has-feedback");
		$username.parent().find(".help-block").html("用户名不能含有特殊符号");
		return false;
	}else{
		$username.parent().removeClass("has-warning has-feedback");
		$username.parent().addClass("has-success has-feedback");
	}
	
}