package com.example;

import java.util.Scanner;

public class Decintobinary {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("enter the decimal number:");
		    int dn = sc.nextInt();
		    String binary = Integer.toBinaryString(dn);
		    System.out.println("Binary number is:"+binary);
		    sc.close();
			}

		}

