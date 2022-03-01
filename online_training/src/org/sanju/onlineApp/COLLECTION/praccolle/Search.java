package org.sanju.onlineApp.COLLECTION.praccolle;
import java.util.*;
public class Search {
public static void main(String[] args) {
	List <String>a =new ArrayList<>();
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the flower name ");
	String g=sc.next();
a.add("flower");
a.add("jasmine");
a.add("gulabi");
a.add("rose");


if(a.contains(g)) {
	System.out.println("found the element");
}
else
	System.out.println("element not found");

}
}
