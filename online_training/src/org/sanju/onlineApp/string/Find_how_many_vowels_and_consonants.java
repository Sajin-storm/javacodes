package org.sanju.onlineApp.string;

import java.util.Scanner;

public class Find_how_many_vowels_and_consonants {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String in=sc.nextLine();
	 vowelscons(in);
	
}

private static void vowelscons(String in) {
in=in.replaceAll(" ", "").toLowerCase();
int vowelc=0;
int conscount=0;
char ch[]=in.toCharArray();
for (int i = 0; i < ch.length; i++) {
if(ch[i]=='a'|| ch[i]=='e' ||ch[i]=='i' || ch[i]=='o' || ch[i]=='u'){	
      vowelc++;
      System.out.println("vowels => " +ch[i]);
}
else {
	conscount++;
System.out.println(ch[i]+" ");
}}
System.out.println(vowelc);
System.out.println(conscount);


}
}