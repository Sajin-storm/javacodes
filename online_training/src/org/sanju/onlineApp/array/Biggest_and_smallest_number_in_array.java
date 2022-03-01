package org.sanju.onlineApp.array;

import java.util.Scanner;

public class Biggest_and_smallest_number_in_array {
	
private static int getSmallest(int[] input) {
	int small=input[0];// initializing a small variable
	for (int i = 0; i < input.length; i++) {
		if(input[i]<small)
			small=input[i];
	}	
		return small;
	}



	
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.print("enter the size of an a array = ");
int size=sc.nextInt();//taking input for the size of an a array


int input[]=new int[size]; // representing a array
int big=input[0]; // initializing a big variable


//to take a input from user
System.out.print("enter a values for array = ");
for (int i = 0; i < input.length; i++)
   {
	input[i]=sc.nextInt();
   }

//calling a return method to calculate the smallest number    
int smallest=getSmallest(input); 


//to find the biggest number  and 	Smallest number in array
       for (int i = 0; i < input.length; i++)
       {
	    if(input[i]>big)
		 big=input[i];	
       }
       
//printing the biggest number
System.out.println("The biggest value in this array is = "+big); 
System.out.println("The smallest value in this array is = "+smallest);
sc.close();
	}

	}
