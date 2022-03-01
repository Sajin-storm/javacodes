package org.sanju.onlineApp.string;

public class string_comparing_values_equals {

	public static void main(String[] args) {
String r1="java";
String r2="java";

//comparing the content by using  reference
if(r1==r2)
	System.out.println("refrence are same");
else
	System.out.println("reference are not same");


//comparing the content by using ref.equals()
if(r1.equals(r2))
		System.out.println("the content are equal");
else
		System.out.println("the content are not equal");
	
	

String r3=new String("java"); // Basically it will take to heap and then to scp
String r4=new String("java");
r3=r4;// assigning reference r3 to r4
System.out.println(r3==r4);//it will check the reference because we used new keyword
System.out.println(r3.equals(r4));// it will check content of the object



	}
}
