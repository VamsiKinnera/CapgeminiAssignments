package com.capgemini.collectionframework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.TreeSet;

public class Exercise_2 {

	public static void main(String[] args) {
		
		char a[]= {'a', 'b', 'a', 'c', 'b', 'd', 'd'};
		
		HashMap<Character,Integer> al=new HashMap<Character,Integer>();
		
		int count=1;
		
		for (Character ch : a) {
				
			if(al.containsKey(ch))
			{
				count++;
			}
			al.put(ch, count);
			count=1;
		}
		System.out.println(al);


		
		

	}

}
