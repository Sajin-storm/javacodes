package org.sanju.onlineApp.COLLECTION;
import java.util.*;
public  class ArrayListOps {

	  
	  
	   public static ArrayList<Integer> makeArrayListInt(int n){
	ArrayList<Integer>a=new ArrayList<>();
	    for(int i=0;i<n;i++)
	    {
		    a.add(0);
	    }
	     return a;
	   }


	public static ArrayList<Integer>reverseList(ArrayList<Integer> list){
	Collections.reverse(list);
	return list;
	}

	public static ArrayList<Integer> changeList(ArrayList<Integer> list, int m, int n){
		Collections.replaceAll(list,m,n);
		return list;
	}
	}

	 class Source{	
		public static void main(String[] args) {
		//	Scanner sc=new Scanner(System.in);
			int n=20;
			int m=28;
	ArrayList<Integer>a=new ArrayList<>();
	a.add(28);a.add(33);a.add(10);a.add(12);a.add(10);a.add(25);a.add(12);
	ArrayListOps ao=new ArrayListOps();
	System.out.println(ao.makeArrayListInt( n));
	ao. reverseList(a);
	ao.changeList(a,m,n);



	      }
	}

