<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<html>
	<head>
		<title>UpdateUser</title>
	</head>

	<body>
		<form action="<%=path %>/userController/updateUser.do" method="POST">
			<input type="hidden" name="id" value="${user.id }">
			
			<table>
				<tr>
					<td>
						name: 
					</td>
					<td>
						<input type="text" name="name" value="${user.name }">
					</td>
				</tr>
				<tr>
					<td>
						phone:
					</td>
					<td>
						<input type="text" name="phone" value="${user.phone }">
					</td>
				</tr>
				<tr>
					<td>
						address:
					</td>
					<td>
						<input type="text" name="address" value="${user.address }">
					</td>
				</tr>
				<tr>
					<td>
						password:
					</td>
					<td>
						<input type="text" name="pw" value="${user.pw }">
					</td>
				</tr>
				<tr>
					<td>
						<input type="submit" value="Update">
					</td>
					<td>
						<input type="reset" value="Reset">
					</td>
				</tr>
			</table>
		</form>
	</body>
</html>
