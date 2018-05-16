<%@page import="java.util.ArrayList"%>
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
<title>User</title>
</head>
<body>
<iframe name="head" align="top" height="15%" width="100%" frameborder="0" src="<%=path %>/Head.jsp?id=${id}">head</iframe>
<iframe name="menu" align="left" height="500" width="20%" frameborder="0" src="<%=path %>/webController/Menu.do?id=${id}"></iframe>
<iframe name="main" align="right" height="500" width="80%" frameborder="0" src="<%=path %>/userController/Emplist.do"></iframe>
<script>
var id = ${id};
console.log("id:",id);
</script>
</body>
</html>