package com.example;
 class Operations 
 {
	 int add=0;
	 int subtract =0;
	 int multiply =0;
	 int division = 0;
	public int add(int fn , int sn)
	{
		add = fn+sn;
		return add;
	}
	public int subtract(int fn, int sn) 
	{
		subtract = fn-sn;
		return subtract;
	}

	public int multiply(int fn, int sn) 
	{
		multiply = fn*sn;
		return multiply;
	}
	public int division(int fn, int sn) {
		division = fn/sn;
		return division;
	}
 }
 