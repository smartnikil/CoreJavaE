package com.raj;

public class Student {
	private int sid;
	private String sname;
    private long smobnum;
    private String saddress;
    private String scourse;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public long getSmobnum() {
		return smobnum;
	}
	public void setSmobnum(long smobnum) {
		this.smobnum = smobnum;
	}
	public String getSaddress() {
		return saddress;
	}
	public void setSaddress(String saddress) {
		this.saddress = saddress;
	}
	public String getScourse() {
		return scourse;
	}
	public void setScourse(String scourse) {
		this.scourse = scourse;
	}
	public double calculatefee(String Scourse) {
		double fee = 0;
		if(Scourse.equals("java")) {
			fee = 20000;
		}
		else if(Scourse.equals("frameworks")) {
			fee = 8500;
		}
		else if(Scourse.equals("UI")) {
			fee = 15000;
		}	
		return fee;	
	}
}
