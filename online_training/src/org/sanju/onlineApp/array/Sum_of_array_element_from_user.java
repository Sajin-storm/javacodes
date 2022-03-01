package org.sanju.onlineApp.array;

import java.util.Scanner;

public class Sum_of_array_element_from_user {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
    System.out.print("Enter the size of an a array = ");
    int size=sc.nextInt();    //taking size of array from user    
    int sum=0;                //initializing sum to zero
    int input[]=new int[size];  //Creating a array
     
    //taking input from user
    System.out.print("Enter the array values = ");
    for (int i = 0; i < input.length; i++) {
		input[i]=sc.nextInt();
	}

    
    for (int i = 0; i < input.length; i++) {
		sum+=input[i];
	}
    System.out.println("The total sum of array is = "+sum);
    sc.close();
}
}