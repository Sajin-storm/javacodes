package org.cap.labPrograms.collection_framework.tereemap;

import java.util.*;
import java.util.Map.Entry;

//Write a Java program to search a key in a Tree Map.
public class Third {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
TreeMap<String,Integer>tm=new TreeMap<>();
tm.put("four", 4);
tm.put("one",  1);
tm.put("three",3);
tm.put("two",  2);
tm.put("five", 5);

for(Entry<String, Integer>al:tm.entrySet()) {
	System.out.println(al.getKey()+" "+al.getValue());
}	
System.out.print("check key is present or not = ");


	if(tm.containsKey(sc.next()))
		System.out.println("The key is present");
	else
		System.out.println("The key is not present");



}
}