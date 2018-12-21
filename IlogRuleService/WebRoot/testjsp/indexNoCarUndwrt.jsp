<%@page import="com.sinosoft.ilogrule.ilog.dto.undwrtDto.nocar.UndwrtNoCarInputDto"%>
<%@page import="com.sinosoft.ilogrule.ilog.dto.undwrtDto.nocar.UndwrtNoCarResultDto"%>
<%@page import="com.sinosoft.ilogrule.restfulService.client.undwrtClient.UndwrtNoCarClient"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<% 
UndwrtNoCarClient undwrtClient = new UndwrtNoCarClient();
System.out.println("开始============");
UndwrtNoCarInputDto undwrtInputDto = undwrtClient.organizeObject();
UndwrtNoCarResultDto underwriteResultDto = undwrtClient.undwrtCarRule(undwrtInputDto);

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