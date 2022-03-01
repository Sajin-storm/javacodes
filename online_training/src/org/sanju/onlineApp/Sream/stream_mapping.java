package org.sanju.onlineApp.Sream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class stream_mapping {
public static void main(String[] args) {
String h[]= {"pune","mumbai","mumbai","chennai","bangalore","noida"};
List<String>Locations=Arrays.asList(h);
Stream<String> stream=Locations.stream();
List<String> result=stream.filter((Location)->Location.length()>5).distinct()
.sorted().collect(Collectors.toList());
result.stream().forEach((city)->System.out.println(city));
result.stream().skip(2).forEach(System.out::println);
result.stream().skip(2).forEach(System.out::println);
long i=result.stream().count();




System.out.println(i);
System.out.println(result);
System.out.println(Locations);



List<Integer> L=Arrays.asList(new Integer[]{2,3,4,5,6,6,7});
System.out.println("map to cube the numbers");
Stream<Integer> num=L.stream();
Stream<Integer> cubeOfNum=num.map((a)->a*a*a).sorted();

List<Integer> list=cubeOfNum.collect(Collectors.toList());
System.out.println(list);
}
}
