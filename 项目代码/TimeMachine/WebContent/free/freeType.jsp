<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>自由模式</title>
<%@include file="../common/common.jsp"%>
</head>
<body>
<div class="container">
<form action="${path}/freeType/getData" method="post">
	<div class="form-group">
		<label>主场球队</label><input type="text" name="tname1"/>
	</div>
	<div class="form-group">
		<label>联赛排名</label><input type="number" name="no1"/>
		<h4>最近战绩</h4>
		<input type="number" name="match11"/>
		<select class="form-control" name="result11">
			<option value="0">负</option>
			<option value="1">平</option>
			<option value="3">胜</option>
		</select>
	</div>
	<div class="form-group">
		<label>对手名次</label>
		<input class="form-control" type="number" name="match12"/>
		<label>比赛结果</label>
		<select class="form-control" name="result12">
			<option value="0">负</option>
			<option value="1">平</option>
			<option value="3">胜</option>
		</select>
	</div>
	<div class="form-group">		
		<input type="number" name="match13"/>
		<select class="form-control" name="result13">
			<option value="0">负</option>
			<option value="1">平</option>
			<option value="3">胜</option>
		</select>
	</div>
	<div class="form-group">
		<label>球队2</label><input type="text" name="tname2"/>
	</div>
	<div class="form-group">
		<label>联赛排名</label><input type="number" name="no2"/>
		<h4>最近战绩</h4>
		<input type="number" name="match21"/>
		<select name="result11">
			<option value="0">负</option>
			<option value="1">平</option>
			<option value="3">胜</option>
		</select>
		<input type="number" name="match22"/>
		<select name="result22">
			<option value="0">负</option>
			<option value="1">平</option>
			<option value="3">胜</option>
		</select>
		<input type="number" name="match23"/>
		<select name="result23">
			<option value="0">负</option>
			<option value="1">平</option>
			<option value="3">胜</option>
		</select>
	</div>	
	<button type="submit">提交</button>
	<button type="reset">重置</button>
</form>	
</div>
</body>
</html>