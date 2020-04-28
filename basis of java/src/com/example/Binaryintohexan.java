package com.example;

import java.util.Scanner;

public class Binaryintohexan {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter your binary number:");
	String bn = sc.next();
	int decimal = Integer.parseInt(bn,2);
	String binary= Integer.toHexString(decimal);
	System.out.println("hexadecimal number is:"+binary.toUpperCase());
	sc.close();
	}
}
