package com.capgemini.strings;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeDate {
	public static void main(String[] args)
	{
		Date date = new Date();
		System.out.println(date.toString());
		
		SimpleDateFormat s = new SimpleDateFormat("dd-MMM-YYYY HH:mm"); 
		System.out.println(s.format(date));
	}

}
