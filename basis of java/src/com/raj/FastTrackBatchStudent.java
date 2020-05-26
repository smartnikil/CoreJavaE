package com.raj;

public class FastTrackBatchStudent extends Student {
	public double calculatefee(String Scourse) {
		double fee = 0;
		double fastrackfee = 8500;
		if(Scourse.equals("java")) {
			fee = 20000;
		}
		else if(Scourse.equals("frameworks")) {
			fee = 8500;
		}
		else if(Scourse.equals("UI")) {
			fee = 15000;
		}
		else {
			return fee;
		}
		return fee+fastrackfee;	
	}


}
