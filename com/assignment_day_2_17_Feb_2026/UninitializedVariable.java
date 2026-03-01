package com.assignment_day_2_17_Feb_2026;

 class Values{
	byte a; 
	short b; 
	int c; 
	long d; 
	float e; 
	double f; 
	char g; 
	boolean h;
	
	
}

public class UninitializedVariable {
	public static void main(String[] args) {
		Values v = new Values();
		
		System.out.println(v.a);
		System.out.println(v.b);
		System.out.println(v.c);
		System.out.println(v.d);
		System.out.println(v.e);
		System.out.println(v.f);
		System.out.println(v.g);
		System.out.println(v.h);
	}
}


