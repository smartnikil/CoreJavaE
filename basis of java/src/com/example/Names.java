//Write a Java program to print 'Hello' on screen and then print your name on a separate line.
//input from user
package com.example;

import java.util.Scanner;

public class Names {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		System.out.println("firstname:");
		String fn = sc.next();
		System.out.println("lastname:");
		String ln = sc.next();
		System.out.println();
		System.out.println("Hello\n"+fn+" "+ln);
		
	};

}
