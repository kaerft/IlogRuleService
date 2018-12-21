<%@page import="com.sinosoft.ilogrule.ilog.dto.prpallDto.UndwrtInputDto"%>
<%@page import="com.sinosoft.ilogrule.ilog.dto.prpallDto.UnderwriteResultDto"%>
<%@page import="com.sinosoft.ilogrule.restfulService.client.prpallClient.PrpallClient"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<% 
PrpallClient prpallClient = new PrpallClient();
System.out.println("开始============");
UndwrtInputDto undwrtInputDto = prpallClient.organizeObject();
UnderwriteResultDto underwriteResultDto = prpallClient.undwrtCarRule(undwrtInputDto);

%>
<title>在此处插入标题</title>
</head>
<body>
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