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
<title>AdminMenu</title>
</head>
<body>
<a href="<%=path %>/userController/Emplist.do" target="main">员工列表</a><br>
<a href="<%=path %>/userController/list.do" target="main">用户列表</a><br>
<a href="<%=path %>/tbController/orderList.do" target="main">订单列表</a><br>
<a href="<%=path %>/webController/textUI.do" target="main">公告管理</a><br>
</body>
</html>