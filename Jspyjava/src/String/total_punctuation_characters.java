package String;

import java.util.Scanner;

public class total_punctuation_characters {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
String str1=sc.nextLine();
int count=0;


for (int i = 0; i <str1.length(); i++) {
	if(str1.charAt(i)==' '||str1.charAt(i)=='!' || str1.charAt(i)=='\'' || str1.charAt(i) == '\"' || str1.charAt(i) == ':'||str1.charAt(i) == ',' ||
		 str1.charAt(i) == ';' || str1.charAt(i) == '.' ||  str1.charAt(i) == '?')
		count++;
}

System.out.println("total number of punctuation"+count);
}
}
