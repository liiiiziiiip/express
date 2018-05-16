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
<a href="<%=path %>/webController/NewtbUI.do?id=${id}" target="main">发送新快递</a><br>
<a href="<%=path %>/tbController/TBfromSelf.do?id=${id}" target="main">发出的快递</a><br>
<a href="<%=path %>/tbController/TBfromOther.do?id=${id}" target="main">来自别人的快递</a><br>
<a href="<%=path %>/userController/payDebt.do?id=${id}" target="main">付款</a><br>
<a href="<%=path %>/webController/updateUserUI.do?id=${id}" target="main">更改用户信息</a><br>
<a href="<%=path %>/webController/CancelListUI.do?id=${id}" target="main">取消订单</a><br>
<script>
var uid = ${id};
console.log("UM_id:",uid);
</script>
</body>
</html>