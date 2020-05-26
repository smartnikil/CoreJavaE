package com.raj;

import java.util.Scanner;

public class OnlineTraning {

	public static void main(String[] args) {
	Scanner sc  = new Scanner(System.in); 
    double fee =0;
    System.out.println("enter your choice:");
    int urwish = sc.nextInt();
    switch(urwish) {
    case 1:
    	FastTrackBatchStudent fbs = new FastTrackBatchStudent();
    System.out.println("enter the course name:");
    fee = fbs.calculatefee(sc.next());
    System.out.println("You select course amount:"+fee);
    break;
    case 2:
    	CoperateBatchStudent cbs = new CoperateBatchStudent();
    System.out.println("enter the course name:");
    fee = cbs.calculatefee(sc.next());
    System.out.println("You select course amount:"+fee);
    break;
    case 3:WeekendBatchStudent wbs = new WeekendBatchStudent();
    System.out.println("enter the course name:");
    fee = wbs.calculatefee(sc.next());
    System.out.println("You select course amount:"+fee);
    break;
    case 4:CoperateWeekendBatchStudent cwbs = new CoperateWeekendBatchStudent();
    System.out.println("enter the course name:");
    fee = cwbs.calculatefee(sc.next());
    System.out.println("You select course amount:"+fee);
    break;
    case 5:System.exit(0);
            break;
            default:System.out.println("please select only the given batches only");
    }
	}

}