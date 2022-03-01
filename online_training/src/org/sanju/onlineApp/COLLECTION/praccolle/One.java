package org.sanju.onlineApp.COLLECTION.praccolle;

import java.util.ArrayList;
import java.util.List;

//Write a Java program to create a new array list, add some elements (string) and print out the collection.
public class One {
public static void main(String[] args) {
	List<String> al=new ArrayList<>();
	al.add("rose");
	al.add("jasmine");
	al.add("lotus");
	al.add("marigold");
    System.out.println(al);	
System.out.println(al.size());
    al.add(2,"pushpa");
    System.out.println(al);
System.out.println(al.size());
}
}
