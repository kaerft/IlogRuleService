package com.sinosoft.ilogrule.ilog.dto.claimDto.ApproveRule;

import java.io.Serializable;
import java.math.BigDecimal;

public class ApproveRuleVo implements Serializable{

	private static final long serialVersionUID = 1L;
	/************************** 入参 **************************/
	private String	aBusinessRisk;	//个/商险
	/**机构编码*/
	private String comCode;
	/**机构名称*/
	private String comName;
	/**当前节点名称（ApproveBpmNode）*/
	private String nodeName;
	/**当前节点编码（ApproveBpmNode）*/
	private String nodeCode;
	/** 立案距出险天数 */
	private int claimToDamageDate;
	/** 立案距报案天数 */
	private int claimToRegistDate;
	/**总估计赔款  立案金额*/
	private BigDecimal sumClaim;
	/**估损次数*/
	private int adjustTimes;
	/**估损调整的绝对值（本次调整和上次调整的对比）*/
	private BigDecimal differenceMoney;
	/**险类**/
	private String classCode;
	private String	className;	//险类名称
	/**险种代码 */
	private String riskCode;
	private String	riskName;	//险种名称
	/**险别代码 */
	private String kindCode;
	/**规则判断标志：01-公估申请 02-海外代理人申请 03-律师申请 04-调查机构申请 11-专家申请 99-其他第三方
	 *  40-超时立案申请  41-超额立案申请  42-估损调整申请 32-立案注销申请 33-立案注销恢复申请  31-担保申请
	 *  101-损余回收申请 102-收回赔款 103-退票申请 	104、46-追偿高级审核 追偿注销 105-重开赔案审核
	 *  100-报案注销高级审核 51 查勘高级审核
	 *  （ApproveType）
	 *
	 * */
	private String approveTypeName;
	/**注销恢复的次数*/
	private int ancelRecoverTimes;
	/**重开次数*/
	private int reclaimTimes;
	/**担保金额*/
	private BigDecimal reverseAmount;
	/**理赔金额*/
	private BigDecimal compensateAmount;
	/**是否临分案件是否理赔控制条件   0--否  1--是 */
	private String ifCase;
	/**是否在名录内   0--否  1--是*/
	private String ifDirectory;
	/**是否是分公司权限内   0--否  1--是 */
	private String ifBranchOfficePower;
	/**追偿金额*/
	private BigDecimal sumPlanReplevy;
	/**损余回收金额*/
	private BigDecimal sumLossFee;
	/**收回赔款金额*/
	private BigDecimal sumReturnPay;
	/**收款人是否被保险人  0--否  1--是*/
	private String ifInsurant;
	/**是否修改账号  0--否  1--是*/
	private String ifModify;
	/**赔付金额*/
	private BigDecimal sumCompensate;
	/**退票金额*/
	private BigDecimal sumReturnBacket;
	/**业务分类 */
	private String businessKind;
	//报损金额
//	private BigDecimal reportedLoss;
//	物损金额
	private BigDecimal propLoss;
	private String isAgreement;//是否协议第三方	0--否  1--是*/
	private BigDecimal checkFee;//查勘金额
	/************************** 返参 **************************/
	/** 规则校验标志 */
	private String pass;
	/** 提示信息 */
	private String message;

	public String getaBusinessRisk() {
		return aBusinessRisk;
	}

	public void setaBusinessRisk(String aBusinessRisk) {
		this.aBusinessRisk = aBusinessRisk;
	}

	public String getComCode() {
		return comCode;
	}

	public void setComCode(String comCode) {
		this.comCode = comCode;
	}

	public String getComName() {
		return comName;
	}

	public void setComName(String comName) {
		this.comName = comName;
	}

	public String getNodeName() {
		return nodeName;
	}

	public void setNodeName(String nodeName) {
		this.nodeName = nodeName;
	}

	public String getNodeCode() {
		return nodeCode;
	}

	public void setNodeCode(String nodeCode) {
		this.nodeCode = nodeCode;
	}

	public int getClaimToDamageDate() {
		return claimToDamageDate;
	}

	public void setClaimToDamageDate(int claimToDamageDate) {
		this.claimToDamageDate = claimToDamageDate;
	}

	public int getClaimToRegistDate() {
		return claimToRegistDate;
	}

	public void setClaimToRegistDate(int claimToRegistDate) {
		this.claimToRegistDate = claimToRegistDate;
	}

	public BigDecimal getSumClaim() {
		return sumClaim;
	}

	public void setSumClaim(BigDecimal sumClaim) {
		this.sumClaim = sumClaim;
	}

	public int getAdjustTimes() {
		return adjustTimes;
	}

	public void setAdjustTimes(int adjustTimes) {
		this.adjustTimes = adjustTimes;
	}

	public BigDecimal getDifferenceMoney() {
		return differenceMoney;
	}

	public void setDifferenceMoney(BigDecimal differenceMoney) {
		this.differenceMoney = differenceMoney;
	}

	public String getClassCode() {
		return classCode;
	}

	public void setClassCode(String classCode) {
		this.classCode = classCode;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String getRiskCode() {
		return riskCode;
	}

	public void setRiskCode(String riskCode) {
		this.riskCode = riskCode;
	}

	public String getRiskName() {
		return riskName;
	}

	public void setRiskName(String riskName) {
		this.riskName = riskName;
	}

	public String getKindCode() {
		return kindCode;
	}

	public void setKindCode(String kindCode) {
		this.kindCode = kindCode;
	}

	public String getApproveTypeName() {
		return approveTypeName;
	}

	public void setApproveTypeName(String approveTypeName) {
		this.approveTypeName = approveTypeName;
	}

	public int getAncelRecoverTimes() {
		return ancelRecoverTimes;
	}

	public void setAncelRecoverTimes(int ancelRecoverTimes) {
		this.ancelRecoverTimes = ancelRecoverTimes;
	}

	public int getReclaimTimes() {
		return reclaimTimes;
	}

	public void setReclaimTimes(int reclaimTimes) {
		this.reclaimTimes = reclaimTimes;
	}

	public BigDecimal getReverseAmount() {
		return reverseAmount;
	}

	public void setReverseAmount(BigDecimal reverseAmount) {
		this.reverseAmount = reverseAmount;
	}

	public BigDecimal getCompensateAmount() {
		return compensateAmount;
	}

	public void setCompensateAmount(BigDecimal compensateAmount) {
		this.compensateAmount = compensateAmount;
	}

	public String getIfCase() {
		return ifCase;
	}

	public void setIfCase(String ifCase) {
		this.ifCase = ifCase;
	}

	public String getIfDirectory() {
		return ifDirectory;
	}

	public void setIfDirectory(String ifDirectory) {
		this.ifDirectory = ifDirectory;
	}

	public String getIfBranchOfficePower() {
		return ifBranchOfficePower;
	}

	public void setIfBranchOfficePower(String ifBranchOfficePower) {
		this.ifBranchOfficePower = ifBranchOfficePower;
	}

	public BigDecimal getSumPlanReplevy() {
		return sumPlanReplevy;
	}

	public void setSumPlanReplevy(BigDecimal sumPlanReplevy) {
		this.sumPlanReplevy = sumPlanReplevy;
	}

	public BigDecimal getSumLossFee() {
		return sumLossFee;
	}

	public void setSumLossFee(BigDecimal sumLossFee) {
		this.sumLossFee = sumLossFee;
	}

	public BigDecimal getSumReturnPay() {
		return sumReturnPay;
	}

	public void setSumReturnPay(BigDecimal sumReturnPay) {
		this.sumReturnPay = sumReturnPay;
	}

	public String getIfInsurant() {
		return ifInsurant;
	}

	public void setIfInsurant(String ifInsurant) {
		this.ifInsurant = ifInsurant;
	}

	public String getIfModify() {
		return ifModify;
	}

	public void setIfModify(String ifModify) {
		this.ifModify = ifModify;
	}

	public BigDecimal getSumCompensate() {
		return sumCompensate;
	}

	public void setSumCompensate(BigDecimal sumCompensate) {
		this.sumCompensate = sumCompensate;
	}

	public BigDecimal getSumReturnBacket() {
		return sumReturnBacket;
	}

	public void setSumReturnBacket(BigDecimal sumReturnBacket) {
		this.sumReturnBacket = sumReturnBacket;
	}

	public String getBusinessKind() {
		return businessKind;
	}

	public void setBusinessKind(String businessKind) {
		this.businessKind = businessKind;
	}

	public BigDecimal getPropLoss() {
		return propLoss;
	}

	public void setPropLoss(BigDecimal propLoss) {
		this.propLoss = propLoss;
	}

	public String getIsAgreement() {
		return isAgreement;
	}

	public void setIsAgreement(String isAgreement) {
		this.isAgreement = isAgreement;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public BigDecimal getCheckFee() {
		return checkFee;
	}

	public void setCheckFee(BigDecimal checkFee) {
		this.checkFee = checkFee;
	}
	
}
