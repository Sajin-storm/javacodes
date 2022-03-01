package org.cap.labPrograms.collection_framework.tereemap;
import java.util.*;
import java.util.Map.Entry;
public class hashmap {
public static void main(String[] args) {
	HashMap<String,String>Hm=new HashMap<>();
	Hm.put("1","one"  );
	Hm.put("2","two"  );
	Hm.put("3","three");
	Hm.put("4","four" );
	
	for(Map.Entry<String, String>al:Hm.entrySet()) {
		System.out.println(al.getKey()+"  =>  "+al.getValue());
	}
	
	Iterator<Entry<String, String>>al=Hm.entrySet().iterator();
	while(al.hasNext()) {
	Map.Entry<String, String> j=al.next();
	System.out.println(j);
	}
	
	Set<Map.Entry<String, String>> yu=Hm.entrySet();
//	for(String u:yu) {
		
	//}
	
	
	
}
}