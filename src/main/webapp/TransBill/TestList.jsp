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

<style> 
        .black_overlay{ 
            display: none; 
            position: absolute; 
            top: 0%; 
            left: 0%; 
            width: 100%; 
            height: 100%; 
            background-color: black; 
            z-index:1001; 
            -moz-opacity: 0.8; 
            opacity:.80; 
            filter: alpha(opacity=88); 
        } 
        .white_content { 
            display: none; 
            position: absolute; 
            top: 25%; 
            left: 25%; 
            width: 55%; 
            height: 55%; 
            padding: 20px; 
            border: 10px solid orange; 
            background-color: white; 
            z-index:1002; 
            overflow: auto; 
        } 
    </style> 

<script > 
var list = "${tblist}";
console.log("list:",list);
var jsonObject=eval('('+list+')');
console.log("jo:",jsonObject);
console.log("jo.l:",jsonObject.length);
   
   T = function(){
	   
	   
		 
		for(var i=0;i<jsonObject.length;i++){  
	        var tr=document.createElement('tr');  
	        var tdid=document.createElement('td')  
	        var tdgname=document.createElement('td')  
	        var tdstart=document.createElement('td')
	        var tdend=document.createElement('td')
	        var tdother=document.createElement('td')
	        var tdnow=document.createElement('td')
	        var tdok=document.createElement('td')
	        var tdno=document.createElement('td')
	        tdid.innerHTML=jsonObject[i].T_id;  
	        tdgname.innerHTML=jsonObject[i].G_name;  
	        tdstart.innerHTML=jsonObject[i].Td_start;
	        tdend.innerHTML=jsonObject[i].Td_end;
	        tdother.innerHTML=jsonObject[i].T_other;
	        tdnow.innerHTML="<a href = \"<%=path %>/webController/text.do?now=" + jsonObject[i].T_now + "\">详情</a>";
	        
	        console.log("now:",jsonObject[i].T_now);
	        
	        tdok.innerHTML="<a href=\"<%=path %>/tbController/verifyTB.do?id=" + jsonObject[i].T_id + "\">确认</a>";
	        tdno.innerHTML="<a href=\"<%=path %>/tbController/CalcelList.do?id=" + jsonObject[i].T_id + "\">拒绝</a>";
	    
	        tr.appendChild(tdid);  
	        tr.appendChild(tdgname);  
	        tr.appendChild(tdstart);
	        tr.appendChild(tdend);
	        tr.appendChild(tdother);
	        tr.appendChild(tdnow);
	        tr.appendChild(tdok);
	        tr.appendChild(tdno);
	        var tbody=document.getElementById('tbody');  
	        tbody.appendChild(tr);  
	          }  
	      };
   
</script> 

</head>
<body>

  	<h3>TBList</h3>
  	<a href="<%=path %>/AddTB.jsp">Add TB</a><br/>
	<table border="1" width="70%" height="100%">
	<thead>
   		<tr>
   			<td>单号</td>
   			<td>货物名称</td>
   			<td>始发地</td>
   			<td>目的地</td>
   			<td>备注</td>
   			<td>详情</td>
   			<td>操作</td>
   			<td><input type='button' value='刷新' onclick="T()"></td>
   		</tr>
   		</thead>
   		<tbody id="tbody">
   		</tbody>
   </table>
   
    
</body>
</html>