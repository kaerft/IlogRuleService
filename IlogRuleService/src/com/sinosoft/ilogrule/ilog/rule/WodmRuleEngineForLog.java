package com.sinosoft.ilogrule.ilog.rule;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import com.sinosoft.ilogrule.util.LoggerRuleHelper;
import com.sinosoft.ilogrule.vo.logVo.IlogRuleLoggerVo;


public class WodmRuleEngineForLog {
	
	private WodmRuleEngine engine = new WodmRuleEngine();

	/**
	 * 一个参数与规则引擎交互(带业务号)
	 * @param requ
	 * @param inParametre
	 * @param rulePath
	 * @return
	 * @throws Exception
	 */
	public Object rules(Object requ,String inParametre, String rulePath,String requestBody,String xomReqXml,String businessTradeNo) throws Exception {

		Object result = null;
		String errorMessage = "";				
		String status = "";		
		String saveDate = "";
		String strSbTrace = "";
		IlogRuleLoggerVo ilogRuleLoggerVo = new IlogRuleLoggerVo();
		try {
			// 存储到日志表中的格式
			Date startTime = new Date();
			SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			saveDate = sdf2.format(startTime);
			//与规则引擎交互
			Map map = engine.runRules(requ,inParametre ,rulePath);
			result = map.get("responseXom");
			strSbTrace = (String)map.get("strSbTrace");					
		} catch (Exception e) {
			StringWriter sw = new StringWriter();   
            PrintWriter pw = new PrintWriter(sw, true);   
            e.printStackTrace(pw);   
            pw.flush();   
            sw.flush();   
			status = "2";
			errorMessage = sw.toString();  ;
			e.printStackTrace();
		}finally{
			ilogRuleLoggerVo.setRulepath(rulePath);
			//ilogRuleLoggerVo.setRulename("");
			if("".equals(status)){
				status = "1";
			}
			ilogRuleLoggerVo.setStatus(status);//状态：1成功，2失败
			ilogRuleLoggerVo.setRequesttime(saveDate);//请求时间：YYYY-MM-DD HH:MI:SS
			ilogRuleLoggerVo.setInterReqXml(requestBody);
			ilogRuleLoggerVo.setXomReqXml(xomReqXml);
			if(businessTradeNo!=null){
				ilogRuleLoggerVo.setExtendstring1(businessTradeNo);//业务号
			}
			ilogRuleLoggerVo.setStrSbTrace(strSbTrace);//所触发的规则跟踪信息
			LoggerRuleHelper logHelper = new LoggerRuleHelper();
			logHelper.loggerHelper_new(ilogRuleLoggerVo,errorMessage);
		}
		return result;
	}
	
	/**
	 * 一个参数与规则引擎交互(不带业务号)
	 * @param requ
	 * @param inParametre
	 * @param rulePath
	 * @return
	 * @throws Exception
	 */
	public Object rules(Object requ,String inParametre, String rulePath,String requestBody,String xomReqXml) throws Exception {

		Object result = null;
		String errorMessage = "";				
		String status = "";		
		String saveDate = "";
		String strSbTrace = "";
		IlogRuleLoggerVo ilogRuleLoggerVo = new IlogRuleLoggerVo();
		try {
			// 存储到日志表中的格式
			Date startTime = new Date();
			SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			saveDate = sdf2.format(startTime);
			//与规则引擎交互
			Map map = engine.runRules(requ,inParametre ,rulePath);
			result = map.get("responseXom");
			strSbTrace = (String)map.get("strSbTrace");					
		} catch (Exception e) {
			StringWriter sw = new StringWriter();   
            PrintWriter pw = new PrintWriter(sw, true);   
            e.printStackTrace(pw);   
            pw.flush();   
            sw.flush();   
			status = "2";
			errorMessage = sw.toString();  ;
			e.printStackTrace();
		}finally{
			ilogRuleLoggerVo.setRulepath(rulePath);
			//ilogRuleLoggerVo.setRulename("");
			if("".equals(status)){
				status = "1";
			}
			ilogRuleLoggerVo.setStatus(status);//状态：1成功，2失败
			ilogRuleLoggerVo.setRequesttime(saveDate);//请求时间：YYYY-MM-DD HH:MI:SS
			ilogRuleLoggerVo.setInterReqXml(requestBody);
			ilogRuleLoggerVo.setXomReqXml(xomReqXml);
			ilogRuleLoggerVo.setStrSbTrace(strSbTrace);//所触发的规则跟踪信息
			LoggerRuleHelper logHelper = new LoggerRuleHelper();
			logHelper.loggerHelper_new(ilogRuleLoggerVo,errorMessage);
		}
		return result;
	}
}
