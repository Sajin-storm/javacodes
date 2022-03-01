package org.sanju.onlineApp.Sream.practicestream;

import java.util.*;
import java.util.stream.*;
public class stream {
public static void main(String[] args) {
	ArrayList<Integer> al=new ArrayList<>();
	al.add(9);
	al.add(2);
	al.add(6);
	al.add(1);
	al.add(-1);
	al.add(0);
	System.out.println(al);
	List<Integer>l2=al.stream().map(p->p*p).collect(Collectors.toList());
	System.out.println(l2);
	
}
}
