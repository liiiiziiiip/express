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
  	<h3>公告列表</h3>
  	<a href="<%=path %>/addTextUI.jsp">添加公告</a><br/>
	<table border="1" width="70%">
   		<tr>
   			<td>主题</td>  			
   			<td>内容</td>
   			<td>删除</td>
   		</tr>
   		<c:forEach items="${textlist}" var="text">
   		<tr>
   			<td>${text.name }</td>
   			<td>${text.text }</td>
   			<td><a href="<%=path %>/webController/deleteText.do?id=${text.id }">删除</a></td>
   		</tr>
   		</c:forEach>
   </table>
   
</body>
</html>