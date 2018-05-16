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
  	<a href="<%=path %>/AddEmp.jsp">Add Emp</a><br/>
	<table border="1" width="70%" height="100%">
   		<tr>
   			<td>Id</td>
   			<td>RName</td>
   			<td>EName</td>
   			<td>Age</td>
   			<td>sex</td>
   			<td>SAL</td>
   			<td>Delete</td>
   			<td>Update</td>
   			<td>ResetPW</td>
   		</tr>
   		<c:forEach items="${Emplist}" var="emp">
   		<tr>
   			<td>${emp.e_id }</td>
   			<td>${emp.r_name }</td>
   			<td>${emp.ename }</td>
   			<td>${emp.age }</td>
   			<td>${emp.sex }</td>
   			<td>${emp.sal }</td>
   			<td><a href="<%=path %>/userController/deleteEmp.do?id=${emp.e_id }">Delete</a></td>
   			<td><a href="<%=path %>/userController/updateEmpUI.do?id=${emp.e_id }">Update</a></td>
   			<td><a href="<%=path %>/userController/resetpw.do?id=${emp.e_id }">ResetPW</a></td>
   			<td><a href="<%=path %>/userController/paysal.do?id=${emp.e_id }">PaySal</a></td>
   		</tr>
   		</c:forEach>
   </table>
   <script>
   console.log("emp:",${Emplist})
   </script>
</body>
</html>