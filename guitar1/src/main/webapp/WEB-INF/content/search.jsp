<%@ page language="java" contentType="text/html; charset=utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>吉他查询</title>
</head>
<body>
<form action="Search" method="post">
<table align="center">
<tr>
		<td><h3>查询</h3><br/></td>
	</tr>	
	<tr>
		<td>serialNumber：<input type="text" name="serialNumber"/><br/></td>
		<td>price：<input type="text" name="price"/><br/></td>
		<td>builder：<input type="text" name="builder"/><br/></td>
		<td>model：<input type="text" name="model"/><br/></td>
		<td>type：<input type="text" name="type"/><br/></td>
		<td>backWood：<input type="text" name="type"/><br/></td>
		<td>topWood<input type="text" name="topWood"/><br/></td>
	</tr>
	
	<tr align="center">
		<td><input type="submit" value="查询"/></td>
	</tr>
</table>
</form>
</body>
</html>