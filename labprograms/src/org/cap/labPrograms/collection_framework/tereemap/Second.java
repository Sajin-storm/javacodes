package org.cap.labPrograms.collection_framework.tereemap;

import java.util.*;
import java.util.Map.Entry;

//Write a Java program to copy a Tree Map content to another Tree Map.
public class Second {
public static void main(String[] args) {
	
	
	
	TreeMap<Integer,String>tm=new TreeMap<>();
	tm.put(0, "zero");    
	tm.put(1, "one");
	tm.put(3, "three");
	tm.put(4, "four");
	tm.put(2, "two");
	
	
	TreeMap<Integer,String>tm1=new TreeMap<>(tm);
	tm1.put(9, "nine");
	tm1.put(8, "eight");
	for(Entry<Integer, String>ref:tm1.entrySet()) {
		System.out.println(ref.getKey() +" => "+ ref.getValue());
	}
	
	
	//----------------------------------------->iterating through itterator<------\\
	System.out.println("  \n iterating through Iterator  \n ");
Iterator<Entry<Integer, String>>itr=tm1.entrySet().iterator();
while(itr.hasNext()) {
	Map.Entry<Integer, String>ref1=itr.next();
	System.out.println(ref1);
}
	
	
	
}
}
