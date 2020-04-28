package com.example;

import java.util.Scanner;

public class Addoftwobinarynumber {
public static void main(String[] args) {
	Scanner sc =  new Scanner(System.in);
	System.out.println("enter your first binary number:");
	int fbn = sc.nextInt();
	System.out.println("enter your second binary number:");
	int sbn = sc.nextInt();
	System.out.println("sum of two binary numbers:"+fbn+sbn);
	sc.close();	
}
}
