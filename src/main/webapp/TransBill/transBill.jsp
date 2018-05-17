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
  	<h3>物流详单</h3>
  	
	<table border="1" width="70%">
   		<tr>
   			<td>单号</td>
   			<td>货物名称</td>
   			<td>发件地</td>
   			<td>目的地</td>
   			<td>价格</td>
   			<td>备注</td>
   			<td>详情</td>
   			<td>删除</td>
   			<td>更新</td>
   		</tr>
   		
   		<tr>
   			<td>${tb.t_id }</td>
   			<td>${tb.g_name }</td>
   			<td>${tb.td_start }</td>
   			<td>${tb.td_end }</td>
   			<td>${tb.t_price }</td>
   			<td>${tb.t_other }</td>
   			<td><a href="<%=path %>/webController/text.do?now=${tb.t_now }">详情</a></td>
   			<td><a href="<%=path %>/userController/deleteUser.do?id=${user.id }">Delete</a></td>
   			<td><a href="<%=path %>/userController/updateUserUI.do?id=${user.id }">Update</a></td>
   		</tr>
   		
   </table>
   
</body>
</html>