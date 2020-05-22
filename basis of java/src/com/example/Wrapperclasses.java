package com.example;

public class Wrapperclasses {

	public static void main(String[] args) {
		int a = 10;//primitive 
		Integer i1 = Integer.valueOf(a);//wrapper object 
        System.out.println(i1);
     Integer i2 = new Integer(30);//wrapper object
     int b = i2.intValue();//primitive object
     System.out.println(i2);
     String s1 = "20";//string
     int c = Integer.parseInt(s1);//primitive 
     System.out.println(c);
     int d = 40;//primitive
     String s2 = Integer.toString(d);//string
     System.out.println(d);
     Integer i3 = new Integer(50);//wrapper object
     String s3 = Integer.toString(50);//string
     System.out.println(s3);
     String s4 ="60";//string
     Integer i4 = Integer.valueOf(s4);//wrapper object
     System.out.println(i4);
	}
}
