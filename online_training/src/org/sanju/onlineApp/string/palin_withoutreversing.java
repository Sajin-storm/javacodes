package org.sanju.onlineApp.string;

import java.util.Scanner;

public class palin_withoutreversing {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String n=sc.nextLine();
	boolean rs=checkpali(n);
	if(rs==true)
      System.out.println("plaindrome");
	else
		System.out.println("not palin");
}

private static boolean checkpali(String n) {
	n=n.toLowerCase();
int i=0;
int j=n.length()-1;
while(i<j) {
	if(n.charAt(i)!=n.charAt(j))
		return false;
		i++;
	j--;
}
return true;
}
}
