<%@page import="com.sinosoft.ilogrule.ilog.dto.undwrtDto.car.UndwrtInputDto"%>
<%@page import="com.sinosoft.ilogrule.ilog.dto.undwrtDto.car.UnderwriteResultDto"%>
<%@page import="com.sinosoft.ilogrule.restfulService.client.undwrtClient.UndwrtClient"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<% 
UndwrtClient undwrtClient = new UndwrtClient();
System.out.println("开始============");
UndwrtInputDto undwrtInputDto = undwrtClient.organizeObject();
UnderwriteResultDto underwriteResultDto = undwrtClient.undwrtCarRule(undwrtInputDto);

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