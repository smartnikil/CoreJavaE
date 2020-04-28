package com.example;

import java.util.Scanner;

public class SwappingOfNumbers {

	public static void main(String[] args) {
		int temp;
		@SuppressWarnings("resource")
		Scanner io = new Scanner(System.in);
		System.out.println("Beforeswapping:");
		int x = io.nextInt();
		int y = io.nextInt();
		temp = x;
		x = y;
		y = temp;
		System.out.println("Afterswapping:"+x+" "+y);

	}

}
