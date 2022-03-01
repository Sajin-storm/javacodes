package org.cap.labPrograms.flowcontrol_operators_assignments;

import java.util.Scanner;

public class Calculate_difference {
	private static int sumOfSquaresOfN(int n) {
		int sum=0;
		 
		for(int i=1;i<=n;i++) 
		{
			double a=Math.pow(i, 2);
            sum+=a;
         }
           return sum;
	}
	
	
	
	private static int SquareofsumN(int n) {
        int sum=0;
		for(int i=1;i<=n;i++) {
			sum+=i;
		}
		//System.out.println(sum);
		double power=Math.pow(sum, 2);
		return (int) power;
	}

	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter any number = ");
    
    int n=sc.nextInt();                        // taking input from the user
    // calling a methods
    int squareOfN=sumOfSquaresOfN(n);            //Method to check the sum of square of natural number number
    int totalSumSquareOfN=  SquareofsumN(n);
    
    System.out.println(squareOfN);//method
    System.out.println(totalSumSquareOfN);//method
    
    System.out.print("Difference Between the squareofn  and  totalsumsquareofn   = "+  ( totalSumSquareOfN-squareOfN) );    //output
    
	}
}