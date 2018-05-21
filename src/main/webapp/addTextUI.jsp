<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<html>
	<head>
		<title>添加公告</title>
	</head>

	<body>
		<form action="<%=path %>/webController/addText.do" method="POST">
			<table>
			<tr>
					<td>公告主题:</td>
					<td><input type="text" name="name"></td>
				</tr>
				<tr>
					<td>公告内容:</td>
					<td><input type="text" name="text"></td>
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
