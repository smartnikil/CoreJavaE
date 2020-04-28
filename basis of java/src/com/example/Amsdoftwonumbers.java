package com.example;

import java.util.Scanner;

public class Amsdoftwonumbers {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter your first number:");
	int fn = sc.nextInt();
    System.out.println("enter your second number:");
	int sn = sc.nextInt();
	int sum = fn+sn;
	int difference = fn-sn;
	int multiply = fn*sn;
	int division = fn/sn;
	int remainderof2 = fn%sn;
	System.out.println(sum+"\n"+difference+"\n"+multiply+"\n"+division+"\n"+remainderof2);
	}

}
