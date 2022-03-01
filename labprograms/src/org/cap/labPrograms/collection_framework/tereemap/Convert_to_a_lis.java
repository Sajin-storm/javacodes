package org.cap.labPrograms.collection_framework.tereemap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
public class Convert_to_a_lis {
public static void main(String[] args) {
	
	
	String g[]= {"e","c","d","b","a"};
	List<String>AL=Arrays.asList(g);
System.out.println(AL.size());
Iterator<String>itr=AL.iterator();
while(itr.hasNext()) {
	System.out.print(itr.next()+" ");
}

List<String>e=new ArrayList<>();
System.out.println();
System.out.println(AL.isEmpty());
System.out.println(e.isEmpty());
}
}
