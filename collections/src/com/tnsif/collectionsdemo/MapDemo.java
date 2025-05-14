package com.tnsif.collectionsdemo;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo {

	 public static void main(String[] args) {
		 Map<String,Integer> m=new HashMap<String,Integer>();
		 m.put("DSP", 80);
		 m.put("VLSI", 89);
		 m.put("AWP", 76);
		 m.put("ESD", 83);
		 System.out.println("hashmap");
		 for (Map.Entry<String,Integer> entry:m.entrySet()) {
			
			 System.out.println(entry.getKey()+","+entry.getValue());
		 }
		 //LinkedHashMap
    Map<String,Integer> lm =new LinkedHashMap<String,Integer>();
         lm.put("DSP", 80);
	     lm.put("VLSI", 89);
	     lm.put("AWP", 76);
	     lm.put("AWP", 76);
	     lm.put("ESD", 83);
	     System.out.println("linkedhashmap");
	     for (Map.Entry<String,Integer> entry:lm.entrySet()) {
				
			 System.out.println(entry.getKey()+","+entry.getValue());
		 }
	     //treemap
	     Map<String,Integer> tm =new TreeMap<String,Integer>();
         tm.put("DSP", 80);
	     tm.put("VLSI", 89);
	     tm.put("AWP", 76);
	     tm.put("AWP", 76);
	     tm.put("ESD", 83);
	     System.out.println("treemap");
	     for (Map.Entry<String,Integer> entry:tm.entrySet()) {
				
			 System.out.println(entry.getKey()+","+entry.getValue());
		 }
	 }
	 
}
