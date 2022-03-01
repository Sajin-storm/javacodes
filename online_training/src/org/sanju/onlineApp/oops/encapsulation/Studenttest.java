package org.sanju.onlineApp.oops.encapsulation;

public class Studenttest {
public static void main(String[] args) { 
	 address al=new  address ();
al.setCity("bengaluru");
al.setCountry("indian");
al.setFlatno(420);
al.setState("karanataka");
System.out.println(al);
 Encapse ref=new Encapse(123, "javafs", "san", al);
 System.out.println(ref);
}
}
