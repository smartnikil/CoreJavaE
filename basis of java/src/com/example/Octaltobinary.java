package com.example;

import java.util.Scanner;

public class Octaltobinary {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the octal number:");
	String oct = sc.next();
	int decimal = Integer.parseInt(oct,8);
	String binary = Integer.toBinaryString(decimal);
	System.out.println("binary number is:"+binary);
	sc.close();
	}
}
