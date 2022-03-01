package org.sanju.onlineApp.Sream.practicestream;

import java.util.*;
import java.util.stream.Collectors;

public class checkfail {
public static void main(String[] args) {
	

	
	
	List<Integer>al=Arrays.asList(new Integer[] {1,23,45,22,15,76,56});
	System.out.println(al);
	 List<Integer>noOfFailStudents=al.stream().map(m->m-2).collect(Collectors.toList());
	 System.out.println(noOfFailStudents);
	 
	 
int a=5;
int b=0;
	 try {
System.out.println(a/b);
	 }
	 catch(ArithmeticException e) {
		System.out.println( e.getMessage());
	 }
	 
	 
	 
	 
}
}
