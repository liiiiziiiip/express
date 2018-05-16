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
<title>Admin</title>
</head>
<body>
<iframe name="head" align="top" height="15%" width="100%" frameborder="0" src="<%=path %>/Head.jsp">head</iframe>
<iframe name="menu" align="left" height="500" width="20%" frameborder="0" src="<%=path %>/AdminMenu.jsp"></iframe>
<iframe name="main" align="right" height="500" width="80%" frameborder="0" src="<%=path %>/userController/Emplist.do"></iframe>
</body>
</html>