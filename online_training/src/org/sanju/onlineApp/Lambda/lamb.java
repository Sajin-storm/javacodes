package org.sanju.onlineApp.Lambda;

public class lamb {
	
	//inbuilt function using implementing
public static void main(String[] args) {
	funinterfcae fn=new funinterfcae (){
	
@Override
public void eat() {
	System.out.println("eatable");
}
	};
fn.eat();


System.out.println("\n\n Using lambda expresion  ");
funinterfcae  e2= ()->System.out.println("food is done and dusted by lambda");
e2.eat();


System.out.println("  \n\n Using lambda expresion and braces to print multiple line ");
funinterfcae  e3=()->{
	System.out.println("food is eaten by lmda");
	System.out.println("done by lambda");
};
e3.eat();
e3.show();
funinterfcae.test();
	
}
}
