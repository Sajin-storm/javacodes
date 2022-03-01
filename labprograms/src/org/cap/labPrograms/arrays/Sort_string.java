package org.cap.labPrograms.arrays;
import java.util.Arrays;
import java.util.Scanner;
public class Sort_string {

private static void sort_string(String input) {

char[] arr=input.toCharArray();
Arrays.sort(arr);

int count=0;
for (int i = 0; i < arr.length; i++) {
     count++;
	System.out.println(arr[i] +" ");
}	

if(count%2==0) {

	for (int i = 0; i < count; i++) {
		if(count%2==0)
			for (int j = 0; j < count/2; j++) {
				System.out.println(arr[j]);

}
}
}
	
System.out.println(count);
}
	
	
	
	
	
	
	
	
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter any single word ");
    String input=sc.next();                                 // taking input from user
    sort_string(input);
}
}
