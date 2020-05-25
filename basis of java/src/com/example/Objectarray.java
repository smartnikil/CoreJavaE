package com.example;
import java.util.Scanner;
class Car
{
public String cname;
public String cmodel;
public double cprice;

public Car(String cname, String cmodel, double cprice) {
	this.cname = cname;
	this.cmodel = cmodel;
	this.cprice = cprice;
}
}
public class Objectarray {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the car array size:");
	int size = sc.nextInt();
	Car[] cars = new Car[size];
	Car car = null;
	for(int i =0;i<size;++i) {
		System.out.println("enter the car name:");
		String cname = sc.next();
		System.out.println("enter the car model:");
		String cmodel = sc.next();
		System.out.println("enter the car price:");
		double cprice = sc.nextDouble();
		car = new Car(cname,cmodel,cprice);
		cars[i] = car;
	}
	System.out.println("CAR LIST");
	for(Car c: cars) {
		System.out.println(c.cname+"\t"+c.cmodel+"\t"+c.cprice);
	}
  }

}
