package com.example;

import java.util.Scanner;

public class Clonemethod implements Cloneable {
     static Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int b = sc.nextInt();
	public static void main(String[] args)throws CloneNotSupportedException {
		Clonemethod c = new Clonemethod();
		System.out.println("A =" +c.a);
		System.out.println("B =" +c.b);
		Clonemethod c1 = (Clonemethod)c.clone();
		System.out.println("A(2) =" +c1.a);
		System.out.println("B(2) =" +c1.b);
		int a1 = sc.nextInt();
		int b1 = sc.nextInt();
		c1.a = a1;
		c1.b = b1;
		System.out.println("A =" +c.a);
		System.out.println("B =" +c.b);
		System.out.println("A(2) =" +c1.a);
		System.out.println("B(2) =" +c1.b);
		sc.close();
	}
}