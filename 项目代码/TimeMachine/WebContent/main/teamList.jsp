<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>球队列表</title>
<%@include file="../common/common.jsp"%>
</head>
<body>

<table id="teamTable">
	<thead>
		<tr>
		<th>序号</th>
		<th>名称</th>
		</tr>	
	</thead>
	<tbody>
		
	</tbody>
</table>

<script type="text/javascript">
$(function(){
	$("#teamTable").bootstrapTable({
		columns:[
		{	field:'id',
			title:'Item Id'},
		{	field:'id',
			title:'Item Id'}
		]
	});
	
});
</script>
</body>
</html>