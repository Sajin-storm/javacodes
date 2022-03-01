package org.sanju.onlineApp.oops.inheritance;

public class A {
	String name;
	int amount;
		 A(){
			 this(242,"raj");           // this operator to invoke constructor in same class should be firstexicutable statement
			 System.out.println("zero parameter constructor");
		 }
		 
		 A(int price,String nm){
			 
			 this.name=nm;           // due to overcome from variable shadowing
			 this.amount=price;
			 System.out.println(" parametaer constructor "+name);
			 System.out.println("paramrter constructor "+amount);
		 }
		 
		 
		 @Override
		 public String toString(){
			 return name + " " +amount;
		 }
		 
		 public static void main(String[] args) {
			A ref=new A();
			System.out.println(ref);
		}
}
