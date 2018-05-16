<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<html>
<head>
	<base href="<%=basePath%>">
	<title>Logistics-beta</title>
</head>
<body>
<h2>Best Logistics!</h2>
<form action="<%=path %>/SearchController/searchById.do" method="post">
<div class="TB_input_item">
		<input id="t_id" name="t_id" tabindex="1" placeholder="请输入运单号"  type="text" value="" size="25">
	</div>
	<input type="submit" name="submit">
	</form>
<a href="<%=path %>/User/User.jsp">User</a>
<a href="login.jsp">logIn</a><br>
<a href="logUp.jsp">logUp</a>

</body>
</html>
