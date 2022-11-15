package com.string.find.word;

import java.util.Scanner;

public class Test 
{

	public static void main(String[] args) 
	{

		// StringExamples/src/com/string/find/character/Test.java

		String sen = "sushant sunil patil";
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter word : ");
		String word = sc.next();
		sc.close();
		
		String[] senArr = sen.split(" ");
		int count = 0;
		

		System.out.println("\nChecking by using 1 way :");
		for(int i=0;i<senArr.length;i++)
		{
			if(senArr[i].equals(word))
			{
				count++;
				System.out.println("matched");
			}
		}
		if(count==0)
		{
			System.out.println(word+" is not present in sentence");
		}
		else
		{
			System.out.println(word+" is present in sentence");
		}

		
		System.out.println("\nChecking by using 2 way using contains() method :");
		boolean check = sen.contains(word);
		if(check)
		{
			System.out.println(word+" is present in sentence");
		}
		else
		{
			System.out.println(word+" is not present in sentence");
		}
		
	}

}
