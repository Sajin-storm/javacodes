package org.sanju.onlineApp.COLLECTION;

import java.util.LinkedList;

public class Flower {
	int cost;
	String type;
	double quantity;
	
public Flower(int cost, String type, double quantity) {
		super();
		this.cost = cost;
		this.type = type;
		this.quantity = quantity;
	}


}
class lldemo{
public static void main(String[] args) {
  Flower f1=new Flower(123,"jasmine",2.0);
  Flower f2=new Flower(234,"marigold",3.4);

LinkedList<Flower> lst=new LinkedList<Flower>();
lst.add(f1);
lst.add(f2);
Flower f3=new Flower(2345,"sunflower",8);
lst.add(f3);
for(Flower gh : lst) {
	System.out.print(" cost= "+gh.cost +" flower = "+gh.type+" quantity = "+gh.quantity);
}






}
	
	
}
