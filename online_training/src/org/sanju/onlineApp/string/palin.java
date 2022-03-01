package org.sanju.onlineApp.string;

import java.util.Scanner;

public class palin {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
    String n=sc.nextLine();
    boolean rs=checkpali(n);
    if(rs==true)
    	System.out.println("palindrome");
    else
    	System.out.println("not palindrome");
}

private static boolean checkpali(String n) {
	n=n.toLowerCase();
	String bin="";
char ch[]=n.toCharArray();
for (int i = ch.length-1; i >=0 ; i--) {
	bin=bin+ch[i];
}
System.out.println(bin);	
		return n.equals(bin);
}
}