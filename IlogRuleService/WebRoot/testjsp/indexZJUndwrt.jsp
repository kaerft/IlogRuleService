<%@page import="com.sinosoft.ilogrule.restfulService.client.undwrtClient.UndwrtZJClient"%>
<%@page import="com.sinosoft.ilogrule.ilog.dto.undwrtDto.zj.UndwrtZJInputDto"%>
<%@page import="com.sinosoft.ilogrule.ilog.dto.undwrtDto.zj.UndwrtZJResultDto"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<% 
UndwrtZJClient undwrtClient = new UndwrtZJClient();
System.out.println("开始============");
UndwrtZJInputDto undwrtInputDto = undwrtClient.organizeObject();
UndwrtZJResultDto underwriteResultDto = undwrtClient.undwrtZJRule(undwrtInputDto);

%>
<title>在此处插入标题</title>
</head>
<body>
	核保级别========
<%= underwriteResultDto.getUndwrtLevel()%>		
	<br>
	规则路径========
<%= underwriteResultDto.getPath()%>	
	<br>
	核保标志========
<%= underwriteResultDto.getUndwrtFlag()%>
	<br>
	结果描述信息======
<%= underwriteResultDto.getDescription()%>
</body>
</html>