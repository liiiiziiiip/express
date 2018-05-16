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
<title>Insert title here</title>
</head>
<body>
<a href="<%=path %>/tbController/NewtbList.do?id=${id}" target="main">查看新快递</a><br>
<a href="<%=path %>/tbController/TBofMe.do?id=${id}" target="main">我负责的快递</a><br>
<a href="<%=path %>/tbController/NewTBUI.do?id=${id}" target="main">添加新快递</a><br>
<a href="<%=path %>/userController/updateUserUI.do?id=${id}" target="main">更改用户信息</a><br>
<script>
var uid = ${id};
console.log("UM_id:",uid);
</script>
</body>
</html>