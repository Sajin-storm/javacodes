package org.cap.labPrograms.exception_handling;

import java.util.Scanner;

public class Validatetheage {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);              // taking input from user
	System.out.print("Enter the age of a person = ");
	double age=sc.nextDouble();
	age=Math.round(age);   
	System.out.println();                          //round figuring the values
	validateTheAge(age);                           //void method to validate
	
	                               
	sc.close();
	
	
}

public static void validateTheAge(double age) {
try {
	if(age>=15) 
		System.out.println("You are elgible for the process thank you....");
	
else {
Throwexception nk=new Throwexception();
throw nk;
}
}
catch(Throwexception e) {
e.printStackTrace();	
}

}

}