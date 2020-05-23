package com.example;

import java.util.Arrays;
import java.util.Scanner;

public class Singlearraydim {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Array of the size:");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("array integer of elements:");
		for(int i=0;i<size;i++)
		{
		 arr[i] = sc.nextInt();
		}
		System.out.println("array of elements:");
		for(int k:arr)
		{
			System.out.println(k);
		}
	    Arrays.sort(arr);
	    System.out.println("array of elements sorted:");
	    for(int k:arr) {
	    	System.out.println(k);
	    }
	    System.out.println("array minimum element:"+arr[0]);
	    System.out.println("array maximum element:"+arr[size-1]);
	    System.out.println("array second maximum element"+arr[size-2]);
	    sc.close();
	}
}