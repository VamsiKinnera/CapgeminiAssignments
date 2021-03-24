package com.capgemini.flowcontrol_Operators;

public class result1 {

	public int calculateDifference(int n)
	{
		int sumofnaturalnumbers,squareofnaturalnumbers,sum;
		squareofnaturalnumbers =( n * (n+1)*((2 * n)+1))/6;
		
		sumofnaturalnumbers = (n * (n+1))/2;
		
		sum = squareofnaturalnumbers+ squareofnaturalnumbers;
		
		return sum;
		
	}
}
