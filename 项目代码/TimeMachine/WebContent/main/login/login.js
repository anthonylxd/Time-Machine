/*登录*/
$(function(){

	$("#btn_login").on("click",function(){
		login();
	});	
	
	$("#btn_register").on("click",function(){
		var contextPath = window.document.location.pathname;
		location.href = contextPath.substring(0,contextPath.substr(1).indexOf('/')+1)+"/register/register";
	});	
});


function login() {
	var contextPath = window.document.location.pathname;		
    var $username = $("#username");
    var $firpass = $("#firpass");

    if(!checkBlank($username,"登录名不能为空")){
    	return false;
    }else{
    	success($username);
    }
    
	if(!checkBlank($firpass,"登录密码不能为空")){
		return false;
	}else{
		success($firpass);
	}
    var result = checkEmail($username);
    if(result){
    	var parname = "email";
    }else{
    	var parname = "username";
    }
    var username = $username.val();
    var password = $firpass.val();

    $.ajax({
    	type:"post",
    	url:"loginuser",
    	dataType:"json",
    	data:{
    		parname:username,
    		"password":password
    	},
    	success:function(data){
    		console.log("回应 "+data);
    	},
    	error:function(){
    		
    	}
    });
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

/*验证是否是邮箱*/
function checkEmail(email){
	var uPattern = new RegExp("^[a-z0-9]+([._\\-]*[a-z0-9])*@([a-z0-9]+[-a-z0-9]*[a-z0-9]+.){1,63}[a-z0-9]+$"); 
	var result = uPattern.test(email);
	return result;
}