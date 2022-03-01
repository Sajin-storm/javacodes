package org.sanju.onlineApp.Lambda;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Differentfunctionalinter {
	public static void main(String[] args) {
Consumer<String> consumer =(String str)-> System.out.println(str);
consumer.accept("ho iam consumer meth");
Supplier<String> supplier= ()->"hello from suppllier";
consumer.accept(supplier.get());

//even number test
Predicate<Integer>predicate=num -> num%2==0;
System.out.println(predicate.test(24));
System.out.println(predicate.test(17));

	//max test

BiFunction<Integer,Integer,Integer>maxFunction = (x,y)->x>y?x:y;
System.out.println(maxFunction.apply(25, 14));

	}
}