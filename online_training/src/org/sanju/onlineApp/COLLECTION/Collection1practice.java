package org.sanju.onlineApp.COLLECTION;

import java.util.ArrayList;
import java.util.Collection;
import java.util.*;

public class Collection1practice {
public static void main(String[] args) {
	List <String> col = new ArrayList<String>();
	col.add("robert");
	col.add("alex");
	col.add("raj");
	col.add("modi");
	col.add("rick");
	col.add("edward");
	
	
	
	//                 itterating using for loop
	System.out.println("printing by using for loop  ");
	for(int i=0;i<col.size();i++) {
    String ele=col.get(i);
    System.out.print( ele +" ");
	}
	
	System.out.println("\n\n");
	
	//           itterating using for each loop and enchanced loop only in forward direction
	System.out.println("using for each loop (or) enhanced loop ");
	for (String string : col) {
		System.out.print(string+" ");
	}
	
	
	System.out.println("\n\n");
	
		
	
	
	
	Collection<String> col2= new ArrayList();
	col2.add("rahul");
	col2.add("raj");
	col2.add("adhi");
	col2.add("mamath");
	
	Collection <String> col3=new ArrayList();
	//col3.add("Gandhi");
	

	Collection <String> engcol=new ArrayList<String>();
	engcol.addAll(col3);
	engcol.addAll(col2);
	engcol.addAll(col);
	System.out.println(col);
	System.out.println(col2);
	System.out.println(col3);
	System.out.println(engcol);
	
	System.out.println(engcol.size());   // to check the size
	engcol.remove("alex");	             // removing the single value
    engcol.removeAll(col2);              // removing the full col object
                                             
    col3.clear();                        // deleting all values in object
    System.out.println(engcol);	

   Object[] arr=engcol.toArray();
   for (int i = 0; i < arr.length; i++) {
	System.out.print(arr[i]+" ");
}
}
}
//               ------------------------>SET <--------------------------------------

//  print according to hashvalue   
//set  will not maintain insertion order and it's not index based
// it will not store the duplicate value

//Set a=new HashSet();
//a.add("raj");
//a.add("20");
//a.add("hi");
//a.add("hi67");
//
//a.add(col3);
//System.out.println(a);
//a.addAll(col2);
//System.out.println(a);
//a.clear();
//System.out.println(a.contains("raj"));           // check value is or there or not
//
//
//
//
//Set h=new LinkedHashSet();          // maintains insertion order
//h.add(30);
//h.add("wrajsimha");
//h.addAll(col2);
//System.out.println(h.contains("adhi"));
//System.out.println(h);  // print according to insertion order
//
//
//// ------------------------------------> Tree set  <-------------------------------------
//
//Set  tree =new TreeSet();
//tree.add("one");
//tree.add("hi ");
//tree.add("abcd");
//System.out.println(tree);
//
//Set tr=new TreeSet();
//tr.add(234);
//tr.add(367);
//tr.add(890);
//tr.add(908);
//System.out.println(tr);
//}
//  }