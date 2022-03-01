package org.sanju.onlineApp.Lambda;

public class LambdaEnterprise {
public static void main(String[] args) {

//	demointerface h=(int a,int b)->System.out.println("demo interface method is executed");
//    h.play(8,9);
//    
    
    
    demointerface h2=(int a,int b)->{
    int reult=a>b?a:b;
    return reult;
    };
   System.out.println( h2.play(34, 2));
    
}
}
