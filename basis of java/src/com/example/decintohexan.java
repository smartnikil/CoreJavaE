package com.example;

import java.util.Scanner;

public class decintohexan {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your decimal number:");
		int dn = sc.nextInt();
		String hexadecimal = Integer.toHexString(dn);
        System.out.println("hexadecimal number is:"+ hexadecimal.toUpperCase());
        sc.close();
	}
}