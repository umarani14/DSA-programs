package com.twopointer;

import java.util.Arrays;

public class MergeSortedArray {

	public static void main(String[] args) {
		int[] nums1 = { 1, 2, 3, 0, 0, 0 }, nums2 = { 2, 5, 6 };
		int m = 3, n = 3;
		mergeSortedArray(nums1, nums2, m, n);
	}

//	BruteForce
	static void mergeSortedArray(int[] n1, int[] n2, int m, int n) {

		for (int i = 0; i < m; i++) {
			n1[i] = n1[i];
		}
		for (int j = 0; j < n; j++) {
			n1[m+j]=n2[j];
		}
		for (int i = 0; i < m + n; i++) {
			Arrays.sort(n1);
			System.out.println("Merger array is-" + n1[i]);
		}

	}

}
