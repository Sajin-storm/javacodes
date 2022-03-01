package org.cap.labPrograms.collection_framework.tereemap;
import java.util.*;
import java.util.Map.Entry;
public class five {
public static void main(String[] args) {
	TreeMap<String,Integer>tm=new TreeMap<>();
	tm.put("four", 4);
	tm.put("one",  1);
	tm.put("three",3);
	tm.put("two",  2);
	tm.put("five", 5);
	
	
	Iterator<Entry<String,Integer>>al=tm.entrySet().iterator();
	while(al.hasNext()) {
		
	}
	
	System.out.println(tm.keySet());
	
}
}
