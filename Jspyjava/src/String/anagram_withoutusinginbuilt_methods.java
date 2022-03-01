

package String;

import java.util.Scanner;

public class anagram_withoutusinginbuilt_methods {
	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
String str1=sc.nextLine();
String str2=sc.nextLine();
boolean rs=checkAnagram(str1,str2);
if(rs==true)
	System.out.println("anagram");
else
	System.out.println("not anagram");
}

	private static boolean checkAnagram(String str1, String str2) {
int c1[]=checkfrequency(str1);
int c2[]=checkfrequency(str2);
		for (int i = 0; i <26; i++) {
			if(c1[i]!=c2[i]) {
				return false;
			}
				
			else
				return true;
		}
		
		return false;
	}

	private static int[] checkfrequency(String str1) {
    int count[]= new int[26];
    for (int i = 0; i < str1.length(); i++) {
		char ch=str1.charAt(i);
		if(ch>='A' && ch<='Z')
			count[ch-65]++;
		else if(ch>='a' && ch<='z')
	     count[ch-97]++;
    }
return count;
	}
}