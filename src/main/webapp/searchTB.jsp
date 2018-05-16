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
<title>searchTB</title>
</head>
<body>
<form action="<%=path %>/SearchController/searchById.do" method="post">
	<div class="TB_input_item">
		<input id="t_id" name="t_id" tabindex="1" placeholder="请输入运单号"  type="text" value="" size="25">
		<input type="submit" name="submit">
	</div>
	</form>
  	<div id="main" >
        <table id="main_table"  cellspacing="0" style="width:100%;height:100%" cellpadding="0" >
        </table>
    </div>
    

<script type="text/javascript" src="common/js/jquery-1.11.3.min.js"></script>
<script type="text/javascript" src="common/js/easyui_1.4.5/jquery.easyui.min.js"></script>
<script type="text/javascript" src="common/js/datagrid-bufferview.js"></script>
<script type="text/javascript" src="common/js/easyui_1.4.5/locale/easyui-lang-zh_CN.js"></script>
<script>
var datainfo;

$(function(){
	loadLocal();
});

function loadLocal(){
    $('#main_table').datagrid({
    	width: '100%',
	        height: 'auto',
	        nowrap: true,//在一行中显示数据
	        striped: false,//隔行变色
	        border: true,
	        loadMsg: '正在加载',
	        striped:true,
	        pageSize: 30,
	        collapsible: false,//是否可折叠的
	        fit: true,//自动大小
	        url: '<%=basePath %>SearchController/searchById',
	        //从远程站点请求数据的url
	        remoteSort: false,//是否从服务器排序数据
	        idField: 'id',
	        singleSelect: true,//是否单选
	        pagination: true,//分页控件
	        rownumbers: false,//行号
	        queryParams : {
	        	T_id : t_id
	        },//用来带参查询
	     
        columns: [[
   	            {field: 'T_ID', width: '8%', align: "center", title: '单号'},
   	            
                {field: 'G_NAME', width: '10%', align: "center", title: '货物名称'},
   	            {field: 'TD_START', width: '10%', align: "center", title: '始发地'},
   	            {field: 'TD_HUB', width: '9%', align:"center", title: '中转地',},
   	            {field: 'TD_END', width: '5%', align: "center", title: '目的地'},
   	            {field: 'T_PRICE', width: '4%', align: "center", title: '价格'},
   	            {field: 'T_STATION', width: '10%', align: "center", title: '状态'},
   	         	{field: 'T_EMNPID', width: '10%', align: "center", title: '承接人'},
   	      		{field: 'T_CLIENT', width: '10%', align: "center", title: '客户'},
	   	            
   	        ]]
         });
   
    }
</script>

</body>
</html>