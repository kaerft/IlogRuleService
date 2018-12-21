package com.sinosoft.ilogrule.util;

import com.sinosoft.ilogrule.service.logService.facade.LogService;
import com.sinosoft.ilogrule.service.logService.impl.LogServiceImpl;
import com.sinosoft.ilogrule.vo.logVo.IlogInteractLoggerVo;
import com.sinosoft.utility.error.UserException;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;


public class LoggerHelper {
	
	/**
	 * 日志存储构造函数
	 */
	public LoggerHelper(){
		System.out.println("调用接口日志开始储存！");
	}
	
	/**
	 * 日志存储
	 */
	public void loggerHelper_new(IlogInteractLoggerVo logger,Object errorMsgObj,String saveLogId){
		try{
			
			Date day = new Date();    
			
			//组织日志唯一序号
			SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
			String currentDate = df.format(day);
			String strLogSerialNo = ""; //日志编码规则：当前时间+UUID
			String strUUID = UUID.randomUUID().toString();
			strLogSerialNo = new StringBuffer(currentDate).append(strUUID).toString().replaceAll("-", "").toUpperCase();
			logger.setSerialno(strLogSerialNo);			
			
			//组织访问接口响应时间
			// 存储到日志表中的格式
			SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			String saveDate = sdf2.format(day);
			logger.setResponsetime(saveDate);

			//组织日志错误信息
			StringWriter sw = new StringWriter();

			String zipErrorMsg = "";
			if(errorMsgObj!=null){
				String strErrorMsg = "";
				StringBuffer sb = new StringBuffer();
				if(errorMsgObj instanceof UserException){
					((UserException)errorMsgObj).printStackTrace(new PrintWriter(sw));
					sb.append(((UserException)errorMsgObj).getErrorMessage());
				}else{
					((Exception)errorMsgObj).printStackTrace(new PrintWriter(sw));
					sb.append(((Exception)errorMsgObj).getMessage());
				}
				strErrorMsg = sb.toString()+"\r\n"+sw.toString();
				//zipErrorMsg = new String(GZipUtils.compress(strErrorMsg.getBytes()),"ISO-8859-1");
				zipErrorMsg = strErrorMsg;
			}else{
				zipErrorMsg = "成功";
			}			
			logger.setStatusdes(zipErrorMsg);
			//存储日志表
			LogService savelogger = new LogServiceImpl(); 
			if(!"".equals(saveLogId)&&saveLogId!=null){//接口交互存过日志,先删除后存储
				savelogger.deleteAndInsertInteract(logger,saveLogId);
			}else{
				savelogger.insertInteract(logger);
			}	
			System.out.println("调用接口日志储存结束！");
		}catch(Exception e){
			System.err.println("调用接口日志存储异常了！:-(");
			e.printStackTrace();
		}
	}

}
