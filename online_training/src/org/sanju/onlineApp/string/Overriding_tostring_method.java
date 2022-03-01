package org.sanju.onlineApp.string;

import java.time.LocalDate;

public class Overriding_tostring_method {
String brand;
int price;
String color;


public  Overriding_tostring_method(String brand,int price,String color) {
	this.brand=brand;
	this.price=price;
	this.color=color;
}
@Override
public String toString() {
	
	return brand +" "+ price+" "+ color;
}

public static void main(String[] args) {
	LocalDate now=LocalDate.now();
	System.out.println(now);
	
	 Overriding_tostring_method ref=new  Overriding_tostring_method("BMW",150000000,"metal black");
	 Overriding_tostring_method ref1=new  Overriding_tostring_method("AUDI",190000000,"white");



System.out.println(ref);
System.out.println(ref1);

}
}