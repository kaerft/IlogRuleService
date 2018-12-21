package com.sinosoft.ilogrule.ilog;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.sinosoft.ilogrule.ilog.xom.undwrtXom.CarRule.ItemKindXom;

public class test {
	
	public static void main(String[] args) throws Exception {
		//只用于方法测试
//		Map<String, String> testLMap = testLMap();
//	    System.out.println(testLMap.toString());
		//SimpleDateFormat formatter=new SimpleDateFormat("yyyy-MM-dd"); 
		//System.out.println(formatter.parse(""));
		
//		List<String> list1 = new ArrayList<String>();
//		list1.add("a1");
//		list1.add("b1");
//		list1.add("c1");
//		list1.add("d1");
//		list1.add("e1");
//		List<String> list2 = new ArrayList<String>();
//		list2.add("d1");
//		list2.add("e1");
//		list2.add("f1");
//		list2.add("g1");
//		list2.add("h1");
//		System.out.println(list1);
//		System.out.println(list2);
//		
//		List<String> lista = new ArrayList<String>(list1);//构建list1的副本
//		lista.removeAll(list2);// 去除相同元素
//		List<String> listb = new ArrayList<String>(list2);//构建list2的副本
//		listb.removeAll(list1);// 去除相同元素
//		System.out.println(lista);
//		System.out.println(listb);
//		
//		 if(list1.contains("a1")){ System.out.print("包含"); } //list里直等的意思
		
		//测试与去年比新增险别问题
		List<ItemKindXom> itemList = new ArrayList<ItemKindXom>();
		ItemKindXom itemKindXom1 = new ItemKindXom();
		itemKindXom1.setItemKindCode("A");		
		itemList.add(itemKindXom1);
		
//		ItemKindXom itemKindXom2 = new ItemKindXom();
//		itemKindXom2.setItemKindCode("MA");		
//		itemList.add(itemKindXom2);
		
		ItemKindXom itemKindXom3 = new ItemKindXom();
		itemKindXom3.setItemKindCode("B");		
		itemList.add(itemKindXom3);
		
		ItemKindXom itemKindXom4 = new ItemKindXom();
		itemKindXom4.setItemKindCode("G");		
		itemList.add(itemKindXom4);
		
		String flag = lastNoItemKind(itemList,"A|MA|G","A|MA|G");
		System.out.println("flag==="+flag);
	}
	
	public  String isTrue(List<String>  list, String str) throws Exception{
		 String flag = "false";
		 for (int i = 0; i < list.size(); i++) { 
			 if(list.contains(str)){
				 flag="true";
			 }else{
				 flag="false";
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
	public static String lastNoItemKind(List<ItemKindXom> itemList, String lastItemkind ,String addKindCode) throws Exception{
		
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
		System.out.println("今年=="+strtodayList);
		
		//去年险别的list
		List<String> strlastList = new ArrayList<String>();
		
		//找出与去年不同的险别
		if(strlastItemkind!=null){//有去年险别	
			//组织去年险别的list
			for(int i=0;i<strlastItemkind.length;i++){
				strlastList.add(strlastItemkind[i]);
			}
			System.out.println("去年=="+strlastList);
			
			nolastKindCodelist = new ArrayList<String>(strtodayList);
			nolastKindCodelist.removeAll(strlastList);// 去除相同元素，今年-去年
			System.out.println("今年新增=="+nolastKindCodelist);
			
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
