<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<html>
	<head>
		<title>NewTB</title>
	</head>

	<body>
		<form action="<%=path %>/tbController/addTB.do?id=${id}" method="POST">
			<table>
				<tr>
					<td>货物名称:</td>
					<td><input type="text" name="G_name"></td>
				</tr>
				<tr>
					<td>始发地:</td>
					<td><input type="text" name="Td_start"></td>
				</tr>
				<tr>
					<td>目的地:</td>
					<td><input type="text" name="Td_end"></td>
				</tr>
				<tr>
					<td>备注:</td>
					<td><input type="text" name="T_other"></td>
				</tr>
				<tr>
					<td>收件人姓名:</td>
					<td><input type="text" name="R_name"></td>
				</tr>
				<tr>
					<td>收件人电话:</td>
					<td><input type="text" name="R_phone"></td>
				</tr>
				<tr>
					<td>
						<input type="submit" value="next">
					</td>
					<td>
						<input type="reset" value="Reset">
					</td>
				</tr>
			</table>
		</form>
	</body>
</html>
