package com.example;

import java.util.Scanner;

public class MultiDimArrayRowsum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the row:");
		int horizontal = sc.nextInt();
		System.out.println("Enter the column:");
		int vertical = sc.nextInt();
		int[][] arr = new int[horizontal][vertical];
		for(int i =0;i<horizontal;++i) 
		{
			for(int j=0;j<vertical;++j) 
			{
				arr[i][j] = sc.nextInt();
			}
		}
		 System.out.println("array of elements:");
	        for(int i=0,sum=0;i<horizontal;++i) 
	        {
	        	for(int j=0;j<vertical;++j) 
	        	{
	        		System.out.print(arr[i][j]+" ");
	        		sum = sum+arr[i][j];
	        		sc.close();
	  
	        	}
	        	System.out.println(" = "+sum);
	            sum = 0;
	         }
  }
}


