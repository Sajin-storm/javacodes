package org.sanju.onlineApp.COLLECTION.praccolle;
import java .util.*;
public class Copyone_to_another {
public static void main(String[] args) {
	ArrayList <Integer> h=new ArrayList<>();
	h.add(1);
	h.add(2);
	h.add(3);
	h.add(4);
	h.add(5);
	h.add(6);
	System.out.println("list h : " + h);
	
	ArrayList <Integer> h2=new ArrayList<>();
	h2.add(345);
	h2.add(45);
	h2.add(26);
	h2.add(335);
	h2.add(490);
	System.out.println("list h2" + h2);
Collections.copy(h, h2);
System.out.println(h);
System.out.println(h2);



}
}
