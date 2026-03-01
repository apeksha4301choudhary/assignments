package com.assignment_day_4_19_Feb_2026;

class Str{
	
	public boolean str() {
		String s1 = "Hello";
		String s2 = "Hello";
		
		boolean result = (s1 == s2);
		
		return result;
	}
}

public class LiteralsObjectCreation {
	public static void main(String[] args) {
		Str s = new Str();
		
		System.out.println("Both variables point to the same object : " + s.str());
	}
}
