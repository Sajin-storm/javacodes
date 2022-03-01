package org.sanju.onlineApp.COLLECTION.Hashset;

import java.util.*;
import java.util.stream.Collectors;

public class set_prac {
public static void main(String[] args) {
	
	
	  List<Integer> li=Arrays.asList(new Integer[] {1,2,4,3,8,90,3,2,4,5,1,2,4,5,2,7,6});
	/*
	  System.out.println(li);
	  Set<Integer>sh=new HashSet<>(li); System.out.println(sh);
	 */
	
	//-------------------------------->next topic<-------------------------------------------\\

     Set<Integer>oddNumber=li.stream().filter(m->m%2!=0).collect(Collectors.toSet());
System.out.println(oddNumber);








}
}
