package org.sanju.onlineApp.COLLECTION.praccolle;

import java.util.*;

public class Addtwo_array_list {

public static void main(String[] args) {

List <String>a=new ArrayList<>();
a.add("12");
a.add("334");
a.add("40");
a.add("34");
	
List <String>ad=new ArrayList<>();
ad.add("12");
ad.add("334");
ad.add("40");
ad.add("34");
System.out.println(ad);
List <String>a3=new ArrayList<>();
a3.addAll(ad);
a3.addAll(a);
System.out.println(a3);
a3.clear();
System.out.println(a3);
System.out.println(a3.isEmpty());



}
}