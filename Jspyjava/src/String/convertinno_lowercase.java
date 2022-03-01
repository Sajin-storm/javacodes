package String;

import java.util.Arrays;
import java.util.Scanner;

public class convertinno_lowercase {
	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.print("enter the 1st string = ");
String str1=sc.nextLine();
String g=convertlower(str1);
System.out.println(g);

}

	private static String convertlower(String str1) {
       char ch[]=str1.toCharArray();
       for (int i = 0; i <ch.length; i++) {
		if(ch[i]>='A'  && ch[i]<='Z')
			ch[i]=(char) (ch[i]+32);
	}
      String r=new String(ch);
		return r;
	}
}