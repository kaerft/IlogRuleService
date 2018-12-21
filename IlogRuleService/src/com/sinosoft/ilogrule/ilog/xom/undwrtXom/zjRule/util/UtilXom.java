package com.sinosoft.ilogrule.ilog.xom.undwrtXom.zjRule.util;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.sinosoft.ilogrule.ilog.xom.undwrtXom.zjRule.ItemKindXom;


public class UtilXom {

	//判断 int 和 double 类型数据是否为空的标志  begin
	 
	//MainXom
	private String isNullOfRenewalYears;//连续续保年数
	
	private String isNullOfBeforePrem;//折前保费
	
	private String isNullOfEntireDiscount;//整单折扣
	
	private String isNullOfAfterPrem;//实交保费
	
	
	//ApplicantXom
	private String isNullOfAgeAppli;//年龄
	
	
	//InsuredXom
	private String isNullOfAgeInsured;//年龄
	
	
	//VehicleXom
	private String isNullOfRunMiles;//行驶里程
	
	private String isNullOfActualValue;//协商实际价值
	
	private String isNullOfNDisplacement;//排量（单位:L）
	
	private String isNullOfhfTaxValue;//车船税的值
	
	//OtherXom
	
	private String isNullOfLastClaimAmount;//上年赔款总金额
	
	private String isNullOfLossNumber;//出险次数
	
	private String isNullOfClaimadjustValue;//无赔优待系数（无赔优NCD系数）
	
	private String isNullOfAtuoBusiness;//业务自主系数
	
	private String isNullOfCountNCDCof;//昊升方案系数
	
	private String IsNullSelfProtectionCof;//自主核保系数
	
	private String IsNullSelfChannelCof;//自主渠道系数
	
	private String IsNullCarPriceCof;//承保定价系数
	
	//判断 int 和 double 类型数据是否为空的标志  end
	
	private String applicantRes; //投保人是否属于清单
	private String InSuredRes;	//被保险人是否属于清单
	private String VehicleOwnerRes;//车主是否属于清单
	
	public String getApplicantRes() {
		return applicantRes;
	}

	public void setApplicantRes(String applicantRes) {
		this.applicantRes = applicantRes;
	}

	public String getInSuredRes() {
		return InSuredRes;
	}

	public void setInSuredRes(String inSuredRes) {
		InSuredRes = inSuredRes;
	}

	public String getVehicleOwnerRes() {
		return VehicleOwnerRes;
	}

	public void setVehicleOwnerRes(String vehicleOwnerRes) {
		VehicleOwnerRes = vehicleOwnerRes;
	}
	
	public String getIsNullOfRenewalYears() {
		return isNullOfRenewalYears;
	}

	public void setIsNullOfRenewalYears(String isNullOfRenewalYears) {
		this.isNullOfRenewalYears = isNullOfRenewalYears;
	}

	public String getIsNullOfBeforePrem() {
		return isNullOfBeforePrem;
	}

	public void setIsNullOfBeforePrem(String isNullOfBeforePrem) {
		this.isNullOfBeforePrem = isNullOfBeforePrem;
	}

	public String getIsNullOfEntireDiscount() {
		return isNullOfEntireDiscount;
	}

	public void setIsNullOfEntireDiscount(String isNullOfEntireDiscount) {
		this.isNullOfEntireDiscount = isNullOfEntireDiscount;
	}

	public String getIsNullOfAfterPrem() {
		return isNullOfAfterPrem;
	}

	public void setIsNullOfAfterPrem(String isNullOfAfterPrem) {
		this.isNullOfAfterPrem = isNullOfAfterPrem;
	}

	public String getIsNullOfAgeAppli() {
		return isNullOfAgeAppli;
	}

	public void setIsNullOfAgeAppli(String isNullOfAgeAppli) {
		this.isNullOfAgeAppli = isNullOfAgeAppli;
	}

	public String getIsNullOfAgeInsured() {
		return isNullOfAgeInsured;
	}

	public void setIsNullOfAgeInsured(String isNullOfAgeInsured) {
		this.isNullOfAgeInsured = isNullOfAgeInsured;
	}

	public String getIsNullOfRunMiles() {
		return isNullOfRunMiles;
	}

	public void setIsNullOfRunMiles(String isNullOfRunMiles) {
		this.isNullOfRunMiles = isNullOfRunMiles;
	}

	public String getIsNullOfActualValue() {
		return isNullOfActualValue;
	}

	public void setIsNullOfActualValue(String isNullOfActualValue) {
		this.isNullOfActualValue = isNullOfActualValue;
	}

	public String getIsNullOfNDisplacement() {
		return isNullOfNDisplacement;
	}

	public void setIsNullOfNDisplacement(String isNullOfNDisplacement) {
		this.isNullOfNDisplacement = isNullOfNDisplacement;
	}

	public String getIsNullOfLastClaimAmount() {
		return isNullOfLastClaimAmount;
	}

	public void setIsNullOfLastClaimAmount(String isNullOfLastClaimAmount) {
		this.isNullOfLastClaimAmount = isNullOfLastClaimAmount;
	}

	public String getIsNullOfLossNumber() {
		return isNullOfLossNumber;
	}

	public void setIsNullOfLossNumber(String isNullOfLossNumber) {
		this.isNullOfLossNumber = isNullOfLossNumber;
	}

	public String getIsNullOfClaimadjustValue() {
		return isNullOfClaimadjustValue;
	}

	public void setIsNullOfClaimadjustValue(String isNullOfClaimadjustValue) {
		this.isNullOfClaimadjustValue = isNullOfClaimadjustValue;
	}

	public String getIsNullOfAtuoBusiness() {
		return isNullOfAtuoBusiness;
	}

	public void setIsNullOfAtuoBusiness(String isNullOfAtuoBusiness) {
		this.isNullOfAtuoBusiness = isNullOfAtuoBusiness;
	}

	public String getIsNullOfCountNCDCof() {
		return isNullOfCountNCDCof;
	}

	public void setIsNullOfCountNCDCof(String isNullOfCountNCDCof) {
		this.isNullOfCountNCDCof = isNullOfCountNCDCof;
	}

	public String getIsNullSelfProtectionCof() {
		return IsNullSelfProtectionCof;
	}

	public void setIsNullSelfProtectionCof(String isNullSelfProtectionCof) {
		IsNullSelfProtectionCof = isNullSelfProtectionCof;
	}

	public String getIsNullSelfChannelCof() {
		return IsNullSelfChannelCof;
	}

	public void setIsNullSelfChannelCof(String isNullSelfChannelCof) {
		IsNullSelfChannelCof = isNullSelfChannelCof;
	}

	public String getIsNullCarPriceCof() {
		return IsNullCarPriceCof;
	}

	public void setIsNullCarPriceCof(String isNullCarPriceCof) {
		IsNullCarPriceCof = isNullCarPriceCof;
	}
	
	public String getIsNullOfhfTaxValue() {
		return isNullOfhfTaxValue;
	}

	public void setIsNullOfhfTaxValue(String isNullOfhfTaxValue) {
		this.isNullOfhfTaxValue = isNullOfhfTaxValue;
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
	 * 遍历险别集合的值,是否属于某一险别
	 * @param itemList
	 * @param itemKindCode
	 * @return
	 * @throws Exception
	 */
	public ItemKindXom listItemKind(List<ItemKindXom> itemList, String itemKindCode) throws Exception{
		ItemKindXom itemKind = new ItemKindXom();
		for(ItemKindXom itemKindXom:itemList){
			if(itemKindCode.equals(itemKindXom.getItemKindCode())){
				itemKind = itemKindXom;
				break;
			}
		}
		return itemKind;
		

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
			strlastItemkind = lastItemkind.split("\\|");
		}				
		//今年与去年不同险别的集合（今年新增）
		List<String> nolastKindCodelist = null;
	
		//今年险别的list
		List<String> strtodayList = new ArrayList<String>();
		//组织今年险别的list
		for(int i=0;i<itemList.size();i++){
			strtodayList.add(itemList.get(i).getItemKindCode());
		}
		
		//去年险别的list
		List<String> strlastList = new ArrayList<String>();
		
		//找出与去年不同的险别
		if(strlastItemkind!=null){//有去年险别	
			//组织去年险别的list
			for(int i=0;i<strlastItemkind.length;i++){
				strlastList.add(strlastItemkind[i]);
			}
			nolastKindCodelist = new ArrayList<String>(strtodayList);
			nolastKindCodelist.removeAll(strlastList);// 去除相同元素，今年-去年
		}else{//没有去年险别，则令今天险别都为新增
			nolastKindCodelist = new ArrayList<String>(strtodayList);
		}
		
		//今年新增险别是否在规则的险别中
		if(nolastKindCodelist!=null){
			if(nolastKindCodelist.size()>0){//和去年相比有新增险别
				if(addKindCode!=null&&!"".equals(addKindCode)){			
					//规则的险别
					String[] addKindCodeList = addKindCode.split("\\|");					
					for(int i=0;i<addKindCodeList.length;i++){
						if(nolastKindCodelist.contains(addKindCodeList[i])){
							flag = "true";
							return flag;
						};
					}						
				}	
			}
		}
		return flag;
		
	}
	/**
	 * 主险保额和
	 * @param itemList
	 * @return
	 */
	public double sumMainItemKindAmount(List<ItemKindXom> itemList){
		double sumAmount = 0;
		for(ItemKindXom itemKindXom:itemList){
			if("1".equals(itemKindXom.getFlag())){//主险
				sumAmount = sumAmount + itemKindXom.getAmount();
			}
		}
		return sumAmount;
	}
}
