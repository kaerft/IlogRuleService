
<%@page import="com.sinosoft.ilogrule.ilog.dto.claimDto.BpmRule.BpmRuleVo"%>
<%@page import="com.sinosoft.ilogrule.restfulService.client.claimClient.ClaimClient"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<% 
ClaimClient claimClient = new ClaimClient();
System.out.println("开始============");
BpmRuleVo requestDto = claimClient.organizeObjectBpmRule();
BpmRuleVo responseDto = claimClient.bpmRule(requestDto);

%>
<title>在此处插入标题</title>
</head>
<body>

	核保标志========
<%= responseDto.getNextNodeString() %>
	<br>
	结果描述信息======
<%= responseDto.getNextNodeName() %>
</body>
</html>