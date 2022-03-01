package org.cap.labPrograms.strings_and_parsing;

import java.util.Scanner;

public class mirror_image {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
String str1=sc.next();
String result=mirrorTheString(str1);
String o=mirror(str1);
System.out.print("|");
System.out.print(result);


}

private static String mirror(String str1) {
StringBuffer d=new StringBuffer();

	
	return null;
}

private static String mirrorTheString(String str1) {

	StringBuffer bw=new StringBuffer(str1);
	bw.reverse();
String g=	String.valueOf(bw);
return g;
}

//public static String mirrorTheString(String str1) {
//	char ch[]=str1.toCharArray();
//	for (int i = 0; i < ch.length; i++) {
//		if(ch[i]==' ') {
//			ch[i]='|';
//			System.out.print(ch[i]);
//		}
//		System.out.print(ch[i]);
//		
//	}
//	System.out.print("|");
//	for (int i =  ch.length-1; i >=0; i--) {
//		System.out.print(ch[i]);
//	}
//	
//	String rs=new String(ch);
//	
//	return rs;
}
