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
	com.sinosoft.ilogrule.restfulService.client.jfeeClient.JfeeClient prpcarRuleQuery = new com.sinosoft.ilogrule.restfulService.client.jfeeClient.JfeeClient();
	com.sinosoft.ilogrule.ilog.dto.prpallJfeeDto.PrpallJfeeResultDto prpallJfeeResultDto = null;
	try{
		com.sinosoft.ilogrule.ilog.dto.prpallJfeeDto.PrpallJfeeInputDto prpallJfeeInputDto = new com.sinosoft.ilogrule.ilog.dto.prpallJfeeDto.PrpallJfeeInputDto(); 

		prpallJfeeInputDto = prpcarRuleQuery.organizeObject();
		prpallJfeeResultDto = prpcarRuleQuery.prpallJfeeRule(prpallJfeeInputDto);//调接口
	}catch (Exception e) {
		e.printStackTrace();
	}
	System.out.println("JfeeFlag======:"+prpallJfeeResultDto.getJfeeFlag());
	System.out.println("Description======:"+prpallJfeeResultDto.getDescription());
	%>
	<%=prpallJfeeResultDto.getJfeeFlag() %>
	<%=prpallJfeeResultDto.getDescription() %>
</body>
</html>