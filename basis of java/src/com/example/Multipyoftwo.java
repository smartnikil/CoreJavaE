package com.example;

import java.util.Scanner;

public class Multipyoftwo {
/*public static void main(String[] args) {
	System.out.println(25*5);
}*/
@SuppressWarnings("resource")
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter your first number:");
	int fn = sc.nextInt();
	System.out.println("enter your second number:");
	int sn = sc.nextInt();
	System.out.println(fn*sn);
}
}
