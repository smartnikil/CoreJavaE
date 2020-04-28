package com.example;

import java.util.Scanner;

public class Binarytodecin {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("enter the binary number:");
		    String bn = sc.next();
		    int decimal = Integer.parseInt(bn,2);
		    System.out.println("decimal number is:"+decimal);
		    sc.close();
			}

		}

