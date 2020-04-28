package com.example;

import java.util.Scanner;

public class Hexadecitodecimal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the hexadecimal number:");
		String hexadeci = sc.next();
		int decimal = Integer.parseInt(hexadeci,16);
        System.out.println("decimal number is:"+decimal);
        sc.close();
	}

}
