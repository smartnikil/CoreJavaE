package com.example;

import java.util.Scanner;

public class octalintodecimal {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the octal number:");
	String oct = sc.next();
	int decimal = Integer.parseInt(oct,8);
	System.out.println("decimal number is:"+decimal);
	sc.close();
}
}
