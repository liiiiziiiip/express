<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<html>
	<head>
		<title>My JSP 'addEmp.jsp' starting page</title>
	</head>

	<body>
		<form action="<%=path %>/userController/addEmp.do" method="POST">
			<table>
				<tr>
					<td>username:</td>
					<td><input type="text" name="ename"></td>
				</tr>
				<tr>
					<td>password:</td>
					<td><input type="text" name="pw"></td>
				</tr>
				<tr>
					<td>realname:</td>
					<td><input type="text" name="r_name"></td>
				</tr>
				<tr>
					<td>age:</td>
					<td><input type="text" name="age"></td>
				</tr>
				<tr>
					<td>sex:</td>
					<td><input type="text" name="sex"></td>
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
