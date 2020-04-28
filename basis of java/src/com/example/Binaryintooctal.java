package com.example;

import java.util.Scanner;

public class Binaryintooctal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	System.out.println("enter your binary number:");
	String bn = sc.next();
	int decimal = Integer.parseInt(bn,2);
	String octal = Integer.toOctalString(decimal);
	System.out.println("octal number is:"+octal);
	sc.close();
	}
}
