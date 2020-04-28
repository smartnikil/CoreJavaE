package com.example;

import java.util.Scanner;

public class octaltohexadeci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
    System.out.println("enter your octal number:");
    String oct = sc.next();
    int decimal = Integer.parseInt(oct,8);
    String hexadecimal = Integer.toHexString(decimal);
    System.out.println("hexadecimal number is:"+hexadecimal);
    sc.close();
	}
}
