package org.cap.labPrograms.collection_framework;
import java.util.*;
public class Getvalues {
public static void getvalues() {
	Scanner sc=new Scanner(System.in); 
	
		Map <	Integer,String> m=new HashMap<>();
		System.out.println("Enter the values of map ");
          m.put(sc.nextInt(), sc.next());
          m.put(sc.nextInt(), sc.next());
          m.put(sc.nextInt(), sc.next());
          m.put( sc.nextInt(),sc.next());
          m.put( sc.nextInt(),sc.next());
System.out.println("before sorted");

printMap(m);
          System.out.println(m);
          Map <Integer,String> jm=new TreeMap<>(m);
          System.out.println("after sorting");
          //System.out.println(jm);
          printMap(m);
          
}


public static <K, V> void printMap(Map<K, V> map) {
    for (Map.Entry<K, V> entry : map.entrySet()) {
        System.out.println("Key : " + entry.getKey() 
			+ " Value : " + entry.getValue());
    }
}


	public static void main(String[] args) {
		getvalues();
	}

	
}
