/*注册*/
$(function(){
	$("#username").change(function(){
		check();
	});
	
	$("#secpass").change(function(){
		
	});
	
	$("#regemail").change(function(){
		if(checkEmail($("#regemail"))){
			
		}else{
			error($("#regemail"),"请检查注册邮箱");
		}
	});
	
	$("#btn_register").click(function(){
		
		register();
		
	});
});

/** 注册 **/
function register(){
	var $regemail = $("#regemail");
	var $firpass = $("#firpass");
	var $secpass = $("#secpass");
	
	if(!check()){
		return false;
	}
	
	if(!checkBlank($regemail,"注册邮箱不能为空")){
		return false;
	}else{
		success($regemail);
	}
	
	if(checkEmail($("#regemail"))){
		
	}else{
		error($("#regemail"),"请检查注册邮箱");
		return false;
	}
	
	if(!checkBlank($firpass,"登录密码不能为空")){
		return false;
	}else{
		success($firpass);
	}
	
	if(!checkBlank($secpass,"确认密码不能为空")){
		return false;
	}else{
		success($secpass);
	}
	
	if(!checkSecPassword($firpass,$secpass)){
		return false;
	}
	var username = $("#username").val().trim();
	$.ajax({
		type:"get",
		url:"registeruser",
		dataType:"json",
		data:{"username":username},
		success:function(data){
			if(!data.result){
				
				return false;
			}
		},
		error:function(){
			
		}
	});
}

/** 验证姓名唯一，且不含特殊符号 **/
function check(){
	var $username = $("#username");
	var username = $username.val().trim();
	if(!checkBlank($username,"用户名不能为空")){
		return false;
	}
	var uPattern = /^[a-zA-Z0-9\u4E00-\u9FA5]{2,6}$/;
	var result = uPattern.test(username);
	if(!result){
		error($username,"用户名不能含有特殊符号");
		return false;
	}else{
		success($username);
	}
	$.ajax({
		type:"get",
		url:"check",
		dataType:"json",
		data:{"username":username},
		success:function(data){
			if(!data.result){
				error($username,'用户名已被注册');
				return false;
			}
		},
		error:function(){
			
		}
	});
	return true;
}

/* 成功提示 */
function success(domnode){
	domnode.parent().removeClass("has-warning has-feedback");
	domnode.parent().addClass("has-success has-feedback");	
	domnode.parent().find(".help-block").html("");
}
/* 错误提示 */
function error(domnode,message){
	domnode.parent().removeClass("has-success has-feedback");
	domnode.parent().addClass("has-warning has-feedback");
	domnode.parent().find(".help-block").html(message);	
}

/* 验证值是否为空 */
function checkBlank(domnode,message){
	var value = domnode.val().trim();
	if(value == ""){
		error(domnode,message);
		return false;
	}	
	return true;	
}

function checkSecPassword(first,second){
	var firpass = first.val().trim();
	var secpass = second.val().trim();
	if(firpass != secpass){
		error(second,"确认密码与登录密码不一致");
		return false;
	}
	return true;
}

function checkEmail(email){
	var uPattern = /^[a-z0-9]+([._\\-]*[a-z0-9])*@([a-z0-9]+[-a-z0-9]*[a-z0-9]+.){1,63}[a-z0-9]+$/; 
	var result = uPattern.test(email);
	return result;
}