package org.sanju.onlineApp.COLLECTION.praccolle;

import java.util.*;

public class Extract_position_of_array_list {
public static void main(String[] args) {
	List <String>a=new ArrayList<>();
	a.add("12");
	a.add("334");
	a.add("40");
	a.add("34");
	
	Iterator<String> itr=a.listIterator(2);
	
for(int i=0;i<=2;i++) {
	System.out.println(a.get(i));
}

List <String>sub_k=a.subList(0, 4) 	;
System.out.println(sub_k);


}
}