package com.capgemini.ExceptionHandling;
class TestCustomException1 {
		static void validate(int age) throws InvalidAgeException{
			if(age<15)
				throw new InvalidAgeException("Not Valid");
			else
				System.out.println("Valid Age");
		}
public static void main(String[] args) {
	try {
		validate(18);
	}catch(Exception e)
	{
		System.out.println("Exception Occured"+e);
	}
	System.out.println("rest of the code...");
}
}



