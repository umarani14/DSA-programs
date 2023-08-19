package com.hashmap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueOccurrences {
	
	public static void main(String[] args) {
		int[] arr = {1,2,2,1,1,3};
		uniqueOccurances1(arr);
	}
//	optimized
	static boolean uniqueOccurances1(int[] arr) {

		int length=arr.length;
		Set<Integer> set=new HashSet<>();
		Map<Integer, Integer> map=new HashMap<>();
		for(int i=0;i<length;i++) {
			map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
		}
		set.addAll(map.values());
		return set.size()==map.size();
	
	}
	
//	Brute force
	static  boolean uniqueOccurrences(int[] arr) {
		int length=arr.length;
		int count=1;
		Arrays.sort(arr);
		Set<Integer> set=new HashSet<>();
		HashMap<Integer, Integer> map=new HashMap<>();
		for(int i=0;i<length;i++) {
			set.add(arr[i]);
			if(map.containsKey(arr[i])) {
				count++;
				map.put(arr[i], count);
			}else {
				count=1;
				map.put(arr[i], count);
			}
			
			
		}
		long a=map.values().stream().distinct().count();
		if(a==set.size()) {
			System.out.println(" true");
			return true;
		}
		System.out.println(" long a is-- "+ a);
		System.out.println(" count is -- "+ count);
		System.out.println(" map is -- "+ map);
		System.out.println(" false");
		return false;
	}

}
