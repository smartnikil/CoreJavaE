package com.raj;

public class CoperateWeekendBatchStudent {
	public double calculatefee(String Scourse) {
		double fee = 0;
		double coperateweekendbatchfee = 17500;
		if(Scourse.equals("java")) {
			fee = 20000;
		}
		else if(Scourse.equals("frameworks")) {
			fee = 8500;
		}
		else if(Scourse.equals("UI")) {
			fee = 15000;
		}	
		return fee+coperateweekendbatchfee;	
	}

}
