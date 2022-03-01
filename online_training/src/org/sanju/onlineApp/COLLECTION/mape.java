package org.sanju.onlineApp.COLLECTION;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap.KeySetView;
public class mape {
public static void main(String[] args) { 
java.util. Map<Integer, String> lst=new HashMap<Integer, String>();
	
	
	lst.put(5, "kl rahul");
lst.put(6, "dhoni");
lst.put(3, "Kholi");

	Map<Integer, String> ref=new HashMap();
ref.put(1, "ishanKishan");
ref.put(2, "mayanak agarwal");
ref.put(4, "pollard");
ref.put(65, "ishanKishan");
//ref.put(4, "pole");



java.util.Map<Integer, String>all=new HashMap<Integer, 	String>();

all.putAll(lst);
all.putAll(ref);


System.out.println(all.size());             //count the length of collections
System.out.println(all.isEmpty());         // check is empty or not
all.remove(2);
System.out.println(all.containsKey(3));
System.out.println(all.containsValue("dhoni"));
System.out.println("4th value is"+all.get(4));

//we have to itterate map by using entry Set

System.out.println(all.keySet());
System.out.println(all.values());

for (Map.Entry<Integer, String> e: all.entrySet()) {
	System.out.print(e.getKey()+" ");
	System.out.println(e.getValue()+" ");
}
//---------------------------------->LINKEDHASHMAP<------------------------------------------------------

LinkedHashMap lsm=new LinkedHashMap ();
lsm.put(16, "san");
lsm.put(23, "abhi");
lsm.put(32, "thimappa");
lsm.put(14, "amma");

Iterator <Integer> it = lsm.keySet().iterator();
while(it.hasNext()) {
	int key=it.next();
	System.out.println(it.next()+" "+lsm.get(key));
}

//------------------------------------------> Tree Set<-------------------------------------------

Map<String, Integer>tr=new TreeMap<>();
tr.put("one",1 );
tr.put("two", 2);
tr.put("three", 3);
for (Map.Entry<String,Integer> ke: tr.entrySet()) {
System.out.println(ke.getKey());
System.out.print(ke.getValue());
}
}	
}