package org.sanju.onlineApp.Sream.practicestream;
import java.util.*;
import java.util.stream.Collectors;
public class convert_collection_to_stream {
public static void main(String[] args) {

	List<String>al=new ArrayList<>();
	al.add("one");
	al.add("two");
	al.add("three");
	al.add("four");

	//System.out.println(al);
List<String>li=al.stream().map(i->i+"o").collect(Collectors.toList());	

Iterator<String>itr=li.iterator();

while(itr.hasNext()) {
	System.out.println(itr.next()+" ");
}
}
}