package com.capgemini.flowcontrol_Operators;

public class result {
	int N=100;
	public  int calculateSum() 
	{
		int sum=0;
	for(int n=0 ; n<=N ; n++)
	{
		if(n%3==0 && n%5==0)
		{
			sum=sum+n;
		}
	}
	return sum;
	}
}
