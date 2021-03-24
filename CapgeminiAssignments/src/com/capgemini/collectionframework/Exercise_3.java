package com.capgemini.collectionframework;

import java.util.HashMap;

public class Exercise_3 {

	public static void main(String[] args) {
		
		int a[]= {2 , 3 , 5 , 7 , 8, 2};
		
		HashMap<Integer, Integer> hm=new HashMap<Integer, Integer>();
		
		for (int i : a) {
			hm.put(i, i*i);
		}
		System.out.println(hm);
	}

}

