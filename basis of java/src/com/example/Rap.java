package com.example;

import java.util.Scanner;

public class Rap {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter width:");
		float w = sc.nextFloat();
		System.out.println("enter height:");
		float h = sc.nextFloat();
		System.out.println("area is " +w*h);
		System.out.println("perimeter is" + 2*(w+h));
	}
}
		
