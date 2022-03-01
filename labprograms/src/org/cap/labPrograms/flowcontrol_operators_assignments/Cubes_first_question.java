package org.cap.labPrograms.flowcontrol_operators_assignments;

import java.util.Scanner;

public class Cubes_first_question {
 	//Method to print a cube for digit
	public  static int  findDigitCube(int number) {    
		int sum=0;
		while(number>0) {
			int first=number%10;
			sum+=Math.pow(first, 3);
			number=number/10;
		}
	return sum;
	}
	
	
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter any number to find the sum of digits of  cube = ");
	//taking input from user
	int number=sc.nextInt(); 
	
    int sumOfCube=findDigitCube(number);
    System.out.println("sum of cube of digits is = "+sumOfCube);
    sc.close();    //closing the scanner class
}
}
