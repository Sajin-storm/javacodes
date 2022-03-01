package org.sanju.onlineApp.string;

import java.util.Scanner;

public class String_convert_lowercase {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String in=sc.nextLine();
     String ch=check(in);
     System.out.println(ch);
}

private static String check(String in) {
	char ch[]=in.toCharArray();
	for (int i = 0; i < ch.length; i++) {
          if(ch[i]>='A'  && ch[i]<='Z')
        	  ch[i]=(char) (ch[i]+32);
          
	}
	String h=new String(ch);
	return h;
}
}
