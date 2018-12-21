package com.sinosoft.ilogrule.ilog.rule;

import ilog.rules.res.model.IlrFormatException;
import ilog.rules.res.model.IlrPath;
import ilog.rules.res.session.IlrPOJOSessionFactory;
import ilog.rules.res.session.IlrSessionCreationException;
import ilog.rules.res.session.IlrSessionException;
import ilog.rules.res.session.IlrSessionFactory;
import ilog.rules.res.session.IlrSessionRequest;
import ilog.rules.res.session.IlrSessionResponse;
import ilog.rules.res.session.IlrStatelessSession;
import ilog.rules.res.session.ruleset.IlrBusinessExecutionTrace;
import ilog.rules.res.session.ruleset.IlrExecutionTrace;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class WodmRuleEngine {
	
	/**
	 * 一个入参的规则集引用IN-OUT
	 * @param inputXom
	 * @param inParametre
	 * @param rulePath
	 * @return
	 * @throws IlrFormatException
	 * @throws IlrSessionException
	 */
	public Map runRules(Object inputXom,String inParametre, String rulePath) throws IlrFormatException, IlrSessionException {

		Map map = new HashMap<>();
		
		IlrSessionFactory pojoFactory = new IlrPOJOSessionFactory();
		IlrSessionRequest sessionRequest = pojoFactory.createRequest();

		try {
			sessionRequest.setRulesetPath(IlrPath.parsePath(rulePath));
		} catch (IlrFormatException e) {
			e.printStackTrace();
			throw e;
		}
		sessionRequest.setForceUptodate(true);
		sessionRequest.setTraceEnabled(true);
		sessionRequest.getTraceFilter().setInfoAllFilters(true);
		Map<String, Object> inputParameters = sessionRequest
				.getInputParameters();
		inputParameters.put(inParametre, inputXom);
		IlrStatelessSession statelessSession = null;
		try {
			statelessSession = pojoFactory.createStatelessSession();
		} catch (IlrSessionCreationException e) {
			e.printStackTrace();
			throw e;
		}
		IlrSessionResponse response = null;
		try {
			response = statelessSession.execute(sessionRequest);
		} catch (IlrSessionException e) {
			e.printStackTrace();
			throw e;
		}

		//执行规则跟踪记录 begin
		StringBuffer sbTrace = new StringBuffer();
		IlrExecutionTrace sessionTrace = response.getRulesetExecutionTrace();
		Long rulesNumber = sessionTrace.getTotalRulesFired(); 
		IlrBusinessExecutionTrace execResult = new IlrBusinessExecutionTrace(response.getRulesetExecutionTrace());
		List<String> rulesFired = execResult.getRuleFiredBusinessNames();
		for(int i=0;i<rulesFired.size();i++){
			sbTrace.append(rulesFired.get(i)+"|");
		}
		String strSbTrace = sbTrace.toString();
		System.out.println("执行的规则======="+strSbTrace);
		map.put("strSbTrace", strSbTrace);
		map.put("responseXom", response.getOutputParameters().get(inParametre));
		//执行规则跟踪记录 end
		
		return map;

	}
//	/**
//	 * 两个参数的规则集引用IN，IN-OUT
//	 * @param inputXom
//	 * @param inputXomTwo
//	 * @param inParametre
//	 * @param inParametreTwo
//	 * @param rulePath
//	 * @return
//	 * @throws IlrFormatException
//	 * @throws IlrSessionException
//	 */
//	public Object runRules(Object inputXom,Object inputXomTwo,String inParametre, String inParametreTwo,String rulePath) throws IlrFormatException, IlrSessionException {
//
//		IlrSessionFactory pojoFactory = new IlrPOJOSessionFactory();
//		IlrSessionRequest sessionRequest = pojoFactory.createRequest();
//
//		try {
//			sessionRequest.setRulesetPath(IlrPath.parsePath(rulePath));
//		} catch (IlrFormatException e) {
//			e.printStackTrace();
//			throw e;
//		}
//		sessionRequest.setForceUptodate(true);
//		sessionRequest.setTraceEnabled(true);
//		sessionRequest.getTraceFilter().setInfoAllFilters(true);
//		Map<String, Object> inputParameters = sessionRequest
//				.getInputParameters();
//		inputParameters.put(inParametre, inputXom);
//		inputParameters.put(inParametreTwo, inputXomTwo);
//		IlrStatelessSession statelessSession = null;
//		try {
//			statelessSession = pojoFactory.createStatelessSession();
//		} catch (IlrSessionCreationException e) {
//			e.printStackTrace();
//			throw e;
//		}
//		IlrSessionResponse response = null;
//		try {
//			response = statelessSession.execute(sessionRequest);
//		} catch (IlrSessionException e) {
//			e.printStackTrace();
//			throw e;
//		}
//
//		return response.getOutputParameters().get(inParametreTwo);
//
//	}
}
