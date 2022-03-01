package org.sanju.onlineApp.Lambda;


@FunctionalInterface
public interface funinterfcae {
public void eat();
   
// public void raj();               if we make more than one functional interface then we will get error
// because then it is not functional interface

default void show() {
	System.out.println("default of functional interface");
	}

static void test() {
	System.out.println("static of functional interface");
}
}
