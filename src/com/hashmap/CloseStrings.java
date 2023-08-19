package com.hashmap;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CloseStrings {
	
	public static void main(String[] args) {
		String s="Uma";
		System.out.println("  list of strings -- "+ lamda(s));
	}
	
	
//	getting list of values when a string matches in the map
	static List<String> lamda(String s) {
		Map<String,List<String>> map=new HashMap<>();
		List<String> list=new ArrayList<>();
		list.add("Uma");
		list.add("Rani");
		map.put("1", list);
		List<String> list1=new ArrayList<>();
		list1.add("Raju");
		list1.add("Uma");
		map.put("2", list1);
		System.out.println(" map " + map);
		List<String> finalList=new ArrayList<>();
		Collection<List<String>> listOfStrings=map.values();
		
		for(List<String> s1:listOfStrings) {
		if(s1.contains(s)) {
			finalList.addAll(s1);
		}
	}
//		using lamda expressions
		
		List<String> listNew=map.values().stream().filter(l -> l.contains(s))
				.flatMap(Collection:: stream).collect(Collectors.toList());
		
		System.out.println(" final list is "+ finalList);
		
		System.out.println(" list using lamda expressions - "+ listNew);
		
		return finalList;
	}

}
