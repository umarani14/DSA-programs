package com.twopointer;

public class AddingTwoNumsinArray {
	
//	output 0 4
public static void main(String[] args) {
	int[] numbers= {1,2,3,4,6};
	int target=7;
	addNums(numbers, target);
//	System.out.println(addNums(numbers, target));
}

private static int[] addNums(int[] numbers,int target) {
	int n=numbers.length-1;
	int left=0,right=n;
	while(left<=right) {
		if(numbers[right]+numbers[left]==target) {

			System.out.println(left + " "+ right);
			return new int[] {left,right};
		}
		else if(numbers[right]+numbers[left]<target)
		left++;
		else if(numbers[right]+numbers[left]>target)
			right--;
	}
	System.out.println(left + " "+ right);
	return new int[] {0,0};
}
}
