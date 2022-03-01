package org.sanju.onlineApp.COLLECTION;

import java.util.*;

public class Comparable_main {
public static void main(String[] args) {
	
	comparable_super n1=new comparable_super(123, "san", "mec");
	comparable_super n2=new comparable_super(23, "ian", "ece");
	comparable_super n3=new comparable_super(673, "sun", "emc");
	comparable_super n4=new comparable_super(29, "mn", "cse");
	
	List<comparable_super> a=new ArrayList<>();
	a.add(n1);
	a.add(n2);
	a.add(n3);
	a.add(n4);
	
	System.out.println(a);
	Collections.sort(a);
	System.out.println(a);
	
}
	
	
	
	
}
