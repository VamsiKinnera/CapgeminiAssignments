package com.capgemini.collectionframework;

import java.awt.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class Exercise1 {

	public static void main(String[] args) {
		
		
		HashMap h=new HashMap();
		h.put(1, "a");
		h.put(2, "t");
		h.put(3, "h");
		h.put(4, "q");
		h.put(5, "c");
		
		ArrayList al=new ArrayList(h.values());
		 al.sort(null);
		
		System.out.println(al);
	
		
		

	}

}
