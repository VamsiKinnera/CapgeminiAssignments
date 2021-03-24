package com.capgemini.arrays;
public class SecondSmallest
{
public static int getSecondSmallest(int [] a,int total) 
		{
			int temp;
			for(int i = 0;i<total;i++)
			{
				for(int j=i+1;j<total;j++)
				{
					if(a[i] > a[j])
					{
						temp=a[i];
						a[i]=a[j];
						a[j]=temp;
					}
				}
			}
			return a[1];
		}
}