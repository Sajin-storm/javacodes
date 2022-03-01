package org.sanju.onlineApp.COLLECTION.praccolle;

import java.util.*;

public class comparetwo_array_list {
	public static void main(String[] args) {
		
	List <String>a=new ArrayList<>(4);
	a.add("12");
	a.add("334");
	a.add("40");
	a.add("34");
	
	List <String>b=new ArrayList<>(4);
	b.add("12");
	b.add("334");
	b.add("40");
	b.add("349");
	
	System.out.println(a.containsAll(b));
	
	
	try {
	System.out.println(b);
	Collections.swap(b, 0, 6);                  // to swap the elements
System.out.println(b);	
	}
	catch(IndexOutOfBoundsException e) {
   System.out.println(     e.getMessage());
Collections.swap(b, 0, 2);
		System.out.println(b);
	}
}
}