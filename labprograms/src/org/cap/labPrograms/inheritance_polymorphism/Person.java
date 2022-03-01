package org.cap.labPrograms.inheritance_polymorphism;

import java.util.Scanner;

public class Person {
	private String name;
	private int age;
	
	public void setName(String name) {
		this.name=name;
	}
	
	public String getName() {
		return name;
	}
	
    public void setAge(int age) {
	   this.age=age;
    }
 
    public int getAge() {
	   return age;
    }
    
    public  void create() {
    	Person p = new Person();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the accHolder name = ");
		p.setName(sc.next());
		System.out.println("Enter yhe accHolder age = ");
		p.setAge(sc.nextInt());
		System.out.println(p);
    }
    
    
    
    
    
    @Override
    public String toString() {
		return "person[name="+name+"  "+"age="+age+"]";
    }
    public static void main(String[] args) {
    	Person p=new Person();
       p.create();    	
	}
}
