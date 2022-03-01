package org.cap.labPrograms.inheritance_polymorphism.lab2.com.cg.eis.service;

import org.cap.labPrograms.inheritance_polymorphism.lab2.com.cg.eis.bean.Employee;

public interface Employeeservice {

public Employee getEmpDetails();
public String insuranceScheme(double salary,String designation);
public void EmployeeDetails(Employee emp);
}