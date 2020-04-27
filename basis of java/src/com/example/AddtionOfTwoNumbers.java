package com.example;
import java.util.Scanner;
public class AddtionOfTwoNumbers {
	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter your first number:");
    int fn = sc.nextInt();
    System.out.println("enter your second number:");
    int sn = sc.nextInt();
    int sum = fn + sn;
    System.out.println("sum of two numbers are:"+sum);
	}

}
