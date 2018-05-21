<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<html>
<head>
	<base href="<%=basePath%>">
	<title>Logistics-beta</title>
	<link rel="stylesheet" type="text/css" href="css/Style.css">
</head>
<body>
<h2>Best Logistics!</h2>
<div id="login">
<div id="form">
<form action="<%=path %>/SearchController/searchById.do" method="post">

		<input id="t_id" name="t_id" tabindex="1" placeholder="请输入运单号"  type="text" value="" size="25">
	
	<input type="submit" name="submit">
	</form>
  <br>
  <br>
<a href="login.jsp">登陆</a>
<a href="logUp.jsp">注册</a>
</div>
</div>

</body>
</html>
