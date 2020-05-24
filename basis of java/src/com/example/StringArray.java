package com.example;

import java.util.Arrays;
import java.util.Scanner;

public class StringArray 
{

	public static void main(String[] args) 
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the size:");
	int fs = sc.nextInt();
	String[] names = new String[fs];
	System.out.println("enter the string array:");
	for(int i =0;i<fs;++i) 
	{
		names[i] = sc.next();
	}
	System.out.println("string array elements are:");
	for(String name:names) 
	{
		System.out.println(name);
	}
    Arrays.sort(names);
    System.out.println("after sorting of array:");
    for(String name:names) 
    {
    	System.out.println(name);
    }
	System.out.println("Enter the search name:");
	String sname = sc.next();
	for(String name:names)
	{
		if(name.equals(sname)) 
		{
			System.out.println("name found:"+name);
			sc.close();
			break;
		}
	}
	} 	
}
