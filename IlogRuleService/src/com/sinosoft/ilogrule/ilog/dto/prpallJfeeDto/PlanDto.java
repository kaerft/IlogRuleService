package com.sinosoft.ilogrule.ilog.dto.prpallJfeeDto;

import java.io.Serializable;

public class PlanDto implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String payNo;	//期次
	
	private String payforTimes;	//缴费次数
	
	private String payStartTimes;	//缴费起期
	
	private String payEndTimes;	//缴费止期
	
	private String currency;	//币别
	
	private String payableAmounts;	//	应缴金额
	
	private String paidupAmounts;	//	实缴金额
	
	private String payReason;	//交费原因
	
	private String paymentRate;	//缴费比例

	public String getPayNo() {
		return payNo;
	}

	public void setPayNo(String payNo) {
		this.payNo = payNo;
	}

	public String getPayforTimes() {
		return payforTimes;
	}

	public void setPayforTimes(String payforTimes) {
		this.payforTimes = payforTimes;
	}

	public String getPayStartTimes() {
		return payStartTimes;
	}

	public void setPayStartTimes(String payStartTimes) {
		this.payStartTimes = payStartTimes;
	}

	public String getPayEndTimes() {
		return payEndTimes;
	}

	public void setPayEndTimes(String payEndTimes) {
		this.payEndTimes = payEndTimes;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getPayableAmounts() {
		return payableAmounts;
	}

	public void setPayableAmounts(String payableAmounts) {
		this.payableAmounts = payableAmounts;
	}

	public String getPaidupAmounts() {
		return paidupAmounts;
	}

	public void setPaidupAmounts(String paidupAmounts) {
		this.paidupAmounts = paidupAmounts;
	}

	public String getPayReason() {
		return payReason;
	}

	public void setPayReason(String payReason) {
		this.payReason = payReason;
	}

	public String getPaymentRate() {
		return paymentRate;
	}

	public void setPaymentRate(String paymentRate) {
		this.paymentRate = paymentRate;
	}

}
