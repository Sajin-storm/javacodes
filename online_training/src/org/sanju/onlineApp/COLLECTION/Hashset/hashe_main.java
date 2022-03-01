package org.sanju.onlineApp.COLLECTION.Hashset;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class hashe_main {
public static void main(String[] args) {
	
	
	
	Hashset j =new Hashset(1, "san", "ece");
	Hashset j1 =new Hashset(4, "pawan", "ise");
	Hashset j2 =new Hashset(2, "prabha", "it");
	Hashset j3 =new Hashset(5, "ran", "mec");
	Hashset j4 =new Hashset(1, "kalyan", "cse");


Set<Hashset> hs=new HashSet<>();
hs.add(j);
hs.add(j1);
hs.add(j2);
hs.add(j3);
hs.add(j4);


Iterator<Hashset> itr=hs.iterator();
//while(itr.hasNext()) {
//	System.out.println(itr.next());
//}

Map<String,Integer> eo=new HashMap<>();
eo.put("one",1 );
eo.put("two",2 );
eo.put("three",3 );
eo.put("four",4 );
eo.put("five",5 );
eo.put("six",6 );


Set<Map.Entry<String, Integer>> mae=eo.entrySet();

Iterator ij=mae.iterator();

while(ij.hasNext()) {
	System.out.println(ij.next());
}



}
}