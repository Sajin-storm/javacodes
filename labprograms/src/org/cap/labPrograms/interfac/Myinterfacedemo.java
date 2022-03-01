package org.cap.labPrograms.interfac;

public class Myinterfacedemo implements demo {

	@Override
	public void test() {
		System.out.println("hi");
		
	}

	@Override
	public void display() {
System.out.println("overrided");		
	}
	
	public void show() {
		System.out.println("subclass specific method");
	}
	public static void main(String[] args) {
		demo h=new Myinterfacedemo();
		h.test();
		h.display();
	//	h.show();----> because it is subclass specified method we have to use subclass variable and object
		
		System.out.println();
		System.out.println();
		Myinterfacedemo h1 = new Myinterfacedemo();
		h1.test();
		h1.display();
		h1.show();
	}

}
