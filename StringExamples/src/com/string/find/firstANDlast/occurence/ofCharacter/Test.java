package com.string.find.firstANDlast.occurence.ofCharacter;

import java.util.Scanner;

public class Test
{

	public static void firstOccurence(String sen, char c)
	{
		int i;
		int count = 0;
		for(i=0;i<sen.length();i++)
		{
			if(sen.charAt(i)==c)
			{
				count++;
				break;
			}
		}
		if(count==0)
		{
			System.out.println("First occurence of "+c+" is not foud");
		}
		else
		{
			System.out.println("First occuence of "+"'"+c+"'"+" is at "+i+" position.");
		}
	}
	
	public static void LastOccurence(String sen, char c)
	{
		int lastIndex = 0;
		int count = 0;
		for(int i=0;i<sen.length();i++)
		{
			if(sen.charAt(i)==c)
			{
				lastIndex = i;
				count++;
			}
		}
		if(lastIndex==0)
		{
			System.out.println("Last occurence of "+c+" is not foud");
		}
		else
		{
			System.out.println("Last occuence of "+"'"+c+"'"+" is at "+lastIndex+" position.");
			System.out.println(c+" is present "+count+" times");
		}
	}

	
	public static void main(String[] args) 
	{
		
		//  Write a program to find the first and the last occurrence of the letter 'o' in "Hello, World".
		
		String sen = "sushant sunil patil";

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Character to check Ocuurence in String : ");
		char c = sc.next().charAt(0);
		sc.close();
		
		firstOccurence(sen, c);
		LastOccurence(sen, c);
		
	}
	
}
