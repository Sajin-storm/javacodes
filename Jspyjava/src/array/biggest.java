package array;

import java.util.Scanner;

public class biggest {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	
	int arr[]=new int[n];
	
	for (int i = 0; i < arr.length; i++) {
		arr[i]=sc.nextInt();
	}
	int big=arr[0];
	for (int i = 1; i < arr.length; i++) {
     if(arr[i]>big)
    	 big=arr[i];
	}
System.out.println(big);
sc.close();
}

}
