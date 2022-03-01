package org.sanju.onlineApp.COLLECTION;

import java.util.*;

public class ConvertcolToarray {
public static void main(String[] args) {
	
	List l=new ArrayList(3);
	l.add("hi");
	l.add("9");
	l.add(45);
	l.add("hwru");
	l.add(678);
	l.add(325);

	//converting col into array
	Object [] arr=l.toArray();
	System.out.println(arr);
	
	//using for loop
	for (int i = 0; i < arr.length; i++) {
		System.out.print(arr[i]+" ");
	}
	
	System.out.println("\n");
	//enhanced loop
	for(Object a:arr) {
		System.out.print(a+" ");
	}
	
System.out.println("printing using itterator");
Iterator itr=l.iterator();
{
	System.out.println(itr.next());
}

	
System.out.println("\n");
System.out.println("printing all values through iterator");

while(itr.hasNext()) {
	Object ele3=itr.next();
	System.out.print(ele3+" ");
}
	
	
	
	
	
	
	
	
	//using iterartor
	
	
	
}
}
