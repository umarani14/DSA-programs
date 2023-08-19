package com.twopointer;

import java.util.Arrays;
/*
 * Given an array of integers citations where citations[i] is the number of citations a researcher received for their ith paper, return the researcher's h-index.

According to the definition of h-index on Wikipedia: The h-index is defined as the maximum value of h such that the given researcher has published at least h papers that have each been cited at least h times.

 

Example 1:

Input: citations = [3,0,6,1,5]
Output: 3
Explanation: [3,0,6,1,5] means the researcher has 5 papers in total and each of them had received 3, 0, 6, 1, 5 citations respectively.
Since the researcher has 3 papers with at least 3 citations each and the remaining two with no more than 3 citations each, their h-index is 3.
 */
public class HIndex {

	public static void main(String[] args) {
		int[] citations = { 1, 2, 3, 4, 5 };
		System.out.println(" h index is-- " + hIndex(citations));
//		hIndex(citations);
	}

	static int hIndex(int[] citations) {
		int length = citations.length;
		int left = 0, right = length - 1;
		Arrays.sort(citations);
		while (left <= right) {
			int mid = (left + right) / 2;
			int value = citations[mid];
			int x = length - mid;
			if (value >= x) {
				right = mid - 1;
			} else {
				left = mid + 1;
			}
		}
		return length - right - 1;
	}
}
