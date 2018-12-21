package com.sinosoft.ilogrule.ilog.xom.prpcarXom;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.sinosoft.ilogrule.ilog.xom.prpcarXom.util.UtilXom;



public class PrpCarInputXom implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private MainXom mainXom;
	
	private ApplicantXom applicantXom;
	
	private InsuredXom insuredXom;
	
	private VehicleXom vehicleXom;
	
	private VehicleOwnerXom vehicleOwnerXom;
	
	private List<ItemKindXom> itemKindXomList;
	
	private OtherXom otherXom;

	private PrpCarResultXom prpCarResultXOM;
	
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

	public VehicleXom getVehicleXom() {
		return vehicleXom;
	}

	public void setVehicleXom(VehicleXom vehicleXom) {
		this.vehicleXom = vehicleXom;
	}

	public VehicleOwnerXom getVehicleOwnerXom() {
		return vehicleOwnerXom;
	}

	public void setVehicleOwnerXom(VehicleOwnerXom vehicleOwnerXom) {
		this.vehicleOwnerXom = vehicleOwnerXom;
	}

	public List<ItemKindXom> getItemKindXomList() {
		return itemKindXomList;
	}

	public void setItemKindXomList(List<ItemKindXom> itemKindXomList) {
		this.itemKindXomList = itemKindXomList;
	}

	public OtherXom getOtherXom() {
		return otherXom;
	}

	public void setOtherXom(OtherXom otherXom) {
		this.otherXom = otherXom;
	}

	public PrpCarResultXom getPrpCarResultXOM() {
		return prpCarResultXOM;
	}
	
	public void setPrpCarResultXOM(PrpCarResultXom prpCarResultXOM) {
		this.prpCarResultXOM = prpCarResultXOM;
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
//			if(startTime <= endTime){
//				//获取相减后天数
//				day = (endTime-startTime)/dm;
//			}else{
				day = (startTime-endTime)/dm;
//			}
		}
		return day;

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

}
