<%@ page language="java" contentType="text/html; charset=GB18030"
    pageEncoding="GB18030"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GB18030">
<title>�ڴ˴��������</title>
</head>
<body>
	<%
	com.sinosoft.ilogrule.restfulService.client.cargoClient.CargoClient cargoQuery = new com.sinosoft.ilogrule.restfulService.client.cargoClient.CargoClient();
	com.sinosoft.ilogrule.ilog.dto.cargoDto.CargoResultDto cargoResultDto = null;
	try{
		com.sinosoft.ilogrule.ilog.dto.cargoDto.CargoInputDto cargoInputDto = new com.sinosoft.ilogrule.ilog.dto.cargoDto.CargoInputDto(); 

		cargoInputDto = cargoQuery.organizeObject();
		cargoResultDto = cargoQuery.cargoRule(cargoInputDto);//���ӿ�
	}catch (Exception e) {
		e.printStackTrace();
	}
	System.out.println("UndwrtFlag======:"+cargoResultDto.getUndwrtFlag());
	System.out.println("Description======:"+cargoResultDto.getDescription());
	%>
	<%=cargoResultDto.getUndwrtFlag() %>
	<%=cargoResultDto.getDescription() %>
</body>
</html>