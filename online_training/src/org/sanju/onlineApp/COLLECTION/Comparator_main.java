package org.sanju.onlineApp.COLLECTION;
import java.util.*;
//import java.lang.*;
public class Comparator_main  implements Comparator<Comparator_super>{

	
	
	public static void main(String[] args) {
		Comparator_main  b=new Comparator_main ();
		
		Comparator_super a1=new Comparator_super(12, "bbhi", "kadu");
		Comparator_super a2=new Comparator_super(345, "demon", "kssu");
		Comparator_super a3=new Comparator_super(56, "abji", "swadu");
		Comparator_super a4=new Comparator_super(4, "san", "fadu");
		
		
		List <Comparator_super> n=new ArrayList<>();
		n.add(a1);
		n.add(a2);
		n.add(a3);
		n.add(a4);
		System.out.println(n);
		Collections.sort(n,b);
		System.out.println(n);
//Collections.sort(n,Collections.reverseOrder());
		System.out.println("\n\n");
		for(Comparator_super ft:n) {
			System.out.println(ft);
		}
	}

	@Override
	public int compare(Comparator_super o1, Comparator_super o2) {
  int i=o1.getName().compareTo(o2.getName());
		return i;
	}
}
