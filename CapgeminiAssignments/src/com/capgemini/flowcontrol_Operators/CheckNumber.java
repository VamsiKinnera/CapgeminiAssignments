package com.capgemini.flowcontrol_Operators;

class test
		{
			static boolean isPowerOfTwo(int n)
			{
				return n!=0&&((n&(n-1))==0);
			}
		}
 
public class CheckNumber {
 
	public static void main(String[] args) {
		int n=8;
		test obj = new test();
		System.out.println(obj.isPowerOfTwo(n) ? " "+n+" is a pw 2" : ""+n+" is not a pw of 2");
	}
}
