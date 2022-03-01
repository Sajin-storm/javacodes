package org.cap.labPrograms.collection_framework.tereemap;
// Write a Java program to associate the specified value
//with the specified key in a Tree Map
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
public class first {

	public static void main(String[] args) {
		
	
	
	
	
	TreeMap<Integer,String>tm=new TreeMap<>();
	tm.put(0, "zero");
    tm.put(3, "three");
    tm.put(1, "one");
    tm.put(2, "two");
    tm.put(6, "six");
	
   //------------------------------>ITTERATING THROUGH KEYSET AND KEY VALUES<------------------------\\
    System.out.println(tm.keySet());
    System.out.println(tm.values());
   

    System.out.println("\n\n");
    //------------------------------>ITTERATING THROUGH FOR EACH LOOP  AND BY (gETKEY and getValue)ENTRY SET<------------------------\\    
    
        
    for(Map.Entry<Integer, String> ref:tm.entrySet()) {
    	System.out.println(ref.getKey() +"   => "+ ref.getValue());
    }
    
    
    System.out.println("\n\n");
	//-------------------------------->ITERATING MAP USING ENTRY SET()<--------------------------------------------------------------\\
    
    Set<Entry<Integer, String>>set=tm.entrySet();
    for(Entry<Integer, String>ref:set) {
    	System.out.println(ref);
    }
	
	//----------------------------> USING itterator<-------------------------------------\\
	
Iterator<Map.Entry<Integer, String>>itr=tm.entrySet().iterator();
while(itr.hasNext()) {
	Map.Entry<Integer, String>entry=itr.next();
	System.out.println(entry.getKey()+" =>"+entry.getValue());
}

	
	
	}
	
	
}