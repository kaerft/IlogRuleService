package com.sinosoft.ilogrule.ilog.xom.prpallJfeeXom;

import java.io.Serializable;
import java.util.Date;

public class PlanXom implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Integer payNo;	//期次
	
	private Integer payforTimes;	//缴费次数
	
	private Date payStartTimes;	//缴费起期
	
	private Date payEndTimes;	//缴费止期
	
	private String currency;	//币别
	
	private Double payableAmounts;	//	应缴金额
	
	private Double paidupAmounts;	//	实缴金额
	
	private String payReason;	//交费原因
	
	private Double paymentRate;	//缴费比例

	
	
	public Integer getPayNo() {
		return payNo;
	}

	public void setPayNo(Integer payNo) {
		this.payNo = payNo;
	}

	public Integer getPayforTimes() {
		return payforTimes;
	}

	public void setPayforTimes(Integer payforTimes) {
		this.payforTimes = payforTimes;
	}

	public Date getPayStartTimes() {
		return payStartTimes;
	}

	public void setPayStartTimes(Date payStartTimes) {
		this.payStartTimes = payStartTimes;
	}

	public Date getPayEndTimes() {
		return payEndTimes;
	}

	public void setPayEndTimes(Date payEndTimes) {
		this.payEndTimes = payEndTimes;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public Double getPayableAmounts() {
		return payableAmounts;
	}

	public void setPayableAmounts(Double payableAmounts) {
		this.payableAmounts = payableAmounts;
	}

	public Double getPaidupAmounts() {
		return paidupAmounts;
	}

	public void setPaidupAmounts(Double paidupAmounts) {
		this.paidupAmounts = paidupAmounts;
	}

	public String getPayReason() {
		return payReason;
	}

	public void setPayReason(String payReason) {
		this.payReason = payReason;
	}

	public Double getPaymentRate() {
		return paymentRate;
	}

	public void setPaymentRate(Double paymentRate) {
		this.paymentRate = paymentRate;
	}

	
}
