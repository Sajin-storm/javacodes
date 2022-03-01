package org.sanju.onlineApp.COLLECTION.Linkedlist;

import java.util.*;
//. Write a Java program to insert the specified element at the specified position in the linked list.
public class example {
public static void main(String[] args) {
	
	LinkedList<String> h=new LinkedList<>();
	h.add("one");
	h.add("two");
	h.add("three");
	h.add("three");
	h.add(null);
	
//	System.out.println();
//	for (String string : h) {
//		System.out.print(string+" ");
//	}
	h.add(0, "welcome");
	System.out.println();
ListIterator <String>g=h.listIterator();
	while(g.hasNext()) {
		System.out.print(g.next()+" ");
	}
	
	System.out.println();
	
	
//	Collections.reverse(h);
//System.out.print(h+" ");	

	while(g.hasPrevious()) {
		System.out.print(g.previous()+" ");
	}
	
	
}
}
