package org.cap.labPrograms.collection_framework.tereemap;

import java.util.Scanner;
import java.util.TreeMap;
import java.util.Map.Entry;
// Write a Java program to search a value in a Tree Map.
public class four {
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

int j=sc.nextInt();
		if(tm.containsValue(j))
			System.out.println("The "+ j+" is present");
		else
			System.out.println("The "+j+ "is not present");
}
}