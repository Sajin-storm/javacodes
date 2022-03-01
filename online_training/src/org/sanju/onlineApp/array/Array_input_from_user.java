package org.sanju.onlineApp.array;
import java.util.Scanner;
public class Array_input_from_user {
	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of an a array");
		int size=sc.nextInt();//size of a array
		
		int a[]=new int[size]; //representing of a array
		
		//printing array through for loop
		System.out.println("enter the array elements");
		for (int i = 0; i < a.length; i++) {
			a[i]=sc.nextInt();
		}
		
		for (int i = 0; i < a.length; i++) {
		System.out.print(a[i]+" ");	
		}
		sc.close();
	}

}
