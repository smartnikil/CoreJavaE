package com.example;

import java.util.Scanner;

public class Decintooctaln {

	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter your decimal number:");
    int decin = sc.nextInt();
    String octal = Integer.toOctalString(decin);
    System.out.println("octal number:"+octal);
    sc.close();
	}

}
