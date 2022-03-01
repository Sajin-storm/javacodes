package org.sanju.onlineApp.Lambda;

@FunctionalInterface
public interface demointerf2 {
void checkdemo2(int a,int b);

default void h1() {
	System.out.println("default method");
}

static void m1() {
	System.out.println("static method");
}
}
class main{
	public static void main(String[] args) {
		demointerf2 ref=(a,b)->System.out.println("the sum "+(a+b));
		ref.checkdemo2(12, 3);
		ref.checkdemo2(2, 3);
		ref.checkdemo2(23, 3);
	ref.h1();
	demointerf2.m1();
	
	}
}