package com.raj;

public class WeekendBatchStudent {
	public double calculatefee(String Scourse) {
		double fee = 0;
		double weekendbatchfee = 6500;
		if(Scourse.equals("java")) {
			fee = 20000;
		}
		else if(Scourse.equals("frameworks")) {
			fee = 8500;
		}
		else if(Scourse.equals("UI")) {
			fee = 15000;
		}else {
			fee=0;
		}
		return fee+weekendbatchfee;	
	}

}
