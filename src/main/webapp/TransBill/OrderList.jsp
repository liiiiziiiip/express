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
  	<h3>OrderList</h3>
	<table border="1" width="70%" height="100%">
   		<tr>
   			<td>订单号</td>
   			<td>物流单号</td>
   			<td>用户编号</td>
   			<td>员工编号</td>
   			<td>发件人电话</td>
   			<td>收件人电话</td>
   			<td>时间</td>
   			<td>发件人</td>
   			<td>收件人</td>
   			<td>详单</td>
   		</tr>
   		<c:forEach items="${OList}" var="ol">
   		<tr>
   			<td>${ol.o_id}</td>
   			<td>${ol.t_id }</td>
   			<td>${ol.e_id }</td>
   			<td>${ol.u_id }</td>
   			<td>${ol.s_phone }</td>
   			<td>${ol.r_phone }</td>
   			<td>${ol.time }</td>
   			<td>${ol.s_name }</td>
   			<td>${ol.r_name }</td>
   			<td><a href="<%=path %>/tbController/TBDetail.do?id=${ol.t_id }">详单</a></td>
   			
   		</tr>
   		</c:forEach>
   </table>
   <script>
   console.log("tblist",${tblist})
   </script>
</body>
</html>