package com.hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDifference {
	
	public static void main(String[] args) {
		int[] nums1 = {1,2,3,3,3}, nums2 = {2,4,6,2,6};
//		findDifference(nums1, nums2);
//		findDifferenceUsingSet(nums1, nums2);
		findDisappearedNumbers(nums1, nums2);
	}
	
	 static List<List<Integer>> findDisappearedNumbers(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (int num : nums1) {
            set1.add(num);
        }

        for (int num : nums2) {
            set2.add(num);
        }

        List<Integer> result1 = new ArrayList<>();
        List<Integer> result2 = new ArrayList<>();

        for (int num : set1) {
            if (!set2.contains(num)) {
                result1.add(num);
            }
        }

        for (int num : set2) {
            if (!set1.contains(num)) {
                result2.add(num);
            }
        }

        List<List<Integer>> answer = new ArrayList<>();
        answer.add(result1);
        answer.add(result2);
        return answer;
	}
	static List<List<Integer>> findDifferenceUsingSet(int[] nums1, int[] nums2) {
		Set<Integer> set1=new HashSet<>();
		Set<Integer> set2=new HashSet<>();
		List<List<Integer>> finalList=new ArrayList<>();
		List<Integer> list1=new ArrayList<>();
		List<Integer> list2=new ArrayList<>();
		for(int n:nums1) {
			set1.add(n);
		}
		for(int n: nums2) {
			set2.add(n);
		}
		for(int n:set1) {
			if(!set2.contains(n)) {
				list1.add(n);
			}
			
		}
		for(int n:set2) {
			if(!set1.contains(n)) {
				list2.add(n);
			}
			
		}
		finalList.add(list2);
		finalList.add(list1);
		
		System.out.println(" set 1 is -- "+ set1);
		System.out.println(" set 2 is --- "+ set2);
		
		System.out.println(" final list is-- "+ finalList);
		return finalList;
	}
	
	
	static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
		HashMap<Integer, Integer> map1=new HashMap<>();
		HashMap<Integer, Integer> map2=new HashMap<>();
		List<Integer> list1=new ArrayList<Integer>();
		List<Integer> list2=new ArrayList<Integer>();
		List<List<Integer>> finalList=new ArrayList<>();
		int length1=nums1.length;
		int length2=nums2.length;
		for(int i=0;i<length1;i++) {
			map1.put(nums1[i], i);
			System.out.println(" map1 is "+ map1);
			map2.put(nums2[i], i);
			
		}
		for(int j=0;j<length2;j++) {
			if(!map1.containsKey(nums2[j])) {
				if(!list2.contains(nums2[j]))
				list2.add(nums2[j]);
			}
			if(!map2.containsKey(nums1[j])) {
				if(!list1.contains(nums1[j])) {
					list1.add(nums1[j]);
				}
				
			}
		}
		finalList.add(list1);
		finalList.add(list2);
		System.out.println(" list is -- "+ list1);
		System.out.println(" finalList is--- "+ finalList);
		return finalList;
	
	}

}
