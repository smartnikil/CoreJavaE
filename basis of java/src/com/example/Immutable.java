package com.example;

import java.util.Scanner;

public class Immutable {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string:");
		String fs = sc.next();
		System.out.println(fs.hashCode());
		System.out.println(fs);
        System.out.println("enter the string:");
        String ss = sc.next();
        System.out.println(sc.hashCode());
        System.out.println(ss);
        fs =fs+ss;
        System.out.println(fs.hashCode());
        System.out.println(fs);
        sc.close();
	}
}
