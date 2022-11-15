package com.string.find.character;

import java.util.Scanner;

public class Test
{
	public static void main(String[] args)
	{
		
		// Write a program to check if the letter 'e' is present in the word 'Umbrella'.

		String sen = "sushant sunil patil";
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter character : ");
		char n = sc.next().charAt(0);
		
		int count = 0;
		
		for(int i=0;i<sen.length();i++)
		{
			char c = sen.charAt(i);
			if(c==n)
			{
				count++;
			}
		}
		if(count==0)
		{
			System.out.println(n+" is present "+count+" times.");
		}
		else
		{
			System.out.println(n+" is present "+count+" times.");
		}
		
		
	}	
}
