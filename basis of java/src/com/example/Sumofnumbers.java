package com.example;
import java.util.Scanner;
public class Sumofnumbers {
            public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("enter the first number:");
	        int fn = sc.nextInt();
	        System.out.println("enter the second number:");
		    int sn = sc.nextInt();
			int answer = demo.m2(fn,sn);
		    System.out.println("sum of two numbers:"+answer);
		    sc.close();
            }
}
class demo{
	    public static int m2(int fn, int sn){
		     int answer;
			answer = fn+sn;
			return answer; 
	  }
    }


