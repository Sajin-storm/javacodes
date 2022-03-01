package org.sanju.onlineApp.array;

import java.util.Scanner;

public class Ninteger_values_from_array_in_reverse_order {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.print("Enter the size of an a array = ");
int size=sc.nextInt();//size of an a array
int input[]=new int[size]; 

//taking the input from user
System.out.print ("user entered array is = ");
for (int i = 0; i < input.length; i++) {
	input[i]=sc.nextInt(); 
}

//printing the output  in reverse order
System.out.print("Reversed array is = ");
for (int i =  input.length-1; i>=0; i--) {
	System.out.print(input[i]+" ");
}


sc.close();
	}
}
