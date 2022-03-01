package org.cap.labPrograms.flowcontrol_operators_assignments;

import java.util.Scanner;

public class Traffic_lights {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("select any color in RED, GREEN, YELLOW");
String click=sc.next();// taking input from user


//click the light any lights from given colors
switch(click) {
    case "RED": 
	System.out.println("Stop the vehice be patience...");
	break;
	
    case "GREEN":
    System.out.println("go happy journey..");
    break;

    case "YELLOW":
    System.out.println("Ready to move....");
    break;
}
		
		sc.close();//closing input from user
		
	}

}
