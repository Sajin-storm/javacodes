package org.cap.labPrograms.exception_handling;

import java.util.Scanner;

public class Handlesalary {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int sal=sc.nextInt();
validatesal(sal);
}

private static void validatesal(int sal) {
	if(sal>3000) {
		System.out.println("your salary is above 3000");
	}
try {
if(sal<3000) {
		EmployeeException e=new EmployeeException();
		throw e;
         }
	}
catch(EmployeeException j) {
	j.printStackTrace();
}
}
}
