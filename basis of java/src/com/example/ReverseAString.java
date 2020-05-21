package com.example;

import java.util.Scanner;

public class ReverseAString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string:");
		String fs = sc.next();
		System.out.println("given string:" +fs);
		String reverse =" ";
		for(int i=fs.length()-1;i>=0;--i)
		{
			reverse+=fs.charAt(i);
		}
			System.out.println("after reversing:"+reverse);
			sc.close();
	}
}
