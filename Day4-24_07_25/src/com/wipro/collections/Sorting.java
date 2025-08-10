package com.wipro.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> map=new HashMap<String, String>();
		map.put("India", "Ruppe");
		map.put("Japan", "Yen");
		map.put("United states", "Dollar");
		map.put("Dubai", "dirham");
		map.put("China", "Yuyan");
		
		Map<String,String>map2=new TreeMap<String, String>();
		map2.putAll(map);
		System.out.println(map2);
		

	}

}
