package org.cap.labPrograms.exception_handling;

import java.util.Scanner;

public class Validatethename {
	public  void validateTheName(String firstName,String lastName) {

		
		
		try {
			if(firstName=="" && lastName=="") {
				throw  new Nameexception();
			}
			else if(firstName!="" && lastName!="") {
				System.out.println("you are elgible");
			}
		}
		catch(Nameexception na) {
			na.getMessage();
		}
		
}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	Validatethename n=new Validatethename();
	System.out.print("Enter the first name =  ");
	String firstName=sc.next();
	//int s=sc.nextInt();
	System.out.print("Enter the last Name= ");
	String lastName=sc.next();
	n.validateTheName(firstName,lastName);
	//sc.close();
	
	
}
}

