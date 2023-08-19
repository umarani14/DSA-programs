package com.twopointer;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
/*
 * 
 * Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.

The overall run time complexity should be O(log (m+n)).
 */
public class MedianOfTwoArrays {
	public static void main(String[] args) {
		Integer[] nums1 = {1,3}, nums2 = {2,4};
		System.out.println(findMedianSortedArrays(nums1, nums2));
//		findMedianSortedArrays(nums1, nums2);
	}
//	List<Integer>  response = Stream.of(List.of(1,2), List.of(3,4)).flatMap(List::stream).collect(Collectors.toList());
	 public static double findMedianSortedArrays(Integer[] nums1, Integer[] nums2) {	 
//		 Stream does not accept primitive datatypes. only wrapper classes
		 Object[] mergedArray=Stream.of(nums1,nums2).flatMap(Stream::of).sorted().toArray();
		 System.out.println("merged array=== "+ Arrays.toString(mergedArray));
		 int length=mergedArray.length;
		 int median=length/2;
		 if(length%2==0) {
			 int m=(int) mergedArray[median];
			 int n=(int) mergedArray[median-1];
			 double medium=(m+n)/2.0;
			 return  medium;
		 }else {
			 System.out.println("mergedArray[median]--"+mergedArray[median]);
			 int m = (int)mergedArray[median];
			 return   (double)m;
		 }	        
	    }
//	 second method using primitives datatyes
 public double findMedianSortedArrays(int[] nums1, int[] nums2) {
      	 
//		 Stream does not accept primitive datatypes. only wrapper classes
		//  Object[] mergedArray=Stream.of(nums1,nums2).flatMap(Stream::of).sorted().toArray();
Integer[] mergedArray = Stream.of(nums1, nums2)
        .flatMapToInt(Arrays::stream) // Convert to IntStream
        .boxed() // Box the integers to Integer objects
        .sorted()
        .toArray(Integer[]::new);

// Rest of the code remains the same

		 System.out.println("merged array=== "+ Arrays.toString(mergedArray));
		 int length=mergedArray.length;
		 int median=length/2;
		 if(length%2==0) {
			 int m=(int) mergedArray[median];
			 int n=(int) mergedArray[median-1];
			 double medium=(m+n)/2.0;
			 return  medium;
		 }else {
			 System.out.println("mergedArray[median]--"+mergedArray[median]);
			 int m = (int)mergedArray[median];
			 return   (double)m;
		 }	        
	      
    }
}
