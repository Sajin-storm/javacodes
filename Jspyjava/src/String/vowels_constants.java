package String;

import java.util.Scanner;

public class vowels_constants {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("enter the 1st string = ");
	String str1=sc.nextLine();
	checkVowelConsonats(str1);
}

private static void checkVowelConsonats(String inp) {
	inp=inp.toLowerCase();
	int vcount=0;
	int ccount=0;
	for (int i = 0; i <inp.length(); i++) {
		if(inp.charAt(i)=='a' || inp.charAt(i)=='e' || inp.charAt(i)=='i' || inp.charAt(i)=='o'||inp.charAt(i)=='u')
		vcount++;
		else if(inp.charAt(i)>='a' && inp.charAt(i)<='z')
			ccount++;
	}
	System.out.println(vcount);
	System.out.println(ccount);
}
}
