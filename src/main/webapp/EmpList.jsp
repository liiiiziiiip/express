<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Emplist</title>
</head>
<body>
  	<h3>EmpList</h3>
  	<a href="<%=path %>/AddEmp.jsp">添加员工</a><br/>
	<table border="1" width="70%" height="100%">
   		<tr>
   			<td>编号</td>
   			<td>姓名</td>
   			<td>用户名</td>
   			<td>年龄</td>
   			<td>性别</td>
   			<td>提成</td>
   			<td>删除</td>
   			<td>更新</td>
   			<td>重置密码</td>
   		</tr>
   		<c:forEach items="${Emplist}" var="emp">
   		<tr>
   			<td>${emp.e_id }</td>
   			<td>${emp.r_name }</td>
   			<td>${emp.ename }</td>
   			<td>${emp.age }</td>
   			<td>${emp.sex }</td>
   			<td>${emp.sal }</td>
   			<td><a href="<%=path %>/userController/deleteEmp.do?id=${emp.e_id }">删除</a></td>
   			<td><a href="<%=path %>/userController/updateEmpUI.do?id=${emp.e_id }">更新</a></td>
   			<td><a href="<%=path %>/userController/resetpw.do?id=${emp.e_id }">重置密码</a></td>
   			<td><a href="<%=path %>/userController/paysal.do?id=${emp.e_id }">打钱</a></td>
   		</tr>
   		</c:forEach>
   </table>
   <script>
   console.log("emp:",${Emplist})
   </script>
</body>
</html>