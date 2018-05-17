<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%><!-- 见onenote/javaweb，获取路径 ，返回当前应用的名字-->
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>list</title>
</head>
<body>
  	<h3>List</h3>
  	<a href="<%=path %>/addUser.jsp">添加用户</a><br/>
	<table border="1" width="70%">
   		<tr>
   			<td>编号</td>
   			<td>姓名</td>
   			<td>用户名</td>
   			<td>电话</td>
   			<td>地址</td>
   			<td>删除</td>
   			<td>更新</td>
   		</tr>
   		<c:forEach items="${userlist}" var="user">
   		<tr>
   			<td>${user.id }</td>
   			<td>${user.name }</td>
   			<td>${user.uname }</td>
   			<td>${user.phone }</td>
   			<td>${user.address }</td>
   			<td><a href="<%=path %>/userController/deleteUser.do?id=${user.id }">删除</a></td>
   			<td><a href="<%=path %>/userController/updateUserUI.do?id=${user.id }">更新</a></td>
   		</tr>
   		</c:forEach>
   </table>
   
</body>
</html>