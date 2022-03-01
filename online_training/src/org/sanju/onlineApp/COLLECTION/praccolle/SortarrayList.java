package org.sanju.onlineApp.COLLECTION.praccolle;

import java.util.*;
//Write a Java program to sort a given array list.

public class SortarrayList {
public static void main(String[] args) {
	ArrayList <Integer>u=new ArrayList<>();
	u.add(2);
	u.add(3);
	u.add(98);
	u.add(5);
	u.add(4);
	u.add(1);
	System.out.print("before sorting = ");
	System.out.println(u+" ");
	
	System.out.print("After sorting = ");
	Collections.sort(u);
	System.out.println(u);
}
}
