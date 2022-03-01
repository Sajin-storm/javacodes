package org.cap.labPrograms.arrays;
import java.util.Arrays;
import java.util.Scanner;

public class Smallest_ellement_in_array {
	
	// Return type method to check the  second smallest number in array
	private static int getSecondSmallest(int[] arr) {    
		Arrays.sort(arr);
		int second=0;
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
			if(i==1)
				second=arr[i];
		}
		return second;                             // returned the output
	}
	
	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("enter the size of a array = ");
    int size=sc.nextInt();                      // takin size of array from user
    int arr[]=new int[size];                    // array created
    
    System.out.print("Enter the values of array according to size given by you above = ");
    for (int i = 0; i < arr.length; i++)        // taking array values from user
    {
		arr[i]=sc.nextInt();
	}
    
    int j=getSecondSmallest(arr);              // calling a method to find second smallest
    System.out.println();
    System.out.println("Second smallest element in array = "+j);                     // printing the result
    sc.close();
}
}
