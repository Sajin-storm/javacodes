package org.sanju.onlineApp.typecasting;

public class Narrowing_implict_widening_explict {

	public static void main(String[] args) {
     int i=140;
     
    // byte b=i;// implicit casting (or) narrowing even it will through compile time error
	
	byte b=(byte)i;
	System.out.println(b);
	
	long g1=90823;
	int y=(int) (g1 +123);
	System.out.println(y);
	}

}
