package org.sanju.onlineApp.string;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram_or_notAnagram {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String str1=sc.nextLine();
	String str2=sc.nextLine();
	
	boolean rs=checkAnagram(str1,str2);
	if(rs==true)
		System.out.println("ana");
	else
		System.out.println("NOt ana");
	
}

private static boolean checkAnagram(String str1, String str2) {
str1=str1.replace(" ", "").toLowerCase();
str2=str2.replaceAll(" ", "").toLowerCase();
if(str1.length()!=str2.length());

char ch[]=str1.toCharArray();
char ch1[]=str2.toCharArray();
Arrays.sort(ch);
Arrays.sort(ch1);

return Arrays.equals(ch, ch1);
	
}



}
