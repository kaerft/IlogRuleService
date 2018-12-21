package com.sinosoft.ilogrule.ilog.xom.cargoXom;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.sinosoft.ilogrule.ilog.xom.cargoXom.agreement.AgreementXom;
import com.sinosoft.ilogrule.ilog.xom.cargoXom.cargo.CargoXom;
import com.sinosoft.ilogrule.ilog.xom.cargoXom.cargoPhead.CargoPheadXom;



public class CargoInputXom implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private CargoXom cargoXom;
	
	private AgreementXom agreementXom;
	
	private CargoPheadXom cargoPheadXom;

	private CargoResultXom cargoResultXOM;
	
	

	public CargoXom getCargoXom() {
		return cargoXom;
	}

	public void setCargoXom(CargoXom cargoXom) {
		this.cargoXom = cargoXom;
	}

	public AgreementXom getAgreementXom() {
		return agreementXom;
	}

	public void setAgreementXom(AgreementXom agreementXom) {
		this.agreementXom = agreementXom;
	}

	public CargoPheadXom getCargoPheadXom() {
		return cargoPheadXom;
	}

	public void setCargoPheadXom(CargoPheadXom cargoPheadXom) {
		this.cargoPheadXom = cargoPheadXom;
	}

	public CargoResultXom getCargoResultXOM() {
		return cargoResultXOM;
	}

	public void setCargoResultXOM(CargoResultXom cargoResultXOM) {
		this.cargoResultXOM = cargoResultXOM;
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
			}
		}
		return day;

	}
	
	/**
	 * 比较两个入参的值是否一致
	 * @param cargoName
	 * @param agreementName
	 * @return
	 */
	public boolean difCargoByAgreement(String cargoName,String agreementName){
		boolean flag = false;
		if(cargoName!=null && cargoName.equals(agreementName)){
			flag =true;
		}
		return flag;
	}
	
	/**
	 * 字符串是否包含某个字符
	 * @param goodNames
	 * @param goodName
	 * @return
	 */
	public boolean containsName(String goodNames,String goodName){
		boolean flag = false;
		
		String[] strgoodNames = null;
		if(goodNames!=null&&!"".equals(goodNames)){
			strgoodNames = goodNames.split("\\|");
		}
		if(strgoodNames!=null){
			for(String strGoodName:strgoodNames){
				if(goodName.indexOf(strGoodName)>-1){
					flag = true;
					break;
				}
			}
		}
		
		return flag;
	}
	
	/**
	 * 按照证件号获取一条被保险人信息
	 * @param agreementList
	 * @param identifyNumber
	 * @return
	 */
	public com.sinosoft.ilogrule.ilog.xom.cargoXom.agreement.InsuredXom getByInsured(
			List<com.sinosoft.ilogrule.ilog.xom.cargoXom.agreement.InsuredXom> agreementList,String identifyNumber){
		com.sinosoft.ilogrule.ilog.xom.cargoXom.agreement.InsuredXom insuredXom = null;
		for(com.sinosoft.ilogrule.ilog.xom.cargoXom.agreement.InsuredXom insXom:agreementList){
			if(identifyNumber.equals(insXom.getIdentifyNumber())){
				insuredXom = insXom;
			}
		}
		return insuredXom;
	}
	
	/**
	 * 判断是否有条款名称修改(保单与协议比较)
	 * @param cargoItemList
	 * @param agreementItemList
	 * @return
	 */
	public boolean updateItemKindNameBX(List<com.sinosoft.ilogrule.ilog.xom.cargoXom.cargo.ItemKindXom> cargoItemList
			,List<com.sinosoft.ilogrule.ilog.xom.cargoXom.agreement.ItemKindXom> agreementItemList){
		boolean flag = false;
		for(com.sinosoft.ilogrule.ilog.xom.cargoXom.cargo.ItemKindXom cargoItemKind:cargoItemList){
			for(com.sinosoft.ilogrule.ilog.xom.cargoXom.agreement.ItemKindXom agreementItemKind:agreementItemList){
				if(cargoItemKind.getItemKindCode().equals(agreementItemKind.getItemKindCode()) &&
						!cargoItemKind.getItemKindName().equals(agreementItemKind.getItemKindName())){
					flag = true;
				}
			}
		}
		return flag;
	}
	
	/**
	 * 判断是否有条款名称修改(批单与协议比较)
	 * @param cargoPheadItemList
	 * @param agreementItemList
	 * @return
	 */
	public boolean updateItemKindNamePX(List<com.sinosoft.ilogrule.ilog.xom.cargoXom.cargoPhead.ItemKindXom> cargoPheadItemList
			,List<com.sinosoft.ilogrule.ilog.xom.cargoXom.agreement.ItemKindXom> agreementItemList){
		boolean flag = false;
		for(com.sinosoft.ilogrule.ilog.xom.cargoXom.cargoPhead.ItemKindXom cargoPheadItemKind:cargoPheadItemList){
			for(com.sinosoft.ilogrule.ilog.xom.cargoXom.agreement.ItemKindXom agreementItemKind:agreementItemList){
				if(cargoPheadItemKind.getItemKindCode().equals(agreementItemKind.getItemKindCode()) &&
						!cargoPheadItemKind.getItemKindName().equals(agreementItemKind.getItemKindName())){
					flag = true;
				}
			}
		}
		return flag;
	}
	
	
	/**
	 * 判断是否有条款名称修改(批单与保单比较)
	 * @param cargoPheadItemList
	 * @param cargoItemList
	 * @return
	 */
	public boolean updateItemKindNamePB(List<com.sinosoft.ilogrule.ilog.xom.cargoXom.cargoPhead.ItemKindXom> cargoPheadItemList
			,List<com.sinosoft.ilogrule.ilog.xom.cargoXom.cargo.ItemKindXom> cargoItemList){
		boolean flag = false;
		for(com.sinosoft.ilogrule.ilog.xom.cargoXom.cargoPhead.ItemKindXom cargoPheadItemKind:cargoPheadItemList){
			for(com.sinosoft.ilogrule.ilog.xom.cargoXom.cargo.ItemKindXom cargoItemKind:cargoItemList){
				if(cargoPheadItemKind.getItemKindCode().equals(cargoItemKind.getItemKindCode()) &&
						!cargoPheadItemKind.getItemKindName().equals(cargoItemKind.getItemKindName())){
					flag = true;
				}
			}
		}
		return flag;
	}
	
	

	
	
	/**
	 * 判断是否有条款删除(保单与协议比较)
	 * @param cargoItemList
	 * @param agreementItemList
	 * @param itemFlag
	 * @return
	 */
	public boolean delItemKindBX(List<com.sinosoft.ilogrule.ilog.xom.cargoXom.cargo.ItemKindXom> cargoItemList
			,List<com.sinosoft.ilogrule.ilog.xom.cargoXom.agreement.ItemKindXom> agreementItemList,String itemFlag){
		boolean flag = false;
//		String itemCode = ",";
//		for(com.sinosoft.ilogrule.ilog.xom.cargoXom.cargo.ItemKindXom cargoItemKind:cargoItemList){
//			if(itemFlag.equals(cargoItemKind.getFlag())){
//				itemCode = cargoItemKind.getItemKindCode() + itemCode;
//			}
//		}
//		
//		
//		for(com.sinosoft.ilogrule.ilog.xom.cargoXom.agreement.ItemKindXom agreementItemKind:agreementItemList){
//			if(itemFlag.equals(agreementItemKind.getFlag()) && itemCode.indexOf(agreementItemKind.getItemKindCode())==-1){
//				flag = true;
//			}
//		}
		
		
		List<String> agreementList =  new ArrayList<String>();
		for(com.sinosoft.ilogrule.ilog.xom.cargoXom.agreement.ItemKindXom agreementItemKind:agreementItemList){
			if(itemFlag.equals(agreementItemKind.getFlag())){
				agreementList.add(agreementItemKind.getItemKindCode());
			}
		}
		
		List<String> cargoList =  new ArrayList<String>();
		for(com.sinosoft.ilogrule.ilog.xom.cargoXom.cargo.ItemKindXom cargoItemKind:cargoItemList){
			if(itemFlag.equals(cargoItemKind.getFlag())){
				cargoList.add(cargoItemKind.getItemKindCode());
			}
		}
		
		agreementList.removeAll(cargoList);
		
		if(agreementList.size()>0){
			flag = true;
		}
		
		
		return flag;
	}
	
	
	/**
	 * 判断是否有条款删除(批单与协议比较)
	 * @param cargoPheadItemList
	 * @param agreementItemList
	 * @param itemFlag
	 * @return
	 */
	public boolean delItemKindPX(List<com.sinosoft.ilogrule.ilog.xom.cargoXom.cargoPhead.ItemKindXom> cargoPheadItemList
			,List<com.sinosoft.ilogrule.ilog.xom.cargoXom.agreement.ItemKindXom> agreementItemList,String itemFlag){
		boolean flag = false;
		
		List<String> agreementList =  new ArrayList<String>();
		for(com.sinosoft.ilogrule.ilog.xom.cargoXom.agreement.ItemKindXom agreementItemKind:agreementItemList){
			if(itemFlag.equals(agreementItemKind.getFlag())){
				agreementList.add(agreementItemKind.getItemKindCode());
			}
		}
		
		List<String> cargoPheadList =  new ArrayList<String>();
		for(com.sinosoft.ilogrule.ilog.xom.cargoXom.cargoPhead.ItemKindXom cargoPheadItemKind:cargoPheadItemList){
			if(itemFlag.equals(cargoPheadItemKind.getFlag())){
				cargoPheadList.add(cargoPheadItemKind.getItemKindCode());
			}
		}
		
		agreementList.removeAll(cargoPheadList);
		
		if(agreementList.size()>0){
			flag = true;
		}
		
		
		return flag;
	}
	
	
	/**
	 * 判断是否有条款删除(批单与保单比较)
	 * @param cargoPheadItemList
	 * @param cargoItemList
	 * @param itemFlag
	 * @return
	 */
	public boolean delItemKindPB(List<com.sinosoft.ilogrule.ilog.xom.cargoXom.cargoPhead.ItemKindXom> cargoPheadItemList
			,List<com.sinosoft.ilogrule.ilog.xom.cargoXom.cargo.ItemKindXom> cargoItemList,String itemFlag){
		boolean flag = false;
		
		List<String> cargoList =  new ArrayList<String>();
		for(com.sinosoft.ilogrule.ilog.xom.cargoXom.cargo.ItemKindXom cargoItemKind:cargoItemList){
			if(itemFlag.equals(cargoItemKind.getFlag())){
				cargoList.add(cargoItemKind.getItemKindCode());
			}
		}
		
		List<String> cargoPheadList =  new ArrayList<String>();
		for(com.sinosoft.ilogrule.ilog.xom.cargoXom.cargoPhead.ItemKindXom cargoPheadItemKind:cargoPheadItemList){
			if(itemFlag.equals(cargoPheadItemKind.getFlag())){
				cargoPheadList.add(cargoPheadItemKind.getItemKindCode());
			}
		}
		
		cargoList.removeAll(cargoPheadList);
		
		if(cargoList.size()>0){
			flag = true;
		}
		
		
		return flag;
	}
	
	
	
	
	
	/**
	 * 判断是否有条款增加(保单与协议比较)
	 * @param cargoItemList
	 * @param agreementItemList
	 * @param itemFlag
	 * @return
	 */
	public boolean addItemKindBX(List<com.sinosoft.ilogrule.ilog.xom.cargoXom.cargo.ItemKindXom> cargoItemList
			,List<com.sinosoft.ilogrule.ilog.xom.cargoXom.agreement.ItemKindXom> agreementItemList,String itemFlag){
		boolean flag = false;
//		String itemCode = ",";
//		for(com.sinosoft.ilogrule.ilog.xom.cargoXom.agreement.ItemKindXom agreementItemKind:agreementItemList){
//			if(itemFlag.equals(agreementItemKind.getFlag())){
//				itemCode = agreementItemKind.getItemKindCode() + itemCode;
//			}
//		}
//		
//		
//		for(com.sinosoft.ilogrule.ilog.xom.cargoXom.cargo.ItemKindXom cargoItemKind:cargoItemList){
//			if(itemFlag.equals(cargoItemKind.getFlag()) && itemCode.indexOf(cargoItemKind.getItemKindCode())==-1){
//				flag = true;
//				break;
//			}
//		}
		
		
		List<String> agreementList =  new ArrayList<String>();
		for(com.sinosoft.ilogrule.ilog.xom.cargoXom.agreement.ItemKindXom agreementItemKind:agreementItemList){
			if(itemFlag.equals(agreementItemKind.getFlag())){
				agreementList.add(agreementItemKind.getItemKindCode());
			}
		}
		
		List<String> cargoList =  new ArrayList<String>();
		for(com.sinosoft.ilogrule.ilog.xom.cargoXom.cargo.ItemKindXom cargoItemKind:cargoItemList){
			if(itemFlag.equals(cargoItemKind.getFlag())){
				cargoList.add(cargoItemKind.getItemKindCode());
			}
		}
		
		cargoList.removeAll(agreementList);
		
		if(cargoList.size()>0){
			flag = true;
		}
		
		
		return flag;
	}
	
	
	/**
	 * 判断是否有条款增加(批单与协议比较)
	 * @param cargoPheadItemList
	 * @param agreementItemList
	 * @param itemFlag
	 * @return
	 */
	public boolean addItemKindPX(List<com.sinosoft.ilogrule.ilog.xom.cargoXom.cargoPhead.ItemKindXom> cargoPheadItemList
			,List<com.sinosoft.ilogrule.ilog.xom.cargoXom.agreement.ItemKindXom> agreementItemList,String itemFlag){
		boolean flag = false;
		
		List<String> agreementList =  new ArrayList<String>();
		for(com.sinosoft.ilogrule.ilog.xom.cargoXom.agreement.ItemKindXom agreementItemKind:agreementItemList){
			if(itemFlag.equals(agreementItemKind.getFlag())){
				agreementList.add(agreementItemKind.getItemKindCode());
			}
		}
		
		List<String> cargoPheadList =  new ArrayList<String>();
		for(com.sinosoft.ilogrule.ilog.xom.cargoXom.cargoPhead.ItemKindXom cargoPheadItemKind:cargoPheadItemList){
			if(itemFlag.equals(cargoPheadItemKind.getFlag())){
				cargoPheadList.add(cargoPheadItemKind.getItemKindCode());
			}
		}
		
		cargoPheadList.removeAll(agreementList);
		
		if(cargoPheadList.size()>0){
			flag = true;
		}
		
		
		return flag;
	}
	
	
	/**
	 * 判断是否有条款增加(批单与保单比较)
	 * @param cargoPheadItemList
	 * @param cargoItemList
	 * @param itemFlag
	 * @return
	 */
	public boolean addItemKindPB(List<com.sinosoft.ilogrule.ilog.xom.cargoXom.cargoPhead.ItemKindXom> cargoPheadItemList
			,List<com.sinosoft.ilogrule.ilog.xom.cargoXom.cargo.ItemKindXom> cargoItemList,String itemFlag){
		boolean flag = false;
		
		List<String> cargoList =  new ArrayList<String>();
		for(com.sinosoft.ilogrule.ilog.xom.cargoXom.cargo.ItemKindXom cargoItemKind:cargoItemList){
			if(itemFlag.equals(cargoItemKind.getFlag())){
				cargoList.add(cargoItemKind.getItemKindCode());
			}
		}
		
		List<String> cargoPheadList =  new ArrayList<String>();
		for(com.sinosoft.ilogrule.ilog.xom.cargoXom.cargoPhead.ItemKindXom cargoPheadItemKind:cargoPheadItemList){
			if(itemFlag.equals(cargoPheadItemKind.getFlag())){
				cargoPheadList.add(cargoPheadItemKind.getItemKindCode());
			}
		}
		
		cargoPheadList.removeAll(cargoList);
		
		if(cargoPheadList.size()>0){
			flag = true;
		}
		
		
		return flag;
	}
	
}
