package org.sanju.onlineApp.COLLECTION;

import java.util.*;
import java.util.Collection;

public class Coolection1 {
public static void main(String[] args) {
	Collection<Object> col=new ArrayList<Object>();
	col.add("one");                   // adding element to collection
	col.add("two");
	col.add(3);
	col.add(234);
//	col.clear();                      // to clear the collection
	
   // System.out.println(	col.contains("one"));             // to check wheter value is present or not
	//System.out.println(col.containsAll(col));             // to check all values are there are not
 col.remove(234);                                      // to rmove a single object
//	col.removeAll(col);                                   // to remove ll values in collection
	
	
	Iterator< Object> itr=col.iterator();
	while(itr.hasNext()) {
		System.out.print(itr.next()+" ");
	}
	//col.retainAll(col);
    
    
  //  System.out.println(col);
	
	Collection <Object> col3=new LinkedList<Object>();
	col3.add("iop");
	col3.add("tee");
	col3.add(43);
	col3.add(24);
	
	
	//LinkedList collection
	Collection <Object> col2=new LinkedList<Object>();
	col2.add("one");
	col2.add("two");
	col2.add(3);
	col2.add(234);
	System.out.println(col);
	System.out.println(col2);
	
	col2.addAll(col2);
	col2.addAll(col3);
	col2.addAll(col);
	System.out.println(col3);
	
  //col2.retainAll(col);
  System.out.println(col);
  System.out.println(col2);
  System.out.println(col2.size());
  System.out.println(col.size());
  
  col3.retainAll(col2);
  System.out.println(col3);
  
  
  
  
  List j=new ArrayList();
  j.add("orange");
  j.add("mango");
  j.add(null);
  j.add("pine");
  j.add("orange");  
  //duplicate
  j.add("mango");              //duplicate
  j.add("setapalla");
  j.get(3);
  j.remove(1);
  j.remove("two");
  j.add(3, "yoju");
  System.out.println(j);
  
  
  LinkedHashSet <Integer>ld=new LinkedHashSet<Integer>();
  ld.add(233);
  ld.add(456);
  ld.add(786);
  
  ArrayList<Object> al=new ArrayList<Object>(ld);
  al.add("santhosh");
  System.out.println(al);
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
}
}
