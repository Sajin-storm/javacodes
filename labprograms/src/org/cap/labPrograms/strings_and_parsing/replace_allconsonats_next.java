package org.cap.labPrograms.strings_and_parsing;
import java.lang.*;
import java.util.Scanner;

public class replace_allconsonats_next {
	public static void main(String[] args) {
 Scanner sc=new Scanner(System.in);
 System.out.print("Enter the first string = ");
 String str1=sc.nextLine();
 String rs=alterString(str1);
 System.out.println(rs); 
 sc.close();
 replace_allconsonats_next y=new replace_allconsonats_next();
Class Class1=y.getClass();
String nm=Class1.getName();
System.out.println(nm);
}

	private static String alterString(String str1) {
	char ch[]=str1.toLowerCase().toCharArray();
	//String rs="";
	for (int i = 0; i <ch.length; i++) {
		if(ch[i]=='z')
			ch[i]='b';
		
		else if(ch[i]>='b' && ch[i]<='z' &&ch[i]!='a'  && ch[i]!='e'  && ch[i]!='i'  && ch[i]!='o'  && ch[i]!='u')
			ch[i]=(char) (ch[i]+1);
		
		 
	}  
     String	rs=String.valueOf(ch);
		return rs;
	}
}