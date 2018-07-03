<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户注册</title>
<%@include file="/common/common.jsp"%>
<link rel="stylesheet" type="text/css" href="${path}/main/register/register.css">
<script type="text/javascript" src="${path}/main/register/register.js"></script>
</head>
<body>
<div class="container">
	<div class="row center-vertical">
		<form class="form-horizontal col-md-5 col-md-offset-3">
			<div class="form-group">
				<label class="col-sm-4 control-label">用户名</label>
				<div class="col-sm-8">
					<input id="username" type="text" class="form-control" placeholder="请输入用户名"/>
					<span class="help-block"></span>
				</div>
			</div>
			<div class="form-group">
				<label class="col-sm-4 control-label">注册邮箱</label>
				<div class="col-sm-8">
					<input type="password" class="form-control" placeholder="请输入注册邮箱"/>
				</div>
			</div>
			<div class="form-group">
				<label class="col-sm-4 control-label">登录密码</label>
				<div class="col-sm-8">
					<input type="password" class="form-control" placeholder="请输入登录密码"/>
				</div>
			</div>
			<div class="form-group">
				<label class="col-sm-4 control-label">密码确认</label>
				<div class="col-sm-8">
					<input type="password" class="form-control" placeholder="请再次输入登录密码"/>
				</div>
			</div>
			<center class="form-group">
				<button type="button" class="btn btn-primary" id="btn_register">注册</button>
				<button type="button" class="btn btn-info" id="btn_login">去登录</button>
			</center>			
		</form>			
	</div>
</div>
</body>
</html>