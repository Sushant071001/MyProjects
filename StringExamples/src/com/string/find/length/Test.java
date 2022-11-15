package com.string.find.length;

public class Test 
{
	public static void main(String[] args) 
	{

		// Write a program to find the length of the string "refrigerator" without using length function.
		
		String name = "Sushant Sunil Patil";
		
		System.out.print("Entered String : ");
			
		int i = 0;
		for(char c : name.toCharArray())
		{
			i++;
			System.out.print(c);
		}
		System.out.println("\nlength of String : "+i);
		
	}
}
