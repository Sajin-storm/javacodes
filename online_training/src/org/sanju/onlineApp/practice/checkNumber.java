package org.sanju.onlineApp.practice;

import java.util.Scanner;

public class checkNumber {

	
	
	private static boolean checkincrease(int in) {
String s=Integer.toString(in);
for (int i = 0; i < s.length(); i++) {
	for (int k = 1;k <=s.length();k++) {
		if(s.charAt(i)<s.charAt(k))
			return true;
	    else
		return false;
		
	}
}
		return false;
	}
	
	
	
	
	
	
	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	int in=sc.nextInt();
	
	boolean ko=checkincrease(in);
	System.out.println(ko);
}

	
	}

