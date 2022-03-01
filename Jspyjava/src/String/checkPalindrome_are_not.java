package String;

import java.util.Scanner;

public class checkPalindrome_are_not {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the 1st string = ");
	String str1=sc.nextLine();
	str1=str1.toLowerCase();
boolean rs=checkpalindrome(str1);
if(rs==true)
	System.out.println("palindrome");
else
	System.out.println("not palindrome");
}

private static boolean checkpalindrome(String str1)
{
	String bin="";
	char ch[]=str1.toCharArray();
	for (int i =str1.length()-1; i>=0; i--) {
bin=bin+ch[i];		
	}
	return str1.equals(bin);
}
}
