package org.cap.labPrograms.flowcontrol_operators_assignments;

import java.util.Scanner;

public class Sum_of_first_n_natural_number {

	
    // method return type sumoffirstnaturalnumber and the numbers which is divisible 3 or 5
	private static int sumOFFirstNaturalNumber(int n) {
        int sum=0;
        System.out.print("The numbers which are divisible by 5 (or) 3 = ");
		for(int i=1; i<=n ;i++) {
	    	  sum+=i;
        if(i%3==0 || i%5==0)
        	System.out.print(i+" ");
		}
		return sum;
	    }
	
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter any number to print below natural number = ");  // asking input from user
    int n=sc.nextInt();
    int result=sumOFFirstNaturalNumber(n);  // method to get sum of user
    System.out.println();
    
    
    System.out.println(" The total sum of first n  natural number = "+result);
    sc.close();                             //closing the scanner
	}


	

}
