<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>添加球队</title>
<%@include file="../common/common.jsp"%>
</head>
<body>
<form action="${path}/team/go" method="post">
<input type="text" name="name" placeholder="球队名称"/>
<input type="text" name="league" placeholder="所在联赛"/>
<input type="text" name="cup" placeholder="参加杯赛"/>
<input type="text" name="level" placeholder="级别"/>
<button type="submit">提交</button>
</form>
</body>
</html>