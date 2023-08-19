package com.arrays;

public class NotSmallerThanItsNeighbor {
	
	public static void main(String[] args) {
		int array[]= {5, 10, 20, 15};
		notSmallerNum(array);
		NotSmallerThanItsNeighbor notSmallerThanItsNeighbor=new NotSmallerThanItsNeighbor();
		notSmallerThanItsNeighbor.binarySearch(array);
		iterationBinarySearch(array);
	}
	
//	O(n) time complexity
	public static int notSmallerNum(int[] arr) {
		int left=0,right=1;
		while(right<arr.length) {
			if(arr[left]<arr[right]) {
				left++;
				right++;
			}else {
				System.out.println(" left is "+ arr[left]);
				return left;
			}
		}
		System.out.println("-1");
		return 0;
	}
	
//	binary search
	public  int binarySearch(int[] arr) {
		int left=0,length=arr.length,right=length-1;
		return recursivebinerySearch(arr, left, right, length);
	}
	
	public int recursivebinerySearch(int[] arr,int left,int right,int length) {
		int mid=left+(right-left)/2;
		
		if((mid==0 || arr[mid-1]<=arr[mid]) && (mid==length-1 || arr[mid+1]<=arr[mid])) {
			System.out.println("mid "+mid);
			System.out.println(" mid element is "+ arr[mid]);
			return mid;
		}
		else if(mid>0 && arr[mid]<arr[mid-1]) {
			System.out.println(" mid-1 " + arr [mid-1]);
		
		 return	recursivebinerySearch(arr, left, mid-1, length);
		}
		else return recursivebinerySearch(arr, mid+1, right, length);
	}
	
	public static int iterationBinarySearch(int[] arr) {
		int left=0,length=arr.length,right=length-1;
		System.out.println(" inside iteration method ");
		while(left<=right) {
			int mid=left+(right-left)/2;
			if((mid>=0 || arr[mid]<=arr[mid-1]) && (mid==length-1 || arr[mid]>=arr[mid+1])) {
				System.out.println("mid is -- "+ arr[mid]);
				return mid;
			}
			else if(mid>0 && arr[mid]<arr[mid-1]) {
				right=mid-1;
			}else {
				left=mid+1;
			}
		}
		return 0;
	}

}
