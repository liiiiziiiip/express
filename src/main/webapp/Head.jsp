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
<title>Head</title>
</head>
<body bgcolor="red">
重要公告!<br>
	<c:forEach items="${text}" var="t">
   		<tr>
   			<td>${t.name }<br>${t.text }</td>  			
   		</tr>
   		</c:forEach>
<script>
var hid = ${id};
var text = "${text}";
console.log("Hid:",hid);
console.log("text：",text);
</script>
</body>
</html>