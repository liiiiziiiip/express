<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="css/Style.css">
<title>login</title>
</head>
<body>
<div id="login">
<div id="form">
<form name="input" action="<%=path %>/userController/login-check.do" method="post">
	<div class="input-item">
		<input id="name" name="name" tabindex="1" placeholder="请输入用户名"  type="text" value="" size="25">
	</div>
	<div class="input-item" style="margin-top: 5%;">						 
		<input id="password" name="password" tabindex="2" placeholder="请输入密码" accesskey="p" type="password" value="" size="25" autocomplete="off">
	</div>
	<a>用户类型</a><br>
	<input type="radio" name="userKind" value="user">	用户<br>
	<input type="radio" name="userKind" value="emp">	员工<br>
	<input type="radio" name="userKind" value="admin">管理员<br>
<input type="submit" name="submit">
</div>
</div>
</form> 

</body>
</html>