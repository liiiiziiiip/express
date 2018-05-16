<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<html>
	<head>
		<title>updateEmp</title>
	</head>

	<body>
		<form action="<%=path %>/userController/updateEmp.do" method="POST">
			<input type="hidden" name="e_id" value="${emp.e_id }">
			<input type="hidden" name="ename" value="${emp.ename }">
			<input type="hidden" name="pw" value="${emp.pw }">
			<table>
				<tr>
					<td>
						name: 
					</td>
					<td>
						<input type="text" name="r_name" value="${emp.r_name }">
					</td>
				</tr>
				<tr>
					<td>
						age:
					</td>
					<td>
						<input type="text" name="age" value="${emp.age }">
					</td>
				</tr>
				<tr>
					<td>
						sex:
					</td>
					<td>
						<input type="text" name="sex" value="${emp.sex }">
					</td>
				</tr>
				<tr>
					<td>
						sal:
					</td>
					<td>
						<input type="text" name="sal" value="${emp.sal }">
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
