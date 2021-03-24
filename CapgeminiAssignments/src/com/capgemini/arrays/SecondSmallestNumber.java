package com.capgemini.arrays;

public class SecondSmallestNumber {
	public static void main(String[] args) {
		SecondSmallest obj = new SecondSmallest();
		int a[] = {1,2,3,4,5,6};
		int b[] = {22,44,5,55,66,77,88};
		System.out.println("Second Smallest:"+SecondSmallest.getSecondSmallest(a,6));
		System.out.println("Second Smallest:"+SecondSmallest.getSecondSmallest(b,7));
	}

}
