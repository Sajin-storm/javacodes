package org.sanju.onlineApp.constructor;

public class Chaining_inheritance {
	 public Chaining_inheritance(){
		 this(23,363,"yjwk");
		 System.out.println("zero parameter constructor");
	 }
              
	  public Chaining_inheritance(int a,int b ,String c) {
		  System.out.println(a+" "+b+" "+c);
		 
	  }
}

class chaine2 extends Chaining_inheritance{

public chaine2(){
	this(1);
		System.out.println("zero parameter");
	}

chaine2(int a){
	super();
	System.out.println("parametrized constructor");
}
static int j=90;
public static void main(String[] args) {
	chaine2 n=new chaine2();
	System.out.println(j);
}
}

