package com.example;

import java.util.Scanner;

public class Mutable {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("enter the string:");
        String fs = sc.next();
        StringBuffer sc1 = new StringBuffer(fs);
        System.out.println(sc1.hashCode());
        System.out.println(sc1);
        System.out.println("enter the string:");
        String ss = sc.next();
        StringBuffer sc2 = new StringBuffer(ss);
        System.out.println(sc2.hashCode());
        System.out.println(sc2);
        sc1.append(sc2);
        System.out.println(sc1.hashCode());
        System.out.println(sc1);
        sc.close();
	}
}
