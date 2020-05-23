package com.example;
class schlstud
{
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + studmarks;
		result = prime * result + ((studname == null) ? 0 : studname.hashCode());
		result = prime * result + studno;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		schlstud other = (schlstud) obj;
		if (studmarks != other.studmarks)
			return false;
		if (studname == null) {
			if (other.studname != null)
				return false;
		} else if (!studname.equals(other.studname))
			return false;
		if (studno != other.studno)
			return false;
		return true;
	}

	public int studno;
	public String studname;
	public int studmarks;

public schlstud(int studno, String studname, int studmarks) {
		this.studno = studno;
		this.studname = studname;
		this.studmarks = studmarks;
	}
}
public class Equals {

	public static void main(String[] args) {
		int a = 10;
		System.out.println("A=" +a);
		String s = "hello";
		System.out.println(s.hashCode());
		String s1 = "hello";
		System.out.println(s1.hashCode());
		if(s==s1)
		{
			System.out.println("s and s1 pointing to same object");
		}
		else
		{
			System.out.println("s and s1 are different");
		}
        schlstud s2 = new schlstud(10,"raj",95);
        System.out.println(s2.hashCode());
        schlstud s3 = new schlstud(10,"raj",95);
        System.out.println(s3.hashCode());
        if(s2.equals(s3))
        {
        	System.out.println("s2 and s3 are equals");
        }
        else
        {
        	System.out.println("s2 and s3 are not equals");
        }	
	}
}
