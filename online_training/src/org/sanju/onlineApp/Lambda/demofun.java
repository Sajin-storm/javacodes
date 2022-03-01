package org.sanju.onlineApp.Lambda;

import java.util.function.*;

@FunctionalInterface                  //should contain only one abstract method
public interface demofun {
void checkDemo();
}


class Test{
public static void main(String[] args) {
	demofun ref=()->System.out.println("m1 implementation");  // Functional interface is responsible to provide reference to lamda
	ref.checkDemo();
	Consumer<Integer> cons=in->System.out.println("the value of consumer "+in);
    cons.accept(34);
	Consumer< String> cons1=sin->System.out.println("the cons1 is " +sin);
	Consumer <String> cons2=sin2->System.out.println("the cons 2 "+sin2);
	cons1.andThen(cons2).accept("hello");
	
	
	
	
}
}