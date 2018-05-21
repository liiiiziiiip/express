<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<html>
	<head>
		<title>注册</title>
		<link rel="stylesheet" type="text/css" href="css/Style.css">
	</head>

	<body>
	<div id="login">
	<div id="form">
	
		<form action="<%=path %>/userController/addUser.do" method="POST">
			<table>
				<tr>
					<td>用户名:</td>
					<td><input type="text" name="uname"></td>
				</tr>
				<tr>
					<td>密码:</td>
					<td><input type="text" name="pw"></td>
				</tr>
				<tr>
					<td>真实姓名:</td>
					<td><input type="text" name="name"></td>
				</tr>
				<tr>
					<td>电话:</td>
					<td><input type="text" name="phone"></td>
				</tr>
				<tr>
					<td>地址:</td>
					<td><input type="text" name="address"></td>
				</tr>
				<tr>
					<td>
						<input type="submit" value="提交">
					</td>
					<td>
						<input type="reset" value="重置">
					</td>
				</tr>
			</table>
		</form>
		</div>
	</div>
	</body>
</html>
