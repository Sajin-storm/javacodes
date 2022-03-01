package org.sanju.onlineApp.Sream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Basicstream {
public static void main(String[] args) {
	//String can be created with a Static data
Stream<String> stream1= Stream.of("I","G","A","T","E","\n");
stream1.sorted().forEach((str)->System.out.println(str));


//Not possible stream is closed
//stream1.sorted().forEach((str)->System.out.println(str));

//Stream to array
/*
 * 
 * Object[] arr=stream1.toArray();
 * for(Object location:arr){
 * System.out.println(location);
 * }
 */

  // Stream can be aquired from array or collections

String[] loc=new String[] {"bangalore","kerala","andhrapradesh","chennai"};
List<String>locations=Arrays.asList(loc);
Stream<String>stream2=locations.stream();
stream2.forEach(System.out::println);





}
}