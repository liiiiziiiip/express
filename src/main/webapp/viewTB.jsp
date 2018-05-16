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
  	
	<table border="1" width="70%">
   		<tr>
   			<td>T_id</td>
   			<td>G_name</td>
   			<td>T_client</td>
   			<td>T_empId</td>
   			<td>T_price</td>
   			<td>Td_end</td>
   			<td>Td_hub</td>
   			<td>Td_start</td>
   		</tr>
   		
   		<tr>
   			<td>${TBD.t_id }</td>
   			<td>${TBD.g_name }</td>
   			<td>${TBD.t_client }</td>
   			<td>${TBD.t_empId }</td>
   			<td>${TBD.t_price }</td>
   			<td>${TBD.td_end }</td>
   			<td>${TBD.td_hub }</td>
   			<td>${TBD.td_start }</td>
   			<td><a href="<%=path %>/userController/deleteUser.do?id=${user.id }">Delete</a></td>
   			<td><a href="<%=path %>/userController/updateUserUI.do?id=${user.id }">Update</a></td>
   		</tr>
   		
   </table>
   
</body>
</html>