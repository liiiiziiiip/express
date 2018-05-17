<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<html>
	<head>
		<title>UpdateUser</title>
		<script type="text/javascript">
		console.log("tb:"，${tb});
		</script>
	</head>

	<body>
		<form action="<%=path %>/tbController/updateTB.do?e_id=${id}" method="POST">
			<input type="hidden" name="T_id" value="${tb.t_id }">
			<input type="hidden" name="T_price" value="${tb.t_price }">
			<input type="hidden" name="T_now" value="${tb.t_now }">
			
			<table>
				<tr>
					<td>
						货物名称: 
					</td>
					<td>
						<input type="text" name="G_name" value="${tb.g_name }">
					</td>
				</tr>
				<tr>
					<td>
						始发地:
					</td>
					<td>
						<input type="text" name="phone" value="${tb.td_start }">
					</td>
				</tr>
				<tr>
					<td>
						目的地:
					</td>
					<td>
						<input type="text" name="address" value="${tb.td_end }">
					</td>
				</tr>
				<tr>
					<td>
						备注:
					</td>
					<td>
						<input type="text" name="pw" value="${tb.t_other }">
					</td>
				</tr>
				<tr>
					<td>
						最新状态:
					</td>
					<td>
						<input type="text" name="updateNow" value="">
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
