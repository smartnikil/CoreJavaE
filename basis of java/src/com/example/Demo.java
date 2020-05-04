package com.example;
 import java.util.Scanner;
public class Demo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your first number:");
		int fn = sc.nextInt();
		System.out.println("enter your second number:");
		int sn = sc.nextInt();
		Operations o = new Operations();
	    int additionfunction1 = o.add(fn, sn);
	    int subtractfunction = o.subtract(fn,sn);
	    int multiplyfunction = o.multiply(fn,sn);
	    int dividefunction = o.division(fn,sn);
	    System.out.println("sum of two numbers:"+ additionfunction1);
	    System.out.println("difference between two numbers:"+ subtractfunction);
	    System.out.println("product of two numbers:" + multiplyfunction);
	    System.out.println("division of two numbers:" + dividefunction);
	    sc.close();
	}
}



