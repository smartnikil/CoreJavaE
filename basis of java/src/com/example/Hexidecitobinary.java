package com.example;

import java.util.Scanner;

public class Hexidecitobinary {
            public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("enter the hexadecimal number:");
			String hexadeci = sc.next();
			int decimal = Integer.parseInt(hexadeci,16);
			String hexadecimal = Integer.toBinaryString(decimal);
	        System.out.println("binary number is:"+hexadecimal);
	        sc.close();

	}

}
