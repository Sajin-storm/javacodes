package String;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first String");
		String str1=sc.nextLine();
		System.out.println("Enter second string");
		String str2=sc.nextLine();
		boolean rs=checkanagram(str1,str2);
		if(rs==true)
			System.out.println("anagram");
		else
			System.out.println("not anagram");
		
	}

	private static boolean checkanagram(String str1, String str2) {
		str1=str1.replaceAll(" ","");
        str2=str2.replaceAll(" ","");
        
        if(str1.length()!=str2.length())
        	return false;
        
        char ch[]=str1.toLowerCase().toCharArray();
        char ch2[]=str2.toLowerCase().toCharArray();
        Arrays.sort(ch);
        Arrays.sort(ch2);
        
        return Arrays.equals(ch, ch2);
		
		
		
	}
}

































