<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>主页</title>
<%@include file="/common/common.jsp"%>
</head>
<body>
 
<%-- <a href="${path}/Football/login">login</a> --%>
<%-- <%@include file="/common/header.jsp"%> --%>

<div class="container">
	<div class="row">
		<div class="col-sm-6">
		<ul class="nav nav-pills nav-justified">
			<li><a href="${path}/login/l"><button class="btn">首页</button></a></li>
			<li>
			<div class="btn-group dropdown">
				<button class="btn dropdown-toggle" data-toggle="dropdown">球队</button>
				<ul class="dropdown-menu">
					<li><a href="${path}/common/goAddteam">资料</a></li>
					<li><a href="">战绩</a></li>
					<li><a href="">赛程</a></li>
				</ul>
			</div>
			</li>
			<li>
			<div class="btn-group dropdown">
				<button class="btn dropdown-toggle" data-toggle="dropdown">联赛</button>
				<ul class="dropdown-menu">
					<li><a href="">资料</a></li>
					<li><a href="">战绩</a></li>
					<li><a href="">赛程</a></li>
				</ul>
			</div>
			</li>
			<li><a href="${path}/common/freeType"><button class="btn">自由</button></a></li>
		</ul>
		</div>


		<div class="col-sm-2 col-sm-push-4">个人中心</div>
	</div>


</div>









<script type="text/javascript">

</script>
</body>
</html>