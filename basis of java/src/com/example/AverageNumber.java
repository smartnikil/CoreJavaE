package com.example;

import java.util.Scanner;

public class AverageNumber {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter three numbers:");
		int fn = sc.nextInt();
		int sn = sc.nextInt();
		int tn = sc.nextInt();
		System.out.println("average of three numbers are:"+(fn+sn+tn)/3);
		
	}
}
