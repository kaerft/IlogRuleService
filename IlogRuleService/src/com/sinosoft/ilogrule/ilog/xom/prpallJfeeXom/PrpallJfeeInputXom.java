package com.sinosoft.ilogrule.ilog.xom.prpallJfeeXom;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import com.sinosoft.ilogrule.ilog.xom.prpallJfeeXom.util.UtilXom;



public class PrpallJfeeInputXom implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private MainXom mainXom;
	
	private ApplicantXom applicantXom;
	
	private InsuredXom insuredXom;
	
	private List<PlanXom> planXomList;
	
	private List<ItemKindXom> itemKindXomList;
	
	private PrpallJfeeResultXom prpallJfeeResultXom;
	
	private UtilXom utilXom;
	
	
	public MainXom getMainXom() {
		return mainXom;
	}

	public void setMainXom(MainXom mainXom) {
		this.mainXom = mainXom;
	}

	public ApplicantXom getApplicantXom() {
		return applicantXom;
	}

	public void setApplicantXom(ApplicantXom applicantXom) {
		this.applicantXom = applicantXom;
	}

	public InsuredXom getInsuredXom() {
		return insuredXom;
	}

	public void setInsuredXom(InsuredXom insuredXom) {
		this.insuredXom = insuredXom;
	}

	public List<PlanXom> getPlanXomList() {
		return planXomList;
	}

	public void setPlanXomList(List<PlanXom> planXomList) {
		this.planXomList = planXomList;
	}

	public List<ItemKindXom> getItemKindXomList() {
		return itemKindXomList;
	}

	public void setItemKindXomList(List<ItemKindXom> itemKindXomList) {
		this.itemKindXomList = itemKindXomList;
	}

	public PrpallJfeeResultXom getPrpallJfeeResultXom() {
		return prpallJfeeResultXom;
	}

	public void setPrpallJfeeResultXom(PrpallJfeeResultXom prpallJfeeResultXom) {
		this.prpallJfeeResultXom = prpallJfeeResultXom;
	}

	public UtilXom getUtilXom() {
		return utilXom;
	}

	public void setUtilXom(UtilXom utilXom) {
		this.utilXom = utilXom;
	}

	/**
	 * 计算两个日期的差 
	 * @param startDate
	 * @param endDate
	 * @return
	 * @throws Exception
	 */
	public long TwoDateSub(Date startDate, Date endDate) throws Exception{

		long dm = 24*60*60*1000;
		long day = 0 ;
		if(startDate!=null && endDate!=null){
			long startTime = startDate.getTime();
			long endTime = endDate.getTime();
			if(startTime <= endTime){
				//获取相减后天数
				day = (endTime-startTime)/dm;
			}else{
				day = (startTime-endTime)/dm;
			}
		}
		return day;

	}
	
	/**
	 * 获取对应日期的day个月后的日期
	 * @param date
	 * @param day
	 * @return
	 */
	public Date getAfterMonth(Date date,int day){
		Calendar c = Calendar.getInstance();//获得一个日历的实例
		c.setTime(date);
		c.add(Calendar.MONTH,day);//在日历的月份上增加6个月
		return c.getTime();
	}

	

	   
	/**
	 * 判断险别代码是否在险别List中存在
	 * @param itemKindCode
	 * @return
	 */
	public String getItemKindCode(String itemKindCode){
		String flag = "false";
		List<ItemKindXom> itemkind = this.itemKindXomList;
		for(ItemKindXom item:itemkind){
			if(item.getItemKindCode()!=null && item.getItemKindCode().equals(itemKindCode)){
				flag = "true";
			}
		}
		return flag;
	}
	
	/**
	 * 遍历缴费计划集合,根据缴费期次获取一条缴费计划信息
	 * @param payNo
	 * @return
	 */
	public PlanXom listPlan(Integer payNo){
		List<PlanXom> planXomList = this.planXomList;
		PlanXom planXom = new PlanXom();
		for(PlanXom plan:planXomList){
			if(payNo==plan.getPayNo()){
				planXom = plan;
			}
		}
		return planXom;
	}
	
	/**
	 *  遍历缴费计划集合,根据缴费期次获取一条缴费计划信息的应缴金额与实缴金额的差
	 * @param payNo
	 * @return
	 */
	public Double difPlan(Integer payNo){
		List<PlanXom> planXomList = this.planXomList;
		double payableAmounts = 0;	//	应缴金额
		double paidupAmounts = 0;	//	实缴金额
		for(PlanXom plan:planXomList){
			if(payNo==-1){
				if(plan.getPayableAmounts()>0){
					payableAmounts = payableAmounts + plan.getPayableAmounts();
					paidupAmounts = paidupAmounts + plan.getPaidupAmounts();
				}
			}else{
				if(payNo==plan.getPayNo()){
					payableAmounts = payableAmounts + plan.getPayableAmounts();
					paidupAmounts = paidupAmounts + plan.getPaidupAmounts();
				}
			}
		}
		return payableAmounts-paidupAmounts;
	}
	
	/**
     * 遍历险种集合的值,是否属于某一险种
     */
	public ItemKindXom listItemKind(String itemKindCode) throws Exception{
		List<ItemKindXom> itemkind = this.itemKindXomList;
		ItemKindXom itemKind = new ItemKindXom();
		for(ItemKindXom itemKindXom:itemkind){
			if(itemKindCode.equals(itemKindXom.getItemKindCode())){
				itemKind = itemKindXom;
			}
		}
		return itemKind;
	}
	
	/**
	 * 判断条款列表是否能匹配上
	 * @param itemKindCodes
	 * @param pFlag
	 * @return
	 */
	public String getItemKindCode(String itemKindCodes,String pFlag){
		String flag = "";
		String[] itemCodeArr = itemKindCodes.split(",");
		List<ItemKindXom> itemkind = this.itemKindXomList;
		List<String> strList = new ArrayList<String>();
		
		for(int i=0;i<itemCodeArr.length;i++){
			String f = "false";
			for(ItemKindXom item:itemkind){
				if(item.getItemKindCode()!=null && item.getItemKindCode().equals(itemCodeArr[i])){
					f = "true";
				}
			}
			strList.add(f);
		}
		
		if("并".equals(pFlag)){
			for(String str:strList){
				if("false".equals(str)){
					flag = "false";
				}
			}
			if("".equals(flag)){
				flag = "true";
			}
		}else if("或".equals(pFlag)){
			for(String str:strList){
				if("true".equals(str)){
					flag = "true";
				}
			}
			if("".equals(flag)){
				flag = "false";
			}
		}
		return flag;
	}
	
	/**
	 * 和去年相比,增加哪些险别
	 * @param itemList
	 * @param itemKindCode
	 * @return
	 * @throws Exception
	 */
	public String lastNoItemKind(List<ItemKindXom> itemList, String lastItemkind ,String addKindCode) throws Exception{
		
		String flag = "false";
 		
		String[] strlastItemkind = null;
		if(lastItemkind!=null&&!"".equals(lastItemkind)){
			strlastItemkind = lastItemkind.split("|");
		}				
		//与去年不同险别的集合
		List<ItemKindXom> nolastKindCodelist = new ArrayList<ItemKindXom>();
		//找出与去年不同的险别
		if(strlastItemkind!=null){//有去年险别
			for(ItemKindXom itemKindXom:itemList){		
				for(int i=0;i<strlastItemkind.length;i++){
					if(!strlastItemkind[i].equals(itemKindXom.getItemKindCode())){
						nolastKindCodelist.add(itemKindXom);
					}
				}
			}
		}else{//没有去年险别，则令今天险别都为新增
			nolastKindCodelist = itemList;
		}
		
		//addKindCode需要区分的险别
		if(nolastKindCodelist.size()>0){//和去年相比有新增险别
			if(addKindCode!=null&&!"".equals(addKindCode)){
				String[] addKindCodeList = addKindCode.split("|");
				for(ItemKindXom itemKindXom:nolastKindCodelist){	
					for(int i=0;i<addKindCodeList.length;i++){
						if(addKindCodeList[i].equals(itemKindXom.getItemKindCode())){
							flag = "true";
							return flag;
						}
					}
				}
			}	
		}
		return flag;
		
	}

}
