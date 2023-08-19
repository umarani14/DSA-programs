package com.twopointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class RemoveDulpicateElements {
	
	public static void main(String[] args) {
//		nums =[1,2,2,2,-1,1,4,5,6]
		ArrayList list=new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(2);
		list.add(2);
		list.add(-1);
		list.add(2);
		list.add(1);
		list.add(4);
		list.add(5);
		list.add(6);
		list.sort(null);
//		System.out.println(list);
//		removeDu(list);
	
		
//		removeDuplicates(list);
		
//		int[] nums= {-1, 1, 1, 2, 2, 2, 4, 5, 6};
		
//		removeDuplicatesFromArray(nums);
//		List lists=Arrays.asList(nums);
		int[] nums1= {0,0,1,1,1,2,2,2,3,3,4};
//		removeDuplicatesI(nums1);
//		removeDuplicates1(nums1);
		System.out.println(" no of dup values are--"+ removeDuplicates1(nums1));
	}
	 static int removeDuplicatesI(int[] nums) {
         int i=0;
        for(int j=1;j<nums.length;j++){
            if(nums[i]!=nums[j]){
                i++;
                nums[i]=nums[j];
            }
        }
        
        return i+1; 
    }
    static int removeDuplicates1(int[] arr) {
        int i=2;
        for(int j=0;j<arr.length;j++){
           if(arr[i-2]!=arr[j]) {
        	   arr[i]=arr[j];
        	   i++;
           }
        }
        for(int j=0;j<arr.length-1;j++) {
        	System.out.println("Array is-- " + arr[j]);
        }
        return i;
        
    }
	
	 static int removeDuplicates(int[] nums) {
		 int left=0,right=1;
		 int count=0;
		 while(right<nums.length-1) {
			 if(nums[left]==nums[right]) {
				 count++;
				 left++;
				 right++;
			 }else{
				 int temp=nums[left];
				 nums[left]=nums[right];
				 nums[right]=temp;
				 left++;
				 right++;
			 }
		 }
		 System.out.println("count is-"+ count);
		return count;
	        
	    }
	
	

//	private static void removeDuplicatesFromArray(int[] nums) {
////		convert array to set
//		List lists=Arrays.asList(nums);
//		Set<Integer> set=new HashSet();
//		 Collections.addAll(set, Arrays.toString(nums));
//	}
	private static void removeDu(ArrayList list) {
	
		int left=0;
		int right=list.size()-1;
		while(left<right) {
			if(list.get(left).equals(list.get(left+1))) {
				list.remove(left+1);
				left--;
			}
			right--;
			left++;
		}
		System.out.println("using two pointer--"+ list);
	}
	
	private static void removeDuplicates(ArrayList list) {
		for(int j=0;j<=list.size()-1;j++) {
			for(int i=list.size()-1;i>j;i--) {
			if(list.get(j).equals(list.get(i))) {
				list.remove(i);
			}
		}
		}
		System.out.println("After removing duplicated elements: -"+ list);
	}

}
