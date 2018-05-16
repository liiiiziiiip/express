<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<html>
	<head>
		<title>注册</title>
	</head>

	<body>
		<form action="<%=path %>/userController/addUser.do" method="POST">
			<table>
				<tr>
					<td>username:</td>
					<td><input type="text" name="uname"></td>
				</tr>
				<tr>
					<td>password:</td>
					<td><input type="text" name="pw"></td>
				</tr>
				<tr>
					<td>realname:</td>
					<td><input type="text" name="name"></td>
				</tr>
				<tr>
					<td>phone:</td>
					<td><input type="text" name="phone"></td>
				</tr>
				<tr>
					<td>address:</td>
					<td><input type="text" name="address"></td>
				</tr>
				<tr>
					<td>
						<input type="submit" value="Save">
					</td>
					<td>
						<input type="reset" value="Reset">
					</td>
				</tr>
			</table>
		</form>
	</body>
</html>
