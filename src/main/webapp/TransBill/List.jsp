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
<title>TBlist</title>
</head>
<body>
  	<h3>TBList</h3>
  	<a href="<%=path %>/AddTB.jsp">Add TB</a><br/>
	<table border="1" width="70%" height="100%">
   		<tr>
   			<td>单号</td>
   			<td>货物名称</td>
   			<td>始发地</td>
   			<td>目的地</td>
   			<td>备注</td>
   			<td>详情</td>
   			<td>Delete</td>
   			<td>Update</td>
   		</tr>
   		<c:forEach items="${tblist}" var="tb">
   		<tr>
   			<td>${tb.t_id}</td>
   			<td>${tb.g_name }</td>
   			<td>${tb.td_start }</td>
   			<td>${tb.td_end }</td>
   			<td>${tb.t_other }</td>
   			<td>${tb.t_now }</td>
   			<td><a href="<%=path %>/userController/deleteEmp.do?id=${tb.t_id }">Delete</a></td>
   			<td><a href="<%=path %>/userController/updateEmpUI.do?id=${tb.t_id }">Update</a></td>
   			
   		</tr>
   		</c:forEach>
   </table>
   <script>
   var list = "${tblist}"
   console.log("var:",list)
   var ok = "<a href=\"<%=path %>/userController/deleteEmp.do?id=${tb.t_id }\">Delete</a>"
	console.log("ok:",ok)
   
   </script>
</body>
</html>