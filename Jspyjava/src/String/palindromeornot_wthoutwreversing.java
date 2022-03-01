package String;

import java.util.Scanner;

public class palindromeornot_wthoutwreversing {
	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
String str1=sc.nextLine();
str1=str1.toLowerCase();
boolean rs=checkpalin(str1);
if(rs==true)
System.out.println("palindrome");
else
	System.out.println("not palindrome");
}

	private static boolean checkpalin(String str1) {
//		int j=str1.length()-1;
//		int i=0;
//		while(i<j) {
//			if(str1.charAt(i)!=str1.charAt(j))
//				return false;
//           i++;
//           j--;
		
		int j=str1.length()-1;
		for (int i = 0; i <j && i<str1.length(); i++){
        if(str1.charAt(i)!=str1.charAt(j))
        	return false;
        j--;
        			
		}
		return true;
	}
}
