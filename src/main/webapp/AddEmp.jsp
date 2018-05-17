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
					<td>用户名:</td>
					<td><input type="text" name="ename"></td>
				</tr>
				<tr>
					<td>密码:</td>
					<td><input type="text" name="pw"></td>
				</tr>
				<tr>
					<td>姓名:</td>
					<td><input type="text" name="r_name"></td>
				</tr>
				<tr>
					<td>年纪:</td>
					<td><input type="text" name="age"></td>
				</tr>
				<tr>
					<td>性别:</td>
					<td><input type="text" name="sex"></td>
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
	</body>
</html>
