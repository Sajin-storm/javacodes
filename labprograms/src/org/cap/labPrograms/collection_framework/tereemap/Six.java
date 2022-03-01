package org.cap.labPrograms.collection_framework.tereemap;

import java.util.*;

//How To Convert ArrayList To String Array In Java With Example
public class Six {
public static void main(String[] args) {
	
	ArrayList<String>Al=new ArrayList<>();
	Al.add("one");
	Al.add("two");
	Al.add("three");
	Al.add("four");
	Al.add("five");
	
	String g[]=Al.toArray(new String[Al.size()]);
	for(String k:g) {
		System.out.println(k);
	}
	
	
	
//	for(String h:arr) {
//		System.out.println(h);
//	}
	
}
}