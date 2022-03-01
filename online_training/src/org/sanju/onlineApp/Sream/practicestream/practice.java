package org.sanju.onlineApp.Sream.practicestream;
import java.util.*;
public class practice {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str1=sc.nextLine();
		String str2=sc.nextLine();
		boolean rs=check(str1,str2);
		if(rs==true)
			System.out.println("Anagram");
		else
			System.out.println("not Anagram");
	}

	private static boolean check(String str1, String str2) {
str1=str1.replaceAll(" ", "").toLowerCase();
str2=str2.replaceAll(" ", "").toLowerCase();
	//	if(str1.length()!=str2.length())
		//	return false;
		
		int[] count1=frequency(str1);
		int[] count2=frequency(str2);
		for (int i = 0; i <26; i++) {
			if(count1[i]!=count2[i])
			return false;
		}
		return true;
}

	private static int[] frequency(String str1) {
int count[]=new int[26];		
    for (int i = 0; i < str1.length(); i++)
    {

    	char cr=str1.charAt(i);
	if(cr>='A'&& cr<='Z')
		count[cr-65]++;
	else if(cr>='a' && cr<='z')
		count[cr-97]++;
    
    }		
for (int i = 0; i < count.length; i++) {
	if(count[i]!=0)
		System.out.println((char)(i+65)+"-->"+count[i]);
} return count;
}
}