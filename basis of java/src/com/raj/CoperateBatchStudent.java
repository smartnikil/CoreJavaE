package com.raj;

public class CoperateBatchStudent extends Student {
	public double calculatefee(String Scourse) {
		double fee = 0;
		double coperatebatchfee = 10500;
		if(Scourse.equals("java")) {
			fee = 20000;
		}
		else if(Scourse.equals("frameworks")) {
			fee = 8500;
		}
		else if(Scourse.equals("UI")) {
			fee = 15000;
		}else {
			return fee;
		}
		return fee+coperatebatchfee;	
	}

}
