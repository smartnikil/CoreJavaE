package com.example;

import java.util.Scanner;

public class Student1 {
	public int srollno;
    public String sname;
	public int smarks;
	public Student1() {
		System.out.println("default constructor");
	}
  public Student1(int srollno, String sname, int smarks)
  {
		this();
	    this.srollno = srollno;
		this.sname = sname;
		this.smarks = smarks;
	}
public void grade() 
{
	if(smarks>40) 
	{
	System.out.println("Mr. "+ sname + " your grade is A");
    }
	else
	{
		System.out.println("you are fail");	
	}
	
}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("the roll no of a student:");
		int sno = sc.nextInt();
		System.out.println("the name of the student:");
		String sname = sc.next();
		System.out.println("the marks of the student:");
		int smarks = sc.nextInt();
		Student1 s = new Student1(sno,sname,smarks);
		s.grade();
		sc.close();
		}
}