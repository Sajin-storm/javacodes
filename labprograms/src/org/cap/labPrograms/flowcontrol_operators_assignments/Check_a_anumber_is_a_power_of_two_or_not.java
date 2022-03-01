package org.cap.labPrograms.flowcontrol_operators_assignments;

import java.util.Scanner;

public class Check_a_anumber_is_a_power_of_two_or_not {
	
	
	
	private static boolean checkNumberPowerOfTwo(int n) { //----------> return method to check the power of 2    
		boolean flag=false;   	
		if(n%2==0)
		flag=true;
		else
        flag=false;		
     	return flag==true;
	}
	
	public static void main(String[] args) {       //------------>mainmethod
		System.out.print("Enter any number = ");
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();                        //-----------> taking input form user using scanner class
       
       boolean result=checkNumberPowerOfTwo(n);   //----------->calling method
       
       if(result==true)                           //-----------> printing the result  output
    	   System.out.println(n+"  is the power of 2 ");
       else
    	   System.out.println(n+"  is not the power of 2 ");


       sc.close();                                //----------->closing scanner class
}
	}