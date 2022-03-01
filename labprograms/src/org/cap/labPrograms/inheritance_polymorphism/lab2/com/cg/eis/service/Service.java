package org.cap.labPrograms.inheritance_polymorphism.lab2.com.cg.eis.service;

import java.util.Scanner;

import org.cap.labPrograms.inheritance_polymorphism.lab2.com.cg.eis.bean.*;

public class Service implements Employeeservice{
	 Employee e= new  Employee();
	@Override
	public Employee getEmpDetails() {
		Scanner sc=new Scanner(System.in);
		
		
		
		
		
		
		return e;
	}

	@Override
	public String insuranceScheme(double salary, String designation) {
		return null;
	}

	@Override
	public void EmployeeDetails(Employee emp) {
		
	}
public static void main(String[] args) {
	Employeeservice h=	 new Service();
	System.out.println(h.getEmpDetails());
}
		
	

}
