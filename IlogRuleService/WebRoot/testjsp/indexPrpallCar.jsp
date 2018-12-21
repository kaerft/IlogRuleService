<%@ page language="java" contentType="text/html; charset=GB18030"
    pageEncoding="GB18030"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GB18030">
<title>在此处插入标题</title>
</head>
<body>
	<%
	com.sinosoft.ilogrule.restfulService.client.PrpCarRuleQuery prpcarRuleQuery = new com.sinosoft.ilogrule.restfulService.client.PrpCarRuleQuery();
	com.sinosoft.ilogrule.ilog.dto.prpcarDto.result.PrpCarResultDto prpcarResultDto = null;
	try{
		com.sinosoft.ilogrule.ilog.dto.prpcarDto.PrpCarInputDto prpcarInputDto = new com.sinosoft.ilogrule.ilog.dto.prpcarDto.PrpCarInputDto(); 

		prpcarInputDto = prpcarRuleQuery.organizeObject();
		prpcarResultDto = prpcarRuleQuery.prpcarRuleQuery(prpcarInputDto);//调接口
	}catch (Exception e) {
		e.printStackTrace();
	}
	System.out.println("XXXXXXXXXXXXXP:"+prpcarResultDto.getMainDto().getProgrammeType());
	System.out.println("Description======:"+prpcarResultDto.getMainDto().getDescription());
	%>
	<%=prpcarResultDto.getMainDto().getProgrammeType() %>
	<%=prpcarResultDto.getMainDto().getDescription() %>
</body>
</html>