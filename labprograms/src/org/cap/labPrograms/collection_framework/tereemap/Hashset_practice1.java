package org.cap.labPrograms.collection_framework.tereemap;
import java.util.*;
//Program for How to Iterate HashSet  Using Iterator
public class Hashset_practice1 {
public static void main(String[] args) {
	HashSet<String>Hs=new HashSet<>();
	Hs.add("one");
	Hs.add("two");
	Hs.add("three");
	Hs.add("four");
	Hs.add("five");
	
	Iterator<String>itr=Hs.iterator();
	while(itr.hasNext()) {
	System.out.println(itr.next());
}}
}
