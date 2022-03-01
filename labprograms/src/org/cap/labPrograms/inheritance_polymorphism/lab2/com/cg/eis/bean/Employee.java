package org.cap.labPrograms.inheritance_polymorphism.lab2.com.cg.eis.bean;

public class Employee {
public int id;
public double salary;
public String designation,insuranceScheme,name;

public Employee(int id, double salary, String designation, String insuranceScheme, String name) {
	super();
	this.id = id;
	this.salary = salary;
	this.designation = designation;
	this.insuranceScheme = insuranceScheme;
	this.name = name;
}

public Employee() {

}

@Override
public String toString() {
	return "Employee [id=" + id + ", salary=" + salary + ", designation=" + designation + ", insuranceScheme="
			+ insuranceScheme + ", name=" + name + "]";
} 





}